package com.example.demo.serviceImpl;

import com.example.demo.service.PersonBehaviorService;
import org.springframework.stereotype.Service;

@Service
public class AdultBehaviorServiceImpl implements PersonBehaviorService {
    @Override
    public void run() {
        System.out.println("Adult run!");
    }

    @Override
    public void fly() {
        System.out.println("Adult run!");
    }
}
