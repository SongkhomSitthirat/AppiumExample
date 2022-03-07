package ext

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileBy
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

fun AppiumDriver<WebElement>.findElementByText(text: String): WebElement {
    return this.findElement(By.xpath("//*[@text='$text']"))
}

fun AppiumDriver<WebElement>.scrollToView(scrollViewId: String, viewId: String): WebElement {
    val scrollViewContainerFinder = "new UiSelector().resourceIdMatches(\".*id/$scrollViewId\")"
    val elementFinder = "new UiSelector().resourceIdMatches(\".*id/$viewId\")"
    return this.findElement(
        MobileBy.AndroidUIAutomator("new UiScrollable(" + scrollViewContainerFinder + ")" +
                ".scrollIntoView(" + elementFinder + ")"))
}

fun AppiumDriver<WebElement>.scrollToViewByText(scrollViewId: String, text: String): WebElement {
    val scrollViewContainerFinder = "new UiSelector().resourceIdMatches(\".*id/$scrollViewId\")"
    val elementFinder = "new UiSelector().text(\"$text\")"
    return this.findElement(
        MobileBy.AndroidUIAutomator("new UiScrollable(" + scrollViewContainerFinder + ")" +
                ".scrollIntoView(" + elementFinder + ")"))
}

fun WebElement.findElementByText(text: String): WebElement {
    return this.findElement(By.xpath("//*[@text='$text']"))
}