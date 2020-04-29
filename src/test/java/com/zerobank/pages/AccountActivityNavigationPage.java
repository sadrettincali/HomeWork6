package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationPage extends PageBase {

    @FindBy(xpath = "((//table)[1]//td[1])[1]/a")
    public WebElement clickOnSavings;

    @FindBy(id = "aa_accountId")
    public WebElement selectedBox;



    public void clickOnSavings(){
      clickOnSavings.click();
        BrowserUtilities.wait(2);
    }

    public void savingSelected(){
        Select select= new Select(selectedBox);
        System.out.println(select.getFirstSelectedOption());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Savings");

    }




}
