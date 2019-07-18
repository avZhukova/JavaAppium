package lib.UI.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.UI.android.AndroidMainPageObject;
import lib.UI.ios.IOSMainPageObject;
import lib.UI.mobile_web.MWBookmarkListPageObject;
import lib.UI.mobile_web.MWMainPageObject;
import lib.UI.pageObjects.MainPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainPageObjectFactory {

	public static MainPageObject get(RemoteWebDriver driver){

		if(Platform.getInstance().isAndroid()) {
			return new AndroidMainPageObject(driver);
		} else if (Platform.getInstance().isMV()) {
			return new MWMainPageObject(driver);
		} else {
			return new IOSMainPageObject(driver);
		}
	}
}
