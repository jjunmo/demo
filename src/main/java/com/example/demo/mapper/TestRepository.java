package com.example.demo.mapper;

import com.example.demo.db.TestDB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestRepository extends JpaRepository<TestDB,Integer> {

    Optional<TestDB> findByIdx(Integer idx);
}
