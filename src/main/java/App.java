import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://moodle.iescendrassos.net");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("username")).sendKeys("d23");
        driver.findElement(By.id("password")).sendKeys("ViperStarZ!!!");
        driver.findElement(By.id("loginbtn")).click();
        driver.findElement(By.linkText("MÒDUL 3: PROGRAMACIÓ 2")).click();
        System.out.println(driver.findElements(By.partialLinkText("Tasca")).size()+1+"chocolata");




    }
}
