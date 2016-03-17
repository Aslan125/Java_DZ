/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz3;

import java.util.Random;



/**
 *
 * @author Aslan
 */
public class DZ3
{
    public static void main(String[] args)
    {  
            Random rand=new Random(); 
            
            Automobile auto=null;
            
            AutoConfig[] configs=new AutoConfig[200];
            
            for (AutoConfig config: configs)
            {
                AutoType[] types= AutoType.values();   
                
                config=new  AutoConfig(rand.nextInt(15),rand.nextInt(3),rand.nextInt(20),rand.nextInt(6),rand.nextInt(300),rand.nextBoolean(),rand.nextBoolean());
                
                if (config.withTrailer|| config.height>2||config.capacity>1 )
                {
                    auto=Automobile.Create(AutoType.Truck,config);
                }
                else
                {
                    auto=Automobile.Create(AutoType.Car,config);
                }
                auto.toString();
                
                try
                    {                        
                        Checkpoint.Check(auto);                           
                    } 

                catch (HeightOverflowException ex)
                    {
                        System.out.println("=======>Исключение... "+ex);

                    } 
                catch (CapacityOverflowException ex)
                    {
                        System.out.println("=======>Исключение... "+ex);
                    } 
                catch (SpeedOverflowException ex)
                    {
                       System.out.println("=======>Исключение... "+ex);
                    }
                catch (Exception ex)
                    {
                        System.out.println("=======>Исключение... "+ex);
                    }
                finally     
                {
                    System.out.println("############################################");
                }
                
            }
        
    }
}
