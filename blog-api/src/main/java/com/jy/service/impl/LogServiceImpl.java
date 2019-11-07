package com.jy.service.impl;

import com.jy.entity.Log;
import com.jy.repository.LogRepository;
import com.jy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jy
 * <p>
 * 2019年11月4日
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;

    @Override
    public Integer saveLog(Log log) {
        return logRepository.save(log).getId();
    }
}
