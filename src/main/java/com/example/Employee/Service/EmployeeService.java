package com.example.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo erepo;
	
	public EmployeeEntity saveDetails(EmployeeEntity e)
	{
		
	return erepo.save(e);
	}
    public List<EmployeeEntity> getDetails()
    {
    	return erepo.findAll();
    }
    public EmployeeEntity updateDetails(EmployeeEntity s)
    {
    	return erepo.saveAndFlush(s);
    }
    public void deleteDetails(int id)
    {
    	erepo.deleteById(id);
    }
}
