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
    click(xpathUser.addToCartButton, 10000);
    click(xpathUser.continueShoppingButton, 10000);
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
    sync({request: Event("End(AdminLogin)")})
    // click(xpathAdmin.menuButton, 5000);
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
// Feature: Admin reduces the quantity of a product to less than X
//
// Scenario: Admin reduces the quantity of a product to less than X
// Given the admin is signed in
// When the admin reduces the quantity of a product to less than X
// Then the product is removed from the inventory
