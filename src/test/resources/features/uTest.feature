#Autor: Miguel

@stories
    Feature: utest

      @scenario1

    Scenario: finding an introduction to utest course

      Given than Miguel wants to learn introduction to utest at utest academy
        |strUser  |  | strPassword |
        |<strUser>|  |<strPassword>|

      When you search for the course Introduction to uTest on the utest academy platform
      |strCourse |
      |<strCourse>|

      Then he find the course called Introduction to uTest on the platform
      | strCourse |
       | <strCourse> |