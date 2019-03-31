/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the automation practice page/) { ->
	to HomePage
}

When(~/I click on Sign In option/) { ->
	page.signInLink.click()
}

When(~/I hover on Dresses through Mega menu/) { ->
	page.dressIcon.click()
}
