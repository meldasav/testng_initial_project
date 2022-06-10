package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class UploadFile extends Base{

    @Test(priority = 1,description = "File upload")
    public void testFileUpload1(){
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Upload");
        heroAppPage.chooseFile.sendKeys("/Users/meldasav/IdeaProjects/testng_initial_project/myFileTech2.xls");
        Waiter.pause(5);
        heroAppPage.upload.click();
        Assert.assertEquals(heroAppPage.fileUploadText.getText(),"File Uploaded!");
        Assert.assertEquals(heroAppPage.locators.getText(),"myFileTech2.xls");

    }
    @Test(priority = 2,description = "File download")
    public void testFileDownload(){
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Download");
        heroAppPage.download.click();
    }
}
