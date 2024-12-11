$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/End2End_Test.feature");
formatter.feature({
  "name": "End To End  Test for Book Store API",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User Generate token for Authorisation",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am an authorized user",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions2.Steps2.iAmAnAuthorizedUser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Authorized user is able to Add and Remove Book.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "A list of books are available",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions2.Steps2.listOfBooksAreAvailable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a book to my reading list",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions2.Steps2.addBookInList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove a book from my reading list",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions2.Steps2.removeBookFromList()"
});
formatter.result({
  "status": "passed"
});
});