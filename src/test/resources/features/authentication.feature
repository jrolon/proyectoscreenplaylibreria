Feature: Login
         I as a user of the application
         I want to access the application with my username and password
         To make a purchase

  Scenario Outline: Successful login
      Given Jeiner go to the library web 
      When He tries to authenticate with <user> and <password> 
      Then He verifies the authentication is successful

    Examples: 
      | user                  | password         |
      |jrolon.05@hotmail.com  |     Jeiner01*    |

@es2
  Scenario Outline: Failed login
    Given Jeiner go to the library web
    When He tries to authenticate with <user> and <password>
    Then He verifies the authentication is failed

    Examples:
      | user                  | password         |
      | malo@hotmail.com      | nada12333*       |


      
