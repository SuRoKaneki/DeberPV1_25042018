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
public class Ejercicio5 {
    static double radio,area,perimetro;
    public static void calcularCirculo(){
        radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        area=radio*radio*3.14;
        perimetro=2*3.14*radio;
        if(area>50){
            JOptionPane.showMessageDialog(null,"Circulo pequeño");
        }
        JOptionPane.showMessageDialog(null,"El area es : "+area);
        JOptionPane.showMessageDialog(null,"EL perimetro es : "+perimetro);
    }
}
