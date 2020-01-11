package main.dao;

import java.util.List;

public interface EmployeeDao {

	void saveEmployee( Employee employee );
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeesBySsn( String ssn );
	
	void findBySsn( String ssn );
	
	void updateEmployee( Employee employee );

}
