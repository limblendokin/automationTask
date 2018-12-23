package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAndAPage extends BasePage {

    @FindBy(tagName = "h1")
    WebElement header;

    public QAndAPage(WebDriver driver){
        super(driver);

        PageFactory.initElements(driver, this);
    }
    public boolean isPageOpened(){
        return header.getText().contains("Thank you for choosing Wrike!");
    }
}
