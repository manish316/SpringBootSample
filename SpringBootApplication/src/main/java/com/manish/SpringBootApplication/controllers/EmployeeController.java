package com.manish.SpringBootApplication.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.SpringBootApplication.dto.EmployeeDTO;
import com.manish.SpringBootApplication.services.EmployeeService;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(path = "/{id}")
	public EmployeeDTO getEmployeeById(@PathVariable("id") Long empID) {
		return employeeService.getEmployeeById(empID);
	}

	@PostMapping
	public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.createNewAmployee(employeeDTO);
	}
	
	@GetMapping(path = "/getAll")
	public List<EmployeeDTO> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
