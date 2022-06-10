package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComfyeliteTest extends Base{

    @Test
 public void validateFacebook(){
        driver.get("https://comfyelite.com/");
        comfyelitePage.facebookIcon.click();
        String cfHomeWindowHandle= driver.getWindowHandle();
        comfyelitePage.facebookIcon.click();

        for(String windowHandle : driver.getWindowHandles()){
            if(!windowHandle.equals(cfHomeWindowHandle))driver.switchTo().window(windowHandle);
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/comfyelite/");
        driver.switchTo().window(cfHomeWindowHandle);
        Assert.assertEquals(driver.getCurrentUrl(),"https://comfyelite.com/");

    }


}
