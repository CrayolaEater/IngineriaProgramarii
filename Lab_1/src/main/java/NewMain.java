/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bogdan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Rectangle patrat = new Rectangle(3); // apelam constructorul separat pt patrate
        patrat.SetWidth(6);
        patrat.SetHeight(6);
        patrat.SetArea();
        
        System.out.println(patrat.ShapeInfo()); // cand e patrat informatiile arata asta
        
        Circle cerc  = new Circle(10);
        cerc.SetArea();
        
        Triangle triunghi = new Triangle(40, 67);
        
        triunghi.SetBase(55);
        triunghi.SetArea();
        
        System.out.println(triunghi.ShapeInfo());
        
        if(patrat.CanFitInside(triunghi))
        {
            System.out.println("The square is small enough to fit inside the triangle!");
        }
        else
        {
            System.out.println("The square is too big to fit inside the triangle! :(");
        }
    }
    
}
