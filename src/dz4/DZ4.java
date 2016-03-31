/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author Aslan
 */
public class DZ4
{
    public static void main(String[] args)
    {
        System.out.println("############Tast 1#####################");
       Task1();
        System.out.println("############Tast 2#####################");
       Task2();
        System.out.println("############Tast 3#####################");
        Task3();
        
        System.out.println("############Tast 4#####################");
        Task4();
    }
    
    public static void Task1()
    {
        PhoneBook pb=new PhoneBook();
        pb.InitContacts(10000);
        pb.IterateTreeSet();
        pb.IterateArray();

    }
    
    public static void Task2()
    {
       ArrayList<Employee> emps=new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < 100; i++)
        {
           emps.add(new Employee("Name "+i, rnd.nextInt(10))); 
        }
        Employee.PrintEmployee(emps, 5);
    }

    private static void Task3()
    {
        Random rnd=new Random();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for (int i = 0; i < 10; i++)
        {
            set1.add(rnd.nextInt(100));
            set2.add(rnd.nextInt(100));
        }
        System.out.println("Union");
        for (Integer i:union(set1,set2))
        {
            System.out.println(i);
        }
        System.out.println("intersect");
        for (Integer i:intersect(set1,set2))
        {
            System.out.println(i);
        }
        
    }
    
    private static void Task4()
    {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 70; i++)
        {
            list.add(i);
        }
        
        for (int i = 69; i >0 ; i--)
        {
            int a=list.get(i);
            if (a%2!=0)
            {
                list.remove(a);
            }
        }
        for (int i :list)
        {
            System.out.println("четные числа "+i);
        }
    }
    
    static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) 
    {
        HashSet<Integer> newset=new HashSet<>();
        newset.addAll(set1);
        newset.addAll(set2);
        return newset;
    }
    
    
    static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2)
    {
        HashSet<Integer> newset=new HashSet<>();
        newset.addAll(set1);
        newset.addAll(set2);
        for (Integer t:set1)
        {
            if (set2.contains(t))
            {
                newset.add(t);
            }
        } 
        return newset;
    }
}
