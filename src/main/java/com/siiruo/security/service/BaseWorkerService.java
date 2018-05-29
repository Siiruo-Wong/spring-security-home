package com.siiruo.security.service;

import com.siiruo.security.model.Worker;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by siiruo on 2018/5/29.
 */
public interface BaseWorkerService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void add(Worker worker);
}
