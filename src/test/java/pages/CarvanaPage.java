package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CarvanaPage {
    public CarvanaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[data-cv-test='headerFinanceDropdown']")
    public WebElement financingDropdown;

    @FindBy(css = "div[data-cv-test*='headerFinanceDropdown'] a") //1 of 4
    public List<WebElement> financingDropDowns;
}
