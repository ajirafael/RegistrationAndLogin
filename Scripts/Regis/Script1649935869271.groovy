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

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/register')

WebUI.click(findTestObject('Object Repository/Page_ALAMI Daftar  ALAMI Peer-to-Peer Lendi_33cbd2/div_Pemberi Dana'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Nama Lengkap_name'), 
    'alami')

//Email
int Number = new Random().nextInt((1000 - 1) + 1) + 10

String Counter1 = 'alami' + Number

String email = Counter1 + '@mail7.io'

GlobalVariable.email = email

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email', [
            (GlobalVariable.email) : GlobalVariable.email]), GlobalVariable.email)

//Phone
int Number1 = new Random().nextInt((999999999 - 10) + 1) + 10

String phone = '0812' + Number1

GlobalVariable.phone = phone

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_No. Handphone_phone', 
        [(GlobalVariable.phone) : GlobalVariable.phone]), GlobalVariable.phone)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Password_password'), 
    'MkYMwbEwh14SDIKjyBLTfA==')

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/label_Individual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/select_-- Silahkan Pilih --                _9f24ad'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/h5_Kebijakan Privasi  Ketentuan Pengguna'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/p_Bismillahirrahmanirrahim'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Saya sudah membaca dan setuju dengan__c3b002'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan_1'))

WebUI.delay(5)

