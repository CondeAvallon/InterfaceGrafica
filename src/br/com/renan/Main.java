package br.com.renan;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        MinhaThread mt = new MinhaThread();
        SwingUtilities.invokeLater(mt);

    }

    public static void criarGUI() {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Programa Topzera");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel label = new JLabel("Olá, Mundo!");
        panel.add(label);

        final JTextField field = new JTextField(10);
        panel.add(field);

        JButton button = new JButton("Clique aqui!");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String oi = JOptionPane.showInputDialog(frame, "Digite o seu nome: ");
                JOptionPane.showMessageDialog(frame, "Seu nome: " + oi);
            }
        });
        panel.add(button);
        
        JCheckBox checkBox01 = new JCheckBox("Item 01");
        panel.add(checkBox01);
        
        /*ItemListener itemListener = new ItemListener (){
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    JOptionPane.showMessageDialog(frame, "Selecionado!");
                }
            }
            
        };
        checkBox01.addItemListener(itemListener);
        */
        
        JCheckBox checkBox02 = new JCheckBox("Item 02");
        panel.add(checkBox02);

        //checkBox01.addItemListener(itemListener);
        
        JButton button2 = new JButton("Avaliar");
        panel.add(button2);
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Item 01 selecionado:  " + checkBox01.isSelected() + "\nItem 02 Selecionado: " + checkBox02.isSelected());
            }
        });
        

        frame.pack();
        frame.setVisible(true);
    }

}
