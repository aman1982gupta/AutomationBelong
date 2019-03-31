package pages

import geb.Page

class SummerDressPage extends Page {
	static at = { waitFor(10){ title == "Summer Dresses - My Store"} }
	static content = {
		sortDressList{$('select#selectProductSort')}

		sortDressPrice(wait:5){$('select#selectProductSort').find('option')[1]}

		dressTitle{$('a["title=Printed Summer Dress"]')}

		dressesPriceList {$('.product-container').find('div.right-block').find('.content_price').find('span.price')}

		dressColor{$('.color_to_pick_list').find('a[href$=color-blue]')[0]}

		addToCartButton{$('button[name=Submit]')}

		dressName{$('h1[itemprop=name]')}

		quantitySelected{$('input[id=quantity_wanted]')}

		}
}
