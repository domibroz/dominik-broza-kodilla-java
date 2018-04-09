package testing2.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testing2.config.WebDriverConfig;

public class EBayTestingApp {
    public static final String SEARCHFIELD = "gh-ac";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.ebay.com");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
