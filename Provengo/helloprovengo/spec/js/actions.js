function UsrLogin(session, data) {
  with (session) {
    sync({request: Event("Begin(UsrLogin)")});// Begin UsrLogin
    writeText(xpathUser.email, data.username);
    writeText(xpathUser.password, data.password);
    click(xpathUser.signInButton);
    sync({request: Event("End(UsrLogin)")});// End adminLogin
  }
}

function UsrAddingProduct(session, quantity){
  with (session){
    sync({request: Event("Begin(UsrAddingProduct)")}); //Begin user action
    // User cannot add anything to wishlist before done to log in first
    sync({request: Event("End(UsrLogin)")});
    click(xpathUser.product, 500);
    writeText(xpathUser.quantityCell, quantity, clearBeforeWrite=true);
    Ctrl.doSleep(100); //wait for product adding to wishlist
    click(xpathUser.addToWishlistButton, 1000);
    click(xpathUser.chooseMyWishlist, 1000);
    click(xpathUser.goToProfileButton, 1000);
    click(xpathUser.wishlistButton, 1000);
    click(xpathUser.chooseList, 1000);
    // Observe the product in wishlist
    Ctrl.doSleep(500);
    sync({request: Event("End(UsrAddingProduct)")});
  }
}

function AdminLogin(session, data){
  with (session){
    sync({request: Event("Begin(AdminLogin)")});
    writeText(xpathAdmin.email, data.username);
    writeText(xpathAdmin.password, data.password);
    click(xpathAdmin.logInButton);
    sync({request: Event("End(AdminLogin)")});
  }
}

function AdminChanging(session, quantityToReduce){
  with(session){
    sync({request: Event("Begin(AdminChanging)")});
    click(xpathAdmin.catalogButton);
    click(xpathAdmin.productsButton, 500);
    click(xpathAdmin.userProduct, 500);
    click(xpathAdmin.stockButton, 500);
    writeText(xpathAdmin.quantityChangeCell, quantityToReduce, clearBeforeWrite=true);
    click(xpathAdmin.saveButton, 500);
    // wait for updated page
    click(xpathAdmin.productButtonAfterChange, 5000);
    click(xpathAdmin.newQuantityButton, 5000);
    sync({request: Event("End(AdminChanging)")});

  }
}
