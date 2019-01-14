package test
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class KatalonGoogleSearchPage {

	@Keyword
	def searchFor(String word) {
		WebUI.sendKeys(findTestObject('Object Repository/SearchBox'), word);
		WebUI.submit(findTestObject('Object Repository/SearchBox'))
	}
}