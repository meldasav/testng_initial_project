package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
    public AmazonPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="#glow-ingress-block")
    public WebElement selectYourAddress;


    @FindBy(css = ".a-popover-wrapper")
    public WebElement chooseLocationModal;


    @FindBy(css="input[class*='GLUX_Full_Width']")
    public WebElement zipCodeBox;

    @FindBy(css = "#GLUXZipUpdate")
    public WebElement apply;

    @FindBy(css="#GLUXZipConfirmationSection")
    public WebElement message;
}
