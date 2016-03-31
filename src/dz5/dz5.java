/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz5;
import dz2.Matrix;
 import java.lang.reflect.Constructor;
 import java.lang.reflect.Method;
 import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aslan
 */
public class dz5
{
    public static void main(String[] args) throws InterruptedException
    {
        try
        {
            Class matrixClass=Matrix.class;
            Constructor[] cons= matrixClass.getConstructors();
            Matrix mtx1=(Matrix) cons[0].newInstance();
            Matrix mtx2=(Matrix) cons[1].newInstance(3,3);
            
            Method[] methods= matrixClass.getDeclaredMethods();
            Field[] fields=matrixClass.getDeclaredFields();
            for (Field field:fields)
            {
                System.out.println("Fields: "+field.getName());
                Thread.sleep(50);
                System.out.println("\n");
            }
            
            for (Method method:methods)
            {
                Thread.sleep(50);
                System.out.println("Methods: "+method.getName());
                if (method.getName()=="Add")
                {
                    Matrix mtx= (Matrix) method.invoke(mtx1, mtx2);
                    System.out.println( mtx.toString());
                    Thread.sleep(50);
                }
                if (method.getName()=="Sub")
                {
                    Matrix mtx= (Matrix) method.invoke(mtx1, mtx2);
                    System.out.println( mtx.toString());
                    Thread.sleep(50);
                }
                if (method.getName()=="Print")
                {
                   method.setAccessible(true);
                   method.invoke(mtx1, mtx2);
                   Thread.sleep(50);
                }
                System.out.println("\n");
            }
            
            
            
            
            
            
        } catch (InstantiationException ex)
        {
            Logger.getLogger(dz5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(dz5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex)
        {
            Logger.getLogger(dz5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex)
        {
            Logger.getLogger(dz5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
}
