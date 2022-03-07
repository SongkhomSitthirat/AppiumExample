import io.appium.java_client.AppiumDriver
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.MobileCapabilityType
import io.appium.java_client.remote.MobilePlatform
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.nio.file.Paths
import java.util.concurrent.TimeUnit

class AppiumSetup {

    companion object {

        fun setUpEnvironment(platform: String): AppiumDriver<WebElement> {
            val driver: AppiumDriver<WebElement>
            if (platform == MobilePlatform.ANDROID) {
                val dir = System.getProperty("user.dir")
                val path = Paths.get(dir, "apps/dtac-staging-uat_290921_10.apk")
                val capabilities = DesiredCapabilities().apply {
                    setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
                    setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator")
                    setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2)
                    setCapability(MobileCapabilityType.APP, path.toAbsolutePath().toString())
                }
                driver = AppiumDriver<WebElement>(URL("http://0.0.0.0:4723/wd/hub"), capabilities)
                driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS)
                return driver
            } else {
                //val dir = System.getProperty("user.dir")
                val path = Paths.get("/Users/chakritpaniam/Library/Developer/Xcode/DerivedData/dtac-iservice-eoalungeemeducfnuknadcvjdogw/Build/Products/Debug-iphonesimulator/beta.app")
                val capabilities = DesiredCapabilities().apply {
                    setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS")
                    setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11")
                    setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0")
                    setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST)
                    setCapability(MobileCapabilityType.APP, path.toAbsolutePath().toString())
                    setCapability("autoAcceptAlerts", true)
                }
                driver = AppiumDriver<WebElement>(URL("http://localhost:4724/wd/hub"), capabilities)
                driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS)
                return driver
            }
        }
    }
}