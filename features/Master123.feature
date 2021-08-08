Feature: Free CRM login feature
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is "<Title>"
Then user enters "<username>" and "<password>"
Then user click on login button
Then verify user is on Home Page
Then close the browser

Examples:
|Title|username|password|
|CRMPRO - CRM software for customer relationship management, sales, and support.|nadeemz|Test@123|
|CRMPRO - CRM software for customer relationship management, sales, and support.|groupautomation|Test@1234|

Scenario Outline: Free CRM Create Contacts

Given user is already on Login Page
Then user enters "<username>" and "<password>"
Then user click on login button
Then user hover on Contacts and click on New Contact
Then user fill "<title>","<First_Name>","<Last_Name>","<Company>"
Then user click on Save button
Then verify "<contact>" is created
Then close the browser

Examples:
|username|password|title|First_Name|Last_Name|Company|contact|
|nadeemz|Test@123|Mr.|Jimmy|Disuza|Apple|Jimmy Disuza|
|nadeemz|Test@123|Mrs.|Riya|Fernandis|Google|Riya Fernandis|