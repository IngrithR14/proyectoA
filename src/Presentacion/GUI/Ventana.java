package Presentacion.GUI;


import Logica.Controlador;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame implements ActionListener, ChangeListener {

    private final JPanel panel;

    private final JTextField txt;
    private final JButton boton;
    private final JButton boton1;
    private final JButton boton2;
    private final JButton boton3;
    private final JButton boton4;
    private final JButton boton5;
    private final JButton boton6;
    private final JButton boton7;
    private final JButton boton8;
    private final JButton boton9;
    private final JButton boton10;
    private final JButton boton11;
    private final JButton boton12;
    private final JButton boton13;
    private final JButton boton14;
    private final JButton boton15;
    private final JButton boton16;
    private final JButton boton17;
    private final JButton boton18;
    private final JButton boton19;
    private final JTextField linea1;


    public Ventana() {
        Font font = new Font("Arial", Font.PLAIN, 20);
        Font font1 = new Font("Arial", Font.PLAIN, 20);

        this.linea1 = new JTextField();
        this.linea1.setBounds(0, 0, 240, 35);
        this.linea1.setBackground(new Color(200, 200, 200));
        this.linea1.setBorder(null);
        this.linea1.setHorizontalAlignment(JTextField.RIGHT);

        this.txt = new JTextField("");
        this.txt.setBounds(0, 35, 240, 55);
        this.txt.setBackground(new Color(200, 200, 200));
        this.txt.setBorder(null);
        this.txt.setFont(font);
        this.txt.setHorizontalAlignment(JTextField.RIGHT);

        this.boton = new JButton("(");
        this.boton.setBounds(0, 90, 60, 60);
        this.boton.setFont(font1);
        this.boton.setBackground(new Color(230, 230, 230));
        this.boton.addActionListener(this);

        this.boton1 = new JButton(")");
        this.boton1.setBounds(60, 90, 60, 60);
        this.boton1.setFont(font1);
        this.boton1.setBackground(new Color(230, 230, 230));
        this.boton1.addActionListener(this);

        this.boton2 = new JButton("C");
        this.boton2.setBounds(120, 90, 60, 60);
        this.boton2.setFont(font1);
        this.boton2.setBackground(new Color(230, 230, 230));
        this.boton2.addActionListener(this);

        this.boton3 = new JButton("<<");
        this.boton3.setBounds(180, 90, 60, 60);
        this.boton3.setFont(font1);
        this.boton3.setBackground(new Color(230, 230, 230));
        this.boton3.addActionListener(this);

        this.boton4 = new JButton("7");
        this.boton4.setBounds(0, 150, 60, 60);
        this.boton4.setFont(font1);
        this.boton4.setBackground(new Color(210, 210, 210));
        this.boton4.addActionListener(this);

        this.boton5 = new JButton("8");
        this.boton5.setBounds(60, 150, 60, 60);
        this.boton5.setFont(font1);
        this.boton5.setBackground(new Color(210, 210, 210));
        this.boton5.addActionListener(this);

        this.boton6 = new JButton("9");
        this.boton6.setBounds(120, 150, 60, 60);
        this.boton6.setFont(font1);
        this.boton6.setBackground(new Color(210, 210, 210));
        this.boton6.addActionListener(this);

        this.boton7 = new JButton("/");
        this.boton7.setBounds(180, 150, 60, 60);
        this.boton7.setFont(font1);
        this.boton7.setBackground(new Color(230, 230, 230));
        this.boton7.addActionListener(this);


        this.boton8 = new JButton("4");
        this.boton8.setBounds(0, 210, 60, 60);
        this.boton8.setFont(font1);
        this.boton8.setBackground(new Color(210, 210, 210));
        this.boton8.addActionListener(this);

        this.boton9 = new JButton("5");
        this.boton9.setBounds(60, 210, 60, 60);
        this.boton9.setFont(font1);
        this.boton9.setBackground(new Color(210, 210, 210));
        this.boton9.addActionListener(this);

        this.boton10 = new JButton("6");
        this.boton10.setBounds(120, 210, 60, 60);
        this.boton10.setFont(font1);
        this.boton10.setBackground(new Color(210, 210, 210));
        this.boton10.addActionListener(this);

        this.boton11 = new JButton("x");
        this.boton11.setBounds(180, 210, 60, 60);
        this.boton11.setFont(font1);
        this.boton11.setBackground(new Color(230, 230, 230));
        this.boton11.addActionListener(this);

        this.boton12 = new JButton("1");
        this.boton12.setBounds(0, 270, 60, 60);
        this.boton12.setFont(font1);
        this.boton12.setBackground(new Color(210, 210, 210));
        this.boton12.addActionListener(this);

        this.boton13 = new JButton("2");
        this.boton13.setBounds(60, 270, 60, 60);
        this.boton13.setFont(font1);
        this.boton13.setBackground(new Color(210, 210, 210));
        this.boton13.addActionListener(this);

        this.boton14 = new JButton("3");
        this.boton14.setBounds(120, 270, 60, 60);
        this.boton14.setFont(font1);
        this.boton14.setBackground(new Color(210, 210, 210));
        this.boton14.addActionListener(this);

        this.boton15 = new JButton("-");
        this.boton15.setBounds(180, 270, 60, 60);
        this.boton15.setFont(font1);
        this.boton15.setBackground(new Color(230, 230, 230));
        this.boton15.addActionListener(this);

        this.boton16 = new JButton("0");
        this.boton16.setBounds(0, 330, 60, 60);
        this.boton16.setFont(font1);
        this.boton16.setBackground(new Color(210, 210, 210));
        this.boton16.addActionListener(this);

        this.boton17 = new JButton("CL");
        this.boton17.setBounds(60, 330, 60, 60);
        this.boton17.setFont(font1);
        this.boton17.setBackground(new Color(210, 210, 210));
        this.boton17.setForeground(Color.RED);
        this.boton17.addActionListener(this);

        this.boton18 = new JButton("=");
        this.boton18.setBounds(120, 330, 60, 60);
        this.boton18.setFont(font1);
        this.boton18.setBackground(new Color(30, 90, 130));
        this.boton18.setForeground(Color.WHITE);
        this.boton18.addActionListener(this);

        this.boton19 = new JButton("+");
        this.boton19.setBounds(180, 330, 60, 60);
        this.boton19.setFont(font1);
        this.boton19.setBackground(new Color(230, 230, 230));
        this.boton19.addActionListener(this);


        this.panel = new JPanel();
        this.panel.setBackground(new Color(140, 140, 140));
        this.add(this.linea1);
        this.add(this.txt);

        this.add(this.boton);
        this.add(this.boton1);
        this.add(this.boton2);
        this.add(this.boton3);
        this.add(this.boton4);
        this.add(this.boton5);
        this.add(this.boton6);
        this.add(this.boton7);
        this.add(this.boton8);
        this.add(this.boton9);
        this.add(this.boton10);
        this.add(this.boton11);
        this.add(this.boton12);
        this.add(this.boton13);
        this.add(this.boton14);
        this.add(this.boton15);
        this.add(this.boton16);
        this.add(this.boton17);
        this.add(this.boton18);
        this.add(this.boton19);


        this.add(this.panel);
        this.setSize(256, 430);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new Ventana();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton) {
            txt.setText(txt.getText() + " ( ");
        }
        if (e.getSource() == this.boton1) {
            txt.setText(txt.getText() + " ) ");
        }
        if (e.getSource() == this.boton2) {
            txt.setText("");
        }
        if (e.getSource() == this.boton3) {
            if (linea1.getText().equals("")) {

            }else {
                txt.setText(linea1.getText());
                linea1.setText("");
            }

        }
        if (e.getSource() == this.boton4) {
            txt.setText(txt.getText() + "7");
        }
        if (e.getSource() == this.boton5) {
            txt.setText(txt.getText() + "8");
        }
        if (e.getSource() == this.boton6) {
            txt.setText(txt.getText() + "9");
        }
        if (e.getSource() == this.boton7) {
            txt.setText(txt.getText() + " / ");
        }
        if (e.getSource() == this.boton8) {
            txt.setText(txt.getText() + "4");
        }
        if (e.getSource() == this.boton9) {
            txt.setText(txt.getText() + "5");
        }
        if (e.getSource() == this.boton10) {
            txt.setText(txt.getText() + "6");
        }
        if (e.getSource() == this.boton11) {
            txt.setText(txt.getText() + " * ");
        }
        if (e.getSource() == this.boton12) {
            txt.setText(txt.getText() + "1");
        }
        if (e.getSource() == this.boton13) {
            txt.setText(txt.getText() + "2");
        }
        if (e.getSource() == this.boton14) {
            txt.setText(txt.getText() + "3");
        }
        if (e.getSource() == this.boton15) {
            txt.setText(txt.getText() + " - ");
        }
        if (e.getSource() == this.boton16) {
            txt.setText(txt.getText() + "0");
        }
        if (e.getSource() == this.boton17) {
            this.dispose();
        }
        if (e.getSource() == this.boton18) {
            linea1.setText(txt.getText());
            Controlador controlador= new Controlador();
            controlador.setText(txt.getText());
            txt.setText(controlador.parentesis());
            controlador.controlador();

        }
        if (e.getSource() == this.boton19) {
            txt.setText(txt.getText() + " + ");
        }

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

}
