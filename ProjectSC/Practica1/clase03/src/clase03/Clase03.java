/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase03;

import javax.swing.JOptionPane;

/**
 *
 * @author alvarados
 */
public class Clase03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     /*/ Una empresa necesita determinar el monto total que debe pagar a la CCSS
        Se debe solicitar salario individual - Listo
        Aplicar seguro de enfermedad 9.25  - Listo
        IVM 5.08 - Listo*/
     
     double salario=0;
        double salarioSEM = 0; 
        double salarioIVM = 0;
        double SEM = 0.0925;
        double IVM = 0.0508;
        String variableT="";
        
        double resultado = 0;
       
        variableT= JOptionPane.showInputDialog("Digite su salario semanal");
        
        salario=Double.parseDouble(variableT);
        
        salarioSEM=salario*SEM;
        salarioIVM=salario*IVM;
        
        resultado=salarioSEM + salarioIVM;
        
        
       
        
    JOptionPane.showMessageDialog(null, "La empresa Kyndryl debera abonar a la CCSS un monto total de $" + resultado); 
     
     
     
     
    }
    
}




        
     
        
    
        
        
                
    
    

