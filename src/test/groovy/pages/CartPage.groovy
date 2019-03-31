package pages

import geb.Page

class CartPage extends Page {

	static at = { waitFor(10){ title.contains( "My Store")} }

	static content = {
		cartDressName{$('span[id=layer_cart_product_title]')}

		cartQuantity{$('span[id=layer_cart_product_quantity]')}

		cartProductAttributes{$('span[id=layer_cart_product_attributes]')}
	}
}
