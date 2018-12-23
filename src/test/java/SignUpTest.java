import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;
import pages.QAndAPage;

import java.util.concurrent.TimeUnit;

public class SignUpTest {
    private WebDriver driver;
    @Before
    public void setup(){
        System.setProperty();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickGetStartedButton();
        mainPage.fillInEmailField("abc+wpt@wriketask.com");
        mainPage.clickCreateAccountButton();

        QAndAPage qAndAPage = new QAndAPage(driver);
        Assert.assertTrue(qAndAPage.isPageOpened());
    }
    @After
    public void quit(){
        driver.quit();
    }

}
