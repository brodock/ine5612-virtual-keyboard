/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ine5612.components.virtualkeyboard.gui;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import ine5612.components.virtualkeyboard.VirtualMultilayoutKeyboard;

/**
 * Bank Keyboard
 * @author Gabriel, Ramon
 */
public class BankKeyboard extends javax.swing.JPanel {
    
    
    /** Creates new form BankKeyboard */
    public BankKeyboard() {

        initComponents();
        randomize_keyboard();
    }
    
        
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(2, 5, 3, 3));

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b0);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b1);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b2);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b3);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b4);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b5);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b6);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b7);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b8);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankKeyboard.this.actionPerformed(evt);
            }
        });

        add(b9);

    }// </editor-fold>//GEN-END:initComponents
    
    private void actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformed
        this.fireEvent(evt);
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
    // End of variables declaration//GEN-END:variables
    
    
    public void randomize_keyboard() {
        
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        
        // adding the buttons to arraylist to be recovered after
        buttons.add(b0);
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        
        
        // here starts the shuffle algorithm
        int random;
        JButton button;
        
        JPanel p = (JPanel)b0.getParent();
        this.removeAll();
        
        for (int x=0; x<=9; x++) {
            random = (int)(Math.random()*(buttons.size()));
            button = buttons.get(random);
            //System.out.println("Random: "+Integer.toString(random)+" Size: "+Integer.toString(buttons.size()));
            buttons.remove(random);
            this.add(button);
            
        }
        
    }
    
    /**
     * Utility field used by event firing mechanism.
     */
    private javax.swing.event.EventListenerList listenerList =  null;
    
    /**
     * Registers ActionListener to receive events.
     * @param listener The listener to register.
     */
    public synchronized void addActionListener(java.awt.event.ActionListener listener) {
        if (listenerList == null ) {
            listenerList = new javax.swing.event.EventListenerList();
        }
        listenerList.add(java.awt.event.ActionListener.class, listener);
    }
    
    /**
     * Removes ActionListener from the list of listeners.
     * @param listener The listener to remove.
     */
    public synchronized void removeActionListener(java.awt.event.ActionListener listener) {
        listenerList.remove(java.awt.event.ActionListener.class, listener);
    }
    
    /**
     * Notifies all registered listeners about the event.
     *
     * @param event The event to be fired
     */
    private void fireEvent(java.awt.event.ActionEvent event) {
        if (listenerList == null) return;
        Object[] listeners = listenerList.getListenerList();
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i]==java.awt.event.ActionListener.class) {
                ((java.awt.event.ActionListener)listeners[i+1]).actionPerformed(event);
            }
        }
    }
    
    
    
}
