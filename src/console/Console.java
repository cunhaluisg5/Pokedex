
package console;

import classes.Aco;
import classes.Agua;
import classes.Dragao;
import classes.Eletrico;
import classes.Fada;
import classes.Fantasma;
import classes.Fogo;
import classes.Gelo;
import classes.Grama;
import classes.Inseto;
import classes.Lutador;
import classes.Normal;
import classes.Pedra;
import classes.Pokedex;
import classes.Pokemon;
import classes.Psiquico;
import classes.Terra;
import classes.Veneno;
import classes.Voador;
import enums.ETipo;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
    Classe criada para a execução so programa sem interface gráfica
*/
public class Console {
    private final Scanner ler = new Scanner(System.in);
    private final Pokedex pokedex = new Pokedex();
    private Pokemon pokemon = new Pokemon();
    private List<Pokemon> listaPokemon;
    private int contador = 1;

    /**
     * Este é um método construtor da classe Console
     */
    public Console() {
    }
    
    /**
     * Este método retorna o menu principal de opções
     * @return 
     */
    public String menu() {
        String opcao = "Escolha uma das opções a seguir:" +
                "\n1 - Cadastrar" +
                "\n2 - Remover" +
                "\n3 - Editar" + 
                "\n4 - Pesquisar" +
                "\n5 - Sair";
        return opcao;
    }
    
