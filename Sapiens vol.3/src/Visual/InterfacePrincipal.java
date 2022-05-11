/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Visual.Estilos.RoundJTextField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


/**
 *
 * @author shmue_cjh
 */
public class InterfacePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrincipal
     * @throws java.io.IOException
     */
    public InterfacePrincipal() throws IOException {
        initComponents();
        
        //Detalhes: Botão do Processador
        final BufferedImage processadorImg = ImageIO.read(getClass().getResource("/Visual/Imagens/Processador (regular).png"));
        
        Processador_jB.setContentAreaFilled(false);    
        Processador_jB.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e) 
            {
                int pixel = processadorImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 ) 
                {
                    return;
                }
                else 
                { 
                    Processador_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Processador (clicking).png")));
                }
                super.mousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) 
            {
                int pixel = processadorImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 )
                {
                    Processador_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Processador (regular).png")));
                }
                else {
                    Processador_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Processador (hovering).png")));             
                }
                super.mouseReleased(e);
            }
        });
        
        Processador_jB.addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseMoved(MouseEvent e) 
            {
                int pixel = processadorImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 ) 
                {
                    Processador_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Processador (regular).png")));
                    Processador_jB.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
                else {
                    Processador_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Processador (hovering).png")));
                    Processador_jB.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                super.mouseMoved(e);
            }
        });

        //Detalhes: Botão de Memória
        final BufferedImage memoriaImg = ImageIO.read(getClass().getResource("/Visual/Imagens/Memória (regular).png"));
        
        Memoria_jB.setContentAreaFilled(false);      
        Memoria_jB.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e) 
            {
                int pixel = memoriaImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 ) 
                {
                    return;
                }
                else 
                { 
                    Memoria_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Memória (clicking).png")));
                }
                super.mousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) 
            {
                int pixel = memoriaImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 )
                {
                    Memoria_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Memória (regular).png")));
                }
                else {
                    Memoria_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Memória (hovering).png")));             
                }
                super.mouseReleased(e);
            }
        });
        
        Memoria_jB.addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseMoved(MouseEvent e) 
            {
                int pixel = memoriaImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 ) 
                {
                    Memoria_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Memória (regular).png")));
                    Memoria_jB.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
                else {
                    Memoria_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Memória (hovering).png")));
                    Memoria_jB.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                super.mouseMoved(e);
            }
        });

        //Detalhes: Botão de Enviar Comandos
        final BufferedImage enviarImg = ImageIO.read(getClass().getResource("/Visual/Imagens/BotãoEnviar (regular).png"));
        
        Enviar_jB.setContentAreaFilled(false);
        Enviar_jB.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e) 
            {
                int pixel = enviarImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 ) 
                {
                    return;
                }
                else 
                { 
                    Enviar_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/BotãoEnviar (clicking).png")));
                }
                super.mousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) 
            {
                int pixel = enviarImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 )
                {
                    Enviar_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/BotãoEnviar (regular).png")));
                }
                else {
                    Enviar_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/BotãoEnviar (hovering).png")));             
                }
                super.mouseReleased(e);
            }
        });
        
        Enviar_jB.addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseMoved(MouseEvent e) 
            {
                int pixel = enviarImg.getRGB(e.getPoint().x, e.getPoint().y);
                if( (pixel>>24) == 0x00 ) 
                {
                    Enviar_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/BotãoEnviar (regular).png")));
                    Enviar_jB.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
                else {
                    Enviar_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/BotãoEnviar (hovering).png")));
                    Enviar_jB.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                super.mouseMoved(e);
            }
        });
        
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JTextField Comandos_jT = new RoundJTextField(0);
        Processador_jB = new javax.swing.JButton();
        Enviar_jB = new javax.swing.JButton();
        Memoria_jB = new javax.swing.JButton();
        Mnemônicos_jP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ImagemPrincipal_jL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Comandos_jT.setColumns(20);
        Comandos_jT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comandos_jTActionPerformed(evt);
            }
        });
        getContentPane().add(Comandos_jT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 180, 30));

        Processador_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Processador (regular).png"))); // NOI18N
        Processador_jB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Processador_jBActionPerformed(evt);
            }
        });
        getContentPane().add(Processador_jB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 260, 250));

        Enviar_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/BotãoEnviar (regular).png"))); // NOI18N
        Enviar_jB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviar_jBActionPerformed(evt);
            }
        });
        getContentPane().add(Enviar_jB, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 70, 70));

        Memoria_jB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/Memória (regular).png"))); // NOI18N
        Memoria_jB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Memoria_jBActionPerformed(evt);
            }
        });
        getContentPane().add(Memoria_jB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 520, 200));

        Mnemônicos_jP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mnemônicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NOP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("STA");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("LDA");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("ADD");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("OR");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ADD");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("JMP");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("NOT");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("JN");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("JZ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("HLT");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("00");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("16 end");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("32 end");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("48 end");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("32 end");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("32 end");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("32 end");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("32 end");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("32 end");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("32 end");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("32 end");

        javax.swing.GroupLayout Mnemônicos_jPLayout = new javax.swing.GroupLayout(Mnemônicos_jP);
        Mnemônicos_jP.setLayout(Mnemônicos_jPLayout);
        Mnemônicos_jPLayout.setHorizontalGroup(
            Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Mnemônicos_jPLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26))
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        Mnemônicos_jPLayout.setVerticalGroup(
            Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mnemônicos_jPLayout.createSequentialGroup()
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Mnemônicos_jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jLabel29))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(Mnemônicos_jP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 480, 80));

        ImagemPrincipal_jL.setBackground(new java.awt.Color(255, 255, 255));
        ImagemPrincipal_jL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/Imagens/placa-verde-com-slots_v3.png"))); // NOI18N
        ImagemPrincipal_jL.setToolTipText("");
        getContentPane().add(ImagemPrincipal_jL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Comandos_jTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comandos_jTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Comandos_jTActionPerformed

    private void Processador_jBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Processador_jBActionPerformed
        // TODO add your handling code here:
        System.out.println("Processador O.K!");
    }//GEN-LAST:event_Processador_jBActionPerformed

    private void Enviar_jBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviar_jBActionPerformed
        // TODO add your handling code here:
        System.out.println("Enviar O.K!");
    }//GEN-LAST:event_Enviar_jBActionPerformed

    private void Memoria_jBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Memoria_jBActionPerformed
        // TODO add your handling code here:
        System.out.println("Memória O.K!");
    }//GEN-LAST:event_Memoria_jBActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new InterfacePrincipal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(InterfacePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar_jB;
    private javax.swing.JLabel ImagemPrincipal_jL;
    private javax.swing.JButton Memoria_jB;
    private javax.swing.JPanel Mnemônicos_jP;
    private javax.swing.JButton Processador_jB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
