package JsonUtilityData;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotutility {





    public static String captureScreenshot(WebDriver driver, String testName)
            throws IOException {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir")
                + "\\Screenshots\\"
                + testName + ".png";

        File dest = new File(path);

        FileUtils.copyFile(src, dest);

        return path;

    }
}
