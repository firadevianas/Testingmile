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

WebUI.openBrowser('https://taskdev.mile.app/request-demo')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('taskdev.mile.app/requestDemo'), 3)

WebUI.setText(findTestObject('taskdev.mile.app/fieldName'), 'teststt17791**')

WebUI.setText(findTestObject('taskdev.mile.app/fieldEmail'), 'teststt17791**')

WebUI.verifyElementText(findTestObject('taskdev.mile.app/validationEmail'), 'The email field must be a valid email')

WebUI.setText(findTestObject('taskdev.mile.app/fieldEmail'), 'testing@gmail.com')

WebUI.clickImage(findTestObject('Dev.mile.app/BtnSubmitReqDemo'))

WebUI.verifyElementText(findTestObject('taskdev.mile.app/verifyToastContent'), 'please use your corporate email for this request')

