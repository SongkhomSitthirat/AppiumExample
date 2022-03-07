package login

import AppiumSetup
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileBy
import io.appium.java_client.remote.MobilePlatform
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebElement


class LoginTest {

    private lateinit var driver: AppiumDriver<WebElement>
    private val platform = MobilePlatform.ANDROID

    @Before
    fun setup() {
        driver = AppiumSetup.setUpEnvironment(platform)
    }

    @After
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun testLoginFlow() {
        val loginElement = LoginElement(driver)
        testLanding(loginElement)
        testRequestOTP(loginElement)
        testVerifyOTP(loginElement)
        testOnBoarding(loginElement)
        testSwitchTab(loginElement)
        testLogout(loginElement)
    }

    private fun testLanding(loginElement: LoginElement) {
        //if (platform == MobilePlatform.ANDROID) {
        loginElement.switchEnvironment.click()
        //}
        loginElement.btnLoginPhone.click()
    }

    private fun testRequestOTP(loginElement: LoginElement) {

        //loginElement.edtPhoneNumber.click()

        if (platform == MobilePlatform.ANDROID) {
            driver.keyboard.pressKey("0")
            driver.keyboard.pressKey("9")
            driver.keyboard.pressKey("4")
            driver.keyboard.pressKey("2")
            driver.keyboard.pressKey("4")
            driver.keyboard.pressKey("1")
            driver.keyboard.pressKey("1")
            driver.keyboard.pressKey("1")
            driver.keyboard.pressKey("1")
            driver.keyboard.pressKey("8")
        } else {
            Thread.sleep(2000)
            driver.keyboard.releaseKey("0")
            driver.keyboard.releaseKey("9")
            driver.keyboard.releaseKey("4")
            driver.keyboard.releaseKey("2")
            driver.keyboard.releaseKey("4")
            driver.keyboard.releaseKey("1")
            driver.keyboard.releaseKey("1")
            driver.keyboard.releaseKey("1")
            driver.keyboard.releaseKey("1")
            driver.keyboard.releaseKey("8")
            Thread.sleep(2000)
        }
        loginElement.btnRequestOTP.click()
        Thread.sleep(2000)
    }

    private fun testVerifyOTP(loginElement: LoginElement) {
        driver.keyboard.pressKey("1")
        driver.keyboard.pressKey("2")
        driver.keyboard.pressKey("3")
        driver.keyboard.pressKey("4")
        Thread.sleep(6000)
    }

    private fun testOnBoarding(loginElement: LoginElement) {
        loginElement.btnNext.click()
        Thread.sleep(1000)
        loginElement.btnNext.click()
        Thread.sleep(1000)
        loginElement.btnStart.click()
        Thread.sleep(3000)
    }

    private fun testSwitchTab(loginElement: LoginElement) {
        loginElement.tabPackage.click()
        Thread.sleep(9000)
        loginElement.tabReward.click()
        Thread.sleep(9000)
        loginElement.tabUsage.click()
        Thread.sleep(9000)
        loginElement.tabOther.click()
        Thread.sleep(9000)
    }

    private fun testLogout(loginElement: LoginElement) {
        val scrollViewContainerFinder = "new UiSelector().resourceIdMatches(\".*id/rootList\")"
        val elementFinder = "new UiSelector().resourceIdMatches(\".*id/btnLogout\")"
        driver.findElement(
            MobileBy.AndroidUIAutomator(
                "new UiScrollable(" + scrollViewContainerFinder + ")" +
                        ".scrollIntoView(" + elementFinder + ")"
            )
        )
        loginElement.btnLogout.click()
        Thread.sleep(1000)
        loginElement.dialogBtnLogout.click()
        Thread.sleep(5000)
    }
}