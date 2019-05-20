package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import page.MyPage;

/**
 *
 * 业务执行流程操作
 *
 * */
public class MyTest {
    //获取driver驱动对象
    private WebDriver driver = new FirefoxDriver();
    private Logger log=Logger.getLogger(MyTest.class);
    @Test
    public void baidu_search(){
        //获取页面元素对象
        MyPage myPage = PageFactory.initElements(driver, MyPage.class);
        log.info("获取到页面元素对象："+myPage);
        driver.get("http://www.baidu.com");
        //窗口最大化
        driver.manage().window().maximize();
        //重写了sendkeys方法
        myPage.kw_sendkes("selenium");
        //鼠标点击搜索一下
        myPage.su_click();
    }




}
