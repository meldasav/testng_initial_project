package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_HeroAppTableTest extends Base {

    @Test(priority = 1, description = "Validate the table 1 headers to be displayed as below")
    public void testSortableDataTables() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");
        String[] expectedText = {"Last Name", "First Name", "Email", "Due", "Web Site", "Action"};
        for (int i = 0; i < heroAppPage.sortableDataTableElements.size(); i++) {
            Assert.assertTrue(heroAppPage.sortableDataTableElements.get(i).isDisplayed());
            Assert.assertEquals(heroAppPage.sortableDataTableElements.get(i).getText(), expectedText[i]);

        }
        //    boolean header1=false;
        for (WebElement element : heroAppPage.table1headers) {
            //       String str=element.getText();
            System.out.println(element.getText());
        }
    }

    @Test(priority = 2, description = "Validate the table 1 row 1 to be displayed")
    public void testTable1Row1() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        for (WebElement element : heroAppPage.table1Row1) {
            System.out.println(element.getText());
        }
    }

    @Test(priority = 3, description = "Validate the table 1 column 2 (First Name) to be displayed ")
    public void testTable1Column2() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        for (WebElement element : heroAppPage.table1Column2) {
            System.out.println(element.getText());
        }
    }

    @Test(priority = 4, description = "Validate each cell has value")
    public void testAllCell() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");
        for (WebElement element : heroAppPage.allCells){
            if(!element.getText().isEmpty()){
                System.out.println(element.getText());
            }
        }
        Assert.assertFalse(heroAppPage.allCells.isEmpty());

    }
}