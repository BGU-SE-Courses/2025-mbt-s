function UsrLogin(session, data) {
    /**
     * User login
     */
    with (session) {
        sync({request: Event("Begin(UsrLogin)")});// Begin UsrLogin
        writeText(xpathUser.email, data.username);
        writeText(xpathUser.password, data.password);
        click(xpathUser.signInButton);
        sync({request: Event("End(UsrLogin)")});// End adminLogin
    }
}

function UsrChooseProductAndQuantity(session, quantity) {
    /**
     * Navigate to product, write quantity without saving
     */
    with (session) {
        sync({request: Event("Begin(UsrChooseProductAndQuantity)")}); //Begin user action
        // User cannot add anything to wishlist before done to log in first
        click(xpathUser.product, 500);
        writeText(xpathUser.quantityCell, quantity, clearBeforeWrite = true);
        sync({request: Event("End(UsrChooseProductAndQuantity)")});
    }
}

function UsrAddToWishlist(session) {
    /**
     * Click on the heart icon to save to wishlist
     */
    with (session) {
        sync({request: Event("Begin(UsrAddToWishlist)")}); //Begin user action
        click(xpathUser.addToWishlistButton, 1000);
        click(xpathUser.chooseMyWishlist, 1000);
        sync({request: Event("End(UsrAddToWishlist)")});
    }
}

function UseValidation(session) {
    /**
     * Go to wishlist and validate adding the quantity, than clear the wishlist for the next test
     */
    with (session) {
        sync({request: Event("Begin(UseValidation)")}); //Begin user action
        Ctrl.doSleep(5000);
        refresh();
        click(xpathUser.goToProfileButton, 1000);
        click(xpathUser.wishlistButton, 1000);
        click(xpathUser.chooseList, 1000);
        Ctrl.doSleep(5000);
        // Asserts that the quantity of the product in the wishlist is 3
        assertText(xpathUser.quantityInWishlist, 'Quantity : 3')
        // need to delete the product for next test:
        click(xpathUser.deleteProdFromWishlist, 500);
        click(xpathUser.confirmRemoval, 500);
        Ctrl.doSleep(5000);
        sync({request: Event("End(UseValidation)")});
    }
}


function AdminLogin(session, data) {
    /**
     * Logs in to the admin panel using the provided session and credentials.
     */
    with (session) {
        sync({request: Event("Begin(AdminLogin)")});
        writeText(xpathAdmin.email, data.username);
        writeText(xpathAdmin.password, data.password);
        click(xpathAdmin.logInButton);
        sync({request: Event("End(AdminLogin)")});
    }
}

function AdminNavigation(session) {
    /**Navigates through the admin panel of PrestaShop.*/
    with (session) {
        sync({request: Event("Begin(AdminNavigation)")});
        click(xpathAdmin.catalogButton);
        click(xpathAdmin.productsButton, 500);
        click(xpathAdmin.userProduct, 500);
        click(xpathAdmin.stockButton, 500);
        sync({request: Event("End(AdminNavigation)")});
    }
}

function AdminChange(session, quantityToReduce) {
    /**Changes the quantity of a product in the admin panel.*/
    with (session) {
        sync({request: Event("Begin(AdminChange)")});
        writeText(xpathAdmin.quantityChangeCell, quantityToReduce, clearBeforeWrite = true);
        click(xpathAdmin.saveButton, 500);
        sync({request: Event("End(AdminChange)")});
    }
}

function AdminValidation(session) {
    /**Function to perform admin validation within a session.*/
    with (session) {
        sync({request: Event("Begin(AdminValidation)")});
        // wait for updated page
        Ctrl.doSleep(1000);
        refresh();
        // Asserts that the quantity of the product after edit is 2
        assertText(xpathAdmin.newQuantityButton, '2')
        Ctrl.doSleep(1000);
        sync({request: Event("End(AdminValidation)")});
    }
}

function AdminClearTest(session) {
    /**
     * This function performs a test action in the admin panel.
     * It writes a specific quantity value to a cell and then saves the changes.
     */
    with (session) {
        sync({request: Event("Begin(AdminClearTest)")});
        writeText(xpathAdmin.quantityChangeCell, '298', clearBeforeWrite = true);
        click(xpathAdmin.saveButton, 1000);
        sync({request: Event("End(AdminClearTest)")});
    }
}