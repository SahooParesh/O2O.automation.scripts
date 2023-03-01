import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class HRMSDocumentsPage {


    @Test
    public static void uploadDocuments() throws AWTException, InterruptedException {

        //String documentName = "AADHAR";
        String documentName = "Election ID";
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
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        WebElement btnDocuments = driver.findElement(By.xpath("//button[text()='Documents']"));
        btnDocuments.click();
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);

        WebElement btnUploadPanCard = driver.findElement(By.xpath("//p[text()='" + documentName + "']/parent::div//button"));

        btnUploadPanCard.click();
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
        //WebElement nameOnPanCard = driver.findElement(By.xpath("//p[text()='" + documentName + "']/parent::div//button"));
        //WebElement nameOnPanCard = driver.findElement(By.xpath("//input[@name='fieldValues.PAN Card']"));

        Thread.sleep(5000);
        WebElement nameOnPanCard = driver.findElement(By.xpath("//label[text()='AADHAR']/following-sibling::div/input"));
        /*WebDriverWait  wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='AADHAR']/following-sibling::div/input")));
        */
        nameOnPanCard.sendKeys("Smith");

        WebElement selExpiryDate = driver.findElement(By.xpath("//label[text()='AADHAR Expiry Date']/parent::div//button"));
        selExpiryDate.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement fromDate = driver.findElement(By.xpath("//button[@aria-label='Feb 2, 2023']"));
        fromDate.click();

        WebElement btnDropFile = driver.findElement(By.xpath("//h5[.='Drop or Select file']"));
        // btnDropFile.click();
        //C:\Users\T470\Desktop
        // btnDropFile.sendKeys("/Users/T470/Desktop/PAN.PNG");

        // creating object of Robot class

        Robot rb = new Robot();


        // copying File path to Clipboard
        StringSelection str = new StringSelection("C:\\Users\\T470\\Desktop\\PAN.PNG");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement btnUpload = driver.findElement(By.xpath("(//button[.='Upload'])[last()]"));
        btnUpload.click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        WebElement uploadSuccessMessage = driver.findElement(By.xpath("//div[@id='notistack-snackbar']"));
        String successmessage = uploadSuccessMessage.getText();
        Assert.assertEquals(successmessage, "Update success");
        driver.quit();

    }

}
