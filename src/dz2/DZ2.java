/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz2;

/**
 *
 * @author Aslan
 */
public class DZ2
{
    public static void main(String[] args)
    {
        System.out.println("DZ2");
        Matrix m=new Matrix();
        Matrix n=new Matrix();
        System.out.println(m.toString());
        m= m.Add(n);
        System.out.println(m.toString());
        m=m.Sub(n);
        System.out.println(m.toString());
        m=m.Mult(n);
        System.out.println(m.toString());
        m=m.Div(n);
        System.out.println(m.toString());
    }
}




