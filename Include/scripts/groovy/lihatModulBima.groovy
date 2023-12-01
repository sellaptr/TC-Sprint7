import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class lihatModulBima {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am open the app")
	def OpenTheApp() {
		Mobile.startApplication('D:\\MAGANG\\Dokumentasi Manual Case Satudikti\\Sprint 7\\app-release_sprint6.apk', true)

		WebUI.delay(10)
	}

	@When("I am click the skip button")
	def clickSkipButton() {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/BtnSkip'), 0)
	}

	@When("I click the lainnya button")
	def clickLainnyaButton() {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/BtnLainnya'), 0)
	}

	@And("I click the bima modul")
	def clickBimaModul() {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/BtnModulBima'), 0)
	}

	@And("I click the for login button")
	def clickButtonToLogin() {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/BtnLogin'), 0)
		Mobile.takeScreenshot()
	}

	@Then("I on login page")
	def onLoginPage() {
		Mobile.getText(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/Atb_SignIn'), 0)
	}

	@And("I input the email (.*)")
	def inputEmail(String email) {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/InputEmail'), 0)

		Mobile.setText(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/InpEmail'), 'ahmadump@yahoo.co.id', 0)
	}

	@And("I input the password (.*)")
	def inputPassword(String password) {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/InputPassword'), 0)

		Mobile.setText(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/InpPassword'), '481965ah', 0)
	}

	@Then("I click the login button")
	def clickLoginButton() {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/BtnLogin (1)'), 0)

		WebUI.delay(10)
	}

	@And("I on the agree page")
	def onAgreePage() {
		Mobile.getText(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/AtbHiAHMAD'), 0)
	}

	@Then("I click the setuju button")
	def clickSetujuButton() {
		Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-01_001/BtnSetuju'), 0)
	}

	@Then("Iam on the Modul Bima (.*)")
	def onModulBima(String status) {
		WebUI.delay(10)

		Mobile.takeScreenshot()
		Mobile.closeApplication()
	}
}