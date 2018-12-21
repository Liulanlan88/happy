package com.guoyasoft.gyautotest.ui.testCase.text.GuoYa.pagesguoya;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextGuoYa extends BaseUI {
    @FindBy(xpath = "//input[@name='custmerName']")
    private WebElement studentInput;
    @FindBy(xpath = "//button[contains(text(),)'查询']")
    private WebElement searchButton;
    public void sendKeysStudentInput(String Name){
        sendKeys(studentInput,Name);
    }
    public void clickSearchButton(){
        click(searchButton);
    }
}
