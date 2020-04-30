package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {


    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);


    public PageBase() {
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String tabName) {
        String tabNameCss = "a[href='/bank/redirect.html?url=" + tabName + ".html']";
        WebElement tabElement = driver.findElement(By.cssSelector(tabNameCss));
        tabElement.click();
        BrowserUtilities.wait(2);
    }


}
