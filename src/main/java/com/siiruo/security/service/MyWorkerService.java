package com.siiruo.security.service;

import com.siiruo.security.model.Worker;
import org.springframework.stereotype.Service;

/**
 * Created by siiruo on 2018/5/29.
 */
@Service
public class MyWorkerService implements BaseWorkerService{
    @Override
    public void add(Worker worker) {
        System.out.println(worker);
    }
}
