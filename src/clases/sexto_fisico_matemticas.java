/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaz.i_mejores_estudiantes;

/**
 *
 * @author Bianca Valentina
 */
public class sexto_fisico_matemticas implements i_mejores_estudiantes{

    private String general;

    public sexto_fisico_matemticas(String general) {
        this.general = general;
    }
    
    
    
    @Override
    public void aprobado_cuadro_honor() {
        
        System.out.println("el estudiante aprobo ");
         }

    @Override
    public void reprobado_cuadro_honor() {
        
        System.out.println("el estudiante no aprobo al cudor de honor");
        
        }
    
}
