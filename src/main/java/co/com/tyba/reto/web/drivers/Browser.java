package co.com.tyba.reto.web.drivers;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Browser {
  @Managed private static WebDriver driver;

  public static Browser chrome() {
    ChromeOptions options = new ChromeOptions();
    String downloadFilepath = System.getProperty("user.dir") + "\\src\\test\\resources\\download";
    HashMap<String, Object> chromePrefs = new HashMap<>();
    chromePrefs.put("profile.default_content_settings.popups", 0);
    chromePrefs.put("download.default_directory", downloadFilepath);
    options.setExperimentalOption("prefs", chromePrefs);
    options.addArguments("test-type");
    options.addArguments("start-maximized");
    options.addArguments("--disable-popup-blocking");
    options.addArguments("--disable-default-apps");
    options.addArguments("test-type=browser");
    options.addArguments("disable-web-security");
    options.addArguments("--allow-running-insecure-content");
    options.addArguments("webdriver.load.strategy", "none");
    options.addArguments("pageLoadStrategy", "none");
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    return new Browser();
  }

  public WebDriver onUrl(String url) {
    driver.get(url);
    return driver;
  }
}
