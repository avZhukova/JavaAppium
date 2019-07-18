package lib.UI.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.UI.mobile_web.MWSearchPageObject;
import lib.UI.pageObjects.SearchPageObject;
import lib.UI.android.AndroidSearchPageObject;
import lib.UI.ios.IOSSearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPageObjectFactory {

	public static SearchPageObject get(RemoteWebDriver driver){

		if(Platform.getInstance().isAndroid()) {
			return new AndroidSearchPageObject(driver);
		} else if (Platform.getInstance().isMV()) {
			return new MWSearchPageObject(driver);
		}
		else {
			return new IOSSearchPageObject(driver);
		}
	}
}
