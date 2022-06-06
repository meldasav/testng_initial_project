package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SignInPage {
    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "h1")
    public WebElement heading1;

    @FindBy(css="p[class='sds-page-section__title--sub signup-block']")
    public WebElement paragraphUnderSignIn;

    @FindBy(css="input[name='user[email]'")
    public WebElement emailInputBox;

    @FindBy(css = "input[name='user[password]'")
    public WebElement passwordInputBox;

    @FindBy(css = ".sds-helper-text")
    public WebElement warningUnderPassword;

    @FindBy(xpath = "//div[@class='password-help']//a")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[@class='sds-disclaimer ']")
    public WebElement textUnderForgotPassword;

    @FindBy(xpath = "//div[@class='sds-field']/button")
    public WebElement signInButton;

    @FindBy(css ="h3[class='social-title sds-heading--3']")
    public WebElement heading3;

    @FindBy(xpath = "//li[@class='social-link']/a")
    public List<WebElement> socialMedia;

    @FindBy(css="a[class='sds-button google-button']")
    public WebElement signInGoogle;

    @FindBy(css = "div[class*='sds-notification sds-notification--error']")
    public WebElement errorMessage;
}
