/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicion;
        String listaedades = "";
        double estatura = 0;
        double sumaEstatura = 0;
        int edad = 0;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        int contadorIteraciones = 0;
        double promedioEdad;

        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            
            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;

            contadorIteraciones = contadorIteraciones + 1; 
            listaedades = listaedades + edad + "\n";
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicion,
                    edad,
                    estatura);

            entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        } while (bandera);
        cadenaReporte = String.format("%sListado de edades\n%s",
                cadenaReporte, listaedades);
        promedioEdad = (double) sumaEdades / contadorIteraciones;
        sumaEstatura = sumaEstatura / contadorIteraciones;
     
        cadenaReporte = String.format("%sPromedio de edades: %.1f\n",
                cadenaReporte, promedioEdad);
        cadenaReporte = String.format("%sPromedio de estaturas: %.2f\n",
                cadenaReporte, sumaEstatura);
    
        
        System.out.printf("%s\n", cadenaReporte);
    }
    
}
