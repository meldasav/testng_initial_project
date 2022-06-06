package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01CarTest extends Base {


    @Test(priority = 1,description = "Smoke(Main function)")
    public void login(){
        driver.get("https://www.cars.com/");
        homePage.signInLink.click();
        Assert.assertTrue(signInPage.emailInputBox.isDisplayed() && signInPage.emailInputBox.isEnabled());
        Assert.assertTrue(signInPage.passwordInputBox.isDisplayed() && signInPage.passwordInputBox.isEnabled());
        Assert.assertTrue(signInPage.signInButton.isEnabled() && signInPage.signInButton.getText().equals("Sign in"));

    }

    @Test(priority = 2, description = "Validate Cars.com Sign in page form")
    public void signINLink() {
        driver.get("https://www.cars.com/");
        homePage.signInLink.click();
        Assert.assertTrue(signInPage.heading1.isDisplayed() && signInPage.heading1.getText().equals("Sign in"));
        Assert.assertTrue(signInPage.paragraphUnderSignIn.isDisplayed() && signInPage.paragraphUnderSignIn.getText().equals("New to Cars.com? Sign up. Are you a dealer?"));
        Assert.assertTrue(signInPage.warningUnderPassword.isDisplayed() && signInPage.warningUnderPassword.getText().equals("Minimum of eight characters"));
        Assert.assertTrue(signInPage.forgotPassword.isDisplayed() && signInPage.forgotPassword.isEnabled());
        Assert.assertEquals(signInPage.forgotPassword.getText(), "Forgot password?");
        Assert.assertTrue(signInPage.textUnderForgotPassword.isDisplayed() && signInPage.textUnderForgotPassword.getText().equals("By signing in to your profile, you agree to our  Privacy Statement  and  Terms of Service."));
        Assert.assertTrue(signInPage.signInButton.isDisplayed());


    }

    @Test(priority = 3, description = " Validate Cars.com Sign in page social media section")
    public void socialMediaLink() {
        driver.get("https://www.cars.com/");
        homePage.signInLink.click();
        Assert.assertTrue(signInPage.heading3.isDisplayed() && signInPage.heading3.getText().equals("Connect with social"));
        for (int i = 0; i < 2; i++) {
            Assert.assertTrue(signInPage.socialMedia.get(0).isDisplayed() && signInPage.socialMedia.get(0).isEnabled() &&
                    signInPage.socialMedia.get(0).getText().equals("Sign in with Facebook"));
            Assert.assertTrue(signInPage.socialMedia.get(1).isDisplayed() && signInPage.socialMedia.get(1).isEnabled() &&
                    signInPage.socialMedia.get(1).getText().equals("Sign in with Apple"));
        }
        Assert.assertTrue(signInPage.signInGoogle.isDisplayed() && signInPage.signInGoogle.isEnabled() &&
                signInPage.signInGoogle.getText().equals("Sign in with Google"));

    }

    @Test(priority = 4,description = "Validate user cannot sign in to Cars.com with invalid credentials")
    public void canNotSignIn(){
        driver.get("https://www.cars.com/");
        homePage.signInLink.click();
        signInPage.emailInputBox.sendKeys(" johndoe@gmail.com" + Keys.RETURN);
        signInPage.passwordInputBox.sendKeys("abcd1234" +Keys.RETURN);
        signInPage.signInButton.click();
        System.out.println(signInPage.errorMessage.getText());
        Assert.assertTrue(signInPage.errorMessage.isDisplayed() && signInPage.errorMessage.getText().equals("We were unable to sign you in.\n"+
                "Your email or password was not recognized. Try again soon."));




    }

}
