import okhttp3.Address;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.UploadFile;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

import java.util.concurrent.TimeUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HRMSLoginTest {



    @Test
         public static void Login() {
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
        //Assert.assertTrue(true,"test pass");

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
       //Celebrations More
//       WebElement ViewMoreSelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/button"));
//       ViewMoreSelect.click();
//       driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

       //WebElement CloseViewMore = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button"));
       //CloseViewMore.click();

       //Announcements

//        WebElement AnnounceMentClick= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/button"));
//        AnnouncementClick.click();
//
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//
//        WebElement AnnouncementClose= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button"));
//        AnnouncementClose.click();
//
//        //WelcomeToContactPoint360
//        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
//
//        WebElement SelectWelcomeToContactPoint360 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/div/div[2]/button"));
//        SelectWelcomeToContactPoint360.click();
//
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//
//        WebElement CloseWelcome360= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button"));
//        CloseWelcome360.click();
//        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

     //Profile
        WebElement ProfileClick= driver.findElement(By.xpath("(//*[@class='MuiListItemText-root css-oc2fzr-MuiListItemText-root'])[2]"));
        ProfileClick.click();


        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        //Profile-Edit


        WebElement ProfileEditClick= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[11]/button"));
        ProfileEditClick.click();

        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);

//        WebElement EmployeeID = driver.findElement(By.name("bambooId"));
//        EmployeeID.clear();
//        EmployeeID.sendKeys("55555");

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement PersonalContact = driver.findElement(By.name("PersonalPhone"));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        String s= Keys.chord(Keys.CONTROL, "a");
        PersonalContact.sendKeys(s);
        PersonalContact.sendKeys(Keys.DELETE);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        PersonalContact.sendKeys("123456789012345");

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        WebElement WorkPhone = driver.findElement(By.name("workPhone"));
        String s1= Keys.chord(Keys.CONTROL, "a");
        WorkPhone.sendKeys(s1);
        WorkPhone.sendKeys(Keys.DELETE);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WorkPhone.sendKeys("123456789012345");

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement SaveClick= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
        SaveClick.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        //Profile Files
//        WebElement ProfileFiles= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/button[2]"));
//        //ProfileFiles.sendKeys(Keys.F5);
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//        ProfileFiles.click();
//
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement PanCardSelect= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div/button"));
//        PanCardSelect.click();
//        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MILLISECONDS);
//
//        WebElement PanCardName= driver.findElement(By.name("fieldValues.PAN Card"));
//        PanCardName.click();
//        PanCardName.sendKeys("GFWPS6210B");
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement PanCardExpiryDate= driver.findElement(By.name("name=\"PAN Card Expiry Date\""));
//        PanCardExpiryDate.sendKeys("10/22/2026");

        //Attendance

        WebElement AttendanceClick= driver.findElement(By.xpath("(//*[@class='MuiListItemText-root css-oc2fzr-MuiListItemText-root'])[4]"));
        AttendanceClick.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        WebElement ADDTimeSelect= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[2]/div/button[2]"));
        ADDTimeSelect.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        WebElement SelectProjectType= driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
        SelectProjectType.sendKeys("apple");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        SelectProjectType.sendKeys(Keys.DOWN,Keys.RETURN);

        //time OFF
        //WebElement TimeOffClick= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/header/div/div[1]/button[2]"));
        //TimeOffClick.click();
        //driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        //Time Off Log

        //WebElement TimeOffLogClick= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/button[3]"));
        //TimeOffLogClick.click();
        //driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        //Select TimeOff Type
        //WebElement SelectTimeOffLogType= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div"));
        //SelectTimeOffLogType.click();
        //driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        //WebElement TimeOffType = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div"));

        //Select TimeOffTypeSelect = new Select(TimeOffType);

        //TimeOffTypeSelect.selectByVisibleText("Leave Without Pay");

//        WebElement TimeOffValueSelect = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
//        TimeOffValueSelect.click();
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement ApplyClick = driver.findElement(By.xpath("*//div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/input"));
//        ApplyClick.click();
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement ApplyTimeOffSelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button"));
//        ApplyTimeOffSelect.click();
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement timeOffTypeDropDown = driver.findElement(By.xpath("//*[@value=\"Leave Without Pay\"]"));
//        timeOffTypeDropDown.click();
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement FromDateSelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/form/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/input"));
//        FromDateSelect.sendKeys("02/09/2023");
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement ToDateSelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/form/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[3]/div/input"));
//        ToDateSelect.sendKeys("02/10/2023");
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//
//        WebElement ReasonType = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/button[2]"));
//        ReasonType.sendKeys("Test");
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        //WebElement TimeOffType1 = driver.findElement(By.xpath("//div[contains(@aria-haspopup,'listBox') and contains(@class,'MuiSelect-select MuiSelect-outlined')][1]"));

        //driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        //WebElement SelectTimeOffLogType= driver.findElement(B);
        //SelectTimeOffLogType.click();



        //Add New Address

//        WebElement AddNewAddress= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[2]/div[2]/div[1]/div"));
//        AddNewAddress.click();
//
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//
//        WebElement SelectAddressType=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div[1]/div/div/div"));
//        SelectAddressType.click();
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//        String s2= Keys.chord(Keys.ARROW_DOWN);
//        WorkPhone.sendKeys(s2);

        //Address Edit

        WebElement AddressEdit=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/button[1]"));
        AddressEdit.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement SaveButton=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
        SaveButton.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //Profile-Job-edit

        //WebElement ProfileJobEdit=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[3]/div/div/div[10]/button[2]"));
        //ProfileJobEdit.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        //Profile-files

       //WebElement ProfileFilesSelect=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/button[2]"));
       //ProfileFilesSelect.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        //Profile Personal Document

        //WebElement PANCARDUploadSelect=driver.findElement(By.xpath('"//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/button[3]"));
        //PANCARDUploadSelect.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //SelectAADHARUpload
        //WebElement AADHARUploadSelect=driver.findElement(By.xpath(//*[@id="\root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div/button"));
        //AADHARUploadSelect.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //SelectElectionIDUpload
        //WebElement ElectionIDUploadSelect=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[1]/div[3]/div/div/button"));
        //ElectionIDUploadSelect.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //SelectDRIVINGLICENSE
        //WebElement DRIVINGLICENSEUploadSelect=driver.findElement(By.xpath(//*[@id="root"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[1]/div[4]/div/div/button"));
        //DRIVINGLICENSEUploadSelect.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        //Profile-Settings

        WebElement ProfileSettingsSelect=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/button[3]"));
        ProfileSettingsSelect.click();

        //SelectOLDPassword
        //WebElementOLDPassword = driver.findElement(By.name("OLDPassword"));
        //OLDPassword.click();
        //OLDpPassword.sendKeys("Test@123");

        //People

        WebElement PeopleSelect=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[2]"));
      //PeopleSelect.Click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        //Attendance

//        WebElement AttendanceClick= driver.findElement(By.xpath("(//*[@id="root"]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[4]/div[2]"));
//        AttendanceClick.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //AttendanceViewHistory
          WebElement viewHistorySelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[2]/div/button[1]"));
          viewHistorySelect.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //Add Time

        //WebElement AddTime = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[2]/div/button[2]));
        //AddTimeClick.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //AddTimeSubmitButton
          WebElement SubmitButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
          SubmitButton.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        //Files

//         WebElement FilesClick= driver.findElement(By.xpath("([//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/button[2]"));
        // FilesClick.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //UploadFiles
           WebElement uploadFiles = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/button[1]"));
         //UploadFileClick.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //SelectCancel
          WebElement CancelButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[1]"));
          CancelButton.click();
          driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //SelectAddFolder
           WebElement AddFolderSelect = driver.findElement(By.xpath("//*[//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/button[2]"));
           AddFolderSelect.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //Reports
           WebElement ReportsSelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[6]/div[2]"));
           ReportsSelect.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //SelectEmployeeReport
           WebElement EmployeeReportsSelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[1]/ul/div/div[1]/p/div/span"));
           EmployeeReportsSelect.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //EmployeeReportsBack
           WebElement EmployeeReportsBack = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[2]/div/button[1]"));
           EmployeeReportsBack.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //SelectTimeOffTypeReport
           WebElement TimeOffTypeReportSelect = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[3]/ul/div/div[1]/p/div/span"));
           TimeOffTypeReportSelect.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //TimeOffTypeReportBack
           WebElement TimeOffTypeBack = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[2]/div/button[1]"));
           TimeOffTypeBack.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //TimeOffPolicyReport
           WebElement TimeOffPolicyReport = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[7]/ul/div/div[1]/p/div/span"));
         //TimeOffPolicyReportBack.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

         //EmployeeTurnOverReport
           WebElement EmployeeTurnOverReport = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[11]/ul/div/div[1]/p/div"));
           EmployeeTurnOverReport.click();
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

          //ProjectSummary
            WebElement ProjectSummary = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/ul/div/div[1]/p/div"));
          //ProjectSummarySelect.click();
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

          //ProjectSummaryBack
            WebElement ProjectSummaryBack = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[2]/div/button[1]"));
            ProjectSummaryBack.click();
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);











































        }
    }

