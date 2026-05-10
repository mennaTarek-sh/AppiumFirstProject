import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        // 1. إعدادات الموبايل (Capabilities)
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");

        options.setDeviceName("emulator-5554");

        options.setAppPackage("com.simplemobiletools.calculator");
        options.setAppActivity(".activities.MainActivity");
        options.setNoReset(true);
        // 2. تشغيل الـ Driver
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        // 3. الأوامر
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_plus")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_2")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_equals")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}