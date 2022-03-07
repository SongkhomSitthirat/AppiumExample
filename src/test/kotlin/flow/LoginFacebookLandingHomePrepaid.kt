package flow

import element.ViewElement
import ext.findElementByText
import ext.scrollToView
import ext.scrollToViewByText
import io.appium.java_client.AppiumDriver
import io.appium.java_client.remote.MobilePlatform
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

class LoginFacebookLandingHomePrepaid {

    private lateinit var driver: AppiumDriver<WebElement>
    private val platform = MobilePlatform.ANDROID
    private lateinit var viewElement: ViewElement

    @Before
    fun setup() {
        driver = AppiumSetup.setUpEnvironment(platform)
        viewElement = ViewElement(driver)
    }

    @After
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun `01-testLoginFacebook`() {
        testLoginFacebook(viewElement)
    }

    @Test
    fun `02-testLoginFacebookGoToHome`() {
        testLoginFacebook(viewElement)
        testOnBoarding(viewElement)
        testHomeDataIsShown(viewElement)
    }

    @Test
    fun `03-testLoginFacebookGoToReward`() {
        testLoginFacebook(viewElement)
        testOnBoarding(viewElement)
        testSegmentSectionIsShown(viewElement)
        testSegmentSectionClick(viewElement)
    }

    @Test
    fun `04-testLoginFacebookGoToUsageSummary`() {
        testLoginFacebook(viewElement)
        testOnBoarding(viewElement)
        testSegmentSectionIsShown(viewElement)
        testUsageOverviewSectionClick(viewElement)
    }

    @Test
    fun `05-testLoginFacebookGoToHeroSectionCampaign`() {
        testLoginFacebook(viewElement)
        testOnBoarding(viewElement)
        testHeroSectionIsShown(viewElement)
        testHeroSectionClick(viewElement)
    }

    @Test
    fun `06-testLoginFacebookGoToRecommendSection`() {
        testLoginFacebook(viewElement)
        testOnBoarding(viewElement)
        testRecommendedSectionIsShown(viewElement)
        testRecommendedSectionClick(viewElement)
    }

    @Test
    fun `07-testLoginFacebookGoToSpecialCampaign`() {
        testLoginFacebook(viewElement)
        testOnBoarding(viewElement)
        testSpecialSectionIsShown(viewElement)
        testSpecialSectionClick(viewElement)
    }

    private fun testLoginFacebook(viewElement: ViewElement) {
        Thread.sleep(2000)
        Assert.assertTrue(viewElement.btnLoginFacebook.isDisplayed)
        viewElement.btnLoginFacebook.click()
        driver.findElementByText("080-470-3121").click()
        Thread.sleep(3000)
    }

    private fun testOnBoarding(loginElement: ViewElement) {
        loginElement.btnNext.click()
        Thread.sleep(1000)
        loginElement.btnNext.click()
        Thread.sleep(1000)
        loginElement.btnStart.click()
        Thread.sleep(1000)
    }

    private fun testHomeDataIsShown(viewElement: ViewElement) {
        testSegmentSectionIsShown(viewElement)
        testUsageOverviewSectionIsShown(viewElement)
        testHeroSectionIsShown(viewElement)
//        testOutstandingBalanceNotShown(viewElement)
        testRecommendedSectionIsShown(viewElement)
        testSpecialSectionIsShown(viewElement)
    }

    private fun testSegmentSectionIsShown(viewElement: ViewElement) {
        Assert.assertTrue(viewElement.tvGreetingMessage.isDisplayed)
        Assert.assertTrue(viewElement.tvType.isDisplayed)
        Assert.assertTrue(viewElement.ivTuaD.isDisplayed)
        Assert.assertTrue(viewElement.tvType.text == "เติมเงิน" || viewElement.tvType.text == "Prepaid")
        Assert.assertTrue(viewElement.ivSwitchNumber.isDisplayed)
        Assert.assertTrue(viewElement.tvPhoneNumber.isDisplayed)
        Assert.assertEquals("080-470-3121", viewElement.tvPhoneNumber.text)
        Assert.assertTrue(viewElement.tvCoinsLabel.isDisplayed)
        Assert.assertTrue(viewElement.tvCoinsLabel.text == "My Coins")
        Assert.assertTrue(viewElement.tvCoins.text.isNotBlank())
        Assert.assertTrue(viewElement.ivCoin.isDisplayed)
        Assert.assertTrue(viewElement.tvRedeem.isDisplayed)
    }

    private fun testSegmentSectionClick(viewElement: ViewElement) {
        viewElement.tvRedeem.click()
        Thread.sleep(5000)
        driver.navigate().back()
    }

    private fun testUsageOverviewSectionIsShown(viewElement: ViewElement) {
        Assert.assertTrue(viewElement.tvUsageOverviewTitle.isDisplayed)
        Assert.assertTrue(viewElement.tvUsageOverviewTitle.text == "Usage Overview")
        Assert.assertTrue(viewElement.tvUsageOverviewMoreDetail.isDisplayed)
        Assert.assertTrue(viewElement.tvUsageOverviewMoreDetail.text == "Detail")
        Assert.assertTrue(viewElement.gaugeFirst.isDisplayed)
        Assert.assertTrue(viewElement.gaugeSecond.isDisplayed)
        Assert.assertTrue(viewElement.tvRemainingBalanceTitle.isDisplayed)
        Assert.assertTrue(viewElement.tvRemainingBalanceTitle.text == "Remaining Balance")
        Assert.assertTrue(viewElement.tvRemainingBalance.isDisplayed)
        Assert.assertTrue(viewElement.tvRemainingBalance.text.isNotBlank())
        Assert.assertTrue(viewElement.tvRemainingBalanceUnit.isDisplayed)
        Assert.assertTrue(viewElement.tvRemainingBalanceUnit.text == "Baht")
        Assert.assertTrue(viewElement.tvRemainingBalanceValidTillTitle.isDisplayed)
        Assert.assertTrue(viewElement.tvRemainingBalanceValidTillTitle.text == "Valid till")
        Assert.assertTrue(viewElement.tvRemainingBalanceValidTillDate.isDisplayed)
        Assert.assertTrue(viewElement.tvRemainingBalanceValidTillDate.text.isNotBlank())
        Assert.assertTrue(viewElement.tvRemainingBalanceDays.isDisplayed)
        Assert.assertTrue(viewElement.tvRemainingBalanceDays.text.contains("days"))
        Assert.assertTrue(viewElement.tvRefill.isDisplayed)
        Assert.assertTrue(viewElement.tvRefill.text == "Refill")
    }

