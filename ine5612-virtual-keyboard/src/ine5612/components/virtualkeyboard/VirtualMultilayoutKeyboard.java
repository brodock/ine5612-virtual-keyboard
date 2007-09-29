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

package ine5612.components.virtualkeyboard;

import ine5612.components.virtualkeyboard.gui.BankKeyboard;
import ine5612.components.virtualkeyboard.gui.CalcKeyboard;
import ine5612.components.virtualkeyboard.gui.VoipKeyboard;
import java.awt.Dimension;
/*
 * VirtualMultilayoutKeyboard.java
 *
 * Created on 23 de Setembro de 2007, 14:04
 */

/**
 * @author wabba
 */
public class VirtualMultilayoutKeyboard extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    //private enum TypeVK {BANK,VOIP,CALC}
    
    /**
     * Creates new customizer VirtualMultilayoutKeyboard
     */
    public VirtualMultilayoutKeyboard() {
        setVKType(1);
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout());

    }// </editor-fold>//GEN-END:initComponents
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /**
     * Holds value of property VKType.
     */
    private int VKType; // 1=BANK / 2=CALC / 3=VOIP

    /**
     * Getter for property VKType.
     * @return Value of property VKType.
     */
    public int getVKType() {
        return this.VKType;
    }

    /**
     * Setter for property VKType.
     * @param VKType New value of property VKType.
     */
    public void setVKType(int VKType) {
        if (VKType >= 1 && VKType <= 3) this.VKType = VKType;
        
        switch (this.VKType) {
            case 1:
                //this.initBankComponents();
                this.removeAll();
                this.add(new BankKeyboard(this));
                break;
            case 2:
                this.removeAll();
                this.add(new CalcKeyboard(this));
                break;
            case 3:
                this.removeAll();
                this.add(new VoipKeyboard(this));
                break;
            default:
                break;
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
        listenerList.add (java.awt.event.ActionListener.class, listener);
    }

    /**
     * Removes ActionListener from the list of listeners.
     * @param listener The listener to remove.
     */
    public synchronized void removeActionListener(java.awt.event.ActionListener listener) {
        listenerList.remove (java.awt.event.ActionListener.class, listener);
    }

    /**
     * Notifies all registered listeners about the event.
     * 
     * @param event The event to be fired
     */
    private void fireEvent(java.awt.event.ActionEvent event) {
        if (listenerList == null) return;
        Object[] listeners = listenerList.getListenerList ();
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i]==java.awt.event.ActionListener.class) {
                ((java.awt.event.ActionListener)listeners[i+1]).actionPerformed (event);
            }
        }
    }
    
    public void recvEvent(java.awt.event.ActionEvent evt) {
        fireEvent(evt);
    }
    
}
