/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enuns.EFase;
import interfaces.IFogo;

/**
 *
 * @author Luis
 */
public class Fogo extends Pokemon implements IFogo{

    public Fogo() {
    }

    public Fogo(String nome, double forca, double ataque, double defesa, double agilidade, EFase fase) {
        super(nome, forca, ataque, defesa, agilidade, fase);
    }

    @Override
    public String ataqueFogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