    private fun testUsageOverviewSectionClick(viewElement: ViewElement) {
        viewElement.tvUsageOverviewMoreDetail.click()
        Thread.sleep(5000)
        driver.navigate().back()
        viewElement.tvRefill.click()
        Thread.sleep(5000)
        driver.navigate().back()
        Thread.sleep(2000)
        driver.navigate().back()
    }

//    private fun testOutstandingBalanceNotShown(viewElement: ViewElement) {
//        Assert.assertFalse(viewElement.layoutOutstanding.isDisplayed)
//        Assert.assertFalse(viewElement.tvOutstandingBalanceTitle.isDisplayed)
//        Assert.assertFalse(viewElement.tvOutstandingBalanceAmount.isDisplayed)
//        Assert.assertFalse(viewElement.tvOutstandingUnit.isDisplayed)
//        Assert.assertFalse(viewElement.tvDueDateTitle.isDisplayed)
//        Assert.assertFalse(viewElement.tvDueDate.isDisplayed)
//        Assert.assertFalse(viewElement.tvPayNow.isDisplayed)
//    }

    private fun testHeroSectionIsShown(viewElement: ViewElement) {
        val heroBanner = driver.scrollToView("rootList", "heroSection")
        Assert.assertTrue(heroBanner.isDisplayed)
    }

    private fun testHeroSectionClick(viewElement: ViewElement) {
        val heroBanner = driver.findElementById("heroSection")
        heroBanner.click()
        Thread.sleep(5000)
        driver.navigate().back()
        Thread.sleep(2000)
        driver.navigate().back()
    }

    private fun testRecommendedSectionIsShown(viewElement: ViewElement) {
        val recommendedSection = driver.scrollToView("rootList", "favoriteSection")
        Assert.assertTrue(recommendedSection.isDisplayed)
        val recommendedTitle: WebElement = recommendedSection.findElement(By.id("tvTitle"))
        Assert.assertTrue(recommendedTitle.isDisplayed)
        Assert.assertTrue(recommendedTitle.text == "Recommended services")
        val firstItemSection = driver.scrollToViewByText("rootList", "My choice")
        Assert.assertTrue(firstItemSection.isDisplayed)
        val firstItem = driver.findElementByText("My choice")
        Assert.assertTrue(firstItem.isDisplayed)
        val secondItem = driver.findElementByText("Jaidee")
        Assert.assertTrue(secondItem.isDisplayed)
        val thirdItem = driver.findElementByText("Jaidee Pharmacy")
        Assert.assertTrue(thirdItem.isDisplayed)
        val forthItem = driver.findElementByText("Gift")
        Assert.assertTrue(forthItem.isDisplayed)
    }

    private fun testRecommendedSectionClick(viewElement: ViewElement) {
        val recommendedSection = driver.scrollToView("rootList", "favoriteSection")
        Assert.assertTrue(recommendedSection.isDisplayed)
        val recommendedTitle: WebElement = recommendedSection.findElement(By.id("tvTitle"))
        Assert.assertTrue(recommendedTitle.isDisplayed)
        Assert.assertTrue(recommendedTitle.text == "Recommended services")
        val firstItemSection = driver.scrollToViewByText("rootList", "My choice")
        Assert.assertTrue(firstItemSection.isDisplayed)
        val firstItem = driver.findElementByText("My choice")
        Assert.assertTrue(firstItem.isDisplayed)
        firstItem.click()
        Thread.sleep(7000)
        viewElement.btnClose.click()
        Thread.sleep(2000)
        driver.navigate().back()
        val secondItem = driver.findElementByText("Jaidee")
        Assert.assertTrue(secondItem.isDisplayed)
        secondItem.click()
        Thread.sleep(5000)
        driver.navigate().back()
        val thirdItem = driver.findElementByText("Jaidee Pharmacy")
        Assert.assertTrue(thirdItem.isDisplayed)
        thirdItem.click()
        Thread.sleep(5000)
        driver.navigate().back()
        val forthItem = driver.findElementByText("Gift")
        Assert.assertTrue(forthItem.isDisplayed)
        forthItem.click()
        Thread.sleep(5000)
        driver.navigate().back()
        Thread.sleep(2000)
    }

    private fun testSpecialSectionIsShown(viewElement: ViewElement) {
        val rewardItem = driver.scrollToViewByText("rootList", "dtac reward")
        Assert.assertTrue(rewardItem.isDisplayed)
    }

    private fun testSpecialSectionClick(viewElement: ViewElement) {
        val rewardItem = driver.findElementByText("dtac reward")
        Assert.assertTrue(rewardItem.isDisplayed)
        rewardItem.click()
        Thread.sleep(5000)
        driver.navigate().back()
        Thread.sleep(2000)
    }
}