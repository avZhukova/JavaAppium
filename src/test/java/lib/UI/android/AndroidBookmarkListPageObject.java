package lib.UI.android;

import io.appium.java_client.AppiumDriver;
import lib.UI.pageObjects.BookmarkListPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidBookmarkListPageObject extends BookmarkListPageObject {

	static {
		ARTICLE_TITLE = "xpath://*[contains(@text, '{ARTICLE_TITLE}')]";
	}

	public AndroidBookmarkListPageObject(RemoteWebDriver driver){
		super(driver);
	}
}
