@tag
Feature: Searching Laptop Models in Amazon Website



@tag1
Scenario Outline: Searching Laptop models and add to cart 

Given the user in Amazon home page
When the user search various "<hp>","<dell>","<acer>","<apple>","<iball>" in search box
Then the user has to verifing the particular Laptop added in cart or not

Examples:

	|hp|dell|acer|apple|iball|
	|hp omen|dell 3565 laptop|acer aspire 5|apple macbook air|iBall CompBook Merit G9|
	