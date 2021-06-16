package page;

import constants.Favorites_Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.WaitTool;

public class FavoritesPage extends Favorites_Constants {
    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    String checkMessage;

    public FavoritesPage addBasketFavoriteProduct() throws Exception {

        hoverFavoriteProduct();
        clickObjectBy(ADDBASKETBUTTON);
        clickObjectBy(BASKETBUTTON);

        clickObjectBy(SELECTALL);
        clickObjectBy(REMOVEBUTTON);
        sleep(3000);
        checkMessage = driver.findElement(CHECKPRODUCT).getText();
        Assert.assertEquals("Ürün sepetinizden silinmiştir",checkMessage);
        this.takeSnapShot(driver, "D:\\web\\src\\main\\resources\\test.png") ;
        return this;

    }

    public void hoverFavoriteProduct(){
        Actions actions = new Actions(driver);
        WebElement hoverElement = driver.findElement(SELECTPRODUCT);
        actions.moveToElement(hoverElement).perform();
        WaitTool.waitForElementClickable(driver,ADDBASKETBUTTON,7);
    }


}
