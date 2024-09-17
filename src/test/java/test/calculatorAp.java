package test;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class calculatorAp {



    public static void main(String[] args) throws MalformedURLException, InterruptedException {
      DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Program Files\\Expert1\\Tango Enterprise\\Expert1.Tango.exe");
        WebDriver driver=new WiniumDriver(new URL("http://localhost:9999"),options);
        Thread.sleep(5000);
        WebElement pane = driver.findElement(By.name("Expert1 Login"));
        pane.click();
        System.out.println("Pane is clicked");
        Thread.sleep(2000);

       List<WebElement> hyperlinks =  pane.findElements(By.xpath("//Hyperlink[@Name='Start']"));
        System.out.println(hyperlinks.size());

        hyperlinks.get(1).click();

        Thread.sleep(5000);
        System.out.println("Start option is clicked");




    }

}

