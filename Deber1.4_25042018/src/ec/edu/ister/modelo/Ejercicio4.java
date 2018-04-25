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
public class Ejercicio4 {
    static int base,altura,area;
    public static void areaTriangulo(){
        altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la altura del triangulo: "));
        base=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la base del triangulo: "));
        area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,"El area del triangulo"+area);
    }
}
