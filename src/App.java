
import java.util.Scanner;

public class App {
    static  double szamol( double a,double b, double c){
        double V  = a*b*c;
        return V;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return false;
    }

    

    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("add meg a 3 adatot");
        String a  = myObj.nextLine();
        isNumeric(a);
        String b = myObj.nextLine();
        isNumeric(b);
        String c = myObj.nextLine();
        
        
        System.out.println(isNumeric(c));
       

        
        

        

        
    }
}
