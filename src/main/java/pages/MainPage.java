package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    private String URL = "https://www.wrike.com";

    @FindBy(css = "div.wg-header__desktop > button.wg-header__free-trial-button.wg-btn.wg-btn--green")
    WebElement getStartedButton;

    @FindBy(css = "div.wg-header__desktop > input[name='email']")
    WebElement emailField;

    @FindBy(css = "div#modal-pro > button.wg-btn.wg-btn--blue.modal-form-trial__submit")
    WebElement createAccountButton;

    public MainPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("http://www.wrike.com");
    }

    public void clickGetStartedButton() {
        getStartedButton.click();
    }

    public void fillInEmailField(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public WebDriver clickCreateAccountButton() {
        createAccountButton.click();
        return driver;
    }
}
