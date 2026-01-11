package com.dxs.microservices.Department.service;

import com.dxs.microservices.Department.entity.Department;
import com.dxs.microservices.Department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
//        log.info(LocalDateTime.now()+"Inside DepartmentService -- saveDepartment");
//        System.out.println("deparmtnet saved - service method");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id){
//        log.info(LocalDateTime.now()+"Inside DepartmentService -- getDepartmentById");
        return departmentRepository.findById(id).get();
    }
}
