Feature: Search Book
         I as a user of the application
         I want to search a book in the library web
  @es1
  Scenario Outline: Successful Search a Book
      Given Jeiner go to the library web 
      When He tries to authenticate with <user> and <password>
      When He tries to search a book with tittle <booktittle>
      When He tries to select the first result
      Then He verifies that the book is available in the library

    Examples: 
      | user                  | password         | booktittle         |
      |jrolon.05@hotmail.com  |     Jeiner01*    | Harry potter       |

@es2
  Scenario Outline: Failed Search a Book
    Given Jeiner go to the library web
    When He tries to authenticate with <user> and <password>
    When He tries to search a book with tittle <booktittle>
    Then He verifies that the book does not exist

    Examples:
      | user                  | password         | booktittle            |
      |jrolon.05@hotmail.com  |     Jeiner01*    | viajando en mi moto   |


      
