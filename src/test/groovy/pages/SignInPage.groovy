package pages

import geb.Page

class SignInPage extends Page {

    static at = { title.startsWith("Login") }

    static content = {

        emailIdText { $( 'input#email_create') }

        createButton {$('button#SubmitCreate')}

        createAccountError(wait:5) {$('#create_account_error').find('ol').find('li')[0]}



    }
}
