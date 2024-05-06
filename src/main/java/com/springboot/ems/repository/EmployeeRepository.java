package com.springboot.ems.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.ems.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
