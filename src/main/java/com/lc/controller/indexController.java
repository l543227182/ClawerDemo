package com.lc.controller;

import com.lc.Mapper.DataMapper;
import com.lc.Model.crawlerBean;
import com.lc.crawler.mainCrawler;
import com.lc.utils.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private DataMapper dataMapper;

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

    @RequestMapping("/api/getCrawlerData")
    @ResponseBody
    public Map getCrawlerData(String start, String pageSize) {
        HashMap<String,Object> map=new HashMap<>();
        List<crawlerBean> crawlerBeans = dataMapper.selectDataForPage(Integer.valueOf(start), Integer.valueOf(pageSize));
        int total = dataMapper.countData();
        map.put("data",crawlerBeans);
        map.put("total",total);
        return map;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleError(HttpServletRequest req, Exception exception) {
    return "hello world";
    }
}
