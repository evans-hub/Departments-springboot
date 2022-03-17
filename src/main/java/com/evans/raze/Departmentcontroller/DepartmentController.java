package com.evans.raze.Departmentcontroller;

import com.evans.raze.departmentservice.DepartmentService;
import com.evans.raze.entity.Department;
import com.evans.raze.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;
@PostMapping("/")
    public Department saveDepartment(@Validated @RequestBody Department departmentid){
log.info("Saved in savedepartment controller");
        return departmentRepository.save(departmentid);
    }
    @GetMapping("/{id}")
    public  Department findDepartmentBYId(@PathVariable("id") Long id){
        log.info("Saved in finddepartment controller");
    return departmentRepository.findById(id).get();
    }
    @GetMapping("/")
    public List<Department> findAllEmp(){
    return departmentRepository.findAll();
    }
}
