package com.lc.config;

import com.lc.crawler.mainCrawler;
import com.lc.utils.person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;
import us.codecraft.webmagic.scheduler.BloomFilterDuplicateRemover;
import us.codecraft.webmagic.scheduler.PriorityScheduler;

@Configuration
public class AppConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**");
    }
    @Bean("sayHello1")
    public person sayHello1(){
        return new person();
    }
    @Bean("sayHello2")
    public person sayHello2(){
        return new person();
    }

    @Bean("Crawler")
    public mainCrawler getSpider() {
        mainCrawler mainCrawler = new mainCrawler();
       //  mainCrawler.startSpider();
        return  mainCrawler;
    }
}
