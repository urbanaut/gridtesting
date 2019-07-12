package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestParallel extends BaseClass{

    @Test
    public void test_01() throws InterruptedException, MalformedURLException {
        try{
            getDriver().navigate().to("http://www.w3schools.com/");

//            getDriver().findElement(By.xpath("html/body/div[2]/div/a[4]")).click();

            getDriver().findElement(By.xpath("//a[text()='EXAMPLES ']")).click();

            getDriver().findElement(By.xpath("//*[@id='gsc-i-id1']")).sendKeys("test");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
