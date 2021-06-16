package constants;

import base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Favorites_Constants extends BasePageUtil {
    public Favorites_Constants(WebDriver driver) {
        super(driver);
    }


    public By SELECTPRODUCT = By.id("#ProductBox-HBV00000VSEEG");
    public By ADDBASKETBUTTON = By.id("#ProductBox-HBV00000VSEEG-AddToCart");
    public By BASKETBUTTON = By.cssSelector("a[title='Sepetim']");
    public By REMOVEBUTTON = By.className("[class='product_delete_1zR-0']");
    public By CHECKPRODUCT = By.cssSelector(".action_container_2xURc > span");
    public By SELECTALL= By.cssSelector("button#StickActionHeader-Name");
}
