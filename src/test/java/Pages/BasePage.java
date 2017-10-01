package Pages;

import Driver.DriverFactory;
import Driver.MyDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by Alex on 10.09.2017.
 */
public abstract class BasePage {

    protected static WebDriver driver = MyDriver.getMyDriver();
    // WebDriverWait wait = new WebDriverWait(driver, 30);
    protected Logger log= LogManager.getLogger(this.getClass());


    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
