package com.lc.webTest;

import com.lc.Mapper.DataMapper;
import com.lc.Model.crawlerBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebTestApplicationTests {

	@Autowired
	private DataMapper dataMapper;

	@Test
	public void contextLoads() {
		AnnotationConfigApplicationContext aa=new AnnotationConfigApplicationContext();
        crawlerBean crawlerBean = new crawlerBean();
        crawlerBean.setAvargeScore(3);
        crawlerBean.setCommentsCount(3);
        crawlerBean.setEachScoreCount("123");
        crawlerBean.setResourceUrl("234123234");
        crawlerBean.setTitle("324234");
        crawlerBean.setContent("fasdfasd");
        int i = dataMapper.insertData(crawlerBean);
        System.out.println(crawlerBean.getId());
    }

    @Test
    public void selectData(){
        List<crawlerBean> crawlerBeans = dataMapper.selectDataForPage(0, 10);
        System.out.println(crawlerBeans);
    }
}
