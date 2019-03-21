
package interfaceGrafica;

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
import classes.ManipularArquivo;
import classes.Normal;
import classes.Pedra;
import classes.Pokedex;
import classes.Pokemon;
import classes.Psiquico;
import classes.Terra;
import classes.Veneno;
import classes.Voador;
import enums.ETipo;
import classes.ManipularImagem;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class TelaPokedex extends javax.swing.JFrame {

    private Pokedex pokedex; //Objeto para acessar a Pokedex
    private Pokemon pkm; //Objeto para receber pokemon buscado
    File arquivo; //Objeto para criação de arquivo
    BufferedImage imagem; //Objeto para manipulação de imagem
    DefaultComboBoxModel model; //Objeto para manipulação de combo box
    ManipularArquivo m; //Objeto para manipulação de arquivo
    
    /**
     * Este é um método construtor da TelaPokedex
     */
    public TelaPokedex() {
        initComponents();
        inicializa();
    }
    /**
     * Este método executa a criação de um arquivo TXT 
     */
    private void criaArquivo(){
        arquivo = new File("src/arquivos/arquivo.txt");
        try{
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Este método executa operações quando a tela é iniciada
     */
    private void inicializa(){
        btRemover.setBackground(Color.RED);
        btEditar.setBackground(Color.YELLOW);
        btCadastrar.setBackground(Color.BLUE);
        btCadastrar.setForeground(Color.WHITE);
        btRemover.setForeground(Color.WHITE);
        btLimpar.setBackground(Color.WHITE);
        btBuscar.setBackground(Color.BLACK);
        btBuscar.setForeground(Color.WHITE);
        btLimpar.setBorderPainted(true);
        pokedex = new Pokedex();
        criaArquivo();
        model = new DefaultComboBoxModel();
        m = new ManipularArquivo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grSelecao = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();
        rbTodos = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        rbTipo = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        btBuscar = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tfNome = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        lbAltura = new javax.swing.JLabel();
        tfAltura = new javax.swing.JTextField();
        lbAtaque = new javax.swing.JLabel();
        tfAtaque = new javax.swing.JTextField();
        lbForca = new javax.swing.JLabel();
        tfForca = new javax.swing.JTextField();
        lbDefesa = new javax.swing.JLabel();
        tfDefesa = new javax.swing.JTextField();
        lbAgilidade = new javax.swing.JLabel();
        tfAgilidade = new javax.swing.JTextField();
        tfPeso = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btAdicionarEspecial = new javax.swing.JButton();
        cbAtaque = new javax.swing.JComboBox<>();
        tfNomeAtaque = new javax.swing.JTextField();
        btLimpaEspecial = new javax.swing.JButton();
        btUpload = new javax.swing.JButton();
        lbImagem = new javax.swing.JLabel();
        btProximo = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        lbTelaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokédex");
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        taInfo.setEditable(false);
        taInfo.setBackground(new java.awt.Color(51, 255, 51));
        taInfo.setColumns(20);
        taInfo.setRows(5);
        taInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(taInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 90, 320, 150);

        grSelecao.add(rbTodos);
        rbTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbTodos.setSelected(true);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });
        getContentPane().add(rbTodos);
        rbTodos.setBounds(700, 20, 59, 23);

        grSelecao.add(rbNome);
        rbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbNome.setText("Nome");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });
        getContentPane().add(rbNome);
        rbNome.setBounds(440, 20, 57, 23);

        grSelecao.add(rbTipo);
        rbTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbTipo.setText("Tipo");
        rbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(rbTipo);
        rbTipo.setBounds(620, 20, 49, 23);

        grSelecao.add(rbCodigo);
        rbCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbCodigo.setText("Código");
        rbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(rbCodigo);
        rbCodigo.setBounds(530, 20, 63, 23);

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscar);
        btBuscar.setBounds(680, 50, 80, 23);

        tfBuscar.setEnabled(false);
        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(tfBuscar);
        tfBuscar.setBounds(440, 50, 220, 30);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar.png"))); // NOI18N
        btLimpar.setBorder(null);
        btLimpar.setContentAreaFilled(false);
        btLimpar.setDisabledIcon(null);
        btLimpar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LimparSelecionado.png"))); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(260, 420, 90, 60);

        jPanel1.setBackground(new java.awt.Color(192, 13, 13));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("Nome:");

        lbTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipo.setText("Tipo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AÇO", "ÁGUA", "DRAGÃO", "ELÉTRICO", "FADA", "FANTASMA", "FOGO", "GELO", "GRAMA", "INSETO", "LUTADOR", "NORMAL", "PEDRA", "PSÍQUICO", "TERRA", "VENENO", "VOADOR" }));
        cbTipo.setSelectedIndex(-1);

        lbPeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPeso.setText("Peso:");

        lbAltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAltura.setText("Altura:");

        lbAtaque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAtaque.setText("Ataque:");

        lbForca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbForca.setText("Força:");

        lbDefesa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDefesa.setText("Defesa:");

        lbAgilidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAgilidade.setText("Velocidade:");

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemover.setText("Remover");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Especial:");

        btAdicionarEspecial.setText("+");
        btAdicionarEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarEspecialActionPerformed(evt);
            }
        });

        cbAtaque.setMaximumSize(new java.awt.Dimension(56, 22));
        cbAtaque.setPreferredSize(new java.awt.Dimension(56, 22));

        btLimpaEspecial.setText("-");
        btLimpaEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaEspecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbAtaque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(tfAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(tfPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbForca, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfForca, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(19, 19, 19)
                                .addComponent(btRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfNomeAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btAdicionarEspecial)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btLimpaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbAtaque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbAgilidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfAgilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPeso)
                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAltura)
                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAtaque)
                    .addComponent(tfAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbForca)
                    .addComponent(tfForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDefesa)
                    .addComponent(tfDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAgilidade)
                    .addComponent(tfAgilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btAdicionarEspecial)
                    .addComponent(cbAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpaEspecial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btRemover)
                    .addComponent(btEditar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(440, 250, 320, 250);

        btUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Enviar.png"))); // NOI18N
        btUpload.setContentAreaFilled(false);
        btUpload.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EnviarSelecionado.png"))); // NOI18N
        btUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUploadActionPerformed(evt);
            }
        });
        getContentPane().add(btUpload);
        btUpload.setBounds(120, 430, 120, 60);

        lbImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagem.setRequestFocusEnabled(false);
        getContentPane().add(lbImagem);
        lbImagem.setBounds(70, 160, 260, 140);

        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Proximo.png"))); // NOI18N
        btProximo.setContentAreaFilled(false);
        btProximo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ProximoSelecionado.png"))); // NOI18N
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btProximo);
        btProximo.setBounds(190, 390, 70, 30);

        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Anterior.png"))); // NOI18N
        btAnterior.setContentAreaFilled(false);
        btAnterior.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AnteriorSelecionado.png"))); // NOI18N
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btAnterior);
        btAnterior.setBounds(110, 390, 70, 30);

        lbTelaFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImagemPokedex.png"))); // NOI18N
        getContentPane().add(lbTelaFundo);
        lbTelaFundo.setBounds(0, -60, 780, 640);

        setSize(new java.awt.Dimension(787, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        if(rbTodos.isSelected()){
            tfBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        if(rbNome.isSelected()){
            tfBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_rbNomeActionPerformed

    private void rbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoActionPerformed
        if(rbCodigo.isSelected()){
            tfBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_rbCodigoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try{
            String nome = tfNome.getText();
            m.leTXT(arquivo, pokedex);
            if(pokedex.buscarPorNome(nome) == null){
                double peso = Double.parseDouble(tfPeso.getText());
                double altura = Double.parseDouble(tfAltura.getText());
                int ataque = Integer.parseInt(tfAtaque.getText());
                int forca = Integer.parseInt(tfForca.getText());
                int defesa = Integer.parseInt(tfDefesa.getText());
                int agilidade = Integer.parseInt(tfAgilidade.getText());
                ETipo tipo = retornaTipo(cbTipo.getSelectedItem().toString());
                List<String> ataques = retornaCombo();
                m.gravaTXT(arquivo, retornaPokemon(nome, agilidade, altura, ataque, defesa, forca, peso, tipo, ataques), pokedex);
                if(imagem != null){
                    enviarImagem(nome);
                }
                JOptionPane.showMessageDialog(null, "Pokemon Cadastrado!");
            }else{
                JOptionPane.showMessageDialog(null, "Já existe pokemon cadastrado com esse nome!");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor digite valores válidos");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        try{
            m.leTXT(arquivo, pokedex);            
            btEditar.setText("Editar");
            btRemover.setEnabled(false);
            btEditar.setEnabled(false);
            taInfo.setText("");
            if(rbTodos.isSelected()){
                List<Pokemon> lista = pokedex.imprimePokedex();
                if(lista != null)
                {
                    for(Pokemon p : lista){
                        taInfo.append(p.toString() + "\n");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Não existem Pokemons cadastrados");
                }
            }else{
                if(rbNome.isSelected()){
                   pkm = pokedex.buscarPorNome(tfBuscar.getText());
                   if(pkm != null){
                        taInfo.setText(pkm.toString());
                        if(carregarImagem(pkm.getNome()) != null){
                            lbImagem.setIcon(carregarImagem(pkm.getNome()));
                        }
                        btRemover.setEnabled(true);
                        btEditar.setEnabled(true);
                   }else{
                       JOptionPane.showMessageDialog(null, "Não existe este pokemon cadastrado!");
                   }
                }else if(rbCodigo.isSelected()){
                    pkm = pokedex.buscarPorCodigo(Integer.parseInt(tfBuscar.getText()));
                    if(pkm != null){
                        taInfo.setText(pkm.toString());
                        if(carregarImagem(pkm.getNome()) != null){
                            lbImagem.setIcon(carregarImagem(pkm.getNome()));
                        }
                        btRemover.setEnabled(true);
                        btEditar.setEnabled(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Não existe este pokemon cadastrado!");
                    }
                }else if(rbTipo.isSelected()){
                    List<Pokemon> pokemon = pokedex.buscarPorTipo(tfBuscar.getText());
                    if(pokemon != null)
                    {                        
                        for(Pokemon p: pokemon){
                            taInfo.append(p.toString() + "\n");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Não existem Pokemons cadastrados com esse tipo");
                    }
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite o código corretamente");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void rbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTipoActionPerformed
        if(rbTipo.isSelected()){
            tfBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_rbTipoActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        try{
            m.removeTXT(arquivo, pkm, pokedex);
            pokedex.removePokemon(pkm.getNome());
            JOptionPane.showMessageDialog(null, "Pokemon removido com sucesso!");
            btLimparActionPerformed(evt);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        btCadastrar.setEnabled(false);
        btRemover.setEnabled(false);
        try{
            if(btEditar.getText().equals("Editar")){
            tfNome.setText(pkm.getNome());
            tfPeso.setText(Double.toString(pkm.getPeso()));
            tfAtaque.setText(Integer.toString(pkm.getAtaque()));
            tfDefesa.setText(Integer.toString(pkm.getDefesa()));
            tfAltura.setText(Double.toString(pkm.getAltura()));
            tfForca.setText(Integer.toString(pkm.getForca()));
            tfAgilidade.setText(Integer.toString(pkm.getVelocidade()));
            cbTipo.setSelectedItem(pkm.getTipo().toString());
            preencheCombo(pkm.getAtaques());
            btEditar.setText("Salvar");
            btEditar.setBackground(Color.GREEN);
            }else if(btEditar.getText().equals("Salvar")){
                String nome = tfNome.getText();
                if((pokedex.buscarPorNome(nome) != null) && (!pkm.getNome().equals(nome))){
                    JOptionPane.showMessageDialog(null, "Já existe pokemon cadastrado com esse nome!");
                }
                else{
                    int agilidade = Integer.parseInt(tfAgilidade.getText());
                    double altura = Double.parseDouble(tfAltura.getText());
                    int ataque = Integer.parseInt(tfAtaque.getText());
                    int defesa = Integer.parseInt(tfDefesa.getText());
                    int forca = Integer.parseInt(tfForca.getText());
                    double peso = Double.parseDouble(tfPeso.getText());
                    ETipo tipo = retornaTipo(cbTipo.getSelectedItem().toString());
                    int codigo = pkm.getCodigo();
                    List<String> ataques = retornaCombo();
                    pkm = retornaPokemon(nome, agilidade, altura, ataque, defesa, forca, peso, tipo, ataques);
                    pkm.setCodigo(codigo);
                    //pokedex.editarPokemon(pkm);
                    m.editaTXT(arquivo, pkm, pokedex);
                        if(imagem != null){
                            enviarImagem(nome);
                        }
                    JOptionPane.showMessageDialog(null, "Alteração salva com sucesso!");
                    btLimparActionPerformed(evt);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor digite valores válidos");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfNome.setText("");
        tfAgilidade.setText("");
        tfAltura.setText("");
        tfAtaque.setText("");
        tfDefesa.setText("");
        tfForca.setText("");
        tfPeso.setText("");
        cbTipo.setSelectedIndex(-1);
        taInfo.setText("");
        tfBuscar.setText("");
        tfNomeAtaque.setText("");
        cbAtaque.removeAllItems();
        lbImagem.setIcon(null);
        btEditar.setText("Editar");
        rbTodos.setSelected(true);
        btRemover.setEnabled(false);
        btEditar.setEnabled(false);
        btCadastrar.setEnabled(true);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUploadActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 160, 160);

                lbImagem.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
               // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Você não selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_btUploadActionPerformed

    private void btAdicionarEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarEspecialActionPerformed
        try{            
            model.addElement(tfNomeAtaque.getText());
            cbAtaque.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }//GEN-LAST:event_btAdicionarEspecialActionPerformed

    private void btLimpaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaEspecialActionPerformed
        cbAtaque.removeAllItems();
    }//GEN-LAST:event_btLimpaEspecialActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        try{
            Pokemon aux = pokedex.buscarPorCodigo(pkm.getCodigo() + 1);
            pkm = aux;
            if(pkm != null){
                taInfo.setText(pkm.toString());
                if(carregarImagem(pkm.getNome()) != null){
                    lbImagem.setIcon(carregarImagem(pkm.getNome()));
                }
            }
        }catch(NullPointerException e){
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        try{
            Pokemon aux = pokedex.buscarPorCodigo(pkm.getCodigo() - 1);
            pkm = aux;
            if(pkm != null){
                taInfo.setText(pkm.toString());
                if(carregarImagem(pkm.getNome()) != null){
                    lbImagem.setIcon(carregarImagem(pkm.getNome()));
                }
            }
        }catch(NullPointerException e){
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    /**
     * Este método retorna um tipo Enum
     * @param tipo
     * @return 
     */
   private ETipo retornaTipo(String tipo){
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
   
   /**
    * Este método retorna um Pokemon criado a partir de parâmetros fornecidos
    * @param nome
    * @param agilidade
    * @param altura
    * @param ataque
    * @param defesa
    * @param forca
    * @param peso
    * @param tipo
    * @param lista
    * @return 
    */
   private Pokemon retornaPokemon(String nome, int agilidade, double altura, int ataque, int defesa, int forca, double peso, ETipo tipo, List<String> lista){
       Pokemon recebe = null;
       if(null != tipo)switch (tipo) {
            case AÇO:{
                Aco p = new Aco(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
                }
            case ÁGUA:{
                Agua p = new Agua(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
                }
            case DRAGÃO:{
                Dragao p = new Dragao(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
                }
            case ELÉTRICO:{
                Eletrico p = new Eletrico(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
            }
            case FADA:{
                Fada p = new Fada(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
            }
           case FANTASMA:{
                Fantasma p = new Fantasma(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case FOGO:{
                Fogo p = new Fogo(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case GELO:{
                Gelo p = new Gelo(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case GRAMA:{
                Grama p = new Grama(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case INSETO:{
                Inseto p = new Inseto(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case LUTADOR:{
                Lutador p = new Lutador(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case NORMAL:{
                Normal p = new Normal(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case PEDRA:{
                Pedra p = new Pedra(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case PSÍQUICO:{
                Psiquico p = new Psiquico(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case TERRA:{
                Terra p = new Terra(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case VENENO:{
                Veneno p = new Veneno(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }
           case VOADOR:{
                Voador p = new Voador(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, lista);
                recebe = p;
                    break;
           }           
        }
       return recebe;
   }
   
   /**
    * Este método envia uma imagem para a pasta de destino
    * @param nome 
    */
   private void enviarImagem(String nome){
       try {
             File outputfile = new File("src/miniaturas/" + nome + ".jpg");
             ImageIO.write(imagem, "jpg", outputfile);
             JOptionPane.showMessageDialog(rootPane, "Imagem enviada com sucesso");
         } catch (IOException ex) {
         }
   }
   
   /**
    * Este método retorna uma imagem localizada na pasta miniaturas
    * @param nome
    * @return 
    */
   private ImageIcon carregarImagem(String nome){
        ImageIcon logo = null;
        try {            
            File file = new File("src/miniaturas/" + nome + ".jpg");
            logo = new ImageIcon(file.getPath());

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return logo;
   }
   
   /**
    * Este método retorna uma lista que será preenchida no combo box
    * @return 
    */
   private List<String> retornaCombo(){
       List<String> lista = new ArrayList<String>();
       for(int i = 0; i < cbAtaque.getItemCount(); i++){
           lista.add(cbAtaque.getItemAt(i) + ";");
       }
       return lista;
   }
   
   /**
    * Este método preenche um combo box a partir de uma lista fornecida
    * @param lista 
    */
   private void preencheCombo(List<String> lista){
       for(String l : lista){
           model.addElement(l);
       }
       cbAtaque.setModel(model);
   }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPokedex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarEspecial;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpaEspecial;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btUpload;
    private javax.swing.JComboBox<String> cbAtaque;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.ButtonGroup grSelecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAgilidade;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbAtaque;
    private javax.swing.JLabel lbDefesa;
    private javax.swing.JLabel lbForca;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbTelaFundo;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JRadioButton rbTipo;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTextField tfAgilidade;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfAtaque;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfDefesa;
    private javax.swing.JTextField tfForca;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeAtaque;
    private javax.swing.JTextField tfPeso;
    // End of variables declaration//GEN-END:variables
}
