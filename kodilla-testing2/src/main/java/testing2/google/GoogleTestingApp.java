package testing2.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testing2.config.WebDriverConfig;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "lst-ib";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}

