package lib.UI.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.UI.android.AndroidBookmarkListPageObject;
import lib.UI.ios.IOSBookmarkListPageObject;
import lib.UI.mobile_web.MWArticlePageObject;
import lib.UI.mobile_web.MWBookmarkListPageObject;
import lib.UI.pageObjects.BookmarkListPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BookmarkListPageObjectFactory {

	public static BookmarkListPageObject get(RemoteWebDriver driver){

		if(Platform.getInstance().isAndroid()) {
			return new AndroidBookmarkListPageObject(driver);
		} else if (Platform.getInstance().isMV()) {
			return new MWBookmarkListPageObject(driver);
		} else {
			return new IOSBookmarkListPageObject(driver);
		}
	}
}
