package com.itheima.test;

import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;

public class ItemsTest {
    @Test
    public void findById(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsDao bean = ac.getBean(ItemsDao.class);

        Items byId = bean.findById(1);
        System.out.println(byId);

    }
    @Test
    public void findById2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsService bean = ac.getBean(ItemsService.class);

        Items byId = bean.findById(1);
        System.out.println(byId);

    }

}
