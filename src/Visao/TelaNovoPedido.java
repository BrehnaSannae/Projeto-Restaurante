/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import javax.swing.DefaultListModel;  
import javax.swing.JOptionPane;

/**
 *
 * @author Jesyka Hanae
 */
public class TelaNovoPedido extends javax.swing.JFrame {
        private DefaultListModel Pedidos = new DefaultListModel();
        private DefaultListModel Quantidades = new DefaultListModel();
        private DefaultListModel Observações = new DefaultListModel();
        private DefaultListModel Pratos = new DefaultListModel();


    /**
     * Creates new form TelaNovoPedido
     */
    
    public TelaNovoPedido() {
        initComponents();
        jListPedidos.setModel(Pedidos);
        jListQuantidades.setModel(Quantidades);
        jListPratos.setModel(Pratos);
        jListObservações.setModel(Observações);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabelCadastrarPedido = new javax.swing.JLabel();
        jLabelNumeroMesa = new javax.swing.JLabel();
        jTextFieldNumeroMesa = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jLabelEntradas = new javax.swing.JLabel();
        jLabelEntradasPratosPrincipais = new javax.swing.JLabel();
        jCheckBoxPPrincipal1 = new javax.swing.JCheckBox();
        jLabelQuantidade5 = new javax.swing.JLabel();
        jTextFieldQuantidade5 = new javax.swing.JTextField();
        jLabelQuantidade6 = new javax.swing.JLabel();
        jTextFieldQuantidade6 = new javax.swing.JTextField();
        jLabelQuantidade7 = new javax.swing.JLabel();
        jTextFieldQuantidade7 = new javax.swing.JTextField();
        jLabelQuantidade8 = new javax.swing.JLabel();
        jTextFieldQuantidade8 = new javax.swing.JTextField();
        jCheckBoxPPrincipal2 = new javax.swing.JCheckBox();
        jCheckBoxPPrincipal3 = new javax.swing.JCheckBox();
        jCheckBoxPPrincipal4 = new javax.swing.JCheckBox();
        jLabelEntradas2 = new javax.swing.JLabel();
        jCheckBoxSobremesa1 = new javax.swing.JCheckBox();
        jLabelQuantidade9 = new javax.swing.JLabel();
        jTextFieldQuantidade9 = new javax.swing.JTextField();
        jLabelQuantidade10 = new javax.swing.JLabel();
        jTextFieldlQuantidade10 = new javax.swing.JTextField();
        jLabellQuantidade11 = new javax.swing.JLabel();
        jTextFieldlQuantidade11 = new javax.swing.JTextField();
        jLabellQuantidade12 = new javax.swing.JLabel();
        jTextFieldlQuantidade12 = new javax.swing.JTextField();
        jCheckBoxSobremesa2 = new javax.swing.JCheckBox();
        jCheckBoxSobremesa3 = new javax.swing.JCheckBox();
        jCheckBoxSobremesa4 = new javax.swing.JCheckBox();
        jLabelEntradas3 = new javax.swing.JLabel();
        jTextFieldlQuantidade13 = new javax.swing.JTextField();
        jLabelQuantidade14 = new javax.swing.JLabel();
        jTextFieldQuantidade14 = new javax.swing.JTextField();
        jLabelQuantidade15 = new javax.swing.JLabel();
        jTextFieldQuantidade15 = new javax.swing.JTextField();
        jLabelQuantidade16 = new javax.swing.JLabel();
        jTextFieldQuantidade16 = new javax.swing.JTextField();
        jCheckBoxBebida2 = new javax.swing.JCheckBox();
        jCheckBoxBebida3 = new javax.swing.JCheckBox();
        jCheckBoxBebida4 = new javax.swing.JCheckBox();
        jCheckBoxBebida1 = new javax.swing.JCheckBox();
        jLabellQuantidade13 = new javax.swing.JLabel();
        jButtonGerarPedido = new javax.swing.JButton();
        jCheckBoxEntrada1 = new javax.swing.JCheckBox();
        jLabelQuantidade1 = new javax.swing.JLabel();
        jTextFieldQuantidade1 = new javax.swing.JTextField();
        jLabelQuantidade2 = new javax.swing.JLabel();
        jTextFieldQuantidade2 = new javax.swing.JTextField();
        jLabelQuantidade3 = new javax.swing.JLabel();
        jTextFieldQuantidade3 = new javax.swing.JTextField();
        jLabelQuantidade4 = new javax.swing.JLabel();
        jTextFieldQuantidade4 = new javax.swing.JTextField();
        jCheckBoxEntradas2 = new javax.swing.JCheckBox();
        jCheckBoxEntradas3 = new javax.swing.JCheckBox();
        jCheckBoxEntradas4 = new javax.swing.JCheckBox();
        jButtonPaginaInicial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPedidos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListQuantidades = new javax.swing.JList();
        jToggleButtonRemoverItem = new javax.swing.JToggleButton();
        jToggleButtonConcluirPedido = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldObservação = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListPratos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListObservações = new javax.swing.JList<>();

        jLabel3.setText("Quantidade:");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelCadastrarPedido.setBackground(new java.awt.Color(153, 153, 255));
        jLabelCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastrarPedido.setText("Cadastrar Pedido");
        jLabelCadastrarPedido.setOpaque(true);
        getContentPane().add(jLabelCadastrarPedido);
        jLabelCadastrarPedido.setBounds(4, 1, 214, 20);

        jLabelNumeroMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroMesa.setText("Número da Mesa:");
        getContentPane().add(jLabelNumeroMesa);
        jLabelNumeroMesa.setBounds(233, 1, 120, 20);

        jTextFieldNumeroMesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldNumeroMesa);
        jTextFieldNumeroMesa.setBounds(357, 1, 50, 30);

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ratatouille interfaces.jpg"))); // NOI18N
        jLabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(170, 40, 420, 50);

