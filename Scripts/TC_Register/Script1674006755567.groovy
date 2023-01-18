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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bioskoponline.com/')

WebUI.click(findTestObject('Object Repository/homePage_noLogin/btn_Daftar'))

WebUI.setText(findTestObject('Object Repository/registerPage/form_name'), 'tes akun')

WebUI.setText(findTestObject('Object Repository/registerPage/form_email'), 'izza.test1@gmail.com')

WebUI.setText(findTestObject('Object Repository/registerPage/form_phone'), '08976854755')

WebUI.setEncryptedText(findTestObject('Object Repository/registerPage/form_password'), 
    'WpeBNiXMWlbvXpC6YuojlQ==')

WebUI.click(findTestObject('Object Repository/registerPage/btn_Lanjutkan'))

//switch tab
WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('gmail.com')

WebUI.switchToWindowTitle('Gmail')

WebUI.setText(findTestObject('Object Repository/gmailPage/input_to continue to Gmail_identifier'), 'izza.test1@gmail.com')

WebUI.click(findTestObject('gmailPage/btn_next'))

WebUI.setEncryptedText(findTestObject('Object Repository/gmailPage/input_Too many failed attempts_Passwd'), 'hT2pmnZmo6CV+wjkB23gYw==')

WebUI.click(findTestObject('Object Repository/gmailPage/span_Next'))

WebUI.setText(findTestObject('Object Repository/gmailPage/input_Search_q'), 'bioskoponline \n')

WebUI.click(findTestObject('Object Repository/gmailPage/span_Aktivasi Akun Bioskop Online'))

OTP = WebUI.getText(findTestObject('Object Repository/gmailPage/p_2431'))

WebUI.switchToWindowTitle('Bioskop Online')

WebUI.setText(findTestObject('Object Repository/registerPage/box_otp1'), OTP[0])

WebUI.setText(findTestObject('Object Repository/registerPage/box_otp2'), OTP[1])

WebUI.setText(findTestObject('Object Repository/registerPage/box_otp3'), OTP[2])

WebUI.setText(findTestObject('Object Repository/registerPage/box_otp4'), OTP[3])

WebUI.click(findTestObject('Object Repository/registerPage/btn_Lanjutkan2'))

WebUI.click(findTestObject('Object Repository/registerPage/btn_Lengkapi nanti saja'))

WebUI.click(findTestObject('homePage_login/iconProfile'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('homePage_login/email_forVerify'), 'izza.test1@gmail.com')

