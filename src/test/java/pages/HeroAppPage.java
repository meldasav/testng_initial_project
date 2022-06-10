package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeroAppPage {
    public HeroAppPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul/li/a")
    public List<WebElement> links;

    @FindBy(xpath = "//a[text()='iFrame']")
    public WebElement iFrame;

    @FindBy(css = "#tinymce>p")
    public WebElement text;

    @FindBy(xpath ="//h3")
    public WebElement heading3;

    @FindBy(id="file-upload")
    public WebElement chooseFile;

    @FindBy(id="file-submit")
    public WebElement upload;

    @FindBy(xpath = "//h3")
    public WebElement fileUploadText;

    @FindBy(id="uploaded-files")
    public WebElement locators;

    @FindBy(linkText = "sample.png")
    public WebElement download;

    public void clickOnLink(String linkText) {
        for (WebElement link : links) {
            if (link.getText().equals(linkText)) {
                link.click();
                break;
            }

        }
    }
}