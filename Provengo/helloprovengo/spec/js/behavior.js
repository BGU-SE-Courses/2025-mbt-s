// @provengo summon selenium
/**
 * This story opens a new browser window of login to PrestaShop admin homepage,
 * choose the same product the customer chose,
 * decrease the quantity of this product to less than the customer added to wishlist,
 * save the changes in catalog.
 * */
bthread("AdminAction", function (){
  // sync({waitFor: Event("End(UsrAddingProduct)")});
  let s = new SeleniumSession("AdminAction");
  s.start(adminURL)
  AdminLogin(s, {username: 'demo@prestashop.com', password: 'prestashop_demo'});
  AdminChanging(s, '-270');
  s.close()
})

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


/**
 * This story made for preventing from users to chose product if the manager changing it details
 * */
bthread("UsrCannotAddWhileManagerChanging", function () {
    sync({
      waitFor: Event("End(AdminChanging)"),
      block: Event("Begin(UsrAddingProduct)")
    })
})

/**
 * This story made for preventing the user to actions before login complete.
 * */
bthread("UserCannotAddingUntilFinishLogin", function () {
    sync({
      waitFor: Event("End(UsrLogin)"),
      block: Event("Begin(UsrAddingProduct)")
    })
})

/**
 * This story made for preventing the manager to actions before login complete.
 * */
bthread("UserCannotAddingUntilFinishLogin", function () {
    sync({
      waitFor: Event("End(AdminLogin)"),
      block: Event("Begin(AdminChanging)")
    })
})


