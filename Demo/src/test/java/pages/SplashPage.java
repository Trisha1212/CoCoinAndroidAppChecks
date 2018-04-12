package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SplashPage extends BasePage {

    By splashScreen = By.id("navigationBarBackground");
    By firstInformationScreen = By.className("android.widget.ImageView");

    public SplashPage(AppiumDriver driver) {
        super(driver);
    }


    public SplashPage Login() throws InterruptedException {
        waitForVisibilityOf(splashScreen);
        waitForVisibilityOf(firstInformationScreen);
        Thread.sleep(10000);
        swipeRightToLeft();
        swipeRightToLeft();
        swipeRightToLeft();
        swipeRightToLeft();
        return new SplashPage(driver);

    }
}
