import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("")

WebUI.navigateToUrl("http://www.google.com")
WebUI.sendKeys(findTestObject('Object Repository/SearchBox'), "Katalon Studio")
WebUI.submit(findTestObject('Object Repository/SearchBox'))

Thread.sleep(3000)

WebUI.closeBrowser()