/*
 *  This is a good place to put common test data, project-wide constants, etc.
 */

const userURL = 'http://localhost:8080/login?back=http%3A%2F%2Flocalhost%3A8080%2F';
const adminURL = 'http://localhost:8080/admina/index.php?controller=AdminLogin&token=7f97e320102d2688c66c1c8bc29d196a&redirect=AdminDashboard'


const xpathUser = {
  email: '/html/body/main/section/div/div/div/section/div/section/form/div/div/div/input',
  password: '/html/body/main/section/div/div/div/section/div/section/form/div/div[2]/div/div/input',
  signInButton: '/html/body/main/section/div/div/div/section/div/section/form/footer/button',
  product: "//div[contains(@class, 'product')]//div[@class='product-description']//a[contains(text(), 'Mug The best is yet to come')]",
  quantityCell: '/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/div/div/input',
  addToWishlistButton: '/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/button/i',
  chooseMyWishlist: '/html/body/main/footer/div[2]/div/div/div[4]/div/div/div/div[2]/div/ul/li/p',
  goToProfileButton: '/html/body/main/header/nav/div/div/div/div[2]/div[2]/div/a[2]/span',
  wishlistButton: '/html/body/main/section/div/div/div/section/section/div/div/a[5]/span/i',
  chooseList: '/html/body/main/section/div/div/div/section/div/section/div/ul/li/a/p'
}

const xpathAdmin = {
  email: '/html/body/div/div/div/div[3]/div/div/form/div/input',
  password: '/html/body/div/div/div/div[3]/div/div/form/div[2]/input',
  logInButton: '/html/body/div/div/div/div[3]/div/div/form/div[3]/button',
  menu: '/html/body/header/nav/i',
  catalogButton: '/html/body/nav/div/ul/li[4]/a',
  productsButton: '/html/body/nav/div/ul/li[4]/ul/li/a',
  userProduct: '/html/body/div[2]/div/div[3]/div[2]/div/form[2]/table/tbody/tr[14]/td[4]/a',
  stockButton: '/html/body/div/div/div[3]/form/div[4]/div/ul/li[3]/a',
  quantityChangeCell: '/html/body/div/div/div[3]/form/div[4]/div[2]/div[3]/div/div/div/div/div/div[2]/div/input',
  saveButton: '/html/body/div/div/div[3]/form/div[2]/div/div/div/div[2]/button',
  // quantityField: '/html/body/div[2]/div/div[3]/div[2]/div/form[2]/table/tbody/tr[12]/td[9]/a',
  productButtonAfterChange: '/html/body/div[2]/div/div[3]/div[2]/div/form[2]/table/tbody/tr[14]/td[4]/a',
  newQuantityButton: '/html/body/div[2]/div/div[3]/div[2]/div/form[2]/table/tbody/tr[12]/td[9]/a'

}