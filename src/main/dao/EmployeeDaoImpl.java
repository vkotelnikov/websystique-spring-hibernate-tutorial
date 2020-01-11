package main.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	public void saveEmployee( Employee employee ) {
		persist( employee );
	}
	
	@Override
	public void deleteEmployeesBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
		query.setParameter( "ssn", ssn );
		query.executeUpdate();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> findAllEmployees() {
		Criteria criteria = getSession().createCriteria( Employee.class );
		return (List<Employee>) criteria.list();
	}

	@Override
	public void updateEmployee(Employee employee) {
		getSession().update( employee );
	}

	@Override
	public void findBySsn(String ssn) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add( Restrictions.eq( "ssn", ssn ) );
		return (Employee) criteria.uniqueResult();
	}

}
