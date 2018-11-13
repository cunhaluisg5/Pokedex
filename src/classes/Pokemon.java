/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enuns.EFase;

/**
 *
 * @author Luis
 */
public class Pokemon {
    private static int codigo;
    private String nome;
    private double forca;
    private double ataque;
    private double defesa;
    private double agilidade;
    private EFase fase;
    private String ataqueEspecial;

    public Pokemon() {
        codigo++;
    }

    public Pokemon(String nome, double forca, double ataque, double defesa, double agilidade, EFase fase) {
        this.nome = nome;
        this.forca = forca;
        this.ataque = ataque;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.fase = fase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }

    public EFase getFase() {
        return fase;
    }

    public void setFase(EFase fase) {
        this.fase = fase;
    }

    protected void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo 
                + "\nNome: " + nome 
                + "\nForca: " + forca 
                + "\nAtaque: " + ataque 
                + "\nDefesa: " + defesa 
                + "\nAgilidade: " + agilidade 
                + "\nFase: " + retornaFase()
                + "\nAtaque Especial: " + ataqueEspecial;
    }
    
    private String retornaFase(){
        String retornaFase = null;
        switch (fase) {
            case FASE1:
                retornaFase = "1";
                break;
            case FASE2:
                retornaFase = "2";
                break;
            case FASE3:
                retornaFase = "3";
                break;
            default:
                break;
        }
        return retornaFase;
    }
}
