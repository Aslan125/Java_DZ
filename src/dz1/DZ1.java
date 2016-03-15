
package dz1;

import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author Aslan
 */
public class DZ1
{

    public static void main(String[] args) throws IOException
    {
        System.out.println("#####DZ1#####");
        System.err.println("Задача 1");
        KU();
        
         System.err.println("Задача 2");
         PC();
         System.out.println("Задача 3");
         
         KK();
         
    }
    
    
    public  static void KU() throws IOException
    {
        double a,b,c,d;
        double x1,x2;
        System.out.println("Квадратное уравнение");
        Scanner input=new Scanner(System.in);
        System.out.println("Введите значение a:");
        a=input.nextDouble();
        
        System.out.println("Введите значение b:");
        b=input.nextDouble();
        
        System.out.println("Введите значение c:");
        c=input.nextDouble();
        
        d=Math.pow(b, 2)-(a*c*4);
        System.out.println("Дискриминант равен )"+d); 
        
        if (d<0)
        {
            System.err.println("Нет решений!");
        }
        else if(d==0)
        {
            x1=(-b)/(2*a);
            System.out.println("x1="+x1);
        }
        else        
        {
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            if (x1==x2)
            {
                System.out.println("x1=x2="+x1);
            }
            else
            {                
                System.err.println("x1="+x1+" x2="+x2);
            }
        }
        
        
    
    }
    
    public  static  void PC()
    {

		for (float i = 2; i <= 1000f; i++) 
                {
			boolean flag = true;
			for (float j = 2; j < i; j++) 
                        {				
				if ((i%j) == 0) 
                                {
                                flag = false;
				}
			}
			if (flag) 
                        {
				System.out.print(i+"\n" );
			}
		}
       
        
		
    }
    
    
    public static void KK()
    {
        while (true)
        {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите значение (например: 1, 4, 9, 16 и т.д.)");
        double a=input.nextDouble();
        
        double q=0;
            for (int i = 1; i < a; i++)
            {  
                if ((i*i)==a)
                {
                    q=i;
                    break;
                }
                
            }
            if (q*q!=a)
            {
                System.out.println("Не корректное значение!");
                continue;
            }
        System.out.println("Корень "+a+"="+q);             
        }
      
    }
    
    
}
