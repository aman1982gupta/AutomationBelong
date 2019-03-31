package pages

import geb.Page

class HomePage extends Page {
	static at = { title == "My Store" }
	static content = {
		signInLink { $('a.login') }

		dressIcon{$('a[title=Dresses]')[1]}
	}
}
