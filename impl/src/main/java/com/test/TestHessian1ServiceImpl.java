package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2016/7/3.
 */
@Service
public class TestHessian1ServiceImpl implements TestHessian1Service{
    @Override
    public String hessian1() {
        return "hessian1";
    }
}
