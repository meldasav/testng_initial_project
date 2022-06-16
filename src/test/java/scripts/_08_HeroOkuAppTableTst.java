package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _08_HeroOkuAppTableTst extends Base {

    @Test(priority = 1, description = "Validate the table 1 headers to be displayed")
    public void testTable1() {
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> tableHeading1 = driver.findElements(By.xpath("//table[@id='table1']//th"));
        String[] heading1texts = {"Last Name", "First Name", "Email", "Due", "Web Site", "Action"};

        for (int i = 0; i < tableHeading1.size(); i++) {
            Assert.assertTrue(tableHeading1.get(i).isDisplayed());
            Assert.assertEquals(tableHeading1.get(i).getText(), heading1texts[i]);
            System.out.println(tableHeading1.get(i).getText());

        }
    }
    

    @Test(priority = 2, description = "Tables |first row")
    public void testFirstRow() {
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> table1Row1 = driver.findElements(By.cssSelector("#table1>tbody>tr:nth-child(1)>td"));

        String[] table1Row1Text = {"Smith", "John", "jsmith@gmail.com", "$50.00", "http://www.jsmith.com", "edit delete"};

        for (int i = 0; i < table1Row1.size(); i++) {
            Assert.assertTrue(table1Row1.get(i).isDisplayed());
            Assert.assertEquals(table1Row1.get(i).getText(), table1Row1Text[i]);
            System.out.println("************" + table1Row1.get(i).getText() + "************");

        }
    }

    @Test()
    public void testSecondRow() {
        List<WebElement> table1ROw2 = driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td"));
        String[] table1Row2Text = {"Bach", "Frank", "fbach@yahoo.com", "$51.00", "http://www.frank.com", "edit delete"};
        for (int i = 0; i < table1ROw2.size(); i++) {
            Assert.assertTrue(table1ROw2.get(i).isDisplayed());
            Assert.assertEquals(table1ROw2.get(i).getText(), table1Row2Text[i]);
            System.out.println("************" + table1ROw2.get(i).getText() + "************");
        }

    }

    @Test(priority = 3, description = "Tables | 2nd Column")
    public void testSecondColumn() {
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        //    List<WebElement> table1Column2 = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));

        List<WebElement> table1Column2 = driver.findElements(By.cssSelector("#table1>tbody td:nth-child(2))"));
        String[] table1Column2Text = {"John", "Frank", "Jason", "Tim"};

        for (int i = 0; i < table1Column2.size(); i++) {
            Assert.assertTrue(table1Column2.get(i).isDisplayed());
            Assert.assertEquals(table1Column2.get(i).getText(), table1Column2Text[i]);
            System.out.println("************" + table1Column2.get(i).getText() + "************");
        }
    }

    @Test(priority = 4, description = "Tables | all cells")
    public void testAllCell() {
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> allCells = driver.findElements(By.cssSelector("#table1 td"));
        System.out.println(allCells.size()); // 24

        for(WebElement element : allCells){
            System.out.println(element.getText());
            Assert.assertNotEquals(element.getText(), "");
        }
    }


}


//        List<WebElement> allCells = driver.findElements(By.xpath("//table[@id='table1']//td"));
//        Assert.assertFalse(allCells.isEmpty(), "They are Empty");


//        boolean value = false;
//        for (WebElement element : allCells) {
//            if (element.getText().toLowerCase().startsWith("j")) {
//                value = true;
//                break;
//            }
//        }
//        Assert.assertTrue(value, "Not found");
//
//    }

