
package classes;

import enums.ETipo;
import interfaces.IPokemon;
import java.util.ArrayList;
import java.util.List;


public class Pokemon implements IPokemon{
    
    private String nome;
    private ETipo tipo;
    private double peso;
    private double altura;
    private int ataque;
    private int forca;
    private int defesa;
    private int velocidade;
    private List<String> ataques;
    private int codigo;

    /**
     * Este é um método construtor da classe Pokemon
     */
    public Pokemon() {
        ataques = new ArrayList<String>();
    }

    /**
     * Este é um método construtor da classe Pokemon
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
    public Pokemon(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, List<String> ataques) {
        this.nome = nome;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.ataque = ataque;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = agilidade;
        this.ataques = ataques;
    }
    
    /**
     * Este método retorna o atributo nome
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Este método permite que o atributo nome seja alterado
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Este método retorna o atributo tipo
     * @return 
     */
    public ETipo getTipo() {
        return tipo;
    }

    /**
     * Este método permite que o atributo tipo seja alterado
     * @param tipo 
     */
    public void setTipo(ETipo tipo) {
        this.tipo = tipo;
    }

    /**
     * Este método retorna o atributo peso
     * @return 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Este método permite que o atributo peso seja alterado
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Este método retorna o atributo altura
     * @return 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Este método permite que o atributo altura seja alterado
     * @param altura 
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Este método retorna o atributo ataque
     * @return 
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Este método permite que o atributo ataque seja alterado
     * @param ataque 
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Este método retorna o atributo força
     * @return 
     */
    public int getForca() {
        return forca;
    }

    /**
     * Este método permite que o atributo força seja alterado
     * @param forca 
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * Este método retorna o atributo defesa
     * @return 
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * Este método permite que o atributo defesa seja alterado
     * @param defesa 
     */
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    /**
     * Este método retorna o atributo velocidade
     * @return 
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Este método permite que o atributo velocidade seja alterado
     * @param velocidade 
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * Este método retorna o atributo ataques
     * @return 
     */
    public List<String> getAtaques() {
        return ataques;
    }

    /**
     * Este método permite que o atributo ataques seja alterado
     * @param ataques 
     */
    public void setAtaques(List<String> ataques) {
        this.ataques = ataques;
    }

    /**
     * Este método retorna o atributo código
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Este método permite que o atributo código seja alterado
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Este método retorna as informações referentes a um Pokemon
     * @return 
     */
    @Override
    public String toString() {
        String str = "Codigo: " + codigo;
               str += "\nNome: " + nome ;
               str += "\nTipo: " + tipo;
               str += "\nPeso: " + peso + " Kg"; 
               str += "\nAltura: " + altura + " m";
               str += "\nAtaque: " + ataque;
               str += "\nForça: " + forca;
               str += "\nDefesa: " + defesa;
               str += "\nVelocidade: " + velocidade;               
               str += "\nAtaques: ";
               
                for(String a: ataques){
                    str += a + ", ";
                }
                
               str += "\n*******************************************************";
               return str;
    }
    
    /**
     * Este método formata as informações da classe Pokemon para serem gravadas no arquivo TXT 
     * @return 
     */
    @Override
    public String formataTXT() {
        String str =   codigo + ";";
               str +=  nome + ";";
               str += retornaTipo() + ";";
               str += peso + ";";
               str += altura + ";";
               str += ataque + ";";
               str += forca + ";";
               str += defesa + ";";
               str += velocidade + ";";       
                for(String a: ataques){
                    str += a;
                }
        return str;
    }
    
    /**
     * Este método retorna a "conversão" de um tipo Enum em String
     * @return 
     */
    private String retornaTipo(){
       String retornaTipo = null;
       switch(tipo){
           case AÇO:
               retornaTipo = "AÇO";
               break;
           case ÁGUA:
               retornaTipo = "ÁGUA";
               break;
           case DRAGÃO:
               retornaTipo = "DRAGÃO";
               break;
           case ELÉTRICO:
               retornaTipo = "ELÉTRICO";
               break;
           case FADA:
               retornaTipo = "FADA";
               break;
           case FANTASMA:
               retornaTipo = "FANTASMA";
               break;
           case FOGO:
               retornaTipo = "FOGO";
               break;
           case GELO:
               retornaTipo = "GELO";
               break;
           case GRAMA:
               retornaTipo = "GRAMA";
               break;
           case INSETO:
               retornaTipo = "INSETO";
               break;
           case LUTADOR:
               retornaTipo = "LUTADOR";
               break;
           case NORMAL:
               retornaTipo = "NORMAL";
               break;
           case PEDRA:
               retornaTipo = "PEDRA";
               break;
           case PSÍQUICO:
               retornaTipo = "PSÍQUICO";
               break;
           case TERRA:
               retornaTipo = "TERRA";
               break;
           case VENENO:
               retornaTipo = "VENENO";
               break;
           case VOADOR:
               retornaTipo = "VOADOR";
               break;
       }
       return retornaTipo;
   }
}
