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
public class AutoConfig
{

    /**
     *
     */
    public float capacity;//грузоподъемность (тонн)
    
    public float width;//ширина (метр)
    
    public float lenght;//длина (метр)
    
    public float height;// высота (метр)
    
    public float speed;//скорость (км/ч)
    
    public boolean isSpec;//спец. тех.
    
    public boolean withTrailer=false;//с прицепом?
    
    public AutoConfig(int capacity,int width,int lenght,int height, int speed, boolean isSpec, boolean withTrailer)
    {
        this.capacity=capacity;
        this.width=width;
        this.lenght=lenght;
        this.height=height;
        this.speed=speed;
        this.isSpec=isSpec;
        this.withTrailer= withTrailer;
        
    }
    
    public AutoConfig(int capacity,int width,int lenght,int height, int speed, boolean isSpec)
    {
        this.capacity=capacity;
        this.width=width;
        this.lenght=lenght;
        this.height=height;
        this.speed=speed;
        this.isSpec=isSpec;
        
        
    }
}
