package com.example.springInheritanceEmployeedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springInheritanceEmployeedemo.entity.RegularEmployee;

@Repository
public interface RegularEmployeeRepository extends JpaRepository<RegularEmployee, Integer>{

}
