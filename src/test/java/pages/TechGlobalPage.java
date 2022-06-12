package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechGlobalPage {
    public TechGlobalPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="#img_0_comp-kixnxkbc")
    public WebElement faceBookIcon;

    @FindBy(css="div[id='comp-kixny3ro'] span>span")
    public WebElement techGlobalAddress;

    @FindBy(css = "#comp-kvjohd5t5 span")
    public WebElement registerSessionBox;
}
