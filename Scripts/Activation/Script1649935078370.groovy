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

WebUI.navigateToUrl('https://mail7.io/')

WebUI.setText(findTestObject('Object Repository/Page_Mail 7 - Email workflow testing tool w_96df2e/input_QA Developers_username'), 
	GlobalVariable.email)

WebUI.click(findTestObject('Object Repository/Page_Mail 7 - Email workflow testing tool w_96df2e/input_mail7.io_button is-primary w-50'))

WebUI.click(findTestObject('Object Repository/Page_Mail 7 - Dashboard/p_Mina  ALAMI  no-replyalamisharia.co.id'))

WebUI.switchToWindowTitle('Mail 7 - Dashboard')

WebUI.click(findTestObject('Object Repository/Page_Mail 7 - Dashboard/a_Klik Untuk Aktivasi Email  Log-in'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/a_Masuk ke Akun Saya'))

//WebUI.setText(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/input_Assalamualaikum_username'), 
//    GlobalVariable.email)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/input_Assalamualaikum_password'), 
//    'nwr9I1qT+J0GbQ++JlYjHw==')
//
//WebUI.click(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/a_Masuk Ke Akun Saya'))

