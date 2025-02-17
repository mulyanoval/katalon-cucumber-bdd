package samplePackage
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

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Include/features", glue = "samplePackage")
class LoginRunner {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open the website")
	def openWebsite() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://practice.expandtesting.com/login')
	}

	@When("I fill in correct username (.*) and correct password (.*)")
	def enterCorrectCredentials(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'),
				username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'),
				password)
	}

	@When("I click Login button")
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/button_Login'))
	}

	@Then("I navigate to the Homepage and see a success message 'You logged into a secure area!'")
	def successMessage() {
		WebUI.click(findTestObject('Object Repository/Page_Secure Page page for Automation Testin_836d79/div_You logged into a secure area'))
	}

	@When("I do not fill in username (.*) and password (.*)")
	def emptyCredentials(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'),
				username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'),
				password)
	}

	@Then("I see an error message 'Your username is invalid!'")
	def emptyCredentialsMessage() {
		WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/div_Your username is invalid'))
	}

	@When("I fill in incorrect username (.*) and correct password (.*)")
	def enterIncorrectUsername(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'),
				username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'),
				password)
	}

	@Then("I see an error message 'Your password is invalid!'")
	def passwordErrorMessage() {
		WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/div_Your password is invalid'))
	}

	@When("I fill in correct username (.*) and incorrect password (.*)")
	def enterIncorrectPassword(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'),
				username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'),
				password)
	}

	//	@Then("I see an error message 'Your password is invalid!'")
	//	def incorrectPasswordMessage() {
	//		WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/div_Your password is invalid'))
	//	}

	@When("I fill in incorrect username (.*) and incorrect password (.*)")
	def enterIncorrectCredentials(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Username_username'),
				username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/input_Password_password'),
				password)
	}

	//	@Then("I see an error message 'Your password is invalid!'")
	//	def incorrectCredentialsMessage() {
	//		WebUI.click(findTestObject('Object Repository/Page_Test Login Page for Automation Testing_75c9a0/div_Your password is invalid'))
	//	}
}