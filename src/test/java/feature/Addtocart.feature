Feature: Select a product and add it to cart

Scenario: Ajio Adding Product From Home and Kitchen to Cart
Given user is already in AJIO page
When user mouse over and clicks on home and kitchen menu
Then user selects any one product in the page
Then user navigate to the product page
Then user clciks on add to bag button
Then user waits till add to bag changes into go to bag
Then user clicks on go to bag button