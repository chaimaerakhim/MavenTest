Feature: login
  Correct login


  Scenario: User Sign in with login and password
Given  user fill in "chaimae" and "password"
When  usename and password are correct
Then redirecting user to home page