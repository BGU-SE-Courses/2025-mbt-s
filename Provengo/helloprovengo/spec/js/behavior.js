// @provengo summon selenium

bthread("UsrLogin", function () {
  let s = new SeleniumSession("UsrLogin");
  s.start(URL)
  UsrLogin(s, {username: 'natallie.mir@gmail.com', password: 'natallie1234'});
  UsrAddingProduct(s, '3');

  // goToInformation(session.user, s);
  // changeUserName(session.user, s, credentials.user[index]);
})

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