package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComfyelitePage {
    public ComfyelitePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
        @FindBy(css="a[data-aid='SOCIAL_FACEBOOK_LINK']")
        public WebElement facebookIcon;









}
