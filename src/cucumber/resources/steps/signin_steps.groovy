/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*

When(~/I enter email as '(.*)'/) { String emailEntered ->
	page.emailIdText << emailEntered
}

Then(~/I am at Sign In Page/) { ->
	at SignInPage
}

When(~/I click on Create Account Button/) { ->
	page.createButton.click()
}

Then(~/I see an error message as '(.*)'/) { String error ->
	assert page.createAccountError.text() == error
}