package com.example.demo.serviceImpl;

import com.example.demo.service.PersonBehaviorService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ChildrenBehavionServiceImpl implements PersonBehaviorService {
    @Override
    public void run() {
        System.out.println("children run!");
    }

    @Override
    public void fly() {
        System.out.println("children fly!");

    }
}
