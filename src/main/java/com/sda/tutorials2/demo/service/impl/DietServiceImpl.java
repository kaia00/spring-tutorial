package com.sda.tutorials2.demo.service.impl;

import com.sda.tutorials2.demo.service.DietService;
import org.springframework.stereotype.Component;

@Component
public class DietServiceImpl implements DietService {


    @Override
    public String getDailyDiet() {
        return "My daily diet";
    }
}
