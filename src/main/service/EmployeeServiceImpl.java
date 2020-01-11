package main.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void DeleteEmployeesBySsn(String ssn) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
