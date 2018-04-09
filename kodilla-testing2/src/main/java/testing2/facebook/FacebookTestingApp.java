package testing2.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testing2.config.WebDriverConfig;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//*[@id=\"reg_form_box\"]";
    public static final String XPATH_SELECT_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_SELECT_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_SELECT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed()) ;

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectD = new Select(selectDay);
        selectD.selectByValue("10");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectM = new Select(selectMonth);
        selectM.selectByValue("10");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectY = new Select(selectYear);
        selectY.selectByValue("1990");
    }
}
