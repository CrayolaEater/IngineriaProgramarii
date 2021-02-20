/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bogdan
 */
public abstract class Shape {
    protected double area;
    public Shape()
    {
        
    }
    public double getArea()
    {
        return this.area;
    }
    public abstract void onAreaChanged();
    public abstract void SetArea();
    public abstract String ShapeInfo();
}
