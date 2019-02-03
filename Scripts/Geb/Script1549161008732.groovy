import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import geb.Browser

WebUI.openBrowser("")

WebDriver driver = DriverFactory.getWebDriver()

def browser = new Browser(driver: driver)

Browser.drive(browser) {
	go "https://www.google.com"
	$("[name=q]") << "Katalon Studio"
	$("[name=q]") << Keys.ENTER
}

Thread.sleep(3000)

WebUI.closeBrowser()