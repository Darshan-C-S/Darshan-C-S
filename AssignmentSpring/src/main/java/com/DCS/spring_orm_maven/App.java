package com.DCS.spring_orm_maven;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import dao.EmployeeDao;
import entities.Employee;
/**ng_orm_mave
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
         Employee emp = new Employee();
         int option1 = 6;
         int option  = 0;
         do {
        	 System.out.println("#######################################################");
        	 System.out.println("Press 1 :Insert employee");
        	 System.out.println("Press 2 :Update employee");

        	 System.out.println("Press 3 :delete employee");
        	 System.out.println("Press 4 :Get employee by id");
        	 System.out.println("Press 5 :Get all employee");
        	 System.out.println("#######################################################");
        	 
        	 System.out.println("Please select any one option");
        	 Scanner sc = new Scanner(System.in);
        	 option = sc.nextInt();
        	 
        	 switch(option) {
        	 case 1:{
        		 emp.setId(10);
        		 emp.setName("Darshan C S");
        		 emp.setEmail("d.com");
        		 int result = dao.addEmployee(emp);
        		 System.out.println("("+result+")rows inserted....");
        		 
        		 break;
        		 
        	 }
        	 case 2:{
        		 emp.setId(1);
        		 emp.setName("billi");
        		 emp.setEmail("b.com");
        		 int result = dao.updateEmployee(emp);
        		 System.out.println("("+result+")rows updated....");
        		 
        		 break;
        		 
        		 
        	 }
        	 case 3:{
        		 
        		 dao.deleteEmployee(1);
        		 System.out.println("rows deleted....");
        		 
        		 break;
        	 
        	 }
        	 case 4:{
        		 List<Employee> list = dao.getAllEmployees();
        		 
        		 for (Employee employee : list ) {
        			 System.out.println(list);
        			 
        		 }
        		 break;
        	 }
        		 case 5:{
        			 System.out.println("Enter employee Id....");
        			 int idd = sc.nextInt();
        			 Employee emp1 = dao.getEmployeeById(idd);
        			 System.out.println(emp1);
        			 break;
        		 }
        		 default: {
        			 System.out.println("incorrect option....");
        			 
        		 }
        	 }
        	 
        	 
         }while(option!=6);
//         Employee newEmployee = new Employee();
//         newEmployee.setId(1);
//         newEmployee.setName("Mark");
//         newEmployee.setEmail("m@gmail.com");
//         
//         int result =  dao.addEmployee(newEmployee);
//         System.out.println("("+result+") rows inserted...");


    }
}
