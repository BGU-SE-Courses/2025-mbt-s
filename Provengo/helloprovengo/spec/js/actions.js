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



// function composeQuery(session, data) {
//   session.writeText(xpaths.searchWindow.searchInput, data.text)
// }
//
// function startSearch(session) {
//   with(session) {
//     click(xpaths.searchWindow.searchButton)
//   }
// }
//
// function feelLucky(session) {
//   with(session) {
//     click(xpaths.searchWindow.feelingLuckyButton)
//   }
// }
//
// function login(session, data){
//   session.waitForVisibility(xpathUser.email, 1000)
//   session.writeText(xpathUser.email, data.username)
//   session.waitForVisibility(xpathUser.password, 1000)
//   session.writeText(xpathUser.password, data.password)
//   // session.waitForVisibility(xpaths.searchWindow)
//   session.click(xpaths.searchWindow.searchButton, 100)
// }