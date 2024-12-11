package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Steps {
	private static final String USER_ID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
	private static final String USERNAME = "TOOLSQA-Test";
	private static final String PASSWORD = "Test@@123";
	private static final String BASE_URL = "https://bookstore.toolsqa.com";

	private static String token;
	private static Response response;
	private static String jsonString;
	private static String bookId;

	@Given("I am an authorized user")
	public void iAmAnAuthorizedUser() {
		
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given().contentType(ContentType.JSON);

		Response response = request.body("{\"userName\": \"" + USERNAME + "\",\"password\": \"" + PASSWORD + "\"}")
				.post("/Account/v1/GenerateToken");

		jsonString = response.asString(); //"Deserialize" the JSON Response
		token = JsonPath.from(jsonString).get("token");
		System.out.println("I am an authorized user and token =" + token);

	}

	@Given("A list of books are available")
	public void listOfBooksAreAvailable() {
		response = RestAssured.given().baseUri(BASE_URL).get("/BookStore/v1/Books");

		jsonString = response.asString();
		List<Map<String, String>> books = JsonPath.from(jsonString).get("books");
		Assert.assertTrue(books.size() > 0);
		bookId = books.get(0).get("isbn");
		System.out.println("A list of books are available -" + books);
	}

	@When("I add a book to my reading list")
	public void addBookInList() {

		response = RestAssured.given().baseUri(BASE_URL).header("Authorization", "Bearer " + token)
				.contentType(ContentType.JSON)
				.body("{\"userId\": \"" + USER_ID + "\","
						+ "\"collectionOfIsbns\": [{\"isbn\": \"" + bookId + "\"}]}")
				.post("/BookStore/v1/Books");
		System.out.println("I add a book to my reading list");

	}

	/*
	 * @When("I remove a book from my reading list") public void
	 * removeBookFromList() {
	 * 
	 * response = RestAssured.given().baseUri(BASE_URL).header("Authorization",
	 * "Bearer " + token) .contentType(ContentType.JSON).body("{ \"isbn\": \"" +
	 * bookId + "\", \"userId\": \"" + USER_ID + "\"}")
	 * .delete("/BookStore/v1/Book");
	 * 
	 * System.out.println("I remove a book from my reading list");
	 * 
	 * Assert.assertEquals(401, response.getStatusCode());
	 * System.out.println("Resoponce COde " + response.getStatusCode());
	 * 
	 * jsonString = response.asString(); List<Map<String, String>> booksOfUser =
	 * JsonPath.from(jsonString).get("books");
	 * System.out.println("booksOfUser.size()-" + booksOfUser.size());
	 * Assert.assertEquals(0, booksOfUser.size());
	 * System.out.println("The book is removed"); }
	 */
}