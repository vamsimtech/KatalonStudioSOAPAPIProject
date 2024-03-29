import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


println("value of countrycode is"+CountryCode)
response1 = WS.sendRequest(findTestObject('CountryInfoSOAPService/GetCapital', [('CountryCode') : CountryCode]))

println("value of Capital is"+Capital)
WS.verifyElementText(response1, 'CapitalCityResponse.CapitalCityResult', Capital)


response2 = WS.sendRequest(findTestObject('CountryInfoSOAPService/GetCurrency', [('CountryCode') : CountryCode]))

println("value of Currency1 is"+Currency1)
WS.verifyElementText(response2, 'CountryCurrencyResponse.CountryCurrencyResult.sName', Currency1)
