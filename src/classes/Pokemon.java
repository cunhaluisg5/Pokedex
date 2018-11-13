/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Luis
 */
public class Pokemon {
    private int codigo;
    private String nome;
    private double forca;
    private double ataque;
    private double defesa;
    private double agilidade;
    private EFase fase;

    public Pokemon() {
    }

    public Pokemon(int codigo, String nome, double forca, double ataque, double defesa, double agilidade, EFase fase) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "Codigo: " + codigo 
                + "\nNome: " + nome 
                + "\nForca: " + forca 
                + "\nAtaque: " + ataque 
                + "\nDefesa: " + defesa 
                + "\nAgilidade: " + agilidade 
                + "\nFase: " + fase;
    }
}