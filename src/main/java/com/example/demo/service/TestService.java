package com.example.demo.service;

import com.example.demo.db.TestDB;
import com.example.demo.mapper.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public List<TestDB> allList(){
        return testRepository.findAll();
    }

    public TestDB save(){
        return testRepository.findAll().set();
    }

}
