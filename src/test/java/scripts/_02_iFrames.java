package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _02_iFrames extends Base {

    @Test(priority = 1)
    public void testFrame1() {
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Frames");
        heroAppPage.iFrame.click();
        driver.switchTo().frame(0);
        heroAppPage.text.clear();
        heroAppPage.text.sendKeys("hello world");
        Assert.assertEquals(heroAppPage.text.getText(), "hello world");
        driver.switchTo().parentFrame();
        Assert.assertEquals(heroAppPage.heading3.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");

    }

    @Test(priority = 2)
    public void testFrame2() {
      driver.get("https://www.rediff.com/");
      driver.switchTo().frame(rediffHomePage.moneyIframe);
      for(WebElement element : rediffHomePage.moneyCells){
          Assert.assertTrue(element.isDisplayed());
      }

    }
}


