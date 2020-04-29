package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationPage extends PageBase {

    @FindBy(xpath = "((//table)[1]//td[1])[1]/a")
    public WebElement clickSavings;

    @FindBy(id = "aa_accountId")
    public WebElement selectedBox;

    @FindBy(xpath = "((//table)[2]//td)[1]/a")
    public WebElement clickBrokerage;



    public void clickOnSavings(){
      clickSavings.click();
        BrowserUtilities.wait(1);
    }

    public void savingSelected(){
        Select select= new Select(selectedBox);
        System.out.println(select.getFirstSelectedOption());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Savings");
    }

    public void clickOnBrokerage(){
        clickBrokerage.click();
        BrowserUtilities.wait(1);
    }

    public void brokerageSelected(){
        Select select= new Select(selectedBox);
        System.out.println(select.getFirstSelectedOption());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Brokerage");
    }

}
