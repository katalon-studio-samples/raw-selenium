import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import geb.Browser
import test.GebGoogleSearchPage

WebUI.openBrowser("")

WebDriver driver = DriverFactory.getWebDriver()

def browser = new Browser(driver: driver)

Browser.drive(browser) {
	to GebGoogleSearchPage
	searchFor("Katalon Studio")
}

Thread.sleep(3000)

WebUI.closeBrowser()