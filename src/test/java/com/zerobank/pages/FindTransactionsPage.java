package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath = "(//table//tbody)[2]/tr/td[3]")
    public List<WebElement> depositLists;

    @FindBy(xpath = "(//table//tbody)[2]/tr/td[4]")
    public List<WebElement> withdrawalLists;

    @FindBy(id = "aa_type")
    public WebElement typeDropdown;

    public void checkDepositLists(){
          boolean bln=false;
        for (WebElement depositList : depositLists) {
            if (depositList.getText().isEmpty()){
                bln=true;
            }
        }
        Assert.assertTrue(bln);
    }


    public void checkWithdrawalLists(){
          boolean bln=false;
        for (WebElement withdrawalList : withdrawalLists) {
            if (withdrawalList.getText().isEmpty()){
                bln=true;
            }
        }
        Assert.assertTrue(bln);
    }


    public void selectDropdown(String str){
        Select select=new Select(typeDropdown);
        select.selectByVisibleText(str);
    }

    public void checkWithdrawals(){
        boolean bln=false;
        for (WebElement withdrawalList : withdrawalLists) {
            if (!withdrawalList.getText().isEmpty()){
                bln=true;
            }
        }
        Assert.assertTrue(bln);
    }

    public void checkDeposits(){
        boolean bln=false;
        for (WebElement depositList : depositLists) {
            if (!depositList.getText().isEmpty()){
                bln=true;
            }
        }
        Assert.assertTrue(bln);
    }




    public void listOfDescriptions(String str2){
        for (WebElement onlineDescription : onlineDescriptions) {
            String str= onlineDescription.getText();
            Assert.assertTrue(str.contains(str2));
        }
    }

    public void defaultList(String str2){
        for (WebElement onlineDescription : onlineDescriptions) {
            String str= onlineDescription.getText();
            Assert.assertFalse(str.contains(str2));
        }
    }

    public void setDescription(String str){
        description.sendKeys(str);
    }

    public void clickToFindTransaction() {
        clickFindTransactions.click();
        BrowserUtilities.wait(1);
    }

//    public void enterDate(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
//
//    }

    public void clicksOnFind() {
        click.click();
        BrowserUtilities.wait(1);
    }

}
