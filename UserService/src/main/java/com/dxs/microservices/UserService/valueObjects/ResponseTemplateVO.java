package com.dxs.microservices.UserService.valueObjects;


import com.dxs.microservices.UserService.entity.UserEntity;

public class ResponseTemplateVO {
    private UserEntity user;
    private Department department;

    public ResponseTemplateVO(UserEntity user, Department department) {
        this.user = user;
        this.department = department;
    }

    public ResponseTemplateVO() {
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
