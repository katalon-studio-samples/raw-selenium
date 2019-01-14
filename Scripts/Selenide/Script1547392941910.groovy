import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.WebDriverRunner
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("")

WebDriver driver = DriverFactory.getWebDriver()

WebDriverRunner.setWebDriver(driver)

Selenide.open("https://www.google.com")
Selenide.$(By.name("q")).val("Katalon Studio").pressEnter()

Thread.sleep(3000)

WebUI.closeBrowser()