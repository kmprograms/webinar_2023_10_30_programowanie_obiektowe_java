package com.app.obiektowosc_5_s;

import com.app.obiektowosc_5_s.model.Employee;
import com.app.obiektowosc_5_s.repo.impl.EmplyRepositoryImpl;
import com.app.obiektowosc_5_s.service.BonusStrategy;
import com.app.obiektowosc_5_s.service.impl.EmploySalaryCalculatorImpl;

public class App5 {
    public static void main(String[] args) {
        var e = new Employee(1, "A", 100);

        var employeeRepository = new EmplyRepositoryImpl();
        employeeRepository.saveEmployee(e);

        var esc = new EmploySalaryCalculatorImpl();
        esc.calculateSalary(e, () -> 100);
    }
}
