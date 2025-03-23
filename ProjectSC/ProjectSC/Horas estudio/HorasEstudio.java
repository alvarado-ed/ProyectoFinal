/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horas.estudio;

import javax.swing.JOptionPane;

/**
 *
 * @author alvarados
 */
public class HorasEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        String variable1; // Cambiado de string a String
        String variable2;

        variable1 = JOptionPane.showInputDialog("Ingrese la primera variable:");
        num1 = Double.parseDouble(variable1);

        variable2 = JOptionPane.showInputDialog("Ingrese la segunda variable:");
        num2 = Double.parseDouble(variable2);

        resultado = num1 + num2;

        JOptionPane.showMessageDialog(null, "La suma de ambas variables es: " + resultado);
    }
}

   
   

   
    


        