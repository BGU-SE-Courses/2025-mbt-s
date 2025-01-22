// @provengo summon selenium

/**
 * This story open a new browser window of login to PrestaShop website,
 * choose product from catalog,
 * choosing a quantity from this product to buy,
 * adding the product to the wishlist.
 * */
bthread("UsrAction", function () {
  let s = new SeleniumSession("UsrAction");
  s.start(userURL)
  UsrLogin(s, {username: 'natallie.mir@gmail.com', password: 'natallie1234'});
  UsrAddingProduct(s, '3');
  s.close()
})

bthread("AdminAction", function (){
  sync({waitFor: Event("End(UsrAddingProduct)")});
  let s = new SeleniumSession("AdminAction");
  s.start(adminURL)
  AdminLogin(s, {username: 'demo@prestashop.com', password: 'prestashop_demo'});
  AdminChanging(s);
  s.close()
})
