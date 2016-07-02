package com.test;

import org.springframework.stereotype.Service;

/**
 * Created by admin on 2016/7/2.
 */
@Service
public class TestDubboServiceImpl implements TestDubboService {
    @Override
    public String hello(String name) {
        return "测试+"+name;
    }
}
