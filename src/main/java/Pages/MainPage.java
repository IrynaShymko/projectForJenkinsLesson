package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage extends BasePage {
    private static Logger logger = LoggerFactory.getLogger("MainPage.class");

    public MainPage(WebDriver driver) {
        super(driver);
        logger.info("########## MainPage is created");
    }
    public String getWindowTitle(){
        return  driver.getTitle();
    }
}
