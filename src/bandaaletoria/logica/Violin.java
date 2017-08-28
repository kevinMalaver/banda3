/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaletoria.logica;

import java.awt.Graphics;

/**
 *
 * @author Estudiantes
 */
public class Violin extends Instrumento{

    @Override
    public void dibujar(Graphics g) {
        System.out.println("dibujando el violin");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el violin");
    }
    
}
