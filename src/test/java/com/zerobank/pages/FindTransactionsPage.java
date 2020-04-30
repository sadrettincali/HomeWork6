package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindTransactionsPage extends PageBase {

    @FindBy(xpath = "//a[@href='#ui-tabs-2']")
    public WebElement clickFindTransactions;

    @FindBy(id = "aa_fromDate")
    public WebElement dateFrom;

    @FindBy(id = "aa_toDate")
    public WebElement dateTo;

    @FindBy(tagName = "button")
    public WebElement click;

    @FindBy(id = "aa_description")
    public WebElement description;

    @FindBy(xpath = "(//table//tbody)[2]/tr/td[2]")
    public List<WebElement> onlineDescriptions;

    public void listOfDescriptions(){
        for (WebElement onlineDescription : onlineDescriptions) {
            String str= onlineDescription.getText();
            Assert.assertTrue(str.contains("ONLINE"));
        }
    }

    public void setDescription(){
        description.sendKeys("ONLINE");
    }

    public void clickToFindTransaction() {
        clickFindTransactions.click();
        BrowserUtilities.wait(1);
    }

    public void enterDate(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        String dateFromStr=""+int1 + "-" + int2 + "-" + int3;
        String dateToStr=""+int4 + "-" + int5 + "-" + int6;
        dateFrom.sendKeys(dateFromStr);
        dateTo.sendKeys(dateToStr);

    }

    public void clicksOnFind() {
        click.click();
    }


}
