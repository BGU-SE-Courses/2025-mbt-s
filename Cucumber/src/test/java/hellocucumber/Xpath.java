package hellocucumber;

import java.util.Map;
import java.util.HashMap;

public class Xpath {

    public Map<String, String> dictUseCase_1; //Adding products to wishlist with quantity x
    public Map<String, String> dictUseCase_2; //admin changes the quantity of product to less than x


    public Xpath() {
        dictUseCase_1 = new HashMap<>();
        //1. click the sign in button
        dictUseCase_1.put("IMG: home page", "//div[1]/a[1]/img[1]");
        dictUseCase_1.put("BUTTON: delete", "//div[1]/button[2]");
        dictUseCase_1.put("BUTTON: remove", "//div[5]/div[1]/div[1]/div[1]/div[3]/button[2]");
        //2. enter email
        dictUseCase_1.put("INPUT: (email)", "//*[@id='field-email']");
//                "\n" +
//                "//section[1]/form[1]/div[1]/div[1]/div[1]/input[1]\n" +
//                "//div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]\n" +
//                "//section[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1n\n" +
//                "//div[1]/section[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]\n");
        //3. enter password
        dictUseCase_1.put("INPUT: (password)", "//*[@id='field-password']");
//
//                "//div[2]/div[1]/div[1]/input[1]\n" +
//                "//div[1]/div[2]/div[1]/div[1]/input[1]\n" +
//                "//form[1]/div[1]/div[2]/div[1]/div[1]/input[1]\n" +
//                "//section[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
        //4. click the sign in button to confirm
        dictUseCase_1.put("BUTTON: SIGN IN", "//*[@id='submit-login']");
//                "//footer[1]/button[1]\n" +
//                "//form[1]/footer[1]/button[1]\n" +
//                "//section[1]/form[1]/footer[1]/button[1]\n" +
//                "//div[1]/section[1]/form[1]/footer[1]/button[1]");
        //5. choose product
        dictUseCase_1.put("MUG:best is yet to come", "//section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n");
//                "//section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n" +
//                "//section[1]/section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n" +
//                "//div[1]/section[1]/section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n" +
//                "//div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]");
        //6. entry tha amount of product (do this according to the amount you wish for)
        dictUseCase_1.put("INPUT: QUANTITY","/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/div/div/input");
        //7. click the "add to wishlis" button
        dictUseCase_1.put("BUTTON: add to wishlist", "/html/body/main/section/div/div/div/section/div/div[2]/div[2]/div[2]/form/div[2]/div/button/i");
        //8. choose which wishlist you want
        dictUseCase_1.put("BUTTON: my wishlist","/html/body/main/footer/div[2]/div/div/div[4]/div/div/div/div[2]/div/ul/li");
        //9.
        dictUseCase_1.put("user","/html/body/main/header/nav/div/div/div/div[2]/div[2]/div/a[2]/span");
        //9.
        dictUseCase_1.put("my wishlists","/html/body/main/section/div/div/div/section/section/div/div/a[5]/span");
        //10.
        dictUseCase_1.put("my wishlist","//a[contains(@class, 'wishlist-list-item-link')]");
        //11.
        dictUseCase_1.put("quantity","//div[1]/section[1]/ul[1]/li[1]/div[1]/a[1]/div[2]/div[1]/p[1]/span[1]");



        dictUseCase_2 = new HashMap<>();
        //1. enter email admin
        dictUseCase_2.put("INPUT: (email)", "//input[@id='email']");
        //2. enter password admin
        dictUseCase_2.put("INPUT: (password)", "//input[@id='passwd']");
        dictUseCase_2.put("BUTTON: SIGN IN", "//button[@id='submit_login']");
        //3. open catalog
        dictUseCase_2.put("BUTTON: catalog", "//li[@id='subtab-AdminCatalog']");
        //4. open product
        dictUseCase_2.put("BUTTON: products", "//li[@id='subtab-AdminCatalog']/ul/li[@id='subtab-AdminProducts']");
        //5. click edit button
        dictUseCase_2.put("BUTTON: edit", "//tr/td[contains(@class, 'link-type')]/a[contains(text(), 'Mug The best is yet to come')]/../..//a[contains(@class, 'btn') and @data-original-title='Edit']");
        //6. click stocks button
        dictUseCase_2.put("BUTTON: stocks", "//div[@id='product-tabs']/ul/li[@id='product_stock-tab-nav']/a");
        //7. click input button
        dictUseCase_2.put("INPUT: quantity", "//div[@id='product_stock_quantities_delta_quantity']//span[@class='initial-quantity']");
        //8. write how much you want to reduce
        dictUseCase_2.put("INPUT: subtract", "//div[@class='delta-quantity-delta-container']//input[@id='product_stock_quantities_delta_quantity_delta']");
        //9. click save and publish button
        dictUseCase_2.put("BUTTON: save and publish", "//*[@id='product_footer_save']");
        dictUseCase_2.put("STOCK: quantity", "//div[@class='product-header-summary']/div[@data-role='quantity']/div[contains(@class, 'product-total-quantity')]");
    }

}
