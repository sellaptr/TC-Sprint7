import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\MAGANG\\Dokumentasi Manual Case Satudikti\\Sprint 7\\app-release_sprint6.apk', true)

WebUI.delay(10)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/BtnSkip'), 0)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/BtnLainnya'), 0)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/BtnModulBima'), 0)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/BtnToLogin'), 0)

Mobile.getText(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/AtbSignIn'), 0)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/InputEmail'), 0)

Mobile.setText(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/InpEmail'), 'ahmadump@yahoo.co.id', 0)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/InputPassword'), 0)

Mobile.setText(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/InpPassword'), '481965ah', 0)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/BtnLogin'), 0)

Mobile.getText(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/AtbHiAHMAD'), 0)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/BtnSetuju'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('Object Repository/BIMA/SD-BIMA-02_001/BtnPelajariSelengkapnya'), 0)

Mobile.closeApplication()

