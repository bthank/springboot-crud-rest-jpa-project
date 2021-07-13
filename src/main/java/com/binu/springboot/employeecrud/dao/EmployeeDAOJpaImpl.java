package com.binu.springboot.employeecrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.binu.springboot.employeecrud.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

	private EntityManager entityManager;
	
	// inject entityManager via constructor injection
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> findAll() {

		// create a query
		Query theQuery = entityManager.createQuery("from Employee");
		
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		// return the results
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		 
		return null;
	}

	@Override
	public void save(Employee theEmployee) {
		 
		
	}

	@Override
	public void update(Employee theEmployee) {
		 
		
	}

	@Override
	public void deleteById(int theId) {
		 
		
	}

}
