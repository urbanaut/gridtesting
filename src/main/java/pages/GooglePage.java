package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage  {

    @FindBy(name = "q")
    private WebElement searchBox;

    public void searchFor(String text) {
        searchBox.sendKeys(text + Keys.ENTER);
        searchBox.submit();
    }
}
