/**
 * @author pradeep
 *
 *//*
package com.employee.main;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.employee.model.*;

public class hibermain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		// create some Employee object

		Department dept1 = new Department();
		dept1.setDepartmentName("Development");
		Department dept2 = new Department();
		dept2.setDepartmentName("Admin");
		Department dept3 = new Department();
		dept3.setDepartmentName("Manager");

		ArrayList<Department> department = new ArrayList<Department>();
		department.add(dept1);
		ArrayList<Department> department2 = new ArrayList<Department>();
		department2.add(dept2);
		ArrayList<Department> department3 = new ArrayList<Department>();
		department3.add(dept3);
		department3.add(dept2);	
		ArrayList<Department> department4 = new ArrayList<Department>();
		department4.add(dept1);
		department4.add(dept2);
		department4.add(dept3);


		Skills s1 = new Skills();
		s1.setSkillName("Java");
		Skills s2 = new Skills();
		s2.setSkillName("HR");
		Skills s3 = new Skills();
		s3.setSkillName("Project Management");

		ArrayList<Skills> skill = new ArrayList<Skills>();
		skill.add(s1);
		skill.add(s2);
		ArrayList<Skills> skill2 = new ArrayList<Skills>();
		skill2.add(s1);
		ArrayList<Skills> skill3 = new ArrayList<Skills>();
		skill3.add(s1);
		skill3.add(s2);
		skill3.add(s3);

		Employees emp1 = new Employees();
		emp1.setDepartments(department);
		emp1.setDesignation("Consultant");
		emp1.setEmployeeName("Pradeep");
		emp1.setSalary(24000);
		emp1.setSkills(skill);

		Employees emp2 = new Employees();
		emp2.setDepartments(department2);
		emp2.setDesignation("SeniorConsultatnt");
		emp2.setEmployeeName("Nirmal");
		emp2.setSalary(22000);
		emp2.setSkills(skill2);

		Employees emp3 = new Employees();
		emp3.setDepartments(department3);
		emp3.setDesignation("SuperSeniorssss");
		emp3.setEmployeeName("Lakshman");
		emp3.setSalary(25000);
		emp3.setSkills(skill3);

		ArrayList<Employees> employee = new ArrayList<Employees>();
		employee.add(emp1);
		employee.add(emp2);

		ArrayList<Employees> employee2 = new ArrayList<Employees>();
		employee2.add(emp3);

		Company comp = new Company();
		comp.setCompanyName("Kovan");
		comp.setDepartments(department3);
		comp.setEmployees(employee);

		Company comp1 = new Company();
		comp1.setCompanyName("NDOT");
		comp1.setDepartments(department3);
		comp1.setEmployees(employee2);

		session.save(comp1);
		session.save(comp);
		session.getTransaction().commit();
		System.out.println("Records inserted");
	}
}*/