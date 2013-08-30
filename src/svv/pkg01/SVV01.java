/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svv.pkg01;

/**
 *
 * @author MegaDS
 */
public class SVV01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int a[] = new int(1,2);
        
        System.out.println(new SVV01().checkTriType(3,2,2));
    }
    
    public String checkTriType(double a, double b , double c){
        if (!(checkSideLength(a) && checkSideLength(b) && checkSideLength(c))){
            return "Invalid";
        }
        
        if ( a+b < c || a+c < b || b+c < a){
            return "Invalid";
        }
        
        if ( a == b && b == c ){
            return "Equilateral Triangle";
        }
        
        if ( a == b || a == c || b == c ){
            return "Isosceles Triangle";
        }
        
        if ( a+b >= c && a+c >= b && b+c >= a){
            return "Scalene";
        }
        return "Invalid";
    }
    
    private boolean checkSideLength(double side){
        if ( side <= Math.pow(10, 10)){
            if ( side >= -1*Math.pow(10, 10))
                return true;
        }
        return false;
    }
}