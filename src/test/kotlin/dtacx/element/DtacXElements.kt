package dtacx.element

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class DtacXElements(driver: AppiumDriver<WebElement>) {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    companion object {
        const val PREFIX = "com.portonics.dtac"
//        const val PREFIX = "com.portonics.dtac"
    }

    @AndroidFindBy(id = "$PREFIX:id/ivNext")
    lateinit var onBoardNext: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnNonCliLogin")
    lateinit var btnNonCliLogin: WebElement

    @AndroidFindBy(id = "$PREFIX:id/btnSignIn")
    lateinit var btnSignIn: WebElement

    @AndroidFindBy(id = "$PREFIX:id/moreFragment")
    lateinit var tabMore: WebElement

    @AndroidFindBy(id = "$PREFIX:id/vhLogOut")
    lateinit var btnLogout: WebElement

    @AndroidFindBy(id = "$PREFIX:id/vhLogOutThis")
    lateinit var btnSingleLogout: WebElement


}