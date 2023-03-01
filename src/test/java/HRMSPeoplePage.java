import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HRMSPeoplePage {


    @Test
    public static void searchPeople() throws Exception {

        String teamMember = "Damon Test";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\T470\\IdeaProjects\\O2OHRMS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://test.o2ohrms.com/app";
        driver.get(baseUrl);

        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("hebikiy121@octovie.com");
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("Sahoo@12345");

        WebElement loginButton = driver.findElement(By.xpath("//button[.='Login']"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement btnPeople = driver.findElement(By.xpath("//div[text()='People']"));
        btnPeople.click();
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement btnViewTeamMember = driver.findElement(By.xpath("//button[.='View Team Members']"));
        btnViewTeamMember.click();

        WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search...']"));
        search.sendKeys(teamMember);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement searchedTeamMember = driver.findElement(By.xpath("//span[text()='"+teamMember+"']"));
        Assert.assertEquals(searchedTeamMember.isDisplayed(), true);
        Assert.assertEquals(searchedTeamMember.getText(), teamMember);

        takeSnapShot(driver, "C://Users//T470//Desktop//test.png");
        searchedTeamMember.click();
        Thread.sleep(5000);
        driver.quit();


    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }

}
