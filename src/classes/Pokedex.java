
package classes;

import enums.ETipo;
import java.util.ArrayList;
import java.util.List;


public class Pokedex {
    
    private List<Pokemon> listaPokemon;
    

    /**
     * Este é um método construtor da classe Pokedex
     */
    public Pokedex() {
        listaPokemon = new ArrayList<Pokemon>();
    }

    /**
     * Este método retorna o atributo listaPokemon
     * @return 
     */
    public List<Pokemon> getListaPokemon() {
        return listaPokemon;
    }
    
    /**
     * Este método cadastra um Pokemon
     * @param pokemon 
     */
    public void inserirPokemon(Pokemon pokemon){
            listaPokemon.add(pokemon);
    }
    
    /**
     * Este método remove um Pokemon cadastrado
     * @param nome 
     */
    public void removePokemon(String nome){
        Pokemon pokemon = buscarPorNome(nome);
        if(pokemon != null){
            listaPokemon.remove(pokemon);
        }
    }
    
    /**
     * Este método faz uma pesquisa entre os Pokemons cadastrados e retorna aquele cujo nome é igual ao informado
     * @param nome
     * @return 
     */
    public Pokemon buscarPorNome(String nome){
        Pokemon pokemon = null;
        for(Pokemon p: listaPokemon){
            if(p.getNome().toLowerCase().equals(nome.toLowerCase())){
                pokemon = p;
            }
        }
        return pokemon;
    }
    
    /**
     * Este método faz uma pesquisa entre os Pokemons cadastrados e retorna aquele cujo código é igual ao informado
     * @param codigo
     * @return 
     */
    public Pokemon buscarPorCodigo(int codigo){
        Pokemon pokemon = null;
        for(Pokemon p: listaPokemon){
            if(p.getCodigo() == codigo){
                pokemon = p;
            }
        }
        return pokemon;
    }
    
    /**
     * Este método faz uma pesquisa entre os Pokemons cadastrados e retorna aquele cujo tipo é igual ao informado
     * @param tipo
     * @return 
     */
    public List<Pokemon> buscarPorTipo(String tipo){
        List<Pokemon> pokemon = new ArrayList<Pokemon>();
        for(Pokemon p: listaPokemon){
            if(p.getTipo().toString().equals(tipo.toUpperCase())){
                pokemon.add(p);
            }
        }
        return pokemon;
    }
     
    /**
     * Este método altera as informações de um Pokemon cadastrado buscado pelo nome
     * @param pokemon 
     */
    public void editarPokemon(Pokemon pokemon){
        Pokemon pkm = buscarPorNome(pokemon.getNome());
        if(pkm != null){
            int idx = listaPokemon.indexOf(pkm);
            listaPokemon.set(idx, pokemon);
        }
    }
    
    /**
     * Este método altera as informações de um Pokemon cadastrado buscado pelo código
     * @param pokemon 
     */
    public void editarPokemon2(Pokemon pokemon){
        Pokemon pkm = buscarPorCodigo(pokemon.getCodigo());
        if(pkm != null){
            int idx = listaPokemon.indexOf(pkm);
            listaPokemon.set(idx, pokemon);
        }
    }
    
    /**
     * Este método retorna a lista de Pokemons
     * @return 
     */
    public List<Pokemon> imprimePokedex(){
        return listaPokemon;
    }

    /**
     * Este método permite que o atributo listaPokemon seja alterado
     * @param listaPokemon 
     */
    public void setListaPokemon(List<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }
    
    /**
     * Este método retorna um Pokemon criado a partir dos parâmetros 
     * @param codigo
     * @param nome
     * @param tipo
     * @param peso
     * @param altura
     * @param ataque
     * @param forca
     * @param defesa
     * @param agilidade
     * @param ataques
     * @return 
     */
    public Pokemon retornaPokemon(int codigo, String nome, ETipo tipo, double peso, double altura, 
            int ataque, int forca, int defesa, int agilidade, List<String>ataques){
        List<String> lista = new ArrayList<String>();
        for(String a : ataques){
            lista.add(a);
        }
        Pokemon pokemon = new Pokemon(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
        pokemon.setCodigo(codigo);
        return pokemon;
    }
    
    /**
     * Este método retorna um dos tipos presentes na classe Enum
     * @param tipo
     * @return 
     */
    public ETipo retornaTipo(String tipo){
       ETipo t = null;
       switch(tipo){
           case "AÇO":
               t = ETipo.AÇO;
               break;
           case "ÁGUA":
               t = ETipo.ÁGUA;
               break;
           case "DRAGÃO":
               t = ETipo.DRAGÃO;
               break;
           case "ELÉTRICO":
               t = ETipo.ELÉTRICO;
               break;
           case "FADA":
               t = ETipo.FADA;
               break;
           case "FANTASMA":
               t = ETipo.FANTASMA;
               break;
           case "FOGO":
               t = ETipo.FOGO;
               break;
           case "GELO":
               t = ETipo.GELO;
               break;
           case "GRAMA":
               t = ETipo.GRAMA;
               break;
           case "INSETO":
               t = ETipo.INSETO;
               break;
           case "LUTADOR":
               t = ETipo.LUTADOR;
               break;
           case "NORMAL":
               t = ETipo.NORMAL;
               break;
           case "PEDRA":
               t = ETipo.PEDRA;
               break;
           case "PSÍQUICO":
               t = ETipo.PSÍQUICO;
               break;
           case "TERRA":
               t = ETipo.TERRA;
               break;
           case "VENENO":
               t = ETipo.VENENO;
               break;
           case "VOADOR":
               t = ETipo.VOADOR;
               break;
       }
       return t;
   }
}
