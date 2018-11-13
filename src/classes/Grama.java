/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enuns.EFase;
import interfaces.IGrama;

/**
 *
 * @author Luis
 */
public class Grama extends Pokemon implements IGrama{

    public Grama() {
    }

    public Grama(String nome, double forca, double ataque, double defesa, double agilidade, EFase fase) {
        super(nome, forca, ataque, defesa, agilidade, fase);
    }

    @Override
    public void ataqueGrama() {
        setAtaqueEspecial("Raio Solar");
    }
}
