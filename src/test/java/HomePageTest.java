import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HomePageTest {

        private static ChromeDriver driver;

        public static void main (String[] args)  {

            //Go to the home page  https://gmail.com
            //Verify title is equal to Gmail


            ChromeOptions options = new ChromeOptions();
            options.addArguments("ignore-certificate-errors");
            driver = new ChromeDriver(options);
        }


}

