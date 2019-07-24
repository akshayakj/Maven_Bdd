Feature: A simple ATM machine
	Scenario: Deliver the cash
	Given The cash to be delivered
	When The input is "5000"
	Then The output is "Deliver cash"

	Scenario: Cash is not available
	Given The cash to be delivered
	When The input is "6000"
	Then The output is "Cash is Not available"
	 
