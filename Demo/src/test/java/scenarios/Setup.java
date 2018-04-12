package scenarios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Setup {
    protected AppiumDriver androidDriver;


    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("deviceName", "HWCAM-H");
        capabilities.setCapability("app", "/Users/trishachetani/Downloads/CoCoin.apk");
        capabilities.setCapability("appPackage", "com.nightonke.cocoin");
        //capabilities.setCapability("appActivity", "com.nightonke.saver.activity.MainActivity");
        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
}
