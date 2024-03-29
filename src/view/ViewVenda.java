/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.bean.Produtos;
import model.bean.Vender;
import model.dao.ClienteDA0;
import model.dao.ProdutoDA0;
import model.dao.UsuarioDA0;
import model.dao.VenderDA0;

/**
 *
 * @author PC TESTE
 */
public class ViewVenda extends javax.swing.JFrame {

    /** Creates new form ViewVenda */
    public ViewVenda() {
        
        
        initComponents();DefaultTableModel modelo = (DefaultTableModel) venTable.getModel();
        venTable.setRowSorter(new TableRowSorter(modelo));

        ProdutoDA0 dao = new ProdutoDA0();
        for(Produtos  p: dao.read()){
            
            cbProdutos.addItem(p);
            
      
        }
          
        ClienteDA0 cdao = new ClienteDA0();
        for(Cliente c: cdao.read()){
            v_cliente.addItem(c);
        }
        
            
        readvenTable();
    
}

    public void readvenTable() {

        DefaultTableModel modelo = (DefaultTableModel) venTable.getModel();
        modelo.setNumRows(0);
        VenderDA0 dao = new VenderDA0();
        UsuarioDA0 u=new UsuarioDA0();
        ProdutoDA0 p = new ProdutoDA0();
        ClienteDA0 c = new ClienteDA0();
        
        for (Vender v : dao.ler()) {
            
             String n =       u.getNome(v.getFuncionario());
             String produto = p.getName(v.getProduto());
             String cliente = c.getNombre(v.getCliente());
             
             v.setUs(n);
             v.setPro(produto);
             v.setCli(cliente);
             
            modelo.addRow(new Object[]{
                v.getId(),
                v.getUs(),
                v.getCli(),
                v.getPro(),
                v.getQtd(),
                v.getTotal()
                

            });

        }

    }
    
            
            
            
    
        
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        v_quantidade = new javax.swing.JTextField();
        vConfirm = new javax.swing.JButton();
        v_Cancel = new javax.swing.JButton();
        v_Excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        venTable = new javax.swing.JTable();
        cbProdutos = new javax.swing.JComboBox<>();
        v_cliente = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gregor Millers Friends Font", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Realizar venda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 545, 75));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Produto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 101, -1, -1));
        getContentPane().add(v_quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 114, -1));

        vConfirm.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC TESTE\\Desktop\\Netbeans and IMG\\Sistema\\src\\imagens\\save.png")); // NOI18N
        vConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vConfirmMouseEntered(evt);
            }
        });
        vConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(vConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 50, 40));

        v_Cancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC TESTE\\Desktop\\Netbeans and IMG\\Sistema\\src\\imagens\\editar.png")); // NOI18N
        v_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                v_CancelMouseEntered(evt);
            }
        });
        v_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(v_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 50, 60));

        v_Excluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC TESTE\\Desktop\\Netbeans and IMG\\Sistema\\src\\imagens\\trash.png")); // NOI18N
        v_Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                v_ExcluirMouseEntered(evt);
            }
        });
        v_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(v_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 30, 40));

        venTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Funcionario", "Cliente", "Produto", "Quantidade", "Total"
            }
        ));
        venTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(venTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 780, 250));

        getContentPane().add(cbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 101, 152, -1));

        getContentPane().add(v_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cliente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 102, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jframe.png"))); // NOI18N
        jLabel8.setText("Cliente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 1060, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public String getData(LocalDateTime agora){ //pega a data
        DateTimeFormatter formatador = DateTimeFormatter
	.ofLocalizedDateTime(FormatStyle.MEDIUM)
	.withLocale(new Locale("pt", "br"));
        String data= agora.format(formatador);
        String d=data.substring(0,11);
        return  d;
    }
     
     public String getHora(LocalDateTime agora){ // pegar a hora
        
        DateTimeFormatter formatador = DateTimeFormatter
	.ofLocalizedDateTime(FormatStyle.MEDIUM)
	.withLocale(new Locale("pt", "br"));
        String data= agora.format(formatador);
        String d=data.substring(11);
        return  d;
    }
    
    private void vConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vConfirmActionPerformed
        Produtos p  = new Produtos(); 
        ProdutoDA0 pdao = new ProdutoDA0();
        
        String np= cbProdutos.getSelectedItem().toString();
        String nc = v_cliente.getSelectedItem().toString();
        
        if(Integer.parseInt(v_quantidade.getText())<= pdao.getProduto(np).getQtd()){
        
                    int q  = pdao.getProduto(np).getQtd();
                    int qu = Integer.parseInt(v_quantidade.getText());
                    int qa = q-qu;

                    
                    ProdutoDA0 pd=new ProdutoDA0();
                    
                    Produtos p1=pd.getProduto(np);
                    Produtos p2=new Produtos();
                    
                    p2.setId(p1.getId());
                    p2.setQtd(qa);
                    
                    pd.updateProduto(p2);
                    
                    ClienteDA0 cd = new ClienteDA0();
                    Cliente c1 = cd.getClientes(nc);

                    Vender v = new Vender();
                    VenderDA0 dao = new VenderDA0();

                    
                    v.setProduto(p1.getId());
                    v.setCliente(c1.getCodigo());
                    v.setQtd(Integer.parseInt(v_quantidade.getText())); 

                    LocalDateTime dt = LocalDateTime.now();//3 linhas pegar a data
                    String data =getData(dt);
                    String hora =getHora(dt);

                    v.setData(data);
                    v.setHora(hora);


                    double total = p1.getPreço()*v.getQtd();
                    v.setTotal(total);  
                    
                    
                    dao.vender(v);





                    readvenTable();
                    
                    
     }     
       else {
            JOptionPane.showMessageDialog(null,"Quantidade Insuficiente");
        }
    }//GEN-LAST:event_vConfirmActionPerformed

    private void v_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_CancelActionPerformed

        
       v_quantidade.setText("");
        
              
        
    }//GEN-LAST:event_v_CancelActionPerformed

    private void v_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_ExcluirActionPerformed
       if(venTable.getSelectedRow()!= -1){ 
           
        Vender v = new Vender();
        VenderDA0 vdao = new VenderDA0();
        
        v.setId((int) venTable.getValueAt(venTable.getSelectedRow(),0) );
        vdao.delete(v);
        
        readvenTable();
        } 
        
        
        
    }//GEN-LAST:event_v_ExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ViewHome vw = new ViewHome();
       vw.show();
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        String string = "Voltar";
        jButton1.setToolTipText(string);
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void vConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vConfirmMouseEntered
        String string = "Cadastrar";
        jButton1.setToolTipText(string);        // TODO add your handling code here:
    }//GEN-LAST:event_vConfirmMouseEntered

    private void v_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_CancelMouseEntered
       
                String string = "Cancelar";
        jButton1.setToolTipText(string);
        
    }//GEN-LAST:event_v_CancelMouseEntered

    private void v_ExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_ExcluirMouseEntered
               String string = "Excluir";
        jButton1.setToolTipText(string);
    }//GEN-LAST:event_v_ExcluirMouseEntered

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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbProdutos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton vConfirm;
    private javax.swing.JButton v_Cancel;
    private javax.swing.JButton v_Excluir;
    private javax.swing.JComboBox<Object> v_cliente;
    private javax.swing.JTextField v_quantidade;
    private javax.swing.JTable venTable;
    // End of variables declaration//GEN-END:variables

}
