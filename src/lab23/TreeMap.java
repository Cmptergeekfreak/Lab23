/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab23;

import java.util.Map;

/**
 *
 * @author Joe
 */
public class TreeMap {
    
    public static void main(String[]args){
        
        
        Employee one = new Employee("Builder", "Bob", "333-33-3333");
        Employee two = new Employee("Gadget", "Inspector", "666-66-6666");
        Employee three = new Employee("Montgomery ", "Lloyd", "111-11-1111");
        Employee four = new Employee("Walker", "Edna", "888-88-8888");
        
        Map map = (Map) new TreeMap();
        map.put("333-33-3333", one);
        map.put("666-66-6666", two);
        map.put("111-11-1111", three);
        map.put("888-88-8888", four);
}
}