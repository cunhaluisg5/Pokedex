
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ManipularArquivo {
    
        /**
         * Este método faz com que os Pokemons sejam salvas em um arquivo TXT
         * @param arquivo
         * @param pokemon
         * @param pokedex
         * @throws Exception 
         */
        public void gravaTXT(File arquivo, Pokemon pokemon, Pokedex pokedex)throws Exception{        
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
        leTXT(arquivo, pokedex);
        int codigo = pokedex.getListaPokemon().get(pokedex.getListaPokemon().size() - 1).getCodigo();

        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        pokemon.setCodigo(codigo + 1);
        bw.write(pokemon.formataTXT());
        bw.newLine();
        bw.close();
        fw.close();
    }
    
        /**
         * Este método lê os Pokemons cadastrados no arquivo TXT e os adiciona na Pokedex
         * @param arquivo
         * @param pokedex
         * @throws IOException 
         */
    public void leTXT(File arquivo, Pokedex pokedex) throws IOException{        
        String le;
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        int cont = 0;
        while(br.ready()){
            le = br.readLine();
            if(cont != 0){                    
                String[] separado = le.split(";");
                List<String> lista = new ArrayList<String>();
                     for(int i = 9; i < separado.length; i++){
                         lista.add(separado[i]);
                     }
                Pokemon pokemon = pokedex.retornaPokemon(Integer.parseInt(separado[0]), separado[1], pokedex.retornaTipo(separado[2]), 
                Double.parseDouble(separado[3]), Double.parseDouble(separado[4]), Integer.parseInt(separado[5]),
                Integer.parseInt(separado[6]), Integer.parseInt(separado[7]), Integer.parseInt(separado[8]), lista);

                pokedex.inserirPokemon(pokemon);
            }
            cont++;
        }
        br.close();
        fr.close();
    }
    
    /**
     * Este método edita os Pokemons gravados no arquivo TXT
     * @param arquivo
     * @param pok
     * @param pokedex
     * @throws IOException 
     */
    public void editaTXT(File arquivo, Pokemon pok, Pokedex pokedex) throws IOException {
        File arquivo_temp = new File("src/arquivos/arquivo_temp.txt");
        FileWriter fw = new FileWriter(arquivo_temp, true);
        BufferedWriter bw = new BufferedWriter(fw);

        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);

        String le;
        Pokemon pokemon;
        int cont = 0;
        while (br.ready()){
            le = br.readLine();
            if(cont != 0){         
                String[] separado = le.split(";");

                int codigo = Integer.parseInt(separado[0]);   

                if(codigo == pok.getCodigo()){
                    pokemon = pokedex.retornaPokemon(pok.getCodigo(), pok.getNome(), pok.getTipo(), 
                    pok.getPeso(), pok.getAltura(), pok.getAtaque(),
                    pok.getForca(), pok.getDefesa(), pok.getVelocidade(), pok.getAtaques());
                    
                    bw.write(pokemon.formataTXT());
                    bw.newLine();
                }else{
                    List<String> lista = new ArrayList<String>();
                     for(int i = 9; i < separado.length; i++){
                         lista.add(separado[i]);
                     }
                    pokemon = pokedex.retornaPokemon(Integer.parseInt(separado[0]), separado[1], pokedex.retornaTipo(separado[2]), 
                    Double.parseDouble(separado[3]), Double.parseDouble(separado[4]), Integer.parseInt(separado[5]),
                    Integer.parseInt(separado[6]), Integer.parseInt(separado[7]), Integer.parseInt(separado[8]), lista);
                    
                    bw.write(pokemon.formataTXT());
                    bw.newLine();
                }  
            }else{
                bw.write("0;nulo;nulo;0;0;0;0;0;0;nulo");
                bw.newLine();
            }
            cont++;
        }

        bw.close();        
        br.close();

        arquivo.delete();
        arquivo_temp.renameTo(arquivo);
    }
    
    /**
     * Este método remove um Pokemon do arquivo TXT
     * @param arquivo
     * @param pok
     * @param pokedex
     * @throws IOException 
     */
    public void removeTXT(File arquivo, Pokemon pok, Pokedex pokedex) throws IOException {
        File arquivo_temp = new File("src/arquivos/arquivo_temp.txt");
        FileWriter fw = new FileWriter(arquivo_temp, true);
        BufferedWriter bw = new BufferedWriter(fw);

        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);

        String le;
        int cont = 0;
        while (br.ready()){
            le = br.readLine();
            if(cont != 0){         
                String[] separado = le.split(";");

                int codigo = Integer.parseInt(separado[0]);   

                if(codigo == pok.getCodigo()){
                }else{
                    List<String> lista = new ArrayList<String>();
                     for(int i = 9; i < separado.length; i++){
                         lista.add(separado[i]);
                     }
                     Pokemon pokemon = pokedex.retornaPokemon(Integer.parseInt(separado[0]), separado[1], pokedex.retornaTipo(separado[2]), 
                     Double.parseDouble(separado[3]), Double.parseDouble(separado[4]), Integer.parseInt(separado[5]),
                     Integer.parseInt(separado[6]), Integer.parseInt(separado[7]), Integer.parseInt(separado[8]), lista);
                    
                    bw.write(pokemon.formataTXT());
                    bw.newLine();
                }  
            }else{
                bw.write("0;nulo;nulo;0;0;0;0;0;0;nulo");
                bw.newLine();
            }
            cont++;
        }

        bw.close();        
        br.close();

        arquivo.delete();
        arquivo_temp.renameTo(arquivo);
    }
}
