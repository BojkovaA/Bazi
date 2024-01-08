package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Integer id);
}
