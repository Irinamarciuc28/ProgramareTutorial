package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTests {

    public WebDriver driver;

    @Test
    public void metodaTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");

        //deschidem un browser de chrome

        driver = new ChromeDriver();

        //Facem driverul maximize
        driver.manage().window().maximize();

        //accesam un url specific

        driver.get("https://demo.automationtesting.in/Index.html");

        WebElement SkipSignIn = driver.findElement(By.id("btn2"));
        SkipSignIn.click();

        WebElement FirstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstNameValue = "Irina";
        FirstName.sendKeys(firstNameValue);


        WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        String lastNameValue = "Marinescu";
        LastName.sendKeys(lastNameValue);

        WebElement Adresa = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String AdresaValue = "Strada Soare";
        Adresa.sendKeys(AdresaValue);


        WebElement Email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        String EmailValue = "irina@gmail.com";
        Email.sendKeys(EmailValue);

        WebElement Telefon = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
        String TelefonValue = "0741352998";
        Telefon.sendKeys(TelefonValue);

        WebElement Gen = driver.findElement(By.xpath("//input[@value='FeMale']"));
        Gen.click();

        WebElement Hobbies = driver.findElement(By.id("checkbox2"));
        Hobbies.click();




        //Interactionam cu un drop down clasic > select

        WebElement Skills= driver.findElement(By.id("Skills"));
        Select SkillsDropDown = new Select(Skills);
        SkillsDropDown.selectByVisibleText("Java");

        WebElement Year = driver.findElement(By.id("yearbox"));
        Select YearDropDown = new Select(Year);
        YearDropDown.selectByValue("1990");




        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        WebElement LanguageElement = driver.findElement(By.id("msdd"));
        LanguageElement.click();

        //Interactionam cu o multime de elemente (drop down complex)
        List<WebElement> LanguageOption = driver.findElements(By.cssSelector(".ui-autocomplete>li>a"));
        String ExpectedLanguage = "English";
        for (Integer index=0; index< LanguageOption.size();index ++){
            if (LanguageOption.get(index).getText().equals(ExpectedLanguage)){
                LanguageOption.get(index).click();
            }
        }
        Gen.click();

        WebElement SelectCountry = driver.findElement(By.cssSelector(".select2-selection"));
        SelectCountry.click();

        WebElement SelectCountryInput = driver.findElement(By.className("select2-search__field"));
        SelectCountryInput.sendKeys("Australia");
        SelectCountryInput.sendKeys(Keys.ENTER);



        WebElement Month = driver.findElement(By.cssSelector("select[placeholder = 'Month']"));
        Select MonthDropDown = new Select(Month);
        MonthDropDown.selectByVisibleText("March");


        WebElement Day = driver.findElement(By.cssSelector("select[placeholder = 'Day']"));
        Select DayDropDown = new Select(Day);
        DayDropDown.selectByValue("28");

        WebElement Password = driver.findElement(By.id("firstpassword"));
        String PasswordValue = "1234";
        Password.sendKeys(PasswordValue);


        WebElement ConfirmPass = driver.findElement(By.id("secondpassword"));
        String ConfirmValue = "1234";
        ConfirmPass.sendKeys(ConfirmValue);

    }

}
