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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_123456'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__systemUseruserName'), '1234')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/span_Should have at least 5 characters'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'test')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Employee Name   Employee does not exist _a54bdb'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Change Password_systemUserchkChangePassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input__systemUserpassword'), 'gI2mlAjwl1k=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input__systemUserconfirmPassword'), 'gI2mlAjwl1k=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/span_Should have at least 8 characters'))

WebUI.doubleClick(findTestObject('Object Repository/Page_OrangeHRM/input__systemUseremployeeNameempName'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'a')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Aaliyah Haq'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__systemUseruserName'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Welcome Paul'))


WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), '1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'gI2mlAjwl1k=')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.closeBrowser()
