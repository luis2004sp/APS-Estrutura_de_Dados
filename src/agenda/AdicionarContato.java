/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agenda;

import javax.swing.JOptionPane;

public class AdicionarContato extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarConta
     * @param L lista que será utilizada no codigo
     */
    public AdicionarContato(ListaCircular L) {
        setListaAdiciona(L);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldEmail = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        optionTipo = new javax.swing.JComboBox<>();
        fieldTelefone = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaObservacao = new javax.swing.JTextArea();
        txtNome = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        fieldNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setText("Email");

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTipo.setText("Tipo do Numero :");

        optionTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optionTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Celular", "Casa", "Empresa" }));

        try {
            fieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fieldTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefone.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Observações :");

        areaObservacao.setColumns(20);
        areaObservacao.setRows(5);
        jScrollPane2.setViewportView(areaObservacao);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.setText("Nome");

        buttonSalvar.setActionCommand("Salvar");
        buttonSalvar.setLabel("Salvar ");
        buttonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseClicked(evt);
            }
        });

        fieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(262, 262, 262)
                            .addComponent(optionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome)
                                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTipo)
                                                .addComponent(txtEmail)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtTelefone)
                                                    .addGap(171, 171, 171))
                                                .addComponent(fieldTelefone)))
                                        .addGap(234, 234, 234)))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(txtEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNome)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSalvar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que verifica se o contato pode ser salvo
     * @param evt 
     */
    private void buttonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseClicked

        // encontra o contato ativo e passa o novo valor pro objeto na lista
        if(fieldNome.getText().equals("") || fieldNome.getText() == null){
            JOptionPane.showMessageDialog(null, "Por favor escolha um nome para seu contato");
            return;
        }
        if(fieldTelefone.getText().equals("") || fieldTelefone.getText() == null ||fieldTelefone.getText().length() < 11){
            JOptionPane.showMessageDialog(null, "Por favor escolha um Numero de telefone e válido para seu contato");
            return;
        }
        if(optionTipo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor escolha um Tipo de Numero ");
            return;
        }
        if( isExiste(fieldTelefone.getText()) ){
            JOptionPane.showMessageDialog(null, "Este numero já existe na lista, por favor verifique se foi digitado corretamente ");
            return;
        }
        
        lc.adiciona(this.fieldNome.getText(), this.fieldTelefone.getText(), optionTipo.getSelectedIndex(), fieldEmail.getText(), areaObservacao.getText());
        
        

        this.setVisible(false);
        
    }//GEN-LAST:event_buttonSalvarMouseClicked

    
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarContato().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaObservacao;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JFormattedTextField fieldTelefone;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> optionTipo;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtTelefone;
    private javax.swing.JLabel txtTipo;
    // End of variables declaration//GEN-END:variables
    
    private ListaCircular lc;
    
    /**
     * Adiciona na lista circular
     * @param L 
     */
    public void setListaAdiciona(Object L){
        lc = (ListaCircular) L;
    }
    
    /**
     * Retorna a lista circular
     * @return lc
     */
    public ListaCircular getListaAdiciona(){
        return lc;
    }
    
    /**
     * Metodo criado pra verificar se já existe o numero na lista pois o 
     * numero é pessoal e não terá 2 pessoas com o mesmo numero
     * 
     * @param numero é o Telefone a ser procurado
     * @return se já existe ou não na lista
     */
    public boolean isExiste(String numero){
        
        Contato primeiro = lc.getCabeca();// armazena a cabeca
        Contato index = lc.getCabeca();//armazenar o elemento atual da lista a ser percorrida        
        
        while(primeiro != index ){
            
            if(numero.equals(index.getTelefone())){
                return true;
            }
            index = index.getProximo();
        }
        
        
        return false;
    }
}