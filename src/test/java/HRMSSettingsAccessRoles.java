import com.sun.xml.internal.ws.api.server.WSEndpoint;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HRMSSettingsAccessRoles {

@Test
    public static void AccessRolesAddFullAdmin() throws Exception {


    String FullAdmin = "Aditi Sapre";
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

    WebElement login = driver.findElement(By.xpath("//button[.='Login']"));
    login.click();
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    WebElement btnSettings = driver.findElement(By.xpath("//div[text()='Settings']"));
    btnSettings.click();
    //Thread.sleep(5000);
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    WebElement btnAccessRoles = driver.findElement(By.xpath("//button[.='Access Roles']"));
    btnAccessRoles.click();
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    WebElement btnFullAdmin = driver.findElement(By.xpath("//h6[.='Full Admin']"));
    btnFullAdmin.click();
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    WebElement AddEmployees = driver.findElement(By.xpath("//button[.='Add Employees']"));
    AddEmployees.click();
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    WebElement searchFullAdmin = driver.findElement(By.xpath("//input[@aria-autocomplete='List']"));
    searchFullAdmin.sendKeys(FullAdmin);
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    searchFullAdmin.sendKeys(Keys.DOWN, Keys.RETURN);
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    WebElement search = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/input"));
    search.sendKeys("Aditi Sapre", Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    WebElement searchedFullAdmin = driver.findElement(By.cssSelector("//value[text()='Aditi Sapre']"));
    Assert.assertEquals(searchedFullAdmin.isDisplayed(), true);
    Assert.assertEquals(searchedFullAdmin.getText(),FullAdmin);
    searchedFullAdmin.click();
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    searchedFullAdmin.sendKeys(Keys.DOWN,Keys.RETURN);
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    WebElement AddEmployeestoFullAdmin = driver.findElement(By.xpath("//button[@title='open'"));
    AddEmployeestoFullAdmin.click();
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    WebElement addEmployeestoFullAdmin = driver.findElement(By.xpath("//input[@aria-autocomplete='List']"));
    addEmployeestoFullAdmin.sendKeys(FullAdmin);
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    addEmployeestoFullAdmin.sendKeys(Keys.DOWN, Keys.RETURN);
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


    Assert.assertEquals(searchedFullAdmin.isDisplayed(), true);
    Assert.assertEquals(searchedFullAdmin.getText(), FullAdmin);
    searchedFullAdmin.click();
    Thread.sleep(5000);
    driver.quit();

     }


    {



    }
    }




































