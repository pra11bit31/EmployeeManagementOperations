package com.employee.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.manager.EmployeeManager;

/**
 * Servlet implementation class SalarySearchServlet
 */
@WebServlet("/SalarySearchServlet")
public class SalarySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SalarySearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeManager empman = new EmployeeManager();

		String a = request.getParameter("company");
		if (a.equals("ALL")) {
			List<Object[]> emp = empman.getSalaryOnAllCompany(a);
			request.setAttribute("emp", emp);

			RequestDispatcher view = request
					.getRequestDispatcher("showCompanyBasedSalary.jsp");
			view.forward(request, response);
		} else {
			List<Object[]> emp = empman.getSalaryOnCompany(a);
			request.setAttribute("emp", emp);

			RequestDispatcher view = request
					.getRequestDispatcher("showCompanyBasedSalary.jsp");
			view.forward(request, response);
		}

	}

}
