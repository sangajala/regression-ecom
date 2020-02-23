Feature: Search


@radha
Scenario Outline: 3 Valid search

Given user is in home page
When he search for "<keyword>"
Then i should see "<result>"

Examples:
| keyword  | result                  |
| computer | Build your own computer |
| apple    | Apple iCam              |


