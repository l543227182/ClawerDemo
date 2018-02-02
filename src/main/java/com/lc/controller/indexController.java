package com.lc.controller;

import com.lc.Model.crawlerBean;
import com.lc.crawler.mainCrawler;
import com.lc.utils.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by luochao.byron on 2017/11/9.
 */
@Controller
public class indexController {

    @Autowired
    @Qualifier("sayHello1")
    private person sayhello;

    @Autowired
    private mainCrawler crawler;

    @RequestMapping("/")
    public String index() {
        sayhello.SayHello();
        return "index";
    }
    @RequestMapping("/index")
    @ResponseBody
    public person json() {
        return new person();
    }

    @RequestMapping("/getCrawlerData")
    @ResponseBody
    public Collection<crawlerBean> getCrawlerData() {
        return  crawler.pageMap.values();
    }
}
