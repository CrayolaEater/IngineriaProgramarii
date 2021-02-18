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
        this.base = b;
        this.height = h;
    }
    public void SetArea()
    {
        this.area = this.base * this.height / 2;
        this.onAreaChanged();
    }
    
    @Override
    public void onAreaChanged()
    {
        System.out.print("Triangle area changed.\n");
    }
}
