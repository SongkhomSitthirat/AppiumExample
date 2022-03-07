package login

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class LoginElement(driver: AppiumDriver<WebElement>) {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/switchToggleMode")
    @iOSXCUITFindBy(accessibility = "switchToggleMode")
    lateinit var switchEnvironment: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/buttonSignInWithPhoneNumber")
    @iOSXCUITFindBy(accessibility = "buttonSignInWithPhoneNumber")
    lateinit var btnLoginPhone: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/editTextPhoneNumber")
    @iOSXCUITFindBy(accessibility = "phonenumber")
    lateinit var edtPhoneNumber: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/editTextOtpNumber")
    lateinit var edtOTPNumber: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/buttonOTP")
    @iOSXCUITFindBy(accessibility = "buttonOTP")
    lateinit var btnRequestOTP: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/buttonNext")
    @iOSXCUITFindBy(accessibility = "buttonNext")
    lateinit var btnNext: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/buttonStart")
    @iOSXCUITFindBy(accessibility = "buttonStart")
    lateinit var btnStart: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")
    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/tab_id_two")
    @iOSXCUITFindBy(accessibility = "tabMenuPackage")
    lateinit var tabPackage: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")
    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/tab_id_three")
    @iOSXCUITFindBy(accessibility = "tabMenuReward")
    lateinit var tabReward: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]")
    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/tab_id_four")
    @iOSXCUITFindBy(accessibility = "tabUsage")
    lateinit var tabUsage: WebElement

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]")
    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/tab_id_five")
    @iOSXCUITFindBy(accessibility = "tabOther")
    lateinit var tabOther: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/btnLogout")
    lateinit var btnLogout: WebElement

    @AndroidFindBy(id = "th.co.crie.tron2.android.dev:id/btnActionOne")
    lateinit var dialogBtnLogout: WebElement
}