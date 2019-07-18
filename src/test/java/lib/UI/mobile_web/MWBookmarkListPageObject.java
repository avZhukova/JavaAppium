package lib.UI.mobile_web;

import lib.UI.pageObjects.BookmarkListPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWBookmarkListPageObject extends BookmarkListPageObject {

	static {
		ARTICLE_TITLE = "xpath://ul[contains(@class, 'watchlist')]//h3[contains(text(), '{ARTICLE_TITLE}')]";
		REMOVE_FROM_SAVE_BUTTON = "xpath://ul[contains(@class, 'watchlist')]//h3[contains(text(), '{ARTICLE_TITLE}')]/../../div[contains(@class, 'watched')]";
	}

	public MWBookmarkListPageObject(RemoteWebDriver driver){
		super(driver);
	}
}
