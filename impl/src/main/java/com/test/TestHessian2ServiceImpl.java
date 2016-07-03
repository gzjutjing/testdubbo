package com.test;

import org.springframework.stereotype.Service;

/**
 * Created by admin on 2016/7/3.
 */
@Service
public class TestHessian2ServiceImpl implements TestHessian2Service{
    @Override
    public String hessian2() {
        return "hessian2";
    }
}
