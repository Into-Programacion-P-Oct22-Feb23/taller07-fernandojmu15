/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int secuencia = 2;
        int suma = 3;
        
        do{
            System.out.println(secuencia); 
            secuencia = secuencia + suma; 
            suma = suma + 2;   
            contador = contador + 1;
        }while(contador <= 6);
    }
    
}
