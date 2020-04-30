package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationPage extends PageBase {


    @FindBy(id = "aa_accountId")
    public WebElement selectedBox;

    @FindBy(xpath = "((//table)[1]//td[1])[1]/a")
    public WebElement clickSavings;

    @FindBy(xpath = "((//table)[2]//td)[1]/a")
    public WebElement clickBrokerage;

    @FindBy(xpath = "((//table)[3]//td)[1]/a")
    public WebElement clickChecking;

    @FindBy(xpath = "((//table)[3]//td)[4]/a")
    public WebElement clickCreditCard;
    @FindBy(xpath = "((//table)[4]//td)[1]/a")
    public WebElement clickLoan;

    public void clickOnLoan() {
        clickLoan.click();
        BrowserUtilities.wait(1);
    }

    public void clickOnChecking() {
        clickChecking.click();
        BrowserUtilities.wait(1);
    }

    public void clickOnCreditCard() {
        clickCreditCard.click();
        BrowserUtilities.wait(1);
    }

    public void clickOnSavings() {
        clickSavings.click();
        BrowserUtilities.wait(1);
    }

    public void clickOnBrokerage() {
        clickBrokerage.click();
        BrowserUtilities.wait(1);
    }

    public void selectedOption(String option) {
        Select select = new Select(selectedBox);
        System.out.println(select.getFirstSelectedOption());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), option);
    }

}
