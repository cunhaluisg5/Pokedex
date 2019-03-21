
package classes;

import enums.ETipo;
import java.util.List;


public class Voador extends Pokemon{

    /**
     * Este é um método construtor da classe Voador
     */
    public Voador() {
    }

    /**
     * Este é um método construtor da classe Voador
     * @param nome
     * @param tipo
     * @param peso
     * @param altura
     * @param ataque
     * @param forca
     * @param defesa
     * @param agilidade
     * @param ataques 
     */
    public Voador(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, List<String> ataques) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, ataques);
    }
}
