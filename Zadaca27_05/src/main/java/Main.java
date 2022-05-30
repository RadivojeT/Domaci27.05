import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mlade\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.stealmylogin.com/demo.html");

       // WebElement username = driver.findElement(By.xpath("/html/body/form/input[1]"));
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Teske92");
       // WebElement password = driver.findElement(By.xpath("/html/body/form/input[2]"));
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("sifra92");
        WebElement login = driver.findElement(By.xpath("/html/body/form/input[3]"));
        login.submit();

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://example.com/";
        if (currentUrl.equals(expectedUrl)){
            System.out.println("Nice.");
        }else {
            System.err.println("Not nice.");
        }


    }
}
