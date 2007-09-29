/*
 * VoipKeyboard.java
 *
 * Created on 28 de Setembro de 2007, 00:52
 */

package ine5612.components.virtualkeyboard.gui;

import ine5612.components.virtualkeyboard.VirtualMultilayoutKeyboard;

/**
 *
 * @author  brodock
 */
public class VoipKeyboard extends javax.swing.JPanel {
    
    VirtualMultilayoutKeyboard vmlk;
    
    /** Creates new form VoipKeyboard */
    public VoipKeyboard(VirtualMultilayoutKeyboard vmlk) {
        this.vmlk = vmlk;
        initComponents();
    }
    
    public void setActionCommandAll() {
        b0.setActionCommand("0");
        b1.setActionCommand("1");
        b2.setActionCommand("2");
        b3.setActionCommand("3");
        b4.setActionCommand("4");
        b5.setActionCommand("5");
        b6.setActionCommand("6");
        b7.setActionCommand("7");
        b8.setActionCommand("8");
        b9.setActionCommand("9");
        bAsterisc.setActionCommand("*");
        bSharp.setActionCommand("#");
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bAsterisc = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bSharp = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(4, 3, 3, 3));

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b1);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b2);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b3);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b4);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b5);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b6);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b7);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b8);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b9);

        bAsterisc.setText("*");
        bAsterisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(bAsterisc);

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(b0);

        bSharp.setText("#");
        bSharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoipKeyboard.this.actionPerformed(evt);
            }
        });

        add(bSharp);

    }// </editor-fold>//GEN-END:initComponents

    private void actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformed
        // TODO: FireEvent
        vmlk.recvEvent(evt);
    }//GEN-LAST:event_actionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAsterisc;
    private javax.swing.JButton bSharp;
    // End of variables declaration//GEN-END:variables
    
}