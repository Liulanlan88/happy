package com.guoyasoft.gyautotest.ui.testCase.text;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;


public class TestUI extends BaseUI {
    @Test
    public void testTextInput() {
        //打开网址
        driver.get("https://www.taobao.com");
        //定位元素
        WebElement text = driver.findElement(By.xpath("//input[@id='q']"));
        //清空输入框
        text.clear();
        //往输入框中填值
        text.sendKeys("手机");
        //等待2秒
        sleep(2);


    }

    @Test
    public void testButton() {
        //用上面的变量
        testTextInput();
        //定位页面元素
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),\"搜索\")]"));
        //点击按钮
        button.click();
        //等待2秒
        sleep(2);
    }


    @Test
    public void textRadio() {
        testTextInput();
        WebElement radio = driver.findElement(By.xpath("//span[contains(text(),\"中国大陆\")]"));
        radio.click();
        sleep(2);
    }

    @Test
    public void textLink() {
        //打开网站
        driver.get("https://www.taobao.com");
        //定位页面元素
        WebElement link = driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
        //点击
        link.click();
        //ctrl+点击
        // Actions actions=new Actions(driver);
        // actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
        //shift+点击
        //Actions actions = new Actions(driver);
        //actions.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).perform();
        //等待时间
        sleep(2);

    }

    @Test
    public void textSelect() {
        //打开网站
        driver.get("file:///E:/demo.html");
        //定位页面元素
        WebElement select = driver.findElement(By.xpath("//select"));
        //新建select
        Select selects = new Select(select);
        //文字查找
        //selects.selectByVisibleText("香蕉");
        //sleep(2);
        //找第几个
        //selects.selectByIndex(0);
        //sleep(2);
        //用value查找
        selects.selectByValue("chengzi");
        sleep(2);
    }

    @Test
    public void textNavigate() {
        //打开百度网址
        driver.get("https://www.baidu.com/");
        sleep(1);
        //打开京东网址
        driver.get("https://www.jd.com");
        sleep(1);
        //打开导航栏,再返回去
        driver.navigate().back();
        sleep(1);
        //打开导航栏,前进
        driver.navigate().forward();
        sleep(1);
        //打开导航栏,刷新
        driver.navigate().refresh();
        sleep(1);
        //打开导航栏的淘宝网址
        driver.navigate().to("https://www.taobao.com/");
        sleep(1);

    }

    @Test
    public void textDate() {
        driver.get("file:///E:/demo(2).html");
        String js = "var xpath = \"//input[@type='date']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"2018-12-13\";";
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        jsDriver.executeScript(js);
        sleep(2);


    }

    @Test
    public void testTextinput() {
        driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
        WebElement userName = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
        userName.clear();
        sendKeys(userName, "liull");
        sleep(2);
        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        password.clear();
        sendKeys(password, "LIU1234");
        sleep(2);
        WebElement checkCode = driver.findElement(By.xpath("//input[@id=\"checkCode\"]"));
        checkCode.clear();
        sendKeys(checkCode, "12345");
        sleep(2);
        WebElement button = driver.findElement(By.xpath("//input[@id=\"loginBtn\"]"));
        button.click();

        sleep(2);

    }

    @Test
    public void testInput() {
        driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
        WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
        userName.clear();
        sendKeys(userName, "guopya666");
        sleep(2);
        WebElement realName = driver.findElement(By.xpath("//input[@id='realName']"));
        realName.clear();
        sendKeys(realName, "刘兰兰");
        sleep(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.clear();
        sendKeys(password, "liu666");
        sleep(2);
        WebElement password2 = driver.findElement(By.xpath("//input[@id='password2']"));
        password2.clear();
        sendKeys(password2, "liu666");
        sleep(2);
        WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
        phone.clear();
        sendKeys(phone, "15021328575");
        sleep(2);
        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.clear();
        sendKeys(age, "20");
        sleep(2);
        WebElement checkCode = driver.findElement(By.xpath("//input[@id='checkCode']"));
        driver.findElement(By.xpath("//input[@id='checkCode']"));
        checkCode.clear();
        sendKeys(checkCode, "1234");
        WebElement button = driver.findElement(By.xpath("//input[@id=\"submitBtn\"]"));
        button.click();

        sleep(2);
        Alert alert = driver.switchTo().alert();
        //确定
        alert.accept();
        //取消
        //alert.dismiss();
        //获取提示文本
        // alert.getText();
        //往对话框里填值
        //alert.sendKeys("");
        sleep(2);


    }

    @Test
    public void textWindowSwitch() {
        driver.get("https://www.taobao.com/");
        driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'女装')]")).click();
        sleep(1);
        driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'男装')]")).click();
        sleep(1);
        driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'内衣')]")).click();
        sleep(1);
        driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'鞋靴')]")).click();
        sleep(1);
        //1.获取切换窗口的句柄
        Set<String> handles = driver.getWindowHandles();
        //2.使用foreach循环遍历set集合中的句柄
        for (String h : handles) {
            //3.根据句柄切换窗口
            driver.switchTo().window(h);
            sleep(2);
            //4.判断当前窗口的标题是不是想要的
            if (driver.getTitle().contains("淘宝女鞋"))
                //5.结束循环
                break;

        }

    }


    @Test
    public void testContainer() {
        //一维数组
        //声明
        String[] strings = {"666", "777", "888"};
        // String[]strings1=new String[5];
        //取用
        strings[0] = "999";
        System.out.println(strings[0]);
        String[][] str6 = {{"22", "33", "44", "11"}, {"55", "66", "77", "443"}, {"88", "99", "00", "345"}};
        String[][] str2 = new String[3][4];
        //取str6里面的第一个一维数组里的第三个数,0代表第一个
        System.out.println(str6[0][2]);

        List<String> list = new ArrayList<String>();
        //新建一个list容器
        list.add("111");
        //
        list.add("222");
        list.add("333");
        //往容器某个位置加东西
        list.add(1, "444");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        //删
        //list.remove(2);

        //新建一个map
        Map<String, String> map = new HashMap<String, String>();
        //存(key不能重复)
        map.put("姓名", "刘兰兰");
        map.put("性别", "女");
        map.put("年龄", "20");
        //取
        System.out.println(map.get("姓名"));
        //删
        map.remove("姓名");
        System.out.println(map.get("姓名"));
        //数据不会重复
        Set<String> set = new HashSet<>();
        set.add("555");
        set.add("666");
        set.add("555");
        for (String s : set) {
            System.out.println(s);


        }

    }

    @Test
    public void testGuoya() {
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        driver.findElement(By.xpath("//a[contains(text(),\"查询面试\")]")).click();
        sleep(2);
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[contains(text(),\"查询\")]")).click();
        sleep(2);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),\"面试统计\")]")).click();
        sleep(2);


    }


    @Test
    public void testIframe() {
        //打开网址
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        //定位元素,点击
        driver.findElement(By.xpath("//a[contains(text(),\"查询面试\")]")).click();
        sleep(2);
        //切进iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[contains(text(),\"查询\")]")).click();
        sleep(2);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),\"面试统计\")]")).click();
        sleep(2);


    }

    @Test
    public void testFor() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);

        }

    }

    @Test
    public void testFore() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int arrLength = arr.length;
        Map map = new HashMap();
        System.out.println("数组的长度为:" + arr.length);
        for (int i = 0; i <= arrLength - 1; i++) {
            map.put(i, arr[i]);
        }

