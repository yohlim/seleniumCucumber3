package stepDef;

import config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestStep extends env_target {

    //* SCENARIO CASE LOGIN *//

    //Scenario case login positive1
    @Given("^User is on indomine homepage$")
    public void UserIsOnIndomineHomepage() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(indomineLink);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[1]/div[1]/div/header/div/div/div[2]/div[2]/div[1]/div/a[1]"))
        );

    }

    @Then("^user click button login$")
    public void UserClickButtonLogin() {
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[1]/div/header/div/div/div[2]/div[2]/div[1]/div/a[1]")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/main/div[2]/div/div[2]/a[contains(text(),'Kembali ke homepage')]"))
        );
    }

    @And("^user input field email$")
    public void UserInputFieldEmail() {
        driver.findElement(By.xpath("//*[@id='identifier']")).sendKeys("c79980710@gmail.com");
    }

    @And("^user input field password$")
    public void UserInputFieldPassword() {
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("@Cranium123");
    }

    @And("user click button login on login page")
    public void UserClickButtonLoginOnLoginPage() {
        driver.findElement(By.xpath("//*[@id='root']/main/div[2]/div/form/button/p")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']/div/div/div/div/header/div/div/div/div[5]/a")) // terdapat button Listing saya
        );

        driver.quit();
    }

    //Scenario case login positive2
    @Then("user click wording button Kembali ke homepage")
    public void userClickWordingButtonKembaliKeHomepage() {
        driver.findElement(By.xpath("//*[@id='root']/main/div[2]/div/div[2]/a")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[1]/div[1]/div/header/div/div/div[2]/div[2]/div[1]/div/a[1]")) // Muncul button login
        );
        driver.close();

    }

    //Scenario case login negative1

    @And("user input the wrong email")
    public void userInputTheWrongEmail() {
        driver.findElement(By.xpath("//*[@id='identifier']")).sendKeys("c7998071@gmail.com");
    }

    @And("user input the wrong password and click button login")
    public void userInputTheWrongPasswordAndClickButtonLogin() {
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("@Cranium12");
        driver.findElement(By.xpath("//*[@id='root']/main/div[2]/div/form/button/p")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='swal2-title']")) // Muncul alert login failed
        );
        driver.close();

    }
    //Scenario case login negative2

    @And("user input the correct password and click login button")
    public void userInputTheCorrectPasswordAndClickLoginButton() {
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("@Cranium123");
        driver.findElement(By.xpath("//*[@id='root']/main/div[2]/div/form/button/p")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='swal2-title']")) // Muncul alert login failed
        );
        driver.close();

    }

    //Scenario case login negative3
    @And("user input the correct email")
    public void userInputTheCorrectEmail() {
        driver.findElement(By.xpath("//*[@id='identifier']")).sendKeys("c79980710@gmail.com");
    }

    //Scenario case login negative4
    @And("user click button login on login page without input field email and password")
    public void userClickButtonLoginOnLoginPageWithoutInputFieldEmailAndPassword() {

        driver.findElement(By.xpath("//*[@id='root']/main/div[2]/div/form/button/p")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='swal2-title']")) // Muncul alert login failed
        );

        driver.quit();
    }

    //* SCENARIO CASE JUAL BATUBARA *//

    //Scenario case Positive jual barubara

    @And("user click button login on login page and redirect to homepage")
    public void userClickButtonLoginOnLoginPageAndRedirectToHomepage() {
        driver.findElement(By.xpath("//*[@id='root']/main/div[2]/div/form/button/p")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']/div/div/div/div/header/div/div/div/div[5]/a")) // terdapat button Listing saya
        );
    }

    @And("user click button buat listingan")
    public void userClickButtonBuatListingan() {
        driver.findElement(By.xpath("//div[@class='MuiStack-root css-mu3t9k']//button[contains(text(),'Buat Listingan')]")).click();
    }

    @And("user click on button jual batubara")
    public void userClickOnButtonJualBatubara() {
        driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 w-700 css-1929n4j'][contains(text(),'Jual Batubara')]")).click();
    }

    @And("user input field GAR")
    public void userInputFieldGAR() {
        driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("6000");
    }

    @And("user input field TS")
    public void userInputFieldTS() {
        driver.findElement(By.xpath("//*[@id=':r1:']")).sendKeys("4");
    }

    @And("user input field Ash")
    public void userInputFieldAsh() {
        driver.findElement(By.xpath("//*[@id=':r2:']")).sendKeys("5");
    }

    @And("user input field Quantity")
    public void userInputFieldQuantity() {
        driver.findElement(By.xpath("//*[@id=':r3:']")).sendKeys("1000");
    }

    @And("user input field Harga Batubara")
    public void userInputFieldHargaBatubara() {
        driver.findElement(By.xpath("//*[@id=':r4:']")).sendKeys("200000");
    }

    @And("user input field Sumber Batu")
    public void userInputFieldSumberBatu() {
        driver.findElement(By.xpath("//*[@id=':r5:']")).click();
        driver.findElement(By.id(":r5:-option-2")).click(); //list dropdown pada field sumber batu
    }

    @And("user input field loading port")
    public void userInputFieldLoadingPort() {
        driver.findElement(By.xpath("//*[@id=':r7:']")).click();
        driver.findElement(By.id(":r7:-option-2")).click(); //list dropdown pada field loading port
    }

    @And("user input field laycan date")
    public void userInputFieldLaycanDate() {
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[5]/div[2]/div[6]/div/div/div[1]/img")).click(); //membuka pop up calender nya
        driver.findElement(By.xpath("//div[@class='MuiDayCalendar-weekContainer css-mvmu1r']//button[text()='6']")).click(); // untuk mengklik tanggal yang diinginkan
    }

    @And("user upload document from directory")
    public void userUploadDocumentFromDirectory() {
        //untuk mendapatkan file yang ingin diupload
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[7]/div[2]/div[2]/div[1]/input")).sendKeys("C:\\Latihan Automation\\file dummy\\contoh.pdf");
        Duration duration = Duration.ofSeconds(800000);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='react-doc-viewer']"))
        );
    }

    @And("user click button submit")
    public void userClickButtonSubmit() {
        driver.findElement(By.xpath("//div[@class='MuiStack-root css-x260d1']//button[contains(text(),'Submit')]")).click();
        Duration duration = Duration.ofSeconds(800000);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'box-document border-box')]")) // element xpath untuk memvalidasi bahwa dokumen telah berhasil terupload
        );

    }

    @And("user input field description")
    public void userInputFieldDescription() {
        driver.findElement(By.xpath("//*[@id=':rc:']")).sendKeys("Testing by Yohana Limbong");
    }

    @And("user click on button publish")
    public void userClickOnButtonPublish() {
        driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/p[contains(text(),'Listing saya')]")) //Muncul wording 'Listing Saya'
        );
        driver.close();
    }

    //Scenario case negative1 jual barubara
    @And("user click button publish")
    public void userClikcButtonPublish() {
        driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='swal2-html-container'][contains(text(),'Field tidak boleh kosong')]")) //muncul pop up dan mess err 'Masukan value antara 2000 - 9999' dibawah field GAR
        );
        driver.close();
    }
    //* SCENARIO CASE BELI BATUBARA *//

    //Scenario case beli batubara positive1

    @And("user click on button beli batubara")
    public void userClickOnButtonBeliBatubara() {
        driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 w-700 css-1929n4j'][contains(text(),'Beli batubara')]")).click();
    }

    @And("user input field gar beli batubara")
    public void userInputFieldGarBeliBatubara() {
        driver.findElement(By.xpath("//*[@id=':r0:']")).sendKeys("3000");
    }

    @And("user input field TS beli batubara")
    public void userInputFieldTSBeliBatubara() {
        driver.findElement(By.xpath("//*[@id=':r1:']")).sendKeys("2");
    }

    @And("user input field ASH beli batubara")
    public void userInputFieldASHBeliBatubara() {
        driver.findElement(By.xpath("//*[@id=':r2:']")).sendKeys("20");
    }

    @And("user input field Quantity beli batubara")
    public void userInputFieldQuantityBeliBatubara() {
        driver.findElement(By.xpath("//*[@id=':r3:']")).sendKeys("3000");
    }

    @And("user input field laycan date beli batubara")
    public void userInputFieldLaycanDateBeliBatubara() {
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[5]/div[2]/div[2]/div/div[5]/div[1]/div[4]/div[5][contains(text(),'25')]")).click();
    }

    @And("user input field harga beli batubara")
    public void userInputFieldHargaBeliBatubara() {
        driver.findElement(By.xpath("//*[@id=':r4:']")).sendKeys("340000");
    }

    @And("user input loading port beli batubara")
    public void userInputLoadingPortBeliBatubara() {
        driver.findElement(By.xpath("//*[@id=':r5:']")).click();
        driver.findElement(By.xpath("//*[@id=':r5:-option-3']")).click();
    }

    @And("user input field sumber batu beli batubara")
    public void userInputFieldSumberBatuBeliBatubara() {
        driver.findElement(By.xpath("//*[@id=':r7:']")).click();
        driver.findElement(By.xpath("//*[@id=':r7:-option-3']")).click();
    }

    @Then("user click button cari batubara")
    public void userClickButtonCariBatubara() {
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[7]/button[2][contains(text(),'Cari batubara')]")).click();
        Duration duration = Duration.ofSeconds(300000);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 w-700 css-14x0tch'][contains(text(),'Permintaan pembelian batubara')]")) //Muncul wording 'Permintaan pembelian batubara'
        );
        driver.close();
    }

    @Then("appear mess err when user click button cari batubara")
    public void appearMessErrWhenUserClickButtonCariBatubara() {
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[7]/button[2][contains(text(),'Cari batubara')]")).click();
        Duration duration = Duration.ofSeconds(300000);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='swal2-html-container'][contains(text(),'Field tidak boleh kosong')]")) //Muncul pop up err 'field tidak boleh kosong'
        );
        driver.close();
    }

    //* SCENARIO CASE JUAL NICKEL *//

    //Scenario case jual nickel positive1

    @And("user click on button jual nickel")
    public void userClickOnButtonJualNickel() {
        driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 w-700 css-1929n4j'][contains(text(),'Jual Nikel')]")).click();
    }

    @And("user input field Ni on selling form")
    public void userInputFieldNiOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r0:']")).sendKeys("23");
    }

    @And("user input field Fe on selling form")
    public void userInputFieldFeOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r1:']")).sendKeys("45");
    }

    @And("user input field Kadar air on selling form")
    public void userInputFieldKadarAirOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r2:']")).sendKeys("34");
    }

    @And("user input field Si atau Mg on selling form")
    public void userInputFieldSiAtauMgOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r3:']")).sendKeys("2");
    }

    @And("user input field Quantity on selling form")
    public void userInputFieldQuantityOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r4:']")).sendKeys("4000");
    }

    @And("user input field harga nickel on selling form")
    public void userInputFieldHargaNickelOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r5:']")).sendKeys("560000");
    }

    @And("user input field Sumber Batu on selling form")
    public void userInputFieldSumberBatuOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r6:']")).click();
        driver.findElement(By.id(":r6:-option-3")).click(); //list dropdown pada field sumber batu
    }

    @And("user input field loading port on selling form")
    public void userInputFieldLoadingPortOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':r8:']")).click();
        driver.findElement(By.id(":r8:-option-3")).click(); //list dropdown pada field loading port
    }

    @And("user input field Laycan date on selling form")
    public void userInputFieldLaycanDateOnSellingForm() {
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[5]/div[2]/div[6]/div/div/div[1]/img")).click();
        driver.findElement(By.xpath("//div[@class='MuiDayCalendar-weekContainer css-mvmu1r']//button[text()='6']")).click();
    }

    @And("user upload dokumen on selling form")
    public void userUploadDokumenOnSellingForm() {
        //untuk mendapatkan file yang ingin diupload
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[7]/div[2]/div[2]/div[1]/input")).sendKeys("C:\\Latihan Automation\\file dummy\\contoh.pdf");
        Duration duration = Duration.ofSeconds(800000);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='react-doc-viewer']"))
        );

    }

    @And("user click button submit on selling form")
    public void userClickButtonSubmitOnSellingForm() {
        driver.findElement(By.xpath("//div[@class='MuiStack-root css-x260d1']//button[contains(text(),'Submit')]")).click();
        Duration duration = Duration.ofSeconds(800000);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'box-document border-box')]")) // element xpath untuk memvalidasi bahwa dokumen telah berhasil terupload
        );

    }

    @And("user input field deskripsi on selling form")
    public void userInputFieldDeskripsiOnSellingForm() {
        driver.findElement(By.xpath("//*[@id=':rd:']")).sendKeys("Testing by Yohana Limbong");
    }

    @And("user button publish on selling form")
    public void userButtonPublishOnSellingForm() {
        driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/p[contains(text(),'Listing saya')]")) //Muncul wording 'Listing Saya'
        );
        driver.close();
    }
    //Scenario case jual nickel positive2
    @And("user select company to display listing on nickel form")
    public void userSelectCompanyToDisplayListingOnNickelForm() {
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[7]/div[2]/div[5]/div[1]/span/input")).click();
    }
}


