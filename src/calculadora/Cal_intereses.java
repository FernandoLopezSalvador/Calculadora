/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author PC
 */
public class Cal_intereses {
 
    
    public static double caltiempo(String ti,double i){
        switch (ti) {
                case "Dias":
                    i = i / 365;
                    break;
                case "Mensual":
                    i = i / 12;
                    break;
                case "Bimestres":
                    i = i / 6;
                    break;
                case "Trimestres":
                    i = i / 4;
                case "Cuatrimestres":
                    i = i / 3;
                     break;
                case "Semestral":
                    i = i / 2;
                     break;
                case "Años":
                     break;
            }
        System.out.println(i);
        return i;
    }
}
