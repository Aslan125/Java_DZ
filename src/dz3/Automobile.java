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
public abstract class Automobile
{
    AutoConfig config;
    
    protected Automobile(AutoConfig config)
    {
        this.config=config;
    }
    
    
    
    public static  Automobile Create(AutoType type, AutoConfig config)
    {
        Automobile auto=null;
        switch (type)
        {
            case Car:auto=new Car(config);
            break;
              
            case Truck:auto=new Truck(config);
               break;
        }
        return  auto;
    }
  
    
    @Override
    public String toString()
    {
        System.out.println("Тип автомобиля - "+ this.getClass().getSimpleName());
        System.out.println("Спец. техника - "+this.config.isSpec);
        System.out.println("С прицепом - "+this.config.withTrailer);
        System.out.println("Грузоподъемность - "+this.config.capacity);
        System.out.println("Ширина - "+this.config.width);
        System.out.println("Длина - "+this.config.lenght);
        System.out.println("Высота - "+this.config.height);
        System.out.println("Скорость - "+this.config.speed);
       
        return null;
    }
}

enum AutoType
{
    Car, 
    Truck
}
