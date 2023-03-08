package com.example.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.Service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {
	@Autowired
	EmployeeService eser;
	@PostMapping("/add")
	
	public EmployeeEntity addDetails(@RequestBody  EmployeeEntity e1)
	{
		return eser.saveDetails(e1);
	}
	
	@GetMapping("/showDetails")
	public List<EmployeeEntity> fetchDetails()
	{
		return eser.getDetails();
	}
    @PutMapping("/updateDetails")
    public EmployeeEntity updateInfo(@RequestBody EmployeeEntity s1)
    {
    	return eser.updateDetails(s1);
    }
    @DeleteMapping("/delete/{eid}")
    public String deleteInfo(@PathVariable("eid") int eid)
    {
    	eser.deleteDetails(eid);
    	return "Details Deleted Successfully";
    }
}
