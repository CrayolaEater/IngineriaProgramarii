/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bogdan
 */
public class Triangle extends Shape{
    private double base, height;
    public Triangle(double b, double h)
    {
        this.SetBase(b);
        this.SetHeight(h);
    }
    @Override
    public void SetArea()
    {
        this.area = this.base * this.height / 2;
        this.onAreaChanged();
    }
    
    public void SetBase(double base)
    {
        this.base = base;
    }
    public void SetHeight(double height)
    {
        this.height = height;
    }
    
    @Override
    public void onAreaChanged()
    {
        System.out.print("Triangle area changed to "+String.valueOf(this.area)+".\n");
    }
    @Override
    public String ShapeInfo()
    {
        String s = "Shape type: {Triangle}, " + " base: " + String.valueOf(this.base) + " height: " + String.valueOf(this.height);
        return s;
    }
}
