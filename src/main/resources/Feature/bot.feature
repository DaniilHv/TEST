Feature: Bot for keyboard
  Background: I'm on the main page
    Given Opening the browser "https://10fastfingers.com/typing-test/russian"

@MyTest
  Scenario: Bot begin testing and starting to input words
    When input the marked letter
    Then check the game is done