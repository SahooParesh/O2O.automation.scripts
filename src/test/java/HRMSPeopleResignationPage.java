import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HRMSPeopleResignationPage {



    @Test
    public static void searchTeamMember() throws Exception {
        String TeamMember = "Richard Test";
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

        WebElement btnSearchTeamMember = driver.findElement(By.xpath("//button[.='SearchTeamMember']"));
        btnSearchTeamMember.click();

        WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search...']"));
        search.sendKeys(TeamMember);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement searchedTeamMember = driver.findElement(By.xpath("//span[text()='Richard Text"));
        Assert.assertEquals(searchedTeamMember.isDisplayed(), true);
        Assert.assertEquals(searchedTeamMember.getText(), TeamMember);
        searchedTeamMember.click();
        Thread.sleep(5000);
        driver.quit();



    }


}























