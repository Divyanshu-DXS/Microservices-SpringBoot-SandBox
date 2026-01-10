package com.dxs.microservices.Department.controller;

import com.dxs.microservices.Department.entity.Department;
import com.dxs.microservices.Department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public Department createDepartment(@RequestBody Department department){
//        log.info(LocalDateTime.now()+"Inside Department controller -- createDepartment");
//        System.out.println("department added");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id){
//        log.info(LocalDateTime.now()+"Inside Department controller -- getDepartmentById");
        return departmentService.getDepartmentById(id);
    }
}
