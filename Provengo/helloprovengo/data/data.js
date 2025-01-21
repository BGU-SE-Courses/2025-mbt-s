/*
 *  This is a good place to put common test data, project-wide constants, etc.
 */

const URL = 'http://localhost:8080/login?back=http%3A%2F%2Flocalhost%3A8080%2F';


const xpaths = {
  searchWindow: {
    searchInput: '//textarea[@aria-label="Search"]',
    searchButton: '//input[@aria-label="Google Search"]',
    feelingLuckyButton: '//input[@aria-label="I\'m Feeling Lucky"]'
  }
}

const searchTerm = 'pizza'

const xpathUser = {
  email: '/html/body/main/section/div/div/div/section/div/section/form/div/div/div/input',
  password: '/html/body/main/section/div/div/div/section/div/section/form/div/div[2]/div/div/input',
  signInButton: '/html/body/main/section/div/div/div/section/div/section/form/footer/button',
  product: '/html/body/main/section/div/div/div/section/section/section/div/div[2]/article/div/div/a/picture/img',
  quantityCell: '/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/div/div/input',
  addToCartButton: '/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button',
  continueShoppingButton: '/html/body/div/div/div/div[2]/div/div[2]/div/div/a'
}