
//@feature2
Feature: To validate the account creation of fb application

//@sanity
Scenario: To create new account
Given To launch the browser and maximise the window
When To launch the url of facebook application
And To click the create new account button
And To pass firstname in firstname text box
#one dimensional of map data
And To pass surname in surname text box
#key       #value
|surname1|naveen			|
|surname2|raina				|
|surname3|naveenraina	|
|surname4|naveenvirat	|

#two dimensional
And To pass mobileno or email in email text box
|password1|password2|password3|password4|password5|
|123			|end			|iepjm		|dnssmne	|jdkjsn		|
|456			|of				|jdnjd		|jdiwk		|jdjkiskl	|
|789			|my				|jdmhx		|jsknd		|jdekns		|
|1011			|life			|sad		|hsknsb		|sjjsh		|
And To pass password in password text box
Then To close the chrome browser