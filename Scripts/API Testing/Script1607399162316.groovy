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



def request400 = WS.sendRequest(findTestObject('POST-400'))
def request200 = WS.sendRequest(findTestObject('POST-200'))
def reqExistingEmail = WS.sendRequest(findTestObject('Email_existing'))


WS.verifyResponseStatusCode(request400, 400)
WS.containsString(request400,"The organization name field is required.", false)

WS.verifyResponseStatusCode(request200, 200)
WS.containsString(request200,"test@testlagi.com", false)


WS.verifyResponseStatusCode(reqExistingEmail, 400)
WS.containsString(reqExistingEmail,"It seems that CORPO has already been requested demo account", true)




