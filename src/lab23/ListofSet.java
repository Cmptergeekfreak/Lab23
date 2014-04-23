/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Joe
 */
public class ListofSet {
    
    public static void main(String[]args){
        
        List<Employee> employees = new ArrayList<>();
        
        
        
        Employee one = new Employee("Builder", "Bob", "333-33-3333");
        Employee two = new Employee("Gadget", "Inspector", "666-66-6666");
        Employee three = new Employee("Montgomery ", "Lloyd", "111-11-1111");
        Employee four = new Employee("Walker", "Edna", "888-88-8888");
        
    employees.add(one);
    employees.add(two);
    employees.add(three);
    employees.add(four);
    
    Set noDupes = new HashSet(employees);
    employees = new ArrayList(noDupes);
    
    for (Employee e : employees){
        System.out.println(e);
    }
  }
}