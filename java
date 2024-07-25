
package lab3;
import java.util.*;

public class ejercicio5 {
        public static void main(String[] args) {
            Scanner entrada=new Scanner (System.in);
            String palabra;
            System.out.println("escriba la palabra ");
            palabra= entrada.nextLine();
            System.out.println("la palabra que ingreso tiene "+palabra.length()+" letras");
            System.out.println("la primera letra de la palabra que ingreso es "+palabra.charAt(0));
            int ultimaLetra;
            ultimaLetra=palabra.length();
            System.out.println("la ultima letra de la palabra que ingreso es "+palabra.charAt(ultimaLetra-1));
            
            


        
    }
    
}

  
