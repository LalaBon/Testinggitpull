import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePageTest {

    private static ChromeDriver driver;

    public static void main (String[] args)  {

        //Go to the home page  https://kwidos.tk/offer/search
        //Verify title is equal to Kwidos

        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        driver = new ChromeDriver(options);
    }
}

