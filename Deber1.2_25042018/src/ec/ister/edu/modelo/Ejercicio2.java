/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ister.edu.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author SuRo.kaneki
 */
public class Ejercicio2 {
    static double nota1,nota2,nf;
    
    public static void calcularNotas(){
        nota1=Integer.parseInt(JOptionPane.showInputDialog("ingrese la primera nota ")); 
        nota2=Integer.parseInt(JOptionPane.showInputDialog("ingrese la segunda nota "));
        nf=(nota1+nota2)/2;
        if(nf>13){
            JOptionPane.showMessageDialog(null,"Felicitaciones");
        }
         JOptionPane.showMessageDialog(null,"La nota final es : "+nf);
    }
}
