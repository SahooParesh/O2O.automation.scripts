import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HRMSSettings {


    @Test
    public static void UpdatePassword() throws InterruptedException {

        String teamMember = "Freddy Test";
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
        WebElement ProfileClick = driver.findElement(By.xpath("(//div[.='Profile'])[last()]"));
        ProfileClick.click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement btnSettings = driver.findElement(By.xpath("//button[text()='Settings']"));
        btnSettings.click();

        WebElement changePassword = driver.findElement(By.xpath("//h6[.='Change Password']"));
        //changePassword.isDisplayed();
        Assert.assertEquals(changePassword.isDisplayed(), true);

        WebElement oldPassword = driver.findElement(By.cssSelector("input[name='oldPassword']"));
        oldPassword.sendKeys("Sahoo@1234");

        //Negative scenario
        WebElement newPassword = driver.findElement(By.cssSelector("input[name='newPassword']"));
        newPassword.sendKeys("newpassword");
        WebElement confirmNewPassword = driver.findElement(By.cssSelector("input[name='confirmNewPassword']"));
        confirmNewPassword.sendKeys("newpassword");
        WebElement btnSave = driver.findElement(By.xpath("//button[.='Save']"));
        btnSave.click();

        WebElement error = driver.findElement(By.xpath("//p[contains(.,'Must Contain 8 Characters, One Uppercase, One Lowercase')]"));
        Assert.assertEquals(error.isDisplayed(), true);

        //Negative scenario
        //Thread.sleep(3000);
        newPassword.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        //Thread.sleep(3000);
        newPassword.sendKeys("Sahoo@12345");
       // Thread.sleep(3000);
        confirmNewPassword.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        confirmNewPassword.sendKeys("Sahoo@12364");
        btnSave.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement errormismatch = driver.findElement(By.xpath("//p[contains(.,'Passwords must match')]"));
        Assert.assertEquals(errormismatch.isDisplayed(), true);

        //Positive scenario
       // Thread.sleep(3000);
        confirmNewPassword.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        confirmNewPassword.sendKeys("Sahoo@12345");
        Thread.sleep(5000);
        btnSave.click();
        Thread.sleep(5000);
        driver.quit();


    }
}