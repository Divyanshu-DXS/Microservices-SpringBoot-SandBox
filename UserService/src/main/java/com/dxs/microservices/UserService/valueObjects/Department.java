package com.dxs.microservices.UserService.valueObjects;

public class Department {
    private Long departmentId;
    private String departmentName;
    private String departmentCode;
    private String departmentLocation;

    public Department(Long departmentId, String departmentName, String departmentCode, String departmentLocation) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.departmentLocation = departmentLocation;
    }

    public Department() {
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation) {
        this.departmentLocation = departmentLocation;
    }
}
