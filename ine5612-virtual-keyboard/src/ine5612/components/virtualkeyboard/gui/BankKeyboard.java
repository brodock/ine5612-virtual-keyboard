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
        java.awt.GridBagConstraints gridBagConstraints;

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

        setLayout(new java.awt.GridLayout(2, 5));

        b0.setText("0");
        add(b0);

        b1.setText("1");
        add(b1);

        b2.setText("2");
        add(b2);

        b3.setText("3");
        add(b3);

        b4.setText("4");
        add(b4);

        b5.setText("5");
        add(b5);

        b6.setText("6");
        add(b6);

        b7.setText("7");
        add(b7);

        b8.setText("8");
        add(b8);

        b9.setText("9");
        add(b9);

    }// </editor-fold>//GEN-END:initComponents
    
    
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
        int limite = 10;
        JButton button;
        
        JPanel p = (JPanel)b0.getParent();
        this.removeAll();
        
        for (int x=0; x<=9; x++) {
            random = (int)(Math.random()*limite);
            limite--;
            button = buttons.get(random);
            button.remove(random);
            this.add(button);
            
        }
        
    }
    
}
