package constants;

import base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Results_Constants extends BasePageUtil {
    public Results_Constants(WebDriver driver) {
        super(driver);
    }


    public By TELEPHONECATEGORY = By.cssSelector("ol#categoryList > li:nth-of-type(1)");
    public By MOBILEPHONECATEGORY = By.cssSelector("ol#categoryList > li:nth-of-type(3)");
    public By PAGENUMBER = By.cssSelector("[class='page-2 ']");
    public By FAVORITEPRODUCT = By.cssSelector(".do-flex.list.product-list.results-container > li:nth-of-type(5)");
    public By FAVORIBUTTON = By.cssSelector("div:nth-of-type(1) > .Like-1divm");
    public By FAVORITEPRODUCTIMAGELINK2 = By.cssSelector("[href='https\\:\\/\\/www\\.hepsiburada\\.com\\/samsung-galaxy-m21-64-gb-samsung-turkiye-garantili-p-HBV00000VSEEG']");
    public By FAVORITESBUTTON = By.cssSelector("a[title='Beğendiklerim']");
    public By LOGINHOVER = By.id("myAccount");


}
