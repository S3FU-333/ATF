package Page;

import Page.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends AbstractPage{

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardSign;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement userMeniu;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement logOutButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
