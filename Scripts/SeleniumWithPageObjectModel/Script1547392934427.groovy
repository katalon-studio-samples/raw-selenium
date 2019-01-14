import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import test.GoogleSearchPage

WebUI.openBrowser("")

WebDriver driver = DriverFactory.getWebDriver()

driver.get("http://www.google.com/")
GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class)
page.searchFor("Katalon Studio")

Thread.sleep(3000)

WebUI.closeBrowser()