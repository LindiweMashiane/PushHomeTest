import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

@Test

public class NewTours {

    WebDriver driver = null;

    public void TestingTours() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");

        driver = new EdgeDriver(edgeOptions);

        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/login.php");

        driver.findElement(By.name("userName")).sendKeys("Test");
        driver.findElement(By.name("password")).sendKeys("Test");
        driver.findElement(By.name("submit")).click();



    }
}
