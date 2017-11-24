package com.employee.manager;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import com.employee.model.Employees;

/**
 * @author pradeep
 * 
 */
public class EmployeeManager {
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	// Loads the SessionFactory when the program loads

	private static SessionFactory buildSessionFactory() {
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();
		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;

	}

	// To get all the employees based on Skill

	public List<Object[]> getAllEmployees(String skill) {

		sessionObj = buildSessionFactory().openSession();
		sessionObj.beginTransaction();
		@SuppressWarnings("deprecation")
		Query q = sessionObj
				.createSQLQuery("select emp.employeeName,s.skillName,c.companyName from company_employees ce,company c,employees_skills es,employees emp,skills s where  c.companyId=ce.Company_companyId and ce.employees_employeeId=emp.employeeId and emp.employeeId=es.Employees_employeeId and es.skills_skillId=s.skillId and s.skillName='"
						+ skill + "'");
		List<Object[]> rows = q.list();
		sessionObj.close();
		return rows;
	}

	// To get salary based on the company

	public List<Object[]> getSalaryOnCompany(String company) {

		sessionObj = buildSessionFactory().openSession();
		sessionObj.beginTransaction();
		@SuppressWarnings("deprecation")
		Query q = sessionObj
				.createSQLQuery("select e.employeeName,e.salary,c.companyName from company c,employees e,company_employees ce where e.employeeId=ce.employees_employeeId and c.companyId=ce.Company_companyId and c.companyName='"
						+ company + "' order by e.salary desc;");
		List<Object[]> rows = q.list();
		sessionObj.close();
		return rows;
	}

	// To get salary of all the employees in a company

	public List<Object[]> getSalaryOnAllCompany(String company) {
		sessionObj = buildSessionFactory().openSession();
		sessionObj.beginTransaction();
		@SuppressWarnings("deprecation")
		Query q = sessionObj
				.createSQLQuery("select e.employeeName,e.salary,c.companyName from company c,employees e,company_employees ce where e.employeeId=ce.employees_employeeId and c.companyId=ce.Company_companyId order by e.salary desc;");
		List<Object[]> rows = q.list();
		sessionObj.close();
		return rows;
	}
}
