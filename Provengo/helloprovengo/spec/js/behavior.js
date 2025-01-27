// @provengo summon selenium
// @provengo summon ctrl
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
  AdminNavigation(s);
  AdminChange(s, '-298');
  AdminValidation(s);
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
  UsrChooseProductAndQuantity(s, '3');
  UsrAddToWishlist(s);
  UseValidation(s);
  s.close()
})


/**
 * This story made for preventing user actions before login complete.
 * */
bthread("UserCannotAddUntilFinishLogin", function () {
    sync({
      waitFor: Event("End(UsrLogin)"),
      block: Event("Begin(UsrChooseProductAndQuantity)")
    })
})

/**
 * This story made for preventing from users to chose product if the manager changing it details
 * */
bthread("UsrCannotAddWhileManagerChanging", function () {
    sync({
        waitFor: Event("End(AdminChange)"),
        block: Event("Begin(UsrAddToWishlist)")
    })
})

/**
 * This story made for insuring the saving happens after the choice
 * */
bthread("UsrCannotAddBeforeChoose", function () {
    sync({
        waitFor: Event("End(UsrChooseProductAndQuantity)"),
        block: Event("Begin(UsrAddToWishlist)")
    })
})

/**
 * This story made for insuring the validation happens after the action
 * */
bthread("UsrCannotValidationBeforeAdd", function () {
    sync({
        waitFor: Event("End(UsrAddToWishlist)"),
        block: Event("Begin(UseValidation)")
    })
})

/**
 * This story made for preventing the manager to actions before login complete.
 * */
bthread("AdminCannotActUntilFinishLogin", function () {
    sync({
        waitFor: Event("End(AdminLogin)"),
        block: Event("Begin(AdminNavigation)")
    })
})

/**
 * This story made for preventing the manager to change before navigation to product complete.
 * */
bthread("AdminCannotActUntilFinishLogin", function () {
    sync({
        waitFor: Event("End(AdminNavigation)"),
        block: Event("Begin(AdminChange)")
    })
})

/**
 * This story made for preventing the manager validation before edit complete.
 * */
bthread("AdminCannotActUntilFinishLogin", function () {
    sync({
        waitFor: Event("End(AdminChange)"),
        block: Event("Begin(AdminValidation)")
    })
})