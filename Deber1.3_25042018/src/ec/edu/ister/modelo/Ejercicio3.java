/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author SuRo.kaneki
 */
public class Ejercicio3 {
    static int area,lado;
    public static void areaCuadrado(){
        lado=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el lado del cuadrado: "));
        area=lado*lado;
        if(area<100){
            JOptionPane.showMessageDialog(null,"Cuadrado pequeño");
        }
        JOptionPane.showMessageDialog(null,"El area es : "+area);
    }
}
