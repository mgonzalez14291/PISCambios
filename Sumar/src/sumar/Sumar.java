package sumar;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Sumar {
    public static void main(String[] arg){
        //comentario
        Scanner l= new Scanner(System.in);
        int a;
        int b;
        int charlie;
        int delta;
        
        System.out.println("Ingrese un numero:");
        a=l.nextInt();
        System.out.println("Ingrese un numero:");
        b=l.nextInt();
        charlie=a+b;
        delta=a-b;
        System.out.println("La suma es: "+charlie);
                System.out.println("La resta es: "+delta);
    }
}
