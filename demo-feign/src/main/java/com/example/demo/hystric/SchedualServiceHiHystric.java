package com.example.demo.hystric;

import org.springframework.stereotype.Component;

import com.example.demo.service.SchedualServiceHi;

/**
 * 断路器
 * @author Ati
 * 需要实现SchedualServiceHi 接口，并注入到Ioc容器中
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
