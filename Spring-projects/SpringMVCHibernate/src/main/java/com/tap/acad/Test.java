package com.tap.acad;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeDAOImpl;
import com.entity.Employee;

@Controller
public class Test {
	ClassPathXmlApplicationContext  ac;
	EmployeeDAOImpl ed;
	public Test(){
		ac = new ClassPathXmlApplicationContext("beans.xml");
		ed = (EmployeeDAOImpl) ac.getBean("edaoi");
	}
	
	@RequestMapping("/")
	public String homeController() {
		return "homePage";
	}
	
	@RequestMapping("dataInsert")
	public String insertController(@RequestParam("empid") int empid, 
			@RequestParam("ename") String ename,@RequestParam("jobrole") String jobrole,
			@RequestParam("dept") String dept,@RequestParam("deptid") int deptid) {
		
		Employee e = new Employee(empid, ename, jobrole,dept, deptid);
		
		String s = ed.insert(e);
		return "insertPage";
	}
	
	@RequestMapping("delete")
	public String deleteController(@RequestParam("empid") int empid) {
		String s = ed.delete(empid);
		return "deletePage";
	}
	
	@RequestMapping("update")
	public String updateController(@RequestParam("empid") int empid, @RequestParam("ename") String name,@RequestParam("jobrole") String jobrole,
			@RequestParam("dept") String dept,@RequestParam("deptid") int deptid){
		
		ed.update(new Employee(empid,name,jobrole,dept,deptid));
		return "updatePage";
			
	}
	
	@RequestMapping("get")
	public String getController(@RequestParam("empid") int empid, Model m){
		
		Employee e = ed.get(empid);
		m.addAttribute("employee", e);
		
		return "display";
		
	}
	
	@RequestMapping("getAll")
	public String getAllController(Model m) {
		
		List<Employee> list = ed.getAll();
		m.addAttribute("employee", list);
		return "display";
	}
	
}










