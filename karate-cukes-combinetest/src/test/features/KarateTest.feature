Feature: Karate Testing

Scenario: Testing valid GET endpoint
Given url 'https://www.google.com'
When method GET
Then status 200
