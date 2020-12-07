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

WebUI.verifyElementText(findTestObject('taskdev.mile.app/requestDemo'), 'Fill your detail information')

WebUI.setText(findTestObject('taskdev.mile.app/fieldName'), '')

WebUI.setText(findTestObject('taskdev.mile.app/fieldEmail'), '')

WebUI.setText(findTestObject('taskdev.mile.app/fieldPhone'), '')

WebUI.setText(findTestObject('taskdev.mile.app/fieldCompanyName'), '')

WebUI.click(findTestObject('taskdev.mile.app/buttonReqDemo'))

WebUI.verifyElementPresent(findTestObject('taskdev.mile.app/verifyToastFailed'), 0)

WebUI.verifyElementText(findTestObject('taskdev.mile.app/verifyToastContent'), 'The organization name field is required.')

