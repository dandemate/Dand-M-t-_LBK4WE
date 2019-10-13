package Feladat_2;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1, 1.5, 1);
        t1.setColor("yellow");
        
        System.out.println("Terület: "+t1.getArea()+" Kerület: "+t1.getPerimeter()+
                " Színe: "+t1.getColor()+" Töltve?: "+t1.isFilled());
    }
    
    
}
