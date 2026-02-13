@wish

Feature: Flower wish list functionality
Scenario: Add flower to wish list and verify
	Given user is on search screen 
	When user searches flower from excel
	And user adds flower to wish
	Then flower should be present in wish