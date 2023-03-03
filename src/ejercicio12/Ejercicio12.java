/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

    public static void main(String[] args) {
        double x, y, z, u, r, n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las horas:");
        x = entrada.nextDouble();
        
        System.out.println("Ingrese el precio por hora:");
        y = entrada.nextDouble();
                
        System.out.println("Ingrese el porcentaje de retencion en la fuente:");
        z = entrada.nextDouble();
        
        u = x * y;
        r = u*(z/100);
        n = u - r;
        System.out.println("El salario bruto es: "+ u);
        System.out.println("La retencion en la fuente es: "+ r);
        System.out.println("El salario neto es: "+ n);
    }
    
}
