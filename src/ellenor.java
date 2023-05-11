//JAKABOS ÁBEL , 2023.05.11, SZ/I/n
import java.util.Scanner;
import java.lang.System;
import java.lang.reflect.Method;

public class ellenor {
    public static boolean szame(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);

        } catch (NumberFormatException nfe) {
            System.out.println("ez nem szam!");
        
            return false;
        }
        return true;
    }
    static void csinalo(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("JAKABOS ÁBEL , 2023.05.11, SZ/I/n");
    System.out.println("add meg a 3 adatot");

        String a  = myObj.nextLine();
        
        while(!ellenor.szame(a)){
        a  = myObj.nextLine();
        }
         
        String b = myObj.nextLine();
        
        while(!ellenor.szame(b)){
            b  = myObj.nextLine();
            }
        
        String c = myObj.nextLine();
        
        while(!ellenor.szame(c)){
            c  = myObj.nextLine();
            }

        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double z = Double.parseDouble(c);
        
        System.out.println("az eredmeny " + szamol.szamol(x, y, z));


        }
    
    
}
