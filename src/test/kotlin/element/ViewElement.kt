package element

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class ViewElement(driver: AppiumDriver<WebElement>) {
    
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }
    
    companion object {
        const val PREFIX = "th.co.crie.tron2.android.dev"
//        const val PREFIX = "th.co.crie.tron2.android"
    }

    @AndroidFindBy(id = "$PREFIX:id/switchToggleMode")
    @iOSXCUITFindBy(accessibility = "switchToggleMode")
    lateinit var switchEnvironment: WebElement

    @AndroidFindBy(id = "$PREFIX:id/buttonSignInWithPhoneNumber")
    @iOSXCUITFindBy(accessibility = "switchToggleMode")
    lateinit var btnLoginPhone: WebElement

    @AndroidFindBy(id = "$PREFIX:id/buttonSignInWithFacebook")
    lateinit var btnLoginFacebook: WebElement

    @AndroidFindBy(id = "$PREFIX:id/editTextPhoneNumber")
    lateinit var edtPhoneNumber: WebElement

    @AndroidFindBy(id = "$PREFIX:id/editTextOtpNumber")
    lateinit var edtOTPNumber: WebElement

    @AndroidFindBy(id = "$PREFIX:id/buttonOTP")
    lateinit var btnRequestOTP: WebElement

    @AndroidFindBy(id = "$PREFIX:id/buttonNext")
    lateinit var btnNext: WebElement

    @AndroidFindBy(id = "$PREFIX:id/buttonStart")
    lateinit var btnStart: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")
    @AndroidFindBy(id = "$PREFIX:id/tab_id_two")
    lateinit var tabPackage: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")
    @AndroidFindBy(id = "$PREFIX:id/tab_id_three")
    lateinit var tabReward: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]")
    @AndroidFindBy(id = "$PREFIX:id/tab_id_four")
    lateinit var tabUsage: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]")
    @AndroidFindBy(id = "$PREFIX:id/tab_id_five")
    lateinit var tabOther: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnLogout")
    lateinit var btnLogout: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnActionOne")
    lateinit var dialogBtnLogout: WebElement
    
    @AndroidFindBy(id = "$PREFIX:id/labelGreeting")
    lateinit var tvGreetingMessage: WebElement

    @AndroidFindBy(id = "$PREFIX:id/ivSwitchNumber")
    lateinit var ivSwitchNumber: WebElement

    @AndroidFindBy(id = "$PREFIX:id/ivImage")
    lateinit var ivTuaD: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvAou")
    lateinit var tvType: WebElement

    @AndroidFindBy(id = "$PREFIX:id/labelPhoneNumber")
    lateinit var tvPhoneNumber: WebElement

    @AndroidFindBy(id = "$PREFIX:id/labelTitleCoin")
    lateinit var tvCoinsLabel: WebElement

    @AndroidFindBy(id = "$PREFIX:id/labelValueCoin")
    lateinit var tvCoins: WebElement

    @AndroidFindBy(id = "$PREFIX:id/imageCoin")
    lateinit var ivCoin: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnMoreCoin")
    lateinit var tvRedeem: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvUsageTitle")
    lateinit var tvUsageOverviewTitle: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnUsageOverviewMoreDetail")
    lateinit var tvUsageOverviewMoreDetail: WebElement

    @AndroidFindBy(id = "$PREFIX:id/layoutGauge1")
    lateinit var gaugeFirst: WebElement

    @AndroidFindBy(id = "$PREFIX:id/layoutGauge2")
    lateinit var gaugeSecond: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvRemainingBalanceTitle")
    lateinit var tvRemainingBalanceTitle: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvRemainingBalanceAmount")
    lateinit var tvRemainingBalance: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvRemainingBalanceUnit")
    lateinit var tvRemainingBalanceUnit: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvRemainingBalanceValidTill")
    lateinit var tvRemainingBalanceValidTillTitle: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvRemainingBalanceValidTillDate")
    lateinit var tvRemainingBalanceValidTillDate: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvRemainingBalanceDays")
    lateinit var tvRemainingBalanceDays: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnRemainingBalance")
    lateinit var tvRefill: WebElement

    @AndroidFindBy(id = "$PREFIX:id/layoutOutstanding")
    lateinit var layoutOutstanding: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvOutstandingBalanceTitle")
    lateinit var tvOutstandingBalanceTitle: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvOutstandingBalanceAmount")
    lateinit var tvOutstandingBalanceAmount: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvOutstandingUnit")
    lateinit var tvOutstandingUnit: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvDueDateTitle")
    lateinit var tvDueDateTitle: WebElement

    @AndroidFindBy(id = "$PREFIX:id/tvDueDate")
    lateinit var tvDueDate: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnOutstandingBalancePayNow")
    lateinit var tvPayNow: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnClose")
    lateinit var btnClose: WebElement
}