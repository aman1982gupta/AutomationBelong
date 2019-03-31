package pages

import geb.Page

class DressesPage extends Page {

    static at = { waitFor(10){title.startsWith("Dresses - My Store")} }

    static content = {

        dressSummer{$('a[title="Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer."]')[0]}

    }
}
