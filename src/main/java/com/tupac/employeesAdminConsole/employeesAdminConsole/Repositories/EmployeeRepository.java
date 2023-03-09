package com.tupac.employeesAdminConsole.employeesAdminConsole.Repositories;

import com.tupac.employeesAdminConsole.employeesAdminConsole.Entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long>{

}
