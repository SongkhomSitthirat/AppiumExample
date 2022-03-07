package dtacx.flow

import dtacx.element.DtacXElements
import io.appium.java_client.AppiumDriver
import io.appium.java_client.remote.MobilePlatform
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebElement

class Login {

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
        val elements = DtacXElements(driver)
        Thread.sleep(2000)
        elements.onBoardNext.click()
        elements.onBoardNext.click()
        elements.onBoardNext.click()
        elements.btnNonCliLogin.click()
        Thread.sleep(3000)
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
        elements.btnSignIn.click()
        Thread.sleep(3000)
        driver.keyboard.pressKey("1")
        Thread.sleep(500)
        driver.keyboard.pressKey("2")
        Thread.sleep(500)
        driver.keyboard.pressKey("3")
        Thread.sleep(500)
        driver.keyboard.pressKey("4")
        Thread.sleep(5000)

        elements.tabMore.click()
        Thread.sleep(500)
        elements.btnLogout.click()
        Thread.sleep(500)
        elements.btnSingleLogout.click()
        Thread.sleep(3000)
    }
}