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
        this.SetWidth(width);
        this.SetHeight(height);
    }
    //facem un constructor separat pt patrat
    public Rectangle(double l)
    {
        this.SetHeight(l);
        this.SetWidth(l);
    }
    @Override
    public void SetArea()
    {
        this.area = this.width * this.height;
        this.onAreaChanged();
    }
   
    
    public void SetHeight(double height)
    {
        this.height = height;
    }
    public void SetWidth(double width)
    {
        this.width = width;
    }
    
    //afisam noua arie mereu cand se schimba
    @Override
    public void onAreaChanged()
    {
        System.out.print("Area rectangle changed to " + String.valueOf(this.area) + "\n");
    }
    
    //afisam informatii separat cand rectangle-ul este de tip partrat
    @Override
    public String ShapeInfo()
    {
        String s;
        if(this.width == this.height)
        {
            s = "Shape type: {Square}, " + "side: " + String.valueOf(this.width);
        }
        else
        {
            s = "Shape type: {Rectangle}, " + " width: " + String.valueOf(this.width) + " height: " + String.valueOf(this.height);
        }
        return s;
    }
}
