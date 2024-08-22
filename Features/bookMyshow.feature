@regression
Feature: Login page of book myshow
Description: this feature verifies the login functionalities


@smoketest @important
Scenario: login to bookmyshow WEB page

Given open Browser
When enter the url "https://in.bookmyshow.com/explore/home/bengaluru"
And click on "Movies" hyperlink
Then user must see the text "movies in banglore"