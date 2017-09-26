package SanityTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\IJ\\Documents\\geckodriver.exe");
	String exePath = "C:\\Users\\IJ\\Documents\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath );
	

//WebDriver driver = new FirefoxDriver();//launches fire fox browser with blank url
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
String ptitle = driver.getTitle();
System.out.println(ptitle);
driver.close();// closes the browser

	}

}
