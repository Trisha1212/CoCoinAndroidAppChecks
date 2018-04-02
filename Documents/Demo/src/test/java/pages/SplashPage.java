package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SplashPage extends BasePage {

    By splashScreen = By.id("navigationBarBackground");
    By firstInformationScreen = By.className("android.widget.ImageView");

    public SplashPage(WebDriver driver) {
        super(driver);
    }

    public SplashPage Login() {
        waitForVisibilityOf(splashScreen);
        waitForVisibilityOf(firstInformationScreen);
        return new SplashPage(driver);

    }
}