        jLabelEntradas.setBackground(new java.awt.Color(153, 153, 255));
        jLabelEntradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEntradas.setText("Entradas");
        jLabelEntradas.setOpaque(true);
        getContentPane().add(jLabelEntradas);
        jLabelEntradas.setBounds(4, 95, 398, 17);

        jLabelEntradasPratosPrincipais.setBackground(new java.awt.Color(153, 153, 255));
        jLabelEntradasPratosPrincipais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEntradasPratosPrincipais.setText("Pratos Principais");
        jLabelEntradasPratosPrincipais.setOpaque(true);
        getContentPane().add(jLabelEntradasPratosPrincipais);
        jLabelEntradasPratosPrincipais.setBounds(4, 234, 398, 17);

        jCheckBoxPPrincipal1.setText("Macarrão à Carbonara");
        getContentPane().add(jCheckBoxPPrincipal1);
        jCheckBoxPPrincipal1.setBounds(5, 257, 190, 23);

        jLabelQuantidade5.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade5);
        jLabelQuantidade5.setBounds(287, 257, 70, 23);

        jTextFieldQuantidade5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade5);
        jTextFieldQuantidade5.setBounds(361, 257, 41, 23);

        jLabelQuantidade6.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade6);
        jLabelQuantidade6.setBounds(287, 286, 70, 23);

        jTextFieldQuantidade6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade6);
        jTextFieldQuantidade6.setBounds(361, 286, 41, 23);

        jLabelQuantidade7.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade7);
        jLabelQuantidade7.setBounds(287, 315, 70, 23);

        jTextFieldQuantidade7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade7);
        jTextFieldQuantidade7.setBounds(361, 315, 41, 23);

        jLabelQuantidade8.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade8);
        jLabelQuantidade8.setBounds(287, 344, 70, 23);

        jTextFieldQuantidade8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade8);
        jTextFieldQuantidade8.setBounds(361, 344, 41, 23);

        jCheckBoxPPrincipal2.setText("Medalhão ao Molho Pesto");
        getContentPane().add(jCheckBoxPPrincipal2);
        jCheckBoxPPrincipal2.setBounds(5, 286, 190, 23);

        jCheckBoxPPrincipal3.setText("Ratatouille");
        getContentPane().add(jCheckBoxPPrincipal3);
        jCheckBoxPPrincipal3.setBounds(5, 315, 150, 23);

        jCheckBoxPPrincipal4.setText("Salmão Grelhado e Batatas Rústicas");
        getContentPane().add(jCheckBoxPPrincipal4);
        jCheckBoxPPrincipal4.setBounds(5, 344, 250, 23);

        jLabelEntradas2.setBackground(new java.awt.Color(153, 153, 255));
        jLabelEntradas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEntradas2.setText("Sobremesas");
        jLabelEntradas2.setOpaque(true);
        getContentPane().add(jLabelEntradas2);
        jLabelEntradas2.setBounds(4, 373, 398, 15);

        jCheckBoxSobremesa1.setText("Petit Gateau");
        getContentPane().add(jCheckBoxSobremesa1);
        jCheckBoxSobremesa1.setBounds(4, 394, 180, 23);

        jLabelQuantidade9.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade9);
        jLabelQuantidade9.setBounds(287, 394, 70, 23);

        jTextFieldQuantidade9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade9);
        jTextFieldQuantidade9.setBounds(361, 394, 41, 23);

        jLabelQuantidade10.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade10);
        jLabelQuantidade10.setBounds(287, 423, 70, 23);

        jTextFieldlQuantidade10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldlQuantidade10);
        jTextFieldlQuantidade10.setBounds(361, 423, 41, 23);

        jLabellQuantidade11.setText("Quantidade:");
        getContentPane().add(jLabellQuantidade11);
        jLabellQuantidade11.setBounds(287, 452, 70, 23);

        jTextFieldlQuantidade11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldlQuantidade11);
        jTextFieldlQuantidade11.setBounds(361, 452, 41, 23);

        jLabellQuantidade12.setText("Quantidade:");
        getContentPane().add(jLabellQuantidade12);
        jLabellQuantidade12.setBounds(287, 481, 70, 23);

        jTextFieldlQuantidade12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldlQuantidade12);
        jTextFieldlQuantidade12.setBounds(361, 481, 41, 23);

        jCheckBoxSobremesa2.setText("Taça Cremosa com Frutas Frescas");
        getContentPane().add(jCheckBoxSobremesa2);
        jCheckBoxSobremesa2.setBounds(4, 423, 230, 23);

        jCheckBoxSobremesa3.setText("Tiramisu");
        getContentPane().add(jCheckBoxSobremesa3);
        jCheckBoxSobremesa3.setBounds(4, 452, 130, 23);

        jCheckBoxSobremesa4.setText("Torta Holandesa");
        getContentPane().add(jCheckBoxSobremesa4);
        jCheckBoxSobremesa4.setBounds(4, 481, 160, 23);

        jLabelEntradas3.setBackground(new java.awt.Color(153, 153, 255));
        jLabelEntradas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEntradas3.setText("Bebidas");
        jLabelEntradas3.setOpaque(true);
        getContentPane().add(jLabelEntradas3);
        jLabelEntradas3.setBounds(4, 510, 398, 17);

        jTextFieldlQuantidade13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldlQuantidade13);
        jTextFieldlQuantidade13.setBounds(361, 533, 41, 23);

        jLabelQuantidade14.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade14);
        jLabelQuantidade14.setBounds(287, 562, 70, 23);

        jTextFieldQuantidade14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade14);
        jTextFieldQuantidade14.setBounds(361, 562, 41, 23);

        jLabelQuantidade15.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade15);
        jLabelQuantidade15.setBounds(287, 591, 70, 23);

        jTextFieldQuantidade15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade15);
        jTextFieldQuantidade15.setBounds(361, 591, 41, 23);

        jLabelQuantidade16.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade16);
        jLabelQuantidade16.setBounds(287, 620, 70, 23);

        jTextFieldQuantidade16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade16);
        jTextFieldQuantidade16.setBounds(361, 620, 41, 23);

        jCheckBoxBebida2.setText("Agua com Gás");
        getContentPane().add(jCheckBoxBebida2);
        jCheckBoxBebida2.setBounds(3, 562, 170, 23);

        jCheckBoxBebida3.setText("Champagne");
        getContentPane().add(jCheckBoxBebida3);
        jCheckBoxBebida3.setBounds(3, 591, 160, 23);

        jCheckBoxBebida4.setText("Vinho Branco");
        getContentPane().add(jCheckBoxBebida4);
        jCheckBoxBebida4.setBounds(3, 620, 100, 23);

        jCheckBoxBebida1.setText("Agua");
        getContentPane().add(jCheckBoxBebida1);
        jCheckBoxBebida1.setBounds(3, 533, 110, 23);

        jLabellQuantidade13.setText("Quantidade:");
        getContentPane().add(jLabellQuantidade13);
        jLabellQuantidade13.setBounds(287, 533, 70, 23);

        jButtonGerarPedido.setText("Gerar Pedido");
        jButtonGerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarPedido);
        jButtonGerarPedido.setBounds(270, 650, 140, 23);

        jCheckBoxEntrada1.setText("Brusqueta");
        getContentPane().add(jCheckBoxEntrada1);
        jCheckBoxEntrada1.setBounds(10, 120, 140, 23);

        jLabelQuantidade1.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade1);
        jLabelQuantidade1.setBounds(287, 118, 70, 23);

        jTextFieldQuantidade1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade1);
        jTextFieldQuantidade1.setBounds(361, 118, 41, 23);

        jLabelQuantidade2.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade2);
        jLabelQuantidade2.setBounds(287, 147, 70, 23);

        jTextFieldQuantidade2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade2);
        jTextFieldQuantidade2.setBounds(361, 147, 41, 23);

        jLabelQuantidade3.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade3);
        jLabelQuantidade3.setBounds(287, 176, 70, 23);

        jTextFieldQuantidade3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade3);
        jTextFieldQuantidade3.setBounds(361, 176, 41, 23);

        jLabelQuantidade4.setText("Quantidade:");
        getContentPane().add(jLabelQuantidade4);
        jLabelQuantidade4.setBounds(287, 205, 70, 23);

        jTextFieldQuantidade4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldQuantidade4);
        jTextFieldQuantidade4.setBounds(361, 205, 41, 23);

        jCheckBoxEntradas2.setText("Canapés de Brie");
        getContentPane().add(jCheckBoxEntradas2);
        jCheckBoxEntradas2.setBounds(10, 147, 160, 23);

        jCheckBoxEntradas3.setText("Salada Caprese");
        getContentPane().add(jCheckBoxEntradas3);
        jCheckBoxEntradas3.setBounds(10, 176, 180, 23);

        jCheckBoxEntradas4.setText("Tartar de Linguado");
        getContentPane().add(jCheckBoxEntradas4);
        jCheckBoxEntradas4.setBounds(10, 205, 260, 23);

        jButtonPaginaInicial.setText("Pagina Inicial");
        jButtonPaginaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaginaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPaginaInicial);
        jButtonPaginaInicial.setBounds(610, 10, 140, 23);

        jScrollPane1.setViewportView(jListPedidos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(428, 118, 220, 260);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Itens Pedidos");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(428, 95, 220, 17);

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quantidade");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(666, 95, 84, 17);

        jScrollPane2.setViewportView(jListQuantidades);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(666, 118, 84, 260);

        jToggleButtonRemoverItem.setText("Remover Item");
        jToggleButtonRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRemoverItemActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonRemoverItem);
        jToggleButtonRemoverItem.setBounds(430, 650, 130, 23);

        jToggleButtonConcluirPedido.setText("Concluir Pedido");
        jToggleButtonConcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConcluirPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonConcluirPedido);
        jToggleButtonConcluirPedido.setBounds(590, 650, 140, 23);

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Observações");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 390, 320, 20);
        getContentPane().add(jTextFieldObservação);
        jTextFieldObservação.setBounds(430, 420, 220, 30);

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionar);
        jButtonAdicionar.setBounds(660, 420, 90, 30);

        jScrollPane3.setViewportView(jListPratos);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(430, 460, 130, 180);

        jScrollPane4.setViewportView(jListObservações);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(570, 460, 180, 180);

        setSize(new java.awt.Dimension(779, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

           public void Limpar(){
        jCheckBoxEntrada1.setSelected(false); 
        jCheckBoxEntradas2.setSelected(false);
        jCheckBoxEntradas3.setSelected(false);
        jCheckBoxEntradas4.setSelected(false);
        jCheckBoxPPrincipal1.setSelected(false);
        jCheckBoxPPrincipal2.setSelected(false);
        jCheckBoxPPrincipal3.setSelected(false);
        jCheckBoxPPrincipal4.setSelected(false);
        jCheckBoxBebida1.setSelected(false);
        jCheckBoxBebida2.setSelected(false);
        jCheckBoxBebida3.setSelected(false);
        jCheckBoxBebida4.setSelected(false);
        jCheckBoxSobremesa1.setSelected(false);
        jCheckBoxSobremesa2.setSelected(false);
        jCheckBoxSobremesa3.setSelected(false);
        jCheckBoxSobremesa4.setSelected(false);
        jTextFieldQuantidade1.setText("");
        jTextFieldQuantidade14.setText("");
        jTextFieldQuantidade15.setText("");
        jTextFieldQuantidade16.setText("");
        jTextFieldQuantidade2.setText("");
        jTextFieldQuantidade3.setText("");
        jTextFieldQuantidade4.setText("");
        jTextFieldQuantidade5.setText("");
        jTextFieldQuantidade6.setText("");
        jTextFieldQuantidade7.setText("");
        jTextFieldQuantidade8.setText("");
        jTextFieldQuantidade9.setText("");
        jTextFieldlQuantidade10.setText("");
        jTextFieldlQuantidade11.setText("");
        jTextFieldlQuantidade12.setText("");
        jTextFieldlQuantidade13.setText("");
        }
    
    private void jButtonGerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarPedidoActionPerformed
        String NMesa = jTextFieldNumeroMesa.getText();
        String[] Entradas = new String[]{"Brusqueta","Canapés de Brie","Salada Caprese","Tartar de Linguado"};
        String[] PPrincipais = new String[]{"Macarrão à Carbonara","Medalão ao Molho Pesto","Ratatouille","Salmão Grelhado e Batatas Rústicas"};
        String[] Sobremesas = new String[]{"Petit Gateau","Taça Cremosa com Frutas Frescas","Tiramisu","Torta Holandesa"};
        String[] Bebidas = new String[]{"Agua","Agua com Gás","Champagne","Vinho Branco"};
        
        if (jCheckBoxEntrada1.isSelected() & jTextFieldQuantidade1!=null ){
           String Pedido1 = Entradas[0];
                      Pedidos.addElement(Pedido1);
                      Quantidades.addElement(jTextFieldQuantidade1.getText());
    }
         if (jCheckBoxEntradas2.isSelected() & jTextFieldQuantidade2!=null ){
           String Pedido2 = Entradas[1];
                      Pedidos.addElement(Pedido2);
                      Quantidades.addElement(jTextFieldQuantidade2.getText());
    }
         if (jCheckBoxEntradas3.isSelected() & jTextFieldQuantidade3!=null ){
           String Pedido3 = Entradas[2];
                      Pedidos.addElement(Pedido3);
                      Quantidades.addElement(jTextFieldQuantidade3.getText());
    }
         if (jCheckBoxEntradas4.isSelected() & jTextFieldQuantidade4!=null ){
           String Pedido4 = Entradas[3];
                      Pedidos.addElement(Pedido4);
                      Quantidades.addElement(jTextFieldQuantidade4.getText());
    }    
        if (jCheckBoxPPrincipal1.isSelected() & jTextFieldQuantidade5!=null ){
           String Pedido5 = PPrincipais[0];
                      Pedidos.addElement(Pedido5);
                      Quantidades.addElement(jTextFieldQuantidade5.getText());
        }
        if (jCheckBoxPPrincipal2.isSelected() & jTextFieldQuantidade6!=null ){
           String Pedido6 = PPrincipais[1];
                      Pedidos.addElement(Pedido6);
                      Quantidades.addElement(jTextFieldQuantidade6.getText());
        }
        if (jCheckBoxPPrincipal3.isSelected() & jTextFieldQuantidade7!=null ){
           String Pedido7 = PPrincipais[2];
                      Pedidos.addElement(Pedido7);
                      Quantidades.addElement(jTextFieldQuantidade7.getText());
        }
        if (jCheckBoxPPrincipal4.isSelected() & jTextFieldQuantidade8!=null ){
           String Pedido8 = PPrincipais[3];
                      Pedidos.addElement(Pedido8);
                      Quantidades.addElement(jTextFieldQuantidade8.getText());
        }
        if (jCheckBoxSobremesa1.isSelected() & jTextFieldQuantidade9!=null ){
           String Pedido9 = Sobremesas[0];
                      Pedidos.addElement(Pedido9);
                      Quantidades.addElement(jTextFieldQuantidade9.getText());
        }
        if (jCheckBoxSobremesa2.isSelected() & jTextFieldlQuantidade10!=null ){
           String Pedido10 = Sobremesas[1];
                      Pedidos.addElement(Pedido10);
                      Quantidades.addElement(jTextFieldlQuantidade10.getText());
        }
        if (jCheckBoxSobremesa3.isSelected() & jTextFieldlQuantidade11!=null ){
           String Pedido11 = Sobremesas[2];
                      Pedidos.addElement(Pedido11);
                      Quantidades.addElement(jTextFieldlQuantidade11.getText());
        } 
        if (jCheckBoxSobremesa4.isSelected() & jTextFieldlQuantidade12!=null ){
           String Pedido12 = Sobremesas[3];
                      Pedidos.addElement(Pedido12);
                      Quantidades.addElement(jTextFieldlQuantidade12.getText());
        } 
        if (jCheckBoxBebida1.isSelected() & jTextFieldlQuantidade13!=null ){
           String Pedido13 = Bebidas[0];
                      Pedidos.addElement(Pedido13);
                      Quantidades.addElement(jTextFieldlQuantidade13.getText());
        } 
        if (jCheckBoxBebida2.isSelected() & jTextFieldQuantidade14!=null ){
           String Pedido14 = Bebidas[1];
                      Pedidos.addElement(Pedido14);
                      Quantidades.addElement(jTextFieldQuantidade14.getText());
        }
        if (jCheckBoxBebida3.isSelected() & jTextFieldQuantidade15!=null ){
           String Pedido15 = Bebidas[2];
                      Pedidos.addElement(Pedido15);
                      Quantidades.addElement(jTextFieldQuantidade15.getText());
        }
        if (jCheckBoxBebida4.isSelected() & jTextFieldQuantidade16!=null ){
           String Pedido16 = Bebidas[3];
                      Pedidos.addElement(Pedido16);
                      Quantidades.addElement(jTextFieldQuantidade16.getText());
                      
        }
        if ("".equals(NMesa)) {
            JOptionPane.showMessageDialog(rootPane, "Número da Mesa Inválido Inválido!!");
            if(!"".equals(NMesa)){
            this.setVisible(false);}}

        Limpar();
    }//GEN-LAST:event_jButtonGerarPedidoActionPerformed

    private void jButtonPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaginaInicialActionPerformed
        this.setVisible(false);
        TelaInicialGarcom PaginaInicial = new TelaInicialGarcom();
        PaginaInicial.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButtonPaginaInicialActionPerformed

    private void jToggleButtonRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRemoverItemActionPerformed
        DefaultListModel Pedidos = (DefaultListModel) jListPedidos.getModel();
        int selectedIndex = jListPedidos.getSelectedIndex();
        if (selectedIndex != -1) {
        Pedidos.remove(selectedIndex);
    }//GEN-LAST:event_jToggleButtonRemoverItemActionPerformed
       DefaultListModel Quantidades = (DefaultListModel) jListQuantidades.getModel();
       int selectedIndex2 = jListQuantidades.getSelectedIndex();
       if (selectedIndex2 != -1) {
       Quantidades.remove(selectedIndex2);
    }  
        DefaultListModel Observações = (DefaultListModel) jListObservações.getModel();
       int selectedIndex3 = jListObservações.getSelectedIndex();
       if (selectedIndex3 != -1) {
       Observações.remove(selectedIndex3);
    } 
       DefaultListModel Pratos = (DefaultListModel) jListPratos.getModel();
       int selectedIndex4 = jListPratos.getSelectedIndex();
       if (selectedIndex4 != -1) {
       Pratos.remove(selectedIndex4);
    }
    }
    
    private void jToggleButtonConcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConcluirPedidoActionPerformed
        String NMesa = jTextFieldNumeroMesa.getText();
        if ("".equals(NMesa)) {
            JOptionPane.showMessageDialog(rootPane, "Número da Mesa Inválido Inválido!!");
            if(!"".equals(NMesa)){
            this.setVisible(false);
            TelaConclusao Telaconclusao = new TelaConclusao();
            Telaconclusao.setVisible(true);
            }
            }   
        else {
        
            this.setVisible(false);
            TelaConclusao Telaconclusao = new TelaConclusao();
            Telaconclusao.setVisible(true);
        }
    }//GEN-LAST:event_jToggleButtonConcluirPedidoActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
        String Observação = jTextFieldObservação.getText();
        int selectedIndex = jListPedidos.getSelectedIndex();
        if ((selectedIndex != -1)&(jTextFieldObservação!=null )){
                      Observações.addElement(Observação);  
                      Pratos.addElement(Pedidos.get(selectedIndex));
                      jListPedidos.clearSelection();
        }
        jTextFieldObservação.setText("");
        
        
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonGerarPedido;
    private javax.swing.JButton jButtonPaginaInicial;
    private javax.swing.JCheckBox jCheckBoxBebida1;
    private javax.swing.JCheckBox jCheckBoxBebida2;
    private javax.swing.JCheckBox jCheckBoxBebida3;
    private javax.swing.JCheckBox jCheckBoxBebida4;
    private javax.swing.JCheckBox jCheckBoxEntrada1;
    private javax.swing.JCheckBox jCheckBoxEntradas2;
    private javax.swing.JCheckBox jCheckBoxEntradas3;
    private javax.swing.JCheckBox jCheckBoxEntradas4;
    private javax.swing.JCheckBox jCheckBoxPPrincipal1;
    private javax.swing.JCheckBox jCheckBoxPPrincipal2;
    private javax.swing.JCheckBox jCheckBoxPPrincipal3;
    private javax.swing.JCheckBox jCheckBoxPPrincipal4;
    private javax.swing.JCheckBox jCheckBoxSobremesa1;
    private javax.swing.JCheckBox jCheckBoxSobremesa2;
    private javax.swing.JCheckBox jCheckBoxSobremesa3;
    private javax.swing.JCheckBox jCheckBoxSobremesa4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCadastrarPedido;
    private javax.swing.JLabel jLabelEntradas;
    private javax.swing.JLabel jLabelEntradas2;
    private javax.swing.JLabel jLabelEntradas3;
    private javax.swing.JLabel jLabelEntradasPratosPrincipais;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNumeroMesa;
    private javax.swing.JLabel jLabelQuantidade1;
    private javax.swing.JLabel jLabelQuantidade10;
    private javax.swing.JLabel jLabelQuantidade14;
    private javax.swing.JLabel jLabelQuantidade15;
    private javax.swing.JLabel jLabelQuantidade16;
    private javax.swing.JLabel jLabelQuantidade2;
    private javax.swing.JLabel jLabelQuantidade3;
    private javax.swing.JLabel jLabelQuantidade4;
    private javax.swing.JLabel jLabelQuantidade5;
    private javax.swing.JLabel jLabelQuantidade6;
    private javax.swing.JLabel jLabelQuantidade7;
    private javax.swing.JLabel jLabelQuantidade8;
    private javax.swing.JLabel jLabelQuantidade9;
    private javax.swing.JLabel jLabellQuantidade11;
    private javax.swing.JLabel jLabellQuantidade12;
    private javax.swing.JLabel jLabellQuantidade13;
    private javax.swing.JList<String> jListObservações;
    private javax.swing.JList jListPedidos;
    private javax.swing.JList<String> jListPratos;
    private javax.swing.JList jListQuantidades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldNumeroMesa;
    private javax.swing.JTextField jTextFieldObservação;
    private javax.swing.JTextField jTextFieldQuantidade1;
    private javax.swing.JTextField jTextFieldQuantidade14;
    private javax.swing.JTextField jTextFieldQuantidade15;
    private javax.swing.JTextField jTextFieldQuantidade16;
    private javax.swing.JTextField jTextFieldQuantidade2;
    private javax.swing.JTextField jTextFieldQuantidade3;
    private javax.swing.JTextField jTextFieldQuantidade4;
    private javax.swing.JTextField jTextFieldQuantidade5;
    private javax.swing.JTextField jTextFieldQuantidade6;
    private javax.swing.JTextField jTextFieldQuantidade7;
    private javax.swing.JTextField jTextFieldQuantidade8;
    private javax.swing.JTextField jTextFieldQuantidade9;
    private javax.swing.JTextField jTextFieldlQuantidade10;
    private javax.swing.JTextField jTextFieldlQuantidade11;
    private javax.swing.JTextField jTextFieldlQuantidade12;
    private javax.swing.JTextField jTextFieldlQuantidade13;
    private javax.swing.JToggleButton jToggleButtonConcluirPedido;
    private javax.swing.JToggleButton jToggleButtonRemoverItem;
    // End of variables declaration//GEN-END:variables

   
}