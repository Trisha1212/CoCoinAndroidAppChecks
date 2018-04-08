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
       // driver.swipe(100,100,100,100);
//        int size = driver.manage().window().getSize();
//        System.out.println(size);
//        startx = (int) (size.width * 0.70);
//        endx = (int) (size.width * 0.30);
//        starty = size.height / 2;
//        System.out.println("Start swipe operation");
//        driver.swipe(startx, starty, endx, starty, timeduration);
        return new SplashPage(driver);

    }
}
