
package classes;

import console.Console;
import java.util.InputMismatchException;

/*
    Foi criada a classe Console que possui todos os atributos e métodos para a
    execução do programa sem utilização de interface gráfica.
*/
public class Main {
    
    public static void main(String[] args) {
        try{
            Console console = new Console(); // Criando a instância da classe Console
            console.escolhaMenu(); // Inicializando o menu de escolhas
            System.out.println("Programa Finalizado!");
        }catch(InputMismatchException e){
            System.out.println("Opção Inválida!");
        }
    }
}
