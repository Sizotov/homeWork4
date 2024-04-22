package com.example.homeWork4.repository;

import com.example.homeWork4.model.Employee;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class EmployeeRepository {
    // Список сотрудников
    List<Employee> employeeList = new ArrayList<>();
    // Метод для добавления сотрудника в список
    public void addEmployee (Employee employee) {
        employeeList.add(employee);
    }
}
