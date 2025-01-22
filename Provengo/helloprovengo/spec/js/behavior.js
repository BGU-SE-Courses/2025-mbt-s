// @provengo summon selenium

/**
 * This story open a new browser window of login to PrestaShop website,
 * choose product from catalog,
 * choosing a quantity from this product to buy,
 * adding the product to the wishlist.
 * */
bthread("UsrAction", function () {
  let s = new SeleniumSession("UsrAction");
  s.start(URL)
  UsrLogin(s, {username: 'natallie.mir@gmail.com', password: 'natallie1234'});
  UsrAddingProduct(s, '3');
})

bthread("AdminAction")
// bthread("UsrAddingProduct", function (){
//   let s = new SeleniumSession("UsrAddingProduct");
// })
// /**
//  * This story opens a new browser window, goes to google.com, and searches for "Pizza".
//  */
// bthread('Login', function () {
//   let s = new SeleniumSession('Login')
//   s.start(URL)
//   login(s, {username: 'natallie.mir@gmail.com', password: 'natallie1234'})
//   // startSearch(s)
// })

// /**
//  * This story opens a new browser window, goes to google.com, and searches for "Pizza".
//  */
// bthread('Search', function () {
//   let s = new SeleniumSession('search')
//   s.start(URL)
//   composeQuery(s, { text: 'Pizza' })
//   startSearch(s)
// })
//
// /**
//  * This story opens a new browser window, goes to google.com, and searches for "Pasta" using the "I Feel Lucky" feature.
//  */
// bthread('Feeling lucky', function () {
//   let s = new SeleniumSession('lucky')
//   s.start(URL)
//   composeQuery(s, { text: 'Pasta' })
//   feelLucky(s)
// })