/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IGrama;

/**
 *
 * @author Luis
 */
public class Grama extends Pokemon implements IGrama{

    public Grama() {
    }

    public Grama(int codigo, String nome, double forca, double ataque, double defesa, double agilidade, EFase fase) {
        super(codigo, nome, forca, ataque, defesa, agilidade, fase);
    }

    @Override
    public String ataqueGrama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}