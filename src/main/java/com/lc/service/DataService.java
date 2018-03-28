package com.lc.service;

import com.lc.Mapper.DataMapper;
import com.lc.Mapper.SubDataMapper;
import com.lc.Model.crawlerBean;
import com.lc.Model.itemComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DataService {


    @Autowired
    private DataMapper dataMapper;

    @Autowired
    private SubDataMapper subDataMapper;

    public int addData(crawlerBean crawlerBean){
        try {
            int id = dataMapper.insertData(crawlerBean);

            for(itemComment ic:crawlerBean.getComments()) {
                ic.setPid(String.valueOf(crawlerBean.getId()));
                try{
                    subDataMapper.insertData(ic);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return crawlerBean.getId();
    }
}
