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

WebUI.openBrowser('https://dev.mile.app/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('BtnReqDemo'))

WebUI.waitForElementVisible(findTestObject('BtnSubmitReqDemo'), 5)

WebUI.setText(findTestObject('FieldName'), 'a')

WebUI.setText(findTestObject('FieldCompanyEmail'), 'aaa')

WebUI.setText(findTestObject('FieldPhoneNum'), 'aaa')

WebUI.setText(findTestObject('FieldCompName'), 'aaa')

Random rand = new Random()

OptionsIndustry = WebUI.getNumberOfTotalOption(findTestObject('FieldTypeIndustry'))

int industry = rand.nextInt(OptionsIndustry)

WebUI.selectOptionByIndex(findTestObject('FieldTypeIndustry'), industry)

//WebUI.verifyEqual(Options, 10)
OptionsJobPosition = WebUI.getNumberOfTotalOption(findTestObject('FieldJobPosition'))

int job = rand.nextInt(OptionsJobPosition)

WebUI.selectOptionByIndex(findTestObject('FieldJobPosition'), job)

OptionsProduct = WebUI.getNumberOfTotalOption(findTestObject('FieldProductType'))

int product = rand.nextInt(OptionsProduct)

WebUI.selectOptionByIndex(findTestObject('FieldProductType'), product)

OptionsUser = WebUI.getNumberOfTotalOption(findTestObject('FieldNumOfUser'))

int user = rand.nextInt(OptionsUser)

WebUI.selectOptionByIndex(findTestObject('FieldNumOfUser'), user)

WebUI.click(findTestObject('BtnSubmitReqDemo'))

WebUI.verifyElementVisible(findTestObject(null))

