package com.tupac.employeesAdminConsole.employeesAdminConsole.Controllers;

import com.tupac.employeesAdminConsole.employeesAdminConsole.Entities.Employee;
import com.tupac.employeesAdminConsole.employeesAdminConsole.Services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    // Services in use
    EmployeeService employeeService;

    //Constructor - Dependency Injection
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //Class methods - Endpoints.
    @RequestMapping (method = RequestMethod.GET)
    public ModelAndView getAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return new ModelAndView("employees");
    }

    @RequestMapping (value = "delete/{id}", method = RequestMethod.GET)
    public RedirectView removeEmployee(@PathVariable Long id) {
        employeeService.removeEmployee(id);
        return new RedirectView("/employees");
    }

    @RequestMapping (value = "add", method = RequestMethod.POST)
    public ModelAndView addEmployee(@RequestParam Employee employee) {

        return new ModelAndView("addTodo");
    }
}
