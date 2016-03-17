/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz3;

/**
 *
 * @author Aslan
 */
public class Checkpoint
{
    public static int Check(Automobile auto) 
            throws HeightOverflowException, 
            CapacityOverflowException, 
            SpeedOverflowException
    { 
        int payment=0;
        label:
        {
            if (auto.config.isSpec)
            {                
                break label;
            }
            
            if (auto instanceof Car)
            {               
                payment+=1000;
            }
            if (auto instanceof Truck)
            {               
                payment+=2000;
                
                if (auto.config.withTrailer)
                {
                    payment+=500;
                }
                
            }
            
            if (auto.config.height>4)
                {
                   throw new HeightOverflowException();
                }
            
            if (auto.config.speed>80)
            {
                payment+=5000;
            }
            
            if (auto.config.speed>180)
            {
                throw  new SpeedOverflowException();
            }
            
            
            
            
            
        }
        System.out.println("Сумма к оплате для прохождения через КПП (с учетом штрафов) - "+ payment);
        return payment;
    }
    
    
    
    
    
 
    
    
    
}
