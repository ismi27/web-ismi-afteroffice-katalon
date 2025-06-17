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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.setText(findTestObject('Object Repository/Text Box/input_Full Name_userName'), 'Ismi')

WebUI.setText(findTestObject('Object Repository/Text Box/input_Email_userEmail'), 'ismyisname@gmail.com')

WebUI.setText(findTestObject('Object Repository/Text Box/textarea_Current Address_currentAddress'), 'Jakarta Timur')

WebUI.setText(findTestObject('Object Repository/Text Box/textarea_Permanent Address_permanentAddress'), 'Jakarta Timur')

WebUI.click(findTestObject('Text Box/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Text Box/text_name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Text Box/text_email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Text Box/text_currentAddress'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Text Box/text_permanentAddress'))

WebUI.closeBrowser()

