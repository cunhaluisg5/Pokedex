/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enuns.EFase;
import interfaces.IEletrico;

/**
 *
 * @author Luis
 */
public class Eletrico extends Pokemon implements IEletrico{

    public Eletrico() {
    }

    public Eletrico(int codigo, String nome, double forca, double ataque, double defesa, double agilidade, EFase fase) {
        super(codigo, nome, forca, ataque, defesa, agilidade, fase);
    }

    @Override
    public String ataqueEletrico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
