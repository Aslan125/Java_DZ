/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz4;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Aslan
 */
public class Employee
{
    public String FullName;
    public int WorkAge;
    public Employee(String name, int age)
    {
        this.FullName=name;
        this.WorkAge=age;
    }
    
    @Override
    public String toString()
    {
        return "Name: "+this.FullName+" "+"Work age: "+this.WorkAge;
    }
    
    public static void PrintEmployee(Collection employees, int workAge)
    {
       Iterator<Employee> emps=employees.iterator();
       
        while (emps.hasNext())
        {
            Employee emp=emps.next();
            if (emp.WorkAge==workAge)
            {   
                System.out.println(emp.toString());
            }
        }
        
    }
}
