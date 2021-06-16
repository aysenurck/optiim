package page;

import constants.Results_Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.WaitTool;

public class ResultsPage extends Results_Constants {

    String link1;
    String link2;

    public ResultsPage(WebDriver driver) {
        super(driver);

    }

    public ResultsPage checkProducts(){

        clickObjectBy(TELEPHONECATEGORY);
        WaitTool.waitForElementClickable(driver, MOBILEPHONECATEGORY,8);
        clickObjectBy(MOBILEPHONECATEGORY);
        scrollElementBy(PAGENUMBER);
        clickObjectBy(PAGENUMBER);

        String actualUrl="https://www.hepsiburada.com/ara?kategori=2147483642_371965&q=samsung&sayfa=2";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        scrollElementBy(FAVORITEPRODUCT);
        WaitTool.waitForElementClickable(driver,FAVORITEPRODUCT, 7);
        clickObjectBy(FAVORITEPRODUCT);

        return this;
    }

    public void hoverFavoriteMenu(){
        Actions actions = new Actions(driver);
        WebElement hoverElement = driver.findElement(LOGINHOVER);
        actions.moveToElement(hoverElement).perform();
        WaitTool.waitForElementClickable(driver,FAVORITESBUTTON,7);
    }

    public FavoritesPage favoriteProducts(){

        scrollElementBy(FAVORIBUTTON);
      //  WaitTool.waitForElementClickable(driver, FAVORIBUTTON, 5);
        clickObjectBy(FAVORIBUTTON);
        link1 = driver.getCurrentUrl();
      //  System.out.println(link1);
        hoverFavoriteMenu();
        clickObjectBy(FAVORITESBUTTON);
        link2 = driver.findElement(FAVORITEPRODUCTIMAGELINK2).getAttribute("href");
       // System.out.println(link2);
        Assert.assertEquals(link1,link2);
        return new FavoritesPage(driver);
    }

}
