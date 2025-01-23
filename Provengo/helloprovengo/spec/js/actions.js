function UsrLogin(session, data) {
  with (session) {
    sync({request: Event("Begin(UsrLogin)")});// Begin adminLogin
    writeText(xpathUser.email, data.username);
    writeText(xpathUser.password, data.password);
    click(xpathUser.signInButton);
    sync({request: Event("End(UsrLogin)")});// End adminLogin
  }
}

function UsrAddingProduct(session, quantity){
  with (session){
    sync({request: Event("Begin(UsrAddingProduct)")});// Begin adminLogin
    click(xpathUser.product, 5000);
    writeText(xpathUser.quantityCell, quantity, clearBeforeWrite=true);
    Ctrl.doSleep(1000);
    click(xpathUser.addToWishlistButton, 10000);
    click(xpathUser.chooseMyWishlist, 10000);
    click(xpathUser.goToProfileButton, 10000);
    click(xpathUser.wishlistButton, 10000);
    click(xpathUser.chooseList, 10000);
    // Observe the product in wishlist
    Ctrl.doSleep(500);
    sync({request: Event("End(UsrAddingProduct)")});

  }
}

function AdminLogin(session, data){
  with (session){
    sync({request: Event("Begin(AdminLogin)")});
    sync({request: Event("End(UsrAddingProduct)")})
    writeText(xpathAdmin.email, data.username);
    writeText(xpathAdmin.password, data.password);
    click(xpathAdmin.logInButton);
    sync({request: Event("End(AdminLogin)")});
  }
}

function AdminChanging(session, quantityToReduce){
  with(session){
    sync({request: Event("Begin(AdminChanging)")});
    sync({request: Event("End(AdminLogin)")})
    Ctrl.doSleep(500);
    click(xpathAdmin.catalogButton);
    click(xpathAdmin.productsButton, 5000);
    click(xpathAdmin.userProduct, 5000);
    click(xpathAdmin.stockButton, 5000);
    writeText(xpathAdmin.quantityChangeCell, quantityToReduce, clearBeforeWrite=true);
    click(xpathAdmin.saveButton, 5000);
    click(xpathAdmin.productButtonAfterChange, 5000);
    click(xpathAdmin.newQuantityButton, 5000);
    sync({request: Event("End(AdminChanging)")});

  }
}
