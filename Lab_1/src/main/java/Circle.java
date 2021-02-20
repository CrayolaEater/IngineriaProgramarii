/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bogdan
 */
public class Circle extends Shape {
    
    private double radius;
    private final double Pi = 3.14159;
    public Circle(double r)
    {
        this.SetRadius(r);
    }
    
    public void SetRadius(double r)
    {
        this.radius = r;
    }
    @Override
    public void SetArea()
    {
        this.area = this.Pi*this.radius*this.radius;
        this.onAreaChanged();
    }
    @Override
    public void onAreaChanged()
    {
        System.out.print("Area circle changed to "+String.valueOf(this.area)+"\n");
    }
    @Override
    public String ShapeInfo()
    {
        String s = "Shape type: {Circle}, " + "radius: " + String.valueOf(this.radius);
        return s;
    }
}
