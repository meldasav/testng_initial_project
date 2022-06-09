package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _03AmazonTest extends Base {

    @Test(priority = 1)
    public void testAmazonAddressModal() {
        driver.get("https://www.amazon.com/");
        amazonPage.selectYourAddress.click();
        Assert.assertTrue(amazonPage.chooseLocationModal.isDisplayed());
        amazonPage.zipCodeBox.click();
        amazonPage.zipCodeBox.sendKeys("60585");
        Waiter.pause(1);
        amazonPage.apply.click();
        Waiter.pause(1);
        Assert.assertTrue(amazonPage.message.getText().contains("60585"));
    }
}
