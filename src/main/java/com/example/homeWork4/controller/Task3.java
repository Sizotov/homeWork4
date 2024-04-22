package com.example.homeWork4.controller;

import com.example.homeWork4.model.Employee;
import com.example.homeWork4.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class Task3 {
    // Объект репозитория для работы с сотрудниками
    private final EmployeeRepository employeeRepository;

    // Обработка GET-запроса для получения списка сотрудников
    @GetMapping ("/employees")
    public String getEmployees(Model model){
        model.addAttribute("employees", employeeRepository.getEmployeeList());
        return "employees"; // Возвращает представление "employees"
    }

    // Обработка POST-запроса для добавления нового сотрудника
    @PostMapping("/employees")
    public String addNewEmployee(@ModelAttribute("employee") Employee employee, Model model){
        employeeRepository.addEmployee(employee);
        model.addAttribute("employees", employeeRepository.getEmployeeList());
        return "employees"; // Возвращает представление "employees"
    }
}
