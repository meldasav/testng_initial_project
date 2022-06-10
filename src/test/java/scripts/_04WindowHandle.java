package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _04WindowHandle extends Base{

    @Test(priority = 1,description = "TestCase1")
    public void facebookIcon(){
    driver.get("https://www.techglobalschool.com/");
    String tgHomeWindowHandle=driver.getWindowHandle();
    techGlobalPage.faceBookIcon.click();

    for (String windowHandle : driver.getWindowHandles()){
        if(!windowHandle.equals(tgHomeWindowHandle))driver.switchTo().window(windowHandle);
    }

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/techglobalschool");

    }



}
