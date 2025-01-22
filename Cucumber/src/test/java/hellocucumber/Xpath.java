package hellocucumber;

import java.util.Map;
import java.util.HashMap;

public class Xpath {

    public Map<String, String> dictUseCase_1; //Adding products to wishlist with quantity x
    public Map<String, String> dictUseCase_2; //admin changes the quantity of product to less than x


    public Xpath() {
        dictUseCase_1 = new HashMap<>();
        //1. click the sign in button
        dictUseCase_1.put("SPAN: Sign in", "//div[2]/div[1]/a[1]/span[1]\n" +
                "//div[2]/div[2]/div[1]/a[1]/span[1]\n" +
                "//div[1]/div[2]/div[2]/div[1]/a[1]/span[1]\n" +
                "//div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[1]\n" +
                "//div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[1]\n");
        //2. enter email
        dictUseCase_1.put("INPUT: (email)", "//*[@id='field-email']\n" +
                "//section[1]/form[1]/div[1]/div[1]/div[1]/input[1]\n" +
                "//div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]\n" +
                "//section[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1n\n" +
                "//div[1]/section[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]\n");
        //3. enter password
        dictUseCase_1.put("INPUT: (password)", "//*[@id='field-password']\n" +
                "//div[2]/div[1]/div[1]/input[1]\n" +
                "//div[1]/div[2]/div[1]/div[1]/input[1]\n" +
                "//form[1]/div[1]/div[2]/div[1]/div[1]/input[1]\n" +
                "//section[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
        //4. click the sign in button to confirm
        dictUseCase_1.put("BUTTON: SIGN IN", "//*[@id='submit-login']\n" +
                "//footer[1]/button[1]\n" +
                "//form[1]/footer[1]/button[1]\n" +
                "//section[1]/form[1]/footer[1]/button[1]\n" +
                "//div[1]/section[1]/form[1]/footer[1]/button[1]");
        //5. choose product
        dictUseCase_1.put("IMG:\n", "//section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n" +
                "//section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n" +
                "//section[1]/section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n" +
                "//div[1]/section[1]/section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]\n" +
                "//div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[6]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]");
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
        dictUseCase_1.put("my wishlist","/html/body/main/section/div/div/div/section/div/section/div/ul/li/a");
        //11.
        dictUseCase_1.put("quantity","/html/body/main/section/div/div/div/section/div/section/ul/li/div/div/div/a/p/span");



        dictUseCase_2 = new HashMap<>();
        //1. enter email admin
        dictUseCase_2.put("INPUT: (email)\n", "//*[@id='email']\n" +
                "        //div[1]/form[1]/div[1]/input[1]\n" +
                "        //div[1]/div[1]/form[1]/div[1]/input[1]\n" +
                "        //div[3]/div[1]/div[1]/form[1]/div[1]/input[1]\n" +
                "        //div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/input[1]");
        //2. enter password admin
        dictUseCase_2.put("INPUT: (password)", "//*[@id='passwd']\n" +
                "//div[2]/input[1]\n" +
                "//form[1]/div[2]/input[1]\n" +
                "//div[1]/form[1]/div[2]/input[1]\n" +
                "//div[1]/div[1]/form[1]/div[2]/input[1]");
        //3. open catalog
        //TODO: xpath no found this
        //4. open product
        dictUseCase_2.put("A: Products", "//li[4]/ul[1]/li[1]/a[1]\n" +
                "//ul[1]/li[4]/ul[1]/li[1]/a[1]\n" +
                "//div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]\n" +
                "//nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]\n" +
                "//body/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]\n" +
                "//*[@id='subtab-AdminProducts']/a[1]");
        //5. click edit button
        dictUseCase_2.put("I: edit", "//tr[14]/td[11]/div[1]/div[1]/a[1]/i[1]\n" +
                "//tbody[1]/tr[14]/td[11]/div[1]/div[1]/a[1]/i[1]\n" +
                "//table[1]/tbody[1]/tr[14]/td[11]/div[1]/div[1]/a[1]/i[1]\n" +
                "//form[2]/table[1]/tbody[1]/tr[14]/td[11]/div[1]/div[1]/a[1]/i[1]\n" +
                "//div[1]/form[2]/table[1]/tbody[1]/tr[14]/td[11]/div[1]/div[1]/a[1]/i[1]");
        //6. click stocks button
        dictUseCase_2.put("A: Stocks", "//div[4]/div[1]/ul[1]/li[3]/a[1]\n" +
                "//form[1]/div[4]/div[1]/ul[1]/li[3]/a[1]\n" +
                "//div[3]/form[1]/div[4]/div[1]/ul[1]/li[3]/a[1]\n" +
                "//div[1]/div[3]/form[1]/div[4]/div[1]/ul[1]/li[3]/a[1]\n" +
                "//div[1]/div[1]/div[3]/form[1]/div[4]/div[1]/ul[1]/li[3]/a[1]");
        //7. click input button
        dictUseCase_2.put("INPUT:\n", "//*[@id='product_stock_quantities_delta_quantity_delta']\n" +
                "//div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]\n" +
                "//div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]\n" +
                "//div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]\n" +
                "//div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
        //8. write how much you want to reduce
        //TODO: 8
        //9. click save and publish button
        dictUseCase_2.put("BUTTON: Save and publish", "//*[@id='product_footer_save']\n" +
                "//div[2]/div[1]/div[1]/div[1]/div[2]/button[1]\n" +
                "//form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]\n" +
                "//div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]\n" +
                "//div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]");
    }

}
