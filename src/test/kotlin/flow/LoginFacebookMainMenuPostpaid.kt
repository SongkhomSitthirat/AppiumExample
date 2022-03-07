package flow

import AppiumSetup
import element.ViewElement
import ext.findElementByText
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileBy
import io.appium.java_client.remote.MobilePlatform
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebElement


class LoginFacebookMainMenuPostpaid {

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
        val viewElement = ViewElement(driver)
        testLoginFacebook(viewElement)
        testOnBoarding(viewElement)
        testSwitchTab(viewElement)
        testLogout(viewElement)
    }

    private fun testLoginFacebook(viewElement: ViewElement) {
        Thread.sleep(2000)
        viewElement.switchEnvironment.click()
        Assert.assertTrue(viewElement.btnLoginFacebook.isDisplayed)
        viewElement.btnLoginFacebook.click()
        driver.findElementByText("081-102-9619").click()
        Thread.sleep(3000)
    }

    private fun testOnBoarding(viewElement: ViewElement) {
        viewElement.btnNext.click()
        Thread.sleep(1000)
        viewElement.btnNext.click()
        Thread.sleep(1000)
        viewElement.btnStart.click()
        Thread.sleep(3000)
    }

    private fun testSwitchTab(viewElement: ViewElement) {
        viewElement.tabPackage.click()
        Thread.sleep(9000)
        viewElement.tabReward.click()
        Thread.sleep(9000)
        viewElement.tabUsage.click()
        Thread.sleep(9000)
        viewElement.tabOther.click()
        Thread.sleep(9000)
    }

    private fun testLogout(viewElement: ViewElement) {
        val scrollViewContainerFinder = "new UiSelector().resourceIdMatches(\".*id/rootList\")"
        val elementFinder = "new UiSelector().resourceIdMatches(\".*id/btnLogout\")"
        driver.findElement(
            MobileBy.AndroidUIAutomator(
                "new UiScrollable(" + scrollViewContainerFinder + ")" +
                        ".scrollIntoView(" + elementFinder + ")"
            )
        )
        viewElement.btnLogout.click()
        Thread.sleep(1000)
        viewElement.dialogBtnLogout.click()
        Thread.sleep(5000)
    }
}