    /**
     * Este método realiza uma das opções escolhidas no menu principal
     */
    public void escolhaMenu(){
        int recebe = 0;
        while(recebe != 5){
            try{
                System.out.println(menu());
                recebe = ler.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Digite apenas números válidos");
                return;
            }
            
            switch(recebe){
                case 1:
                    escolhaTipo();
                    pokemon.setCodigo(contador);
                    contador ++;
                    pokedex.inserirPokemon(pokemon);
                    System.out.println("Pokemon cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do Pokemon a ser removido");
                    String nome = ler.next();
                    if(pokedex.buscarPorNome(nome) == null){
                        System.out.println("Pokemon não cadastrado");
                    }else{
                    pokedex.removePokemon(nome);
                        System.out.println("Pokemon removido com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome do pokemon a ser editado");
                    String n = ler.next();
                    pokemon = pokedex.buscarPorNome(n);    
                    if(pokemon != null){
                        int codigo = pokemon.getCodigo();
                        escolhaTipo();
                        pokemon.setCodigo(codigo);
                        pokedex.editarPokemon2(pokemon);
                        System.out.println("Pokemon editado com sucesso!");
                    }else{
                        System.out.println("Não existe este pokemon");
                    }
                    break;
                case 4:
                    escolhaPesquisa();
                    break;
                case 5:
                    System.out.println("Programa Finalizado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            } 
        } 
    }
    
    /**
     * Este método retorna o menu de opções de busca
     * @return 
     */
    public String pesquisar(){
        String pesquisar = "1 - Buscar por nome\n" +
                "2 - Buscar por tipo\n" +
                "3 - Buscar por código\n" +
                "4 - Buscar todos\n" +
                "5 - Voltar";
        return pesquisar;
    }
    
    /**
     * Este método realiza uma das opções escolhida no menu de opções de busca
     */
    public void escolhaPesquisa(){
        int le = 0;
            while(le != 5){
                try{
                    String s = pesquisar();
                    System.out.println(s);
                    le = ler.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Digite apenas números válidos");
                    return;
                }
                
                switch(le){
                    case 1:
                        System.out.println("Digite o nome do Pokemon a ser buscado");
                        String nome = ler.next();
                        pokemon = pokedex.buscarPorNome(nome);
                        if(pokemon != null){
                            System.out.println(pokemon.toString());
                        }else{
                            System.out.println("Pokemon não encontrado");
                        }                        
                        break;
                    case 2:
                        System.out.println("Digite o tipo do Pokemon a ser buscado");
                        String tipo = ler.next();
                        listaPokemon = pokedex.buscarPorTipo(tipo);
                        if(!listaPokemon.isEmpty())
                        {
                            for(Pokemon p: listaPokemon){
                                System.out.println(p.toString() + "\n");
                            }
                        }else{
                            System.out.println("Não há pokemons cadastrados!");
                        }
                        break;
                    case 3:
                        int codigo;
                        try{
                            System.out.println("Digite o código do Pokemon a ser buscado");
                            codigo = ler.nextInt();
                        }catch(InputMismatchException e){
                            System.out.println("Digite apenas números válidos");
                            return;
                        }
                        pokemon = pokedex.buscarPorCodigo(codigo);
                        if(pokemon != null){
                            System.out.println(pokemon.toString());
                        }else{
                            System.out.println("Pokemon não encontrado");
                        }
                        break;
                    case 4:
                        listaPokemon = pokedex.imprimePokedex();
                        if(!listaPokemon.isEmpty())
                        {
                            for(Pokemon p: listaPokemon){
                                System.out.println(p.toString() + "\n");
                            }
                        }else{
                            System.out.println("Não há pokemons cadastrados!");
                        }
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }
    }
    
    /**
     * Este método inicializa os atributos do Pokemon a ser cadastrado
     */
    public void informmacoes(){
        try{
            System.out.println("Digite as informações referente ao Pokemon a ser cadastrado:");
            System.out.println("Nome:");
            pokemon.setNome(ler.next());
            System.out.println("Peso:");
            pokemon.setPeso(ler.nextDouble());
            System.out.println("Altura:");
            pokemon.setAltura(ler.nextDouble());
            System.out.println("Ataque");
            pokemon.setAtaque(ler.nextInt());
            System.out.println("Força:");
            pokemon.setForca(ler.nextInt());
            System.out.println("Defesa:");
            pokemon.setDefesa(ler.nextInt());
            System.out.println("Velocidade:");
            pokemon.setVelocidade(ler.nextInt());
        }catch(InputMismatchException e){
            System.out.println("Digite apenas números válidos");
            return;
        }
        
        int opcao = 1;
        while(opcao != 2){ 
            if(opcao == 1)
            {
                System.out.println("Digite uma habilidade:");
                String habilidade = ler.next();
                pokemon.getAtaques().add(habilidade);
            }else{
                System.out.println("Opção Inválida");
            }
            System.out.println("Adicionar mais? 1 - Sim ou 2 - Não");
            opcao = ler.nextInt();
        }
    }
    
    /**
     * Este método informa os 17 tipos disponíveis de Pokemon
     * @return 
     */
    public String listaTipos(){
        String listaTipos = "1 - Aço\n" +
                "2 - Água\n" +
                "3 - Dragão\n" +
                "4 - Elétrico\n" +
                "5 - Fada\n" +
                "6 - Fantasma\n" +
                "7 - Fogo\n" +
                "8 - Gelo\n" +
                "9 - Grama\n" +
                "10 - Inseto\n" +
                "11 - Lutador\n" +
                "12 - Normal\n" +
                "13 - Pedra\n" +
                "14 - Psiquico\n" +
                "15 - Terra\n" +
                "16 - Veneno\n" +
                "17 - Voador";
        return listaTipos;
    }
    
    /**
     * Este método instancia um Pokemon baseado no tipo escolhido
     */
    public void escolhaTipo(){
        int escolha = 0;
        try{
            System.out.println(listaTipos());
            escolha = ler.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Digite números válidos");
            return;
        }
        
        switch(escolha){
            case 1:
                pokemon = new Aco();
                pokemon.setTipo(ETipo.AÇO);
                break;
            case 2:
                pokemon = new Agua();
                pokemon.setTipo(ETipo.ÁGUA);
                break;
            case 3:
                pokemon = new Dragao();
                pokemon.setTipo(ETipo.DRAGÃO);
                break;
            case 4:
                pokemon = new Eletrico();
                pokemon.setTipo(ETipo.ELÉTRICO);
                break;
            case 5:
                pokemon = new Fada();
                pokemon.setTipo(ETipo.FADA);
                break;
            case 6:
                pokemon = new Fantasma();
                pokemon.setTipo(ETipo.FANTASMA);
                break;
            case 7:
                pokemon = new Fogo();
                pokemon.setTipo(ETipo.FOGO);
                break;
            case 8:
                pokemon = new Gelo();
                pokemon.setTipo(ETipo.GELO);
                break;
            case 9:
                pokemon = new Grama();
                pokemon.setTipo(ETipo.GRAMA);
                break;
            case 10:
                pokemon = new Inseto();
                pokemon.setTipo(ETipo.INSETO);
                break;
            case 11:
                pokemon = new Lutador();
                pokemon.setTipo(ETipo.LUTADOR);
                break;
            case 12:
                pokemon = new Normal();
                pokemon.setTipo(ETipo.NORMAL);
                break;
            case 13:
                pokemon = new Pedra();
                pokemon.setTipo(ETipo.PEDRA);
                break;
            case 14:
                pokemon = new Psiquico();
                pokemon.setTipo(ETipo.PSÍQUICO);
                break;
            case 15:
                pokemon = new Terra();
                pokemon.setTipo(ETipo.TERRA);
                break;
            case 16:
                pokemon = new Veneno();
                pokemon.setTipo(ETipo.VENENO);
                break;
            case 17:
                pokemon = new Voador();
                pokemon.setTipo(ETipo.VOADOR);
                break;
            default:
                System.out.println("Escolha um tipo válido");
                break;
        }
        informmacoes();        
    }     
}
