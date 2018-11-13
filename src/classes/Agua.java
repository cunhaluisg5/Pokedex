/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enuns.EFase;
import interfaces.IAgua;

/**
 *
 * @author Luis
 */
public class Agua extends Pokemon implements IAgua{

    public Agua() {
    }

    public Agua(String nome, double forca, double ataque, double defesa, double agilidade, EFase fase) {
        super(nome, forca, ataque, defesa, agilidade, fase);
    }

    @Override
    public void ataqueAgua() {
        setAtaqueEspecial("Bomba de água");
    }
}
