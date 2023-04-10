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

WebUI.navigateToUrl('https://teacherpd.ipst.ac.th/')

WebUI.click(findTestObject('Object Repository/Page_IPST  Teacher Professional Development/button_x'))

WebUI.click(findTestObject('Page_IPST/login'))

WebUI.click(findTestObject('Object Repository/Page_IPST/a_'))

WebUI.verifyTextPresent('สมัครสมาชิก', false)

WebUI.click(findTestObject('Page_IPST/1.1'))

WebUI.setText(findTestObject('Page_IPST/1.1.search'), 'นาย')

WebUI.sendKeys(findTestObject('Page_IPST/1.1.search'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__firstName'), 'ทศพล')

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__lastName'), 'นิลเพชร')

WebUI.click(findTestObject('Page_IPST/1.2'))

WebUI.setText(findTestObject('Page_IPST/1.2.search'), 'ชาย')

WebUI.sendKeys(findTestObject('Page_IPST/1.2.search'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__user.attributes.RawPersonId'), '1234567891234')

WebUI.click(findTestObject('Page_IPST/1.3'))

WebUI.setText(findTestObject('Page_IPST/1.3.search'), '2544')

WebUI.sendKeys(findTestObject('Page_IPST/1.3.search'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__user.attributes.Telephone'), '0654568779')

WebUI.sendKeys(findTestObject('Page_IPST/searchphone'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_IPST/1.4'))

WebUI.setText(findTestObject('Page_IPST/1.4.search'), 'ศึกษานิเทศ')

WebUI.sendKeys(findTestObject('Page_IPST/1.4.search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_IPST/1.5'))

WebUI.setText(findTestObject('Page_IPST/1.5.search'), 'นครปฐม')

WebUI.sendKeys(findTestObject('Page_IPST/1.5.search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_IPST/div_E-Mail Address'))

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__email'), 'tossapon@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__confirmEmail'), '')

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__confirmEmail_1'), 'tossapon@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_IPST/input__username'), 'hart')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IPST/input__password'), 'L2M85ivSlcDWJai4yKnPgA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IPST/input__password-confirm'), 'L2M85ivSlcDWJai4yKnPgA==')

