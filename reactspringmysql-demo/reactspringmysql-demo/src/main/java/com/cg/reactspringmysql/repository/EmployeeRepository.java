package com.cg.reactspringmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.reactspringmysql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
