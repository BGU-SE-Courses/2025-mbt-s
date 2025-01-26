package hellocucumber;

import java.util.Map;
import java.util.HashMap;

public class Xpath {
    // This is a dictionary of all the web element paths needed by our 2 use cases
    // Uses for better name and easier access to the paths across the code
    public Map<String, String>  dictUseCase_1; //Adding products to wishlist with quantity x
    public Map<String, String> dictUseCase_2; //admin changes the quantity of product to less than x


    public Xpath() {
        dictUseCase_1 = new HashMap<>();
        // Return to home page for navigation
        dictUseCase_1.put("IMG: home page", "//div[1]/a[1]/img[1]");
        // Delete and remove the product from the wishlist for the test set-up
        dictUseCase_1.put("BUTTON: delete", "//div[1]/button[2]");
        dictUseCase_1.put("BUTTON: remove", "//div[5]/div[1]/div[1]/div[1]/div[3]/button[2]");
        // enter email at login page
        dictUseCase_1.put("INPUT: (email)", "//*[@id='field-email']");
        // enter password at login page
        dictUseCase_1.put("INPUT: (password)", "//*[@id='field-password']");
        // click the sign in button to confirm at login page
        dictUseCase_1.put("BUTTON: SIGN IN", "//*[@id='submit-login']");
        // choose product
        dictUseCase_1.put("MUG:best is yet to come", "//div[contains(@class, 'product')]//div[@class='product-description']//a[contains(text(), 'Mug The best is yet to come')]");
        // entry tha amount of product (do this according to the amount you wish for)
        dictUseCase_1.put("INPUT: QUANTITY","/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/div/div/input");
        // click the "add to wishlist" button
        dictUseCase_1.put("BUTTON: add to wishlist", "/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/button/i");
        // choose which wishlist you want
        dictUseCase_1.put("BUTTON: my wishlist","/html/body/main/footer/div[2]/div/div/div[4]/div/div/div/div[2]/div/ul/li");
        // user profile navigation
        dictUseCase_1.put("user","/html/body/main/header/nav/div/div/div/div[2]/div[2]/div/a[2]/span");
        // wishlist navigation
        dictUseCase_1.put("my wishlists","/html/body/main/section/div/div/div/section/section/div/div/a[5]/span");
        // wishlist navigation
        dictUseCase_1.put("my wishlist","//a[contains(@class, 'wishlist-list-item-link')]");
        // quantity of product in wishlist
        dictUseCase_1.put("quantity","//div[@class='wishlist-product']//div[@class='wishlist-product-right']/p[@class='wishlist-product-title' and contains(text(), 'Mug The best is yet to come')]/..//p[@class='wishlist-product-combinations-text']/span");

        // Use case 2
        dictUseCase_2 = new HashMap<>();
        // enter email admin at login page
        dictUseCase_2.put("INPUT: (email)", "//input[@id='email']");
        // enter password admin at login page
        dictUseCase_2.put("INPUT: (password)", "//input[@id='passwd']");
        // click the sign in button to confirm at login page
        dictUseCase_2.put("BUTTON: SIGN IN", "//button[@id='submit_login']");
        // open catalog from side button
        dictUseCase_2.put("BUTTON: catalog", "//li[@id='subtab-AdminCatalog']");
        // open products from catalog from side button
        dictUseCase_2.put("BUTTON: products", "//li[@id='subtab-AdminCatalog']/ul/li[@id='subtab-AdminProducts']");
        // click edit sign for the product
        dictUseCase_2.put("BUTTON: edit", "//tr/td[contains(@class, 'link-type')]/a[contains(text(), 'Mug The best is yet to come')]/../..//a[contains(@class, 'btn') and @data-original-title='Edit']");
        // click stocks tab button
        dictUseCase_2.put("BUTTON: stocks", "//div[@id='product-tabs']/ul/li[@id='product_stock-tab-nav']/a");
        // click input button
        dictUseCase_2.put("INPUT: quantity", "//div[@id='product_stock_quantities_delta_quantity']//span[@class='initial-quantity']");
        // write how much you want to reduce
        dictUseCase_2.put("INPUT: subtract", "//div[@class='delta-quantity-delta-container']//input[@id='product_stock_quantities_delta_quantity_delta']");
        // click save and publish button
        dictUseCase_2.put("BUTTON: save and publish", "//*[@id='product_footer_save']");
        // get the quantity of the product for validation
        dictUseCase_2.put("STOCK: quantity", "//div[@class='product-header-summary']/div[@data-role='quantity']/div[contains(@class, 'product-total-quantity')]");
    }

}
