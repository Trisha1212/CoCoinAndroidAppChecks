package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AppiumTest extends Setup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        androidDriver.quit();
    }

    @Test
    public void splashTest() throws InterruptedException {
        new SplashPage(androidDriver).Login();
    }

}