//        Set set = map.keySet();

        //根据map集合的键去取map集合中的值
        for (Object o : map.keySet()) {
            System.out.println("map集合的键为:" + o + ",map集合中键对应的值为:" + map.get(o));
        }

//        System.out.println(set.toString());

        Map<String, String> map1 = new HashMap<String, String>();

        map1.put("刘兰兰", "年龄18");
        map1.put("王婷", "年龄17");

        System.out.println("map集合中的内容为:" + map1.toString());

        Set<String> set = map1.keySet();
        System.out.println("set中的内容为:" + set.toString());
    }

    @Test
    public static void iuIu() {
        //多少列
        for (int i = 1; i <= 9; i++) {
            //多少行
            for (int j = 1; j <= i; j++) {
                //j代表的行的值*i代表列的值=i*j代表(行*列)的值,加上制表符\t
                System.out.print(j + "*" + i + "=" + i * j + '\t');
               // Allure.addAttachment("","");
            }
            //换行
            System.out.println();
        }

    }

    @Test
    public void textZhifubo() {
        int yuE = 200;
        int yuEB = 3000;
        int yingXingKa = 6000;
        int buy = 60000;
        if (buy <= yuE) {
            System.out.println("余额扣款成功" + buy);
        } else if
        (buy <= yuEB) {
            System.out.println("余额宝扣款成功" + buy);
        } else if (buy <= yingXingKa) {
            System.out.println("银行卡扣款成功" + buy);
        } else {
            System.out.println("扣款失败");

        }
    }

    @Test
    public void textBulle() {
        int[] arr = {17, 21, 14, 32, 8, 19};
        for (int i : arr) {
            System.out.println(i+"\t");
        }
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for(int i:arr){
            System.out.println(i+"\t");
        }

    }

    @Test
    public void textTaobao(){
        driver.get("https://www.taobao.com/");
        addScreenshot2Allure("淘宝首页");
        driver.findElement(By.xpath("//a[contains(text(),'亲，请登录')]")).click();

        sleep(1);
        driver.findElement(By.xpath("//i[@id='J_Quick2Static']")).click();
        sleep(1);
        WebElement username = driver.findElement(By.xpath("//input[@id='TPL_username_1']"));
        username.clear();
        username.sendKeys("LL19881024");
        sleep(1);
        WebElement password = driver.findElement(By.xpath("//input[@id=\"TPL_password_1\"]"));
        password.clear();
        password.sendKeys("Liu781250");
        driver.findElement(By.xpath("//button[@id=\"J_SubmitStatic\"]")).click();
        sleep(1);
        //actual实际,pagesource页面原代码,assert断言
        boolean actual = driver.getPageSource().contains("我的淘宝");
        Assert.assertEquals(actual,false);



    }
//    @Test
//    public void textGuanWang(){
//        driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
//        driver.findElement(By.xpath("//input[@id='userName']"));
//        sleep(1);
//        driver.findElement(By.xpath())
//    }
}