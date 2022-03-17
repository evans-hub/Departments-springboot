package com.evans.raze.departmentservice;

import com.evans.raze.entity.Department;
import com.evans.raze.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department departmentid) {
        log.info("save data in savedepartment service");
        return departmentRepository.save(departmentid);
    }

    public Department findDepartmentBYId(Long id) {
        log.info("save data in finddepartment service");
        return departmentRepository.findDepartmentById(id);
    }


}
