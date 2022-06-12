package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;

public class _06_CarvanaTest extends Base{

    @Test(priority = 1,description = "Validate carvana financing dropdown")
    public void testCarvanaDropdown(){
        driver.get("https://www.carvana.com/");
        carvanaPage.financingDropdown.click();
        for (int i = 1; i <carvanaPage.financingDropDowns.size() ; i++) {
            System.out.println(carvanaPage.financingDropDowns.get(i).getText());
        }
        }
        }


