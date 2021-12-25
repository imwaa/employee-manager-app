package com.imwaa.employeemanager.repo;

import com.imwaa.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

        /* This is a query method created thanks to the name convention
        he recognize what we want to do with the name of the method and the param
        */
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
