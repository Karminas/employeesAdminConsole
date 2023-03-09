package com.tupac.employeesAdminConsole.employeesAdminConsole.Components;

import com.tupac.employeesAdminConsole.employeesAdminConsole.Entities.Employee;
import com.tupac.employeesAdminConsole.employeesAdminConsole.Entities.Site;
import com.tupac.employeesAdminConsole.employeesAdminConsole.Repositories.EmployeeRepository;
import com.tupac.employeesAdminConsole.employeesAdminConsole.Repositories.SiteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrap implements CommandLineRunner {

    // Repositories
    private final EmployeeRepository employeeRepository;
    private final SiteRepository siteRepository;

    // Repositories instantiation via Dependency Injection in class constructor.
    public bootstrap(EmployeeRepository employeeRepository, SiteRepository siteRepository) {
        this.employeeRepository = employeeRepository;
        this.siteRepository = siteRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Instantiate all needed objects for testing purposes.
        Employee employee1 = new Employee();
        employee1.setName("Tupac");
        employee1.setLastName("Ocampo");

        Employee employee2 = new Employee();
        employee2.setName("Alejandro");
        employee2.setLastName("Orozco");

        Site site1 = new Site();
        site1.setName("Globant Tower");
        site1.setLocationName("Puerto Madero");


        // Save all objects in their respective repositories.
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        siteRepository.save(site1);

    }
}
