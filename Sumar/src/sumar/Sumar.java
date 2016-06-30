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
        int c;
        int delta;
        System.out.println("Ingrese un numero:");
        a=l.nextInt();
        System.out.println("Ingrese un numero:");
        b=l.nextInt();
        c=a+b;
        delta=a-b;
        System.out.println("La suma es: "+c);
                System.out.println("La resta es: "+delta);
    }
}
