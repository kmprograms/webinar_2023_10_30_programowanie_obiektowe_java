package com.app.obiektowosc_5_s.service;

import com.app.obiektowosc_5_s.model.Employee;

public interface EmployeeSalaryCalculator {
    Employee calculateSalary(Employee employee, BonusStrategy bonusStrategy);
}
