/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author PC
 */
public class Cal_tiempo {

    public static double caltiempo(String in, String ti, double t) {
        switch (in) {
            case "Dias":
                switch (ti) {
                    case "Mensual":
                        t = t / 31;
                        break;
                    case "Bimestres":
                        t = t / 62;
                        break;
                    case "Trimestres":
                        t = t / 93;
                    case "Cuatrimestres":
                        t = t / 124;
                        break;
                    case "Semestral":
                        t = t / 186;
                        break;
                    case "Años":
                        t = t / 365;
                        break;
                }
                break;
            case "Mensual":
                switch (ti) {
                    case "Dias":
                        t = t * 31;
                        break;
                    case "Bimestres":
                        t = t / 6;
                        break;
                    case "Trimestres":
                        t = t / 4;
                    case "Cuatrimestres":
                        t = t / 3;
                        break;
                    case "Semestral":
                        t = t / 2;
                        break;
                    case "Años":
                        t = t * 12;
                        break;
                }
                break;
            case "Bimestres":
                switch (ti) {
                    case "Dias":
                        t = t * 61;
                        break;
                    case "Mensual":
                        t = t * 2;
                        break;
                    case "Trimestral":
                        t = t / 3;
                        break;
                    case "Cuatrimestres":
                        t = t / 4;
                        break;
                    case "Semestral":
                        t = t / 6;
                        break;
                    case "Años":
                        t = t / 12;
                        break;
                }
                break;
            case "Trimestres":
                switch (ti) {
                    case "Dias":
                        t = t * 91.25;
                        break;
                    case "Mensual":
                        t = t * 3;
                        break;
                    case "Cuatrimestres":
                        t = t / 4;
                        break;
                    case "Semestral":
                        t = t / 6;
                        break;
                    case "Años":
                        t = t / 12;
                        break;
                }
                break;
            case "Cuatrimestres":
                switch (ti) {
                    case "Dias":
                        t = t * 121.6;
                        break;
                    case "Mensual":
                        t = t * 4;
                        break;
                    case "Semestral":
                        t = t / 6;
                        break;
                    case "Trimestral":
                        t = t / 3;
                        break;
                    case "Años":
                        t = t / 12;
                        break;
                }
                break;
            case "Semestral":
                switch (ti) {
                    case "Dias":
                        t = t * 182;
                        break;
                    case "Mensual":
                        t = t * 6;
                        break;
                    case "Trimestral":
                        t = t * 2;
                        break;
                    case "Cuatrimestres":
                        t = t * 1.5;
                        break;
                    case "Años":
                        t = t / 2;
                        break;
                }
                break;
            case "Años":
                switch (ti) {
                    case "Dias":
                        t = t * 365;
                        break;
                    case "Mensual":
                        t = t/12;
                        break;
                    case "Bimestres":
                        t = t / 6;
                        break;
                    case "Trimestral":
                        t = t * 4;
                        break;
                    case "Cuatrimestres":
                        t = t *3 ;
                        break;
                }
                break;
        }
        return t;
    }

}
