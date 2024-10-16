import java.util.Scanner;

import static java.lang.Float.NaN;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Escribe tres numeros y te calcula la ecuadión de segundo grado siendo el primer numero que escribas a el segundo b y el tercero c");

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double b = sc.nextDouble();

        double c = sc.nextDouble();

        /*
        double bAlCuadrado = b*b;
        double cuatroAC = 4*a*c;
        double dosA = 2*a;
        double bAlCuadradoMenos4Ac = bAlCuadrado - cuatroAC;
        double raizbAlCuadradoMenos4Ac = Math.sqrt(bAlCuadradoMenos4Ac);

        double sol1 = (-b+raizbAlCuadradoMenos4Ac)/dosA;
        */
        double sol1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);

        double sol2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));

        double raiz = (b*b-4*a*c);

        sc.close();

        if (a==0){
            System.out.println("No existe solución real");
        } else if ((raiz)<0){
            System.out.println("No existe solución real");
        }else if ((Math.pow(b, 2)-4*a*c) == 0){
            System.out.println("Una solución existente");
            System.out.println("Solución doble");
            System.out.println(sol1);
            System.out.println(sol2);
        }else{
            System.out.println("Hay dos soluciones existentes");
            System.out.println(sol1);
            System.out.println(sol2);
        }
    }
}