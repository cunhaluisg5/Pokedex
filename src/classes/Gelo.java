
package classes;

import enums.ETipo;
import java.util.List;


public class Gelo extends Pokemon{

    /**
     * Este é um método construtor da classe Gelo
     */
    public Gelo() {
    }

    /**
     * Este é um método construtor da classe Gelo
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
    public Gelo(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, List<String> ataques) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, ataques);
    }
}
