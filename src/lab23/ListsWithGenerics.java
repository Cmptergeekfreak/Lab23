/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joe
 */
public class ListsWithGenerics {
    
    public static void main(String[]args){
        
        List employees = new ArrayList();
        
        
        
        Employee one = new Employee("Builder", "Bob", "333-33-3333");
        Employee two = new Employee("Gadget", "Inspector", "666-66-6666");
        Employee three = new Employee("Montgomery ", "Lloyd", "111-11-1111");
        Employee four = new Employee("Walker", "Edna", "888-88-8888");
        
    employees.add(one);
    employees.add(two);
    employees.add(three);
    employees.add(four);
    
        System.out.println("Size of List:" + employees.size());
        
        
        Employee retrievedEmployee = (Employee)employees.get(1);
    System.out.println("Employee variable: " + retrievedEmployee.toString());
    
    System.out.print("Contents of list: \n");
    for(int i = 0; i<employees.size(); i++){
            Employee e = (Employee)employees.get(i);
            System.out.println(e);
    }
  }
}