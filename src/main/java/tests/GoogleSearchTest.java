package tests;

import base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleSearchTest extends BaseClass {

    @Test
    public void searchGoogle() throws InterruptedException {
        driver.get("http://www.google.com");
        GooglePage page = PageFactory.initElements(driver, GooglePage.class);

        page.searchFor("Cheesus");

        Thread.sleep(8000);
    }
}
