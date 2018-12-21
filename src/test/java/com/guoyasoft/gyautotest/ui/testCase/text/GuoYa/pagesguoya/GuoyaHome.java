package com.guoyasoft.gyautotest.ui.testCase.text.GuoYa.pagesguoya;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuoyaHome extends BaseUI {
    @FindBy(xpath = "//a[contains(text(),'课程查询')]")
    private WebElement classsearchLink;
    @FindBy(xpath = "//a[contains(text(),'面试统计')]")
    private WebElement countsLink;
    @FindBy(xpath = "//a[contains(text(),'查询面试')]")
    private WebElement searchLink;
    @FindBy(xpath = "//iframe")
    private WebElement iframe;
    public void classsearchLink(){
        click(classsearchLink);

    }
    public void countsLink(){
        click(countsLink);
    }
    public void searchLink(){
        click(searchLink);
    }
    public void switchToIframe(WebDriver driver){driver.switchTo().frame(iframe);}
}
