package com.example.springInheritanceEmployeedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springInheritanceEmployeedemo.entity.ContractualEmployee;

@Repository
public interface ContractualEmployeeRepository extends JpaRepository<ContractualEmployee, Integer> {

}
