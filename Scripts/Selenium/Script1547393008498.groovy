import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("")

WebDriver driver = DriverFactory.getWebDriver()

driver.get("http://www.google.com")
WebElement element = driver.findElement(By.name("q"))
element.sendKeys("Katalon Studio")
element.submit()

Thread.sleep(3000)

WebUI.closeBrowser()