package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SuRo.kaneki
 */
public class Ejercicio1 {
    static int horas;
    static double tarifa,sueldo,descuento=0;
    public static void calcularSueldo(){
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el total de horas trabajadas : "));
        tarifa=Double.parseDouble(JOptionPane.showInputDialog("Ingresar el total de horas trabajadas : "));
        sueldo=horas*tarifa;
        if(sueldo>1600){
            descuento=sueldo*0.2;
            sueldo=sueldo-descuento;
        }
        JOptionPane.showMessageDialog(null,"El descuento es "+descuento);
        JOptionPane.showMessageDialog(null,"El sueldo a cobrar  es "+sueldo);
    }
}
