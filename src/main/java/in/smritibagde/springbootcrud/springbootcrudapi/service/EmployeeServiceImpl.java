package in.smritibagde.springbootcrud.springbootcrudapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.smritibagde.springbootcrud.springbootcrudapi.dao.EmployeeDAO;
import in.smritibagde.springbootcrud.springbootcrudapi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
 
	@Autowired
	EmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDAO.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDAO.delete(id);
	}

	
}
