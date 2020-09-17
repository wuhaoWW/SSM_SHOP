package com.wh.service;

import com.wh.mapper.SmbmsAddressMapper;
import com.wh.mapper.SmbmsUserMapper;
import com.wh.pojo.SmbmsAddress;
import com.wh.pojo.SmbmsAddressExample;
import com.wh.pojo.SmbmsUser;
import com.wh.pojo.SmbmsUserExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TM {

    public static void main(String[] args) {
        System.out.println("测试mybatis与spring整合，直接从spring的容器中获取mybatis的mapper接口对象");
        //测试
        //加载spring配置文件，启动spring
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器  获取mapper对象
        SmbmsAddressMapper mapper = ac.getBean(SmbmsAddressMapper.class);//从spring容器获取mybatis创建的mapper接口对象
        SmbmsUserMapper bean = ac.getBean(SmbmsUserMapper.class);
        SmbmsUserExample example = new SmbmsUserExample();
        SmbmsUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsercodeEqualTo("admin");
        List<SmbmsUser> smbmsUsers = bean.selectByExample(example);

        //调用mapper方法进行查询
//        List<SmbmsAddress> data = mapper.selectByExample(new SmbmsAddressExample());

        System.out.println("完成spring与mybatis的整合："+smbmsUsers);
    }

}
