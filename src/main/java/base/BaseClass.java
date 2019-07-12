package base;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public RemoteWebDriver driver;

    @BeforeTest
    @Parameters("myBrowser")
    public void beforeClass(String myBrowser) throws MalformedURLException {

        if(myBrowser.equals("chrome")){
            DesiredCapabilities capability = new DesiredCapabilities().chrome();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.LINUX);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        }
        else if(myBrowser.equals("firefox")){
            DesiredCapabilities capability = new DesiredCapabilities().firefox();
            capability.setBrowserName("firefox");
            capability.setPlatform(Platform.LINUX);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        }

//        setWebDriver(driver);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public WebDriver getDriver() {
        return driver;
    }


    @AfterClass
    public void afterClass(){
        getDriver().quit();
    }
}
