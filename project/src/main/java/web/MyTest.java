package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import page.MyPage;

/**
 *
 * ҵ��ִ�����̲���
 *
 * */
public class MyTest {
    //��ȡdriver��������
    private WebDriver driver = new FirefoxDriver();
    private Logger log=Logger.getLogger(MyTest.class);
    @Test
    public void baidu_search(){
        //��ȡҳ��Ԫ�ض���
        MyPage myPage = PageFactory.initElements(driver, MyPage.class);
        log.info("��ȡ��ҳ��Ԫ�ض���"+myPage);
        driver.get("http://www.baidu.com");
        //�������
        driver.manage().window().maximize();
        //��д��sendkeys����
        myPage.kw_sendkes("selenium");
        //���������һ��
        myPage.su_click();
    }




}
