import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HRMSProfile{

@Test
    public static void timeOff() {

         String leaveType = "Feb leave";
         String duration = "Full Day";
         String FromDate = "02/12/2023";
         String ToDate = "02/13/2023";

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
         WebElement ProfileClick= driver.findElement(By.xpath("(//*[@class='MuiListItemText-root css-oc2fzr-MuiListItemText-root'])[2]"));
         ProfileClick.click();
         driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement timeOff = driver.findElement(By.xpath("//button[.='Time Off']"));
        timeOff.click();
        WebElement btnApplyTimeOff = driver.findElement(By.xpath("//button[.='Apply Time Off']"));
        btnApplyTimeOff.click();
        WebElement selTimeOffType = driver.findElement(By.xpath("//button[@title='Open']"));
        selTimeOffType.click();
        WebElement timeOffType = driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
        timeOffType.sendKeys(leaveType);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        timeOffType.sendKeys(Keys.DOWN,Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        /*Select timeofftype = new Select(selTimeOffType);
        timeofftype.selectByVisibleText(leaveType);*/

        List<WebElement> leaveDuration = driver.findElements(By.xpath("(//div[@class='MuiBox-root css-0'])[last()]"));

        for (WebElement leave:leaveDuration) {

            if(leave.getText() == duration){
                leave.click();
                break;
            }

        }

        WebElement selfromDate = driver.findElement(By.xpath("//label[text()='From Date']//following-sibling::div//button"));
        selfromDate.click();

        WebElement fromDate = driver.findElement(By.xpath("//button[@aria-label='Feb 2, 2023']"));
        fromDate.click();
        WebElement seltoDate = driver.findElement(By.xpath("//label[text()='To Date']//following-sibling::div//button"));
        seltoDate.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement toDate = driver.findElement(By.xpath("//button[@aria-label='Feb 3, 2023']"));
        toDate.click();
        WebElement reason = driver.findElement(By.cssSelector("textarea[name='reason']"));
        reason.sendKeys("Testing");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement btnSave = driver.findElement(By.xpath("//button[.='Save']"));
        btnSave.click();
        driver.quit();















    }






}