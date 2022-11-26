/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Usuario iTC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int suma = 3;
        String mensaje = "";
        mensaje = mensaje + "1";
        
        while(contador <= 7){
            if(contador % 2 == 0){
                mensaje = String.format("%s + 1/%d", 
                        mensaje, suma);
            }else{
                mensaje = String.format("%S - 1/%d", 
                        mensaje, suma);
            }
            contador = contador + 1;
            suma = suma + 2;
        }
        System.out.println(mensaje);
    }
    
}
    

