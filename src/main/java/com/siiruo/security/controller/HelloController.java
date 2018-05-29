package com.siiruo.security.controller;

import com.siiruo.security.model.Worker;
import com.siiruo.security.service.BaseWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.peer.WindowPeer;

/**
 * Created by siiruo on 2018/5/29.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    BaseWorkerService workerService;

    public HelloController() {
        System.out.println("dddddddddddddddd");
    }

    //映射一个action
    @RequestMapping("/get")
    public  String index(){

        System.out.println("hello");

        Worker worker=new Worker();

        worker.setAge(100);
        worker.setName("wang");

        this.workerService.add(worker);
        return "index";
    }
}