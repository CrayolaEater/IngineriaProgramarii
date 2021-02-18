/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bogdan
 */
public class Rectangle  extends Shape{
    private double height, width;
    public Rectangle(double h, double w)
    {
        this.height = h;
        this.width = w;
    }
    public void SetArea()
    {
        this.area = this.width * this.height;
        this.onAreaChanged();
    }
    
    @Override
    public void onAreaChanged()
    {
        System.out.print("Area changed rectangle.\n");
    }
}
