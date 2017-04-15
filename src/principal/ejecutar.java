/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.sexto_fisico_matemticas;
import clases.sexto_informatica;
import clases.sexto_quimica;
import interfaz.i_mejores_estudiantes;

/**
 *
 * @author Bianca Valentina
 */
public class ejecutar {
    public static void main(String[] args) {
        
        System.out.println("codigo instanciado de una manera mas corta polimorfismo");
        
        i_mejores_estudiantes ob_polimorfismo1= new sexto_informatica("Mireya Guzman");
        ob_polimorfismo1.aprobado_cuadro_honor();
        
        
        
        
        
        System.out.println("aplicando el llamdao de metodos aplicados en clase pasada");
        sexto_fisico_matemticas ob1=new sexto_fisico_matemticas("Pedro Jimenez");
        
        ob1.aprobado_cuadro_honor();
        
        sexto_informatica ob2= new sexto_informatica("Mireya Guzman");
        ob2.aprobado_cuadro_honor();
        
        sexto_quimica ob3= new sexto_quimica("Jose Armijos");
        ob3.reprobado_cuadro_honor();
        
    }
}
