package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Base {

    WebDriver driver;
    WebDriverWait explicitWait;
    Wait fluentWait;
    SoftAssert softAssert;
    SignInPage signInPage;
    HomePage homePage;
    HeroAppPage heroAppPage;
    RediffHomePage rediffHomePage;
    AmazonPage amazonPage;
    TechGlobalPage techGlobalPage;
    ComfyelitePage comfyelitePage;
    CarvanaPage carvanaPage;
    GooglePage googlePage;



    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        explicitWait = new WebDriverWait(driver, 30);
        fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
        softAssert = new SoftAssert();
        signInPage=new SignInPage(driver);
        homePage=new HomePage(driver);
        heroAppPage=new HeroAppPage(driver);
        rediffHomePage=new RediffHomePage(driver);
        amazonPage=new AmazonPage(driver);
        techGlobalPage=new TechGlobalPage(driver);
        comfyelitePage=new ComfyelitePage(driver);
        carvanaPage=new CarvanaPage();
        googlePage=new GooglePage();
    }

    @AfterMethod

    public void teardown() {
        softAssert.assertAll();
        Driver.quitDriver();
    }


}