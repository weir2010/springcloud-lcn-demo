package com.example.demo.client;

import com.example.demo.entity.Test;
import com.lorne.tx.springcloud.feign.TransactionRestTemplateConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lorne on 2017/6/27.
 */
@FeignClient(value = "demo5",configuration = TransactionRestTemplateConfiguration.class)
public interface Demo5Client {


    @RequestMapping("/demo/list")
    List<Test> list();


    @RequestMapping("/demo/save")
    int save();
}
