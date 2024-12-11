Feature: End To End  Test for Book Store API

  Background: User Generate token for Authorisation
    Given I am an authorized user


  Scenario: Authorized user is able to Add and Remove Book.
    Given A list of books are available
    When I add a book to my reading list
    When I remove a book from my reading list
  

