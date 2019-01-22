

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {
		@Test
		public void Magento()
		{
			
		String url = "http://magento.com";

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url );

		Home home = new Home(driver);
		home.clickOnMyAcc();

		Login login = new Login(driver);
		login.typeEmail("nitinmanjunath1991@gmail.com");
		login.typePassword("Welcome123");
		login.clickOnLogin();

		Logout logout = new Logout(driver);
		logout.clickOnLogout();

		driver.quit();



	}

}
