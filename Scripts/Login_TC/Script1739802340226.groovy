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
import SamplePackage.LoginRunner

CucumberKW.runWithCucumberRunner(LoginRunner.class)

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://practice.expandtesting.com/login')
//
//WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'), 
//    'practice')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'), 
//    'T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI')
//
//WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/button_Login'))
//
//WebUI.click(findTestObject('Object Repository/Page_Secure Page page for Automation Testin_836d79/div_You logged into a secure area'))
//
//WebUI.click(findTestObject('Object Repository/Page_Secure Page page for Automation Testin_836d79/i_Logout'))
//
//WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/button_Login'))
//
//WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/div_Your username is invalid'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'), 
//    'practice123')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'), 
//    'T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI')
//
//WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'), 
//    'practice')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'), 
//    'T6bVo8B8lVBe/t9B/+G2yg==')
//
//WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'), 
//    'practice123')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'), 
//    'T6bVo8B8lVBe/t9B/+G2yg==')
//
//WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/button_Login'))
//
//WebUI.closeBrowser()

