package main.service;

import java.util.List;

public interface EmployeeService {

	void saveEmployee( Employee employee );
	
	List<Employee> findAllEmployees();
	
	void DeleteEmployeesBySsn( String ssn );
	
	Employee findBySsn( String ssn );
	
	void updateEmployee( Employee employee );
	
}
