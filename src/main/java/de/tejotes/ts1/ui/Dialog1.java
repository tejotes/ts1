package de.tejotes.ts1.ui;

import javax.swing.*;
import java.awt.event.*;

public class Dialog1 extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nachname;
    private JLabel labelNachname;
    private JTextField vorname;
    private JLabel labelVorname;
    private JTextArea messageArea;
    private JTextField strasse;
    private JLabel labelStrasse;
    private JTextField plz;
    private JLabel labelPlz;

    public Dialog1() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
// add your code here
        System.out.println("OK: "+nachname.getText());
        if (nachname.getText().equals("ende")){
            dispose();
        }
        else {
            messageArea.setText("Name != <b>ende</b>");
        }

    }

    private void onCancel() {
// add your code here if necessary
        System.out.println("Cancel");
        dispose();
    }

    public static void main(String[] args) {
        Dialog1 dialog = new Dialog1();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
