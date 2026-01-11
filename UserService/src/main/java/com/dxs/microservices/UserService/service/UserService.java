package com.dxs.microservices.UserService.service;

import com.dxs.microservices.UserService.entity.UserEntity;
import com.dxs.microservices.UserService.repository.UserRepository;
import com.dxs.microservices.UserService.valueObjects.Department;
import com.dxs.microservices.UserService.valueObjects.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        UserEntity user = userRepository.findById(userId).get();

        Department department =
                restTemplate
                        .getForObject("http://localhost:9001/departments/"+user.getDepartmentId(),Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
