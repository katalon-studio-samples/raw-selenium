import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.google.com')
CustomKeywords.'test.KatalonGoogleSearchPage.searchFor'('Katalon Studio')

Thread.sleep(3000)

WebUI.closeBrowser()
