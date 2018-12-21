package com.guoyasoft.gyautotest.ui.testCase.text.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.windows.WEmbeddedFrame;
//1.针对每个页面建类2.根据findBy注解先定位元素把页面元素结果存到变量里3.针对每个页面元素操作封装成一个方法,使用
//4.新建一个类写业务代码,初始化调用之前封装好的方法,然后断言
public class TaoBaoHome extends BaseUI {
   /* //根据页面定位元素,取变量名
    @FindBy(xpath = "//a[contains(text(),'亲，请登录')]")
    private WebElement loginLink;
    @FindBy(xpath = "//input[@id='q']")
    private WebElement searchInput;
    @FindBy(xpath = "//button[contains(text(),'搜索')]")
    private WebElement searchButton;
    //把页面元素操作方法封装
    public void clickLoginLink(){
    click(loginLink);


}
    public void search(String text){
        sendKeys(searchInput,text);
        click(searchButton);
    }
    @FindBy(xpath = "//a[contains(text(),'作业检查')]")
    private WebElement click;
    @FindBy(xpath = "//a[contains(text(),'上传总结')]")
    private WebElement link;
*/
@FindBy(xpath = "//input[@id='userName']")
    private WebElement userName;
@FindBy(xpath = "//input[@id='password']")
    private WebElement password;
@FindBy(xpath = "//input[@id='loginBtn']")
    private WebElement loginBtn;
 public void userName(String text){
     sendKeys(userName,text);
 }
 public void password(String text){
     sendKeys(password,text);

 }
 public void loginBtn(String text){
     click(loginBtn);
 }
    }


