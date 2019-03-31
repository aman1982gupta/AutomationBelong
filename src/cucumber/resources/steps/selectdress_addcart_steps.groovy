/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*

dressName = ""
qtySelected = ""

When(~/I Select Summer Dresses/) { ->
	page.dressSummer.click()
}

Then(~/I am on Summer Dresses page/) { ->
	at SummerDressPage
}

Then(~/I am on Dresses page/) { ->
	at DressesPage
}

When(~/I click on sorting Dresses dropdown/) { ->
	page.sortDressList.click()
}

When(~/Sort Dresses by Price/) { ->
	page.sortDressPrice.click()
}

Then(~/Dresses should be sorted correctly by price/) { ->
	def priceList = Float []
	(0..page.dressesPriceList.size()-1).each{
		priceList << (page.dressesPriceList[it].text().substring(1)).toFloat()
	}
	def unsortedPriceList = priceList
	Collection.sort(priceList)
	assert priceList.equals(unsortedPriceList)
}

When(~/I save the dress name and quantity/) { ->
	dressName = page.dressName.text()
	qtySelected = page.quantitySelected.value()
}

When(~/I select a blue color dress/) { ->
	page.dressColor.click()
}

When(~/I add the item to cart/) { ->
	page.addToCartButton.click()
}

Then(~/I am on the Cart Page/) { ->
	at CartPage
}

Then(~/Cart shows the correct dress name , color and quantity/) { ->
	page.cartDressName.text() == dressName
	page.cartQuantity.text() == qtySelected
	page.cartProductAttributes.text().contains("Blue")
}
