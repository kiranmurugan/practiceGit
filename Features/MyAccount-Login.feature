Feature: MyAccount -Login Feature
Description: This Feature will test the  login functionality of the website
#Scenario: Login with valid user name and password

#Given Open Browser
#When Enter the URL"https://practice.automationtesting.in/"
#And click on MyAccount Menu
#And Enter the valid username and password
#And Click on Login buttona
#Then user must be successfully loged into the we page

Scenario Outline: Login with valid and invalid usernames and passwords

Given Open Browser
When Enter the URL"https://practice.automationtesting.in/"
And click on MyAccount Menu
And Enter the valid username "<username>" and password "<password>"
And Click on Login buttona
Then user must be successfully loged into the we page

Examples:
|username |	password |
|Kiran123@gmail.com |	Kiran@123|
|username1 |	password1|
|username1|		password1|
