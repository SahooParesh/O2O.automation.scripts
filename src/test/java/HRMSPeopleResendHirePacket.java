import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HRMSPeopleResendHirePacket {


    @Test
    public static void searchPeople() throws Exception {
        String teamMember = "Aditi Sapre";
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

        WebElement btnSearchEmployee = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div/input"));
        btnSearchEmployee.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement searchedTeamMember = driver.findElement(By.xpath("//span[text()='Aditi Sapre']"));
        Assert.assertEquals(searchedTeamMember.isDisplayed(),true);
        Assert.assertEquals(searchedTeamMember.getText(),teamMember);
        searchedTeamMember.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement editPersonalDetails = driver.findElement(By.xpath("//p[.='Personal']//parent::div/following-sibling::div//button[.='Edit']"));
        editPersonalDetails.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        WebElement btnSave = driver.findElement(By.xpath("//button[.='Save']"));
        btnSave.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        WebElement btnSettings = driver.findElement(By.xpath("//button[@id='access-positioned-button']"));
        //WebElement btnSettings = driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='ArrowDropDownIcon']"));


        try {
            btnSettings.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", btnSettings);
        }


        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement ddresendHirePacket = driver.findElement(By.xpath("//div[.='Resend Hire Packet']"));
        ddresendHirePacket.click();

        WebElement usePersonalemail = driver.findElement(By.xpath("//span[.='Use Employee Personal Email']"));
        usePersonalemail.click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement btnYes = driver.findElement(By.xpath("//button[.='Yes']"));
        btnYes.click();






        /*WebElement PersonalEmail = driver.findElement(By.name("PersonalEmail"));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement Personalemail = driver.findElement(By.xpath("//button[.='Personal Email']"));
        PersonalEmail.sendKeys("pareshsahoo19966@gmail.com");
        Assert.assertEquals(Personalemail.isDisplayed(), true);
        Assert.assertEquals(Personalemail.getText(),email);
        Personalemail.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement workemail = driver.findElement(By.name("WorkEmail"));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement Workemail = driver.findElement(By.cssSelector("textarea[name='Work Email']"));
        Workemail.sendKeys("sahooparesh.qa@gmail.com");
        Assert.assertEquals(Workemail.isDisplayed(),true);
        Assert.assertEquals(Workemail.getText(),email);
        Workemail.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement btnClose = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[1]/text()"));
        btnClose.click();
*/





    }



}
