package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    public WebDriver driver;

    @Test
    public void metodaTest (){
     //se da driverul pentru brpwser;

     System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");

     //deschidem un browser de chrome

        driver = new ChromeDriver();

        //Facem driverul maximize
        driver.manage().window().maximize();
        //accesam un url specific

        driver.get("https://demo.automationtesting.in/Index.html");

        //declaram elementul signin '
        WebElement SignIn = driver.findElement(By.id("btn1"));
        SignIn.click();

        WebElement email = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "irina@gmail.com";
        email.sendKeys(emailValue);

        WebElement parola = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue  ="Parola";
        parola.sendKeys(parolaValue);

        WebElement Enter =driver.findElement(By.id("enterbtn"));
        Enter.click();

        //validam un mesaj de eroare
        WebElement error = driver.findElement(By.id("errormsg"));
        String expectedError = "Invalid User Name or PassWord";
        String actualError = error.getText();

        Assert.assertEquals(actualError,expectedError, "Eroarea de la login nu e corecta");

    }


}
