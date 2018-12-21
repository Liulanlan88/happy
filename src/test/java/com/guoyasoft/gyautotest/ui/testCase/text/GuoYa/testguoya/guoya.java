package com.guoyasoft.gyautotest.ui.testCase.text.GuoYa.testguoya;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.text.GuoYa.pagesguoya.GuoyaHome;
import com.guoyasoft.gyautotest.ui.testCase.text.GuoYa.pagesguoya.TextGuoYa;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class guoya extends BaseUI {
    @Test
    public void textSearch1(){
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        addScreenshot2Allure("果芽首页");
        GuoyaHome guoyaHome = PageFactory.initElements(driver, GuoyaHome.class);
        guoyaHome.searchLink();
        guoyaHome.switchToIframe(driver);
        TextGuoYa textGuoYa = PageFactory.initElements(driver, TextGuoYa.class);
        textGuoYa.sendKeysStudentInput("张继承");
        textGuoYa.clickSearchButton();
    }
    @Test
    public void textSearch2(){
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        addScreenshot2Allure("果芽首页");
        GuoyaHome guoyaHome = PageFactory.initElements(driver, GuoyaHome.class);
        guoyaHome.searchLink();
        guoyaHome.switchToIframe(driver);
        TextGuoYa textGuoYa = PageFactory.initElements(driver, TextGuoYa.class);
        textGuoYa.sendKeysStudentInput("王鹏");
        addScreenshot2Allure("搜索王鹏信息");
        textGuoYa.clickSearchButton();
    }
}
