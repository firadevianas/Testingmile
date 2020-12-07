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

WebUI.click(findTestObject('Dev.mile.app/BtnReqDemo'))

WebUI.waitForElementVisible(findTestObject('Dev.mile.app/BtnSubmitReqDemo'), 5)

WebUI.setText(findTestObject('Dev.mile.app/FieldName'), 'Halo')

WebUI.setText(findTestObject('Dev.mile.app/FieldCompanyEmail'), 'Hallo@hello.com')

WebUI.setText(findTestObject('Dev.mile.app/FieldPhoneNum'), '83388878989')

WebUI.setText(findTestObject('Dev.mile.app/FieldCompName'), 'CORPO')

Random rand = new Random()

OptionsIndustry = WebUI.getNumberOfTotalOption(findTestObject('Dev.mile.app/FieldTypeIndustry'))

int industry = rand.nextInt(OptionsIndustry)

WebUI.selectOptionByIndex(findTestObject('Dev.mile.app/FieldTypeIndustry'), industry)

//WebUI.verifyEqual(Options, 10)
OptionsJobPosition = WebUI.getNumberOfTotalOption(findTestObject('Dev.mile.app/FieldJobPosition'))

int job = rand.nextInt(OptionsJobPosition)

WebUI.selectOptionByIndex(findTestObject('Dev.mile.app/FieldJobPosition'), job)

OptionsProduct = WebUI.getNumberOfTotalOption(findTestObject('Dev.mile.app/FieldProductType'))

int product = rand.nextInt(OptionsProduct)

WebUI.selectOptionByIndex(findTestObject('Dev.mile.app/FieldProductType'), product)

OptionsUser = WebUI.getNumberOfTotalOption(findTestObject('Dev.mile.app/FieldNumOfUser'))

int user = rand.nextInt(OptionsUser)

WebUI.selectOptionByIndex(findTestObject('Dev.mile.app/FieldNumOfUser'), user)

WebUI.click(findTestObject('Dev.mile.app/BtnSubmitReqDemo'))

WebUI.verifyElementText(findTestObject('Dev.mile.app/SuccessSubmit1'), 'Thank you for submitting!')

WebUI.verifyElementText(findTestObject('Dev.mile.app/SuccessSubmit2'), 'Our team will contact you.')

