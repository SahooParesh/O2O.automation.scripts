import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HRMSLogoutTest {


    @Test
    public static void Logout() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\T470\\IdeaProjects\\O2OHRMS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://test.o2ohrms.com/app";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement logout = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/div/header/div/div[2]/div[2]/button/div"));
        logout.click();

        WebElement logoutClick=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/button"));
        //logoutclick.click();
        driver.quit();
        //Assert.assertTrue(true,"test pass");



    }
}