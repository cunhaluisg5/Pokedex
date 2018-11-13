/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Pokedex {
    private List<Pokemon> lista;

    public Pokedex() {
        lista = new ArrayList<Pokemon>();
    }
    
    public void adicionaPokemon(Pokemon pokemon){
        lista.add(pokemon);
    }
    
    public Pokemon buscaPokemon(String nome){
        Pokemon pok = null;
        for(Pokemon p : lista){
            if(p.getNome().toLowerCase().equals(nome.toLowerCase())){
                pok = p;
            }
        }
        return pok;
    }
    
    public List<Pokemon> listarPokemon(){
        return lista;
    }
    
    public List<Pokemon> listarPokemonAgua(){
        List<Pokemon> pok = new ArrayList<Pokemon>();
        for(Pokemon p : lista){
            if(p instanceof Agua){
                pok.add(p);
            }
        }
        return pok;
    }
    
    public List<Pokemon> listarPokemonEletrico(){
        List<Pokemon> pok = new ArrayList<Pokemon>();
        for(Pokemon p : lista){
            if(p instanceof Eletrico){
                pok.add(p);
            }
        }
        return pok;
    }
    
    public List<Pokemon> listarPokemonFogo(){
        List<Pokemon> pok = new ArrayList<Pokemon>();
        for(Pokemon p : lista){
            if(p instanceof Fogo){
                pok.add(p);
            }
        }
        return pok;
    }
    
    public List<Pokemon> listarPokemonGrama(){
        List<Pokemon> pok = new ArrayList<Pokemon>();
        for(Pokemon p : lista){
            if(p instanceof Grama){
                pok.add(p);
            }
        }
        return pok;
    }
    
    public List<Pokemon> listarPokemonNormal(){
        List<Pokemon> pok = new ArrayList<Pokemon>();
        for(Pokemon p : lista){
            if(p instanceof Normal){
                pok.add(p);
            }
        }
        return pok;
    }
    
    public List<Pokemon> listarPokemonPsiquico(){
        List<Pokemon> pok = new ArrayList<Pokemon>();
        for(Pokemon p : lista){
            if(p instanceof Psiquico){
                pok.add(p);
            }
        }
        return pok;
    }
    
    public List<Pokemon> listarPokemonVoador(){
        List<Pokemon> pok = new ArrayList<Pokemon>();
        for(Pokemon p : lista){
            if(p instanceof Voador){
                pok.add(p);
            }
        }
        return pok;
    }
}
