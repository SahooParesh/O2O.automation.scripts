import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HRMSAttendancepage {

    @Test
    public static void AddTime() {


        String ProjectName = "apple123";
        String Date = "02/12/2023";
        String CheckinTime = "12:40 PM";
        String CheckoutTime = "03:40 PM";

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

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div/form/button"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement AttendanceClick = driver.findElement(By.xpath("(//*[@class='MuiListItemText-root css-oc2fzr-MuiListItemText-root'])[2]"));
        AttendanceClick.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement AddTime = driver.findElement(By.xpath("//button[.='AddTime'"));
        AddTime.click();
        WebElement selProject = driver.findElement(By.xpath("//button[@title='open'"));
        selProject.click();
        WebElement projectName = driver.findElement(By.xpath("//input[@aria-autocomplete='List']"));
        projectName.sendKeys();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        projectName.sendKeys(Keys.DOWN, Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        List<WebElement> projectDuration = driver.findElements(By.xpath("(//div[@class='MuiBox-root css 0'])[Last()]"));

        for (WebElement project : projectDuration) {

            project.click();
            break;
        }


    }










}



















