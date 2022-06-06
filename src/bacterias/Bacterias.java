package bacterias;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Brandon
 */
public final class Bacterias extends javax.swing.JFrame {

//    private Bacteria ListaBacterias[];
    ArrayList<Bacteria> ListaBacterias = new ArrayList<Bacteria>();
    ArrayList<Graphics> ListaFiguras = new ArrayList<Graphics>();

    public int ID = 0;
    public String dato;
    public int temperatura;
    public int humedad;
    public int co2;
    public int o2;
    int lista;
    public static String mensajeDeTiempo;

    public Bacterias() {
        this.setResizable(false);//no me deja modificarle el tamaño con el cuadro
        initComponents();
        this.setLocationRelativeTo(null);//me centra la pestaña
        fondo.setBackground(Color.CYAN);
        panel();
        reload();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        THCO = new javax.swing.JButton();
        temptxt = new javax.swing.JTextField();
        humtxt = new javax.swing.JTextField();
        co2txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        o2txt = new javax.swing.JTextField();
        Agregar_Bacteria = new javax.swing.JButton();
        T = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        TTtxtA = new javax.swing.JLabel();
        HHtxtA = new javax.swing.JLabel();
        CCtxtA = new javax.swing.JLabel();
        OOtxtA = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        m5 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        IMFORMACION = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        THCO.setText("INICIAR");
        THCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THCOActionPerformed(evt);
            }
        });

        temptxt.setText("0");
        temptxt.setName(""); // NOI18N
        temptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temptxtActionPerformed(evt);
            }
        });

        humtxt.setText("0");

        co2txt.setText("0");

        jLabel1.setText("TEMPERATURA");

        jLabel2.setText("HUMEDAD");

        jLabel3.setText("CO2");

        jLabel4.setText("O2");

        o2txt.setText("0");

        Agregar_Bacteria.setText("AGREGAR BACTERIA");
        Agregar_Bacteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_BacteriaActionPerformed(evt);
            }
        });

        T.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        O.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        H.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TTtxtA.setText("0");

        HHtxtA.setText("0");

        CCtxtA.setText("0");

        OOtxtA.setText("0");

        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        m5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setText("REPORTE DE ESTADO");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IMFORMACION.setText("INFORMACION");
        IMFORMACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMFORMACIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(temptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(humtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(co2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(o2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(THCO)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Agregar_Bacteria)
                .addGap(10, 10, 10))
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(TTtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HHtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(CCtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OOtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IMFORMACION, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTtxtA)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(T, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HHtxtA)
                    .addComponent(CCtxtA)
                    .addComponent(OOtxtA)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(IMFORMACION, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agregar_Bacteria)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(temptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(o2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(humtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(co2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(THCO)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temptxtActionPerformed

    }//GEN-LAST:event_temptxtActionPerformed

    //btn enviar
    private void THCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THCOActionPerformed
        resivir();
        temperatura();
        repaint();
    }//GEN-LAST:event_THCOActionPerformed

    private void Agregar_BacteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_BacteriaActionPerformed
        validarCreacion();
    }//GEN-LAST:event_Agregar_BacteriaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new HILO()).start();
    }//GEN-LAST:event_formWindowOpened

    private void IMFORMACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMFORMACIONActionPerformed
        JOptionPane.showMessageDialog(null, "Desarollo de las bacterias:\n"
                + "|Psicrofilas:|Se desarrollan entre los 0-20 °C.|\n"
                + "|Mesofilas:|Se desarrollan entre los 20-45 °C.|\n"
                + "|Termofilas:|Se desarrollan entre los 45-70 °C.|\n"
                + "\n"
                + "Crecimiento de las bacterias:\n"
                + "|Nivel 1|-> 5°C|\n"
                + "|Nivel 2|-> 10 °C|\n"
                + "|Nivel 3|-> 15 °C|\n"
                + "\n"
                + "Muerte de las Bacterias:\n"
                + "|Bacteria:..|Por temperatura:............|Por exceso de CO2:|Por falta de O2:|\n"
                + "|Psicrofilas|->Mueren entre los 40-75 °C.|->Mayor a 10%.....|->Menor a 10%...|\n"
                + "|Mesofilas..|->Mueren a menos de 10 °C...|->Mayor a 10%.....|->Menor a 10%...|\n"
                + "|Termofilas.|->Mueren entre los 0-20 °C..|->Mayor a 10%.....|->Menor a 10%...|\n"
                + "\n"
                + "Reproducción de las bacterias:\n"
                + "|Bacteria:..|Se reproduce:|\n" 
                + "|Psicrofilas|-> A 10% de humedad.|\n"
                + "|Mesofilas..|-> A 20% de humedad.|\n"
                + "|Termofilas.|-> A 30% de humedad.|\n"
                + "\n"
                + "Reacción de telescopio de observación:\n"
                + "\n"
                + "Cambio del fondo por temperatura progresiva: \n"
                + "|Temperatura: |0-25 °C |26-50 °C |51-75 °C |76-100 °C|\n"
                + "\n"
                + "|Precencia de humedad: |\n"
                + "|Se presenta a un grado mayor al 5%|\n"
                + "\n"
                + "|Precencia de gases: |\n"
                + "|O2_|Se presentan a un grado mayor al 1%.|Burbujas blancas.| \n"
                + "|CO2|Se presentan a un grado mayor al 1%.|Burbujas negras. | \n"
                + "\n"
                + "\n"
                + "\n", "ALERTA INFORMATIVA", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_IMFORMACIONActionPerformed

    public void validarCreacion() {

        try {
            int bacteria = Integer.parseInt(JOptionPane.showInputDialog("Elija la bacteria que desea crear."
                    + "\n 1 - Psicrofilas."
                    + "\n 2 - Mesofilas."
                    + "\n 3 - Termofilas."));
            if (bacteria >= 4) {
                JOptionPane.showMessageDialog(null, "Tipo de bacteria selecionado no existente, \n"
                        + "selecione uno de los precentes", "ALERTA DE ERROR", JOptionPane.INFORMATION_MESSAGE);
                validarCreacion();
            } else {
                CrearBacterias(bacteria);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de validacion de los datos,\n Datos no numericos!!!!! ", "ALERTA DE ERROR", JOptionPane.INFORMATION_MESSAGE);
            validarCreacion();
        }
    }

    public void musgo(int humedad) {

        if (humedad >= 5) {
            m1.setVisible(true);
            m2.setVisible(true);
            m3.setVisible(true);
            m4.setVisible(true);
            m5.setVisible(true);
        } else {
            m1.setVisible(false);
            m2.setVisible(false);
            m3.setVisible(false);
            m4.setVisible(false);
            m5.setVisible(false);
        }
    }

    public void temperatura() {
        String temp1;
        temp1 = temptxt.getText();

        int t = Integer.parseInt(temp1);

        if (t <= 25) {
            fondo.setBackground(Color.CYAN);
        } else if (t >= 26 && t <= 50) {
            fondo.setBackground(Color.BLUE);
        } else if (t >= 51 && t <= 75) {
            fondo.setBackground(Color.PINK);
        } else if (t >= 76 && t <= 100) {
            fondo.setBackground(Color.red);
        }
    }

    public void panel() {
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/Temperatura.png"));
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(T.getWidth(), T.getHeight(), Image.SCALE_DEFAULT));
        T.setIcon(icono);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/Humedad.png"));
        ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(H.getWidth(), H.getHeight(), Image.SCALE_DEFAULT));
        H.setIcon(icono2);

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagenes/CO2.png"));
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(C.getWidth(), C.getHeight(), Image.SCALE_DEFAULT));
        C.setIcon(icono3);

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagenes/O2.png"));
        ImageIcon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(O.getWidth(), O.getHeight(), Image.SCALE_DEFAULT));
        O.setIcon(icono4);

        //************************************************************
        //musgo
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Musgo/musgo.PNG"));
        ImageIcon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(m1.getWidth(), m1.getHeight(), Image.SCALE_DEFAULT));
        m1.setIcon(icono5);

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/Musgo/musgo.PNG"));
        ImageIcon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(m2.getWidth(), m2.getHeight(), Image.SCALE_DEFAULT));
        m2.setIcon(icono6);

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/Musgo/musgo.PNG"));
        ImageIcon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(m3.getWidth(), m3.getHeight(), Image.SCALE_DEFAULT));
        m3.setIcon(icono7);

        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/Musgo/musgo.PNG"));
        ImageIcon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(m4.getWidth(), m4.getHeight(), Image.SCALE_DEFAULT));
        m4.setIcon(icono8);

        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/Musgo/musgo.PNG"));
        ImageIcon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(m5.getWidth(), m5.getHeight(), Image.SCALE_DEFAULT));
        m5.setIcon(icono9);

        //dejar aqui 
        musgo(0);
    }

    public void resivir() {

        try {
            temperatura = Integer.parseInt(temptxt.getText());
            humedad = Integer.parseInt(humtxt.getText());
            co2 = Integer.parseInt(co2txt.getText());
            o2 = Integer.parseInt(o2txt.getText());

            TTtxtA.setText(temptxt.getText());
            HHtxtA.setText(humtxt.getText());
            CCtxtA.setText(co2txt.getText());
            OOtxtA.setText(o2txt.getText());

            musgo(humedad);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errora la validadcion de los datos,\n Datos no numericos!!!!! ", "ALERTA DE ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void CrearBacterias(int TIPO) {
        if (ListaBacterias.size() < 250) {
            Random numAleatorio = new Random();

            //int tipo = numAleatorio.nextInt(3 - 1 + 1) + 1;
            //x15--710
            //y60--480
            int X = numAleatorio.nextInt(710 - 15 + 1) + 15;
            int Y = numAleatorio.nextInt(460 - 95 + 1) + 95;

            //id--nivel--estado--tipo--x--y--partos--horaDeCreacion
            int TiempoVida = Integer.parseInt(mensajeDeTiempo);

            Bacteria bac = new Bacteria(ID, 1, 1, TIPO, X, Y, 0, TiempoVida);

            ID++;
            ListaBacterias.add(bac);
        }
    }

    public void Crecer(int id) {
        //Nivel1--5
        //Nivel2--15
        //Nivel3--30
        //System.out.println(id);
        for (int i = 0; i < ListaBacterias.size(); i++) {
            if (ListaBacterias.get(i).getId() == id) {
                if (ListaBacterias.get(i).getNivel() <= 30) {
                    ListaBacterias.get(i).setNivel(ListaBacterias.get(i).getNivel() + 1);
                }
            }
        }
    }

    public void MatarBacterias(int id) {
        int cc = Integer.parseInt(CCtxtA.getText());
        int oo = Integer.parseInt(OOtxtA.getText());
        //30
        //<10
        if (cc >= 10 && oo < 10) {
            for (int i = 0; i < ListaBacterias.size(); i++) {
                if (ListaBacterias.get(i).getId() == id) {
                    if (ListaBacterias.get(i).getEstado() == 5) {
                        //
                        int TiempoVida = Integer.parseInt(mensajeDeTiempo);

                        int nombre = ListaBacterias.get(i).getId();
                        int TiempoNacimiento = ListaBacterias.get(i).getHoraDeNacimiento();
                        TiempoVida = TiempoVida - TiempoNacimiento;
                        int tipo = ListaBacterias.get(i).getTipo();
                        String tipo1;

                        if (tipo == 1) {
                            tipo1 = "Psicrofilas";
                        } else if (tipo == 2) {
                            tipo1 = "Mesofilas";
                        } else {
                            tipo1 = "Termofilas";
                        }

                        ListaBacterias.remove(i);
                        //JOptionPane.showMessageDialog(null, "La bacteria numero " + nombre + " de la categoria " + tipo1 + "\nVivio " + TiempoVida + " segundos", "Datos de la Bacteria", JOptionPane.INFORMATION_MESSAGE);
                        String area = "------------------------------------------------------------------------\n" + "La bacteria numero " + nombre + " de la categoria " + tipo1 + "\nVivio " + TiempoVida + " segundos";
                        //String AREA = area + jTextArea1.getText();

                        jTextArea1.append(area);
                        jTextArea1.append(System.getProperty("line.separator")); // Esto para el salto de línea

                    } else {
                        ListaBacterias.get(i).setEstado(ListaBacterias.get(i).getEstado() + 1);
                    }
                }

            }
        }
    }

    public void EvolucionarOMatarBaterias() {
        for (int i = 0; i < ListaBacterias.size(); i++) {
            if (!ListaBacterias.isEmpty() && i < ListaBacterias.size()) {
                int temp = Integer.parseInt(TTtxtA.getText());
                if (ListaBacterias.get(i).getTipo() == 1) {
                    //Psicrofilas
                    if (temp >= 0 && temp <= 20) {
                        Crecer(ListaBacterias.get(i).getId());
                    }
                    if (temp >= 40 && temp <= 75) {
                        MatarBacterias(ListaBacterias.get(i).getId());
                    }
                    //Psicrofilas
                } else if (ListaBacterias.get(i).getTipo() == 2) {
                    //Mesofilas
                    if (temp >= 20 && temp <= 45) {
                        Crecer(ListaBacterias.get(i).getId());
                    }
                    if (temp <= 10) {
                        MatarBacterias(ListaBacterias.get(i).getId());
                    }
                    //Mesofilas
                } else {
                    //Termofilas
                    if (temp >= 45 && temp <= 70) {
                        Crecer(ListaBacterias.get(i).getId());
                    }
                    if (temp > 0 && temp <= 20) {
                        MatarBacterias(ListaBacterias.get(i).getId());
                    }
                    //Termofilas      
                }
            }
        }
    }

    public void ReproduccionBacterias(int id, int tipo) {

        int h = Integer.parseInt(HHtxtA.getText());
        Random numAleatorio = new Random();
        int N = numAleatorio.nextInt(4 - 1 + 1) + 1;

        switch (tipo) {
            case 1:
                if (h == 10) {
                    for (int i = 0; i < ListaBacterias.size(); i++) {
                        if (ListaBacterias.get(i).getId() == id && ListaBacterias.get(i).getParto() == 0) {
                            ListaBacterias.get(i).setParto(N);
                            for (int j = 0; j < N; j++) {
                                CrearBacterias(tipo);
                            }
                        }
                    }
                }
                break;
            case 2:
                if (h == 20) {
                    for (int i = 0; i < ListaBacterias.size(); i++) {
                        if (ListaBacterias.get(i).getId() == id && ListaBacterias.get(i).getParto() == 0) {
                            ListaBacterias.get(i).setParto(N);
                            for (int j = 0; j < N; j++) {
                                CrearBacterias(tipo);
                            }
                        }
                    }
                }
                break;
            default:
                if (h == 30) {
                    for (int i = 0; i < ListaBacterias.size(); i++) {
                        if (ListaBacterias.get(i).getId() == id && ListaBacterias.get(i).getParto() == 0) {
                            ListaBacterias.get(i).setParto(N);
                            for (int j = 0; j < N; j++) {
                                CrearBacterias(tipo);
                            }
                        }
                    }
                }
                break;
        }
    }

    public void MoverBacterias() {
        Random numAleatorio = new Random();
        //x15--710
        //y60--480
        for (int i = 0; i < ListaBacterias.size(); i++) {
            int X = numAleatorio.nextInt(710 - 15 + 1) + 15;
            int Y = numAleatorio.nextInt(460 - 95 + 1) + 95;
            if (ListaBacterias.get(i).getEstado() == 1) {
                ListaBacterias.get(i).setX(X);
                ListaBacterias.get(i).setY(Y);
            }
        }

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        //Burbujas de CO2 y O2
        //----------------------------------------------------------------------
        //resivir();
        int o2Local = Integer.parseInt(CCtxtA.getText());
        int co2Local = Integer.parseInt(OOtxtA.getText());

        if (o2Local >= 1) {
            g.setColor(Color.WHITE);
            g.drawOval(710, 395, 30, 30);
            g.drawOval(740, 425, 30, 30);
            g.drawOval(710, 460, 30, 30);
        }
        if (co2Local >= 1) {
            g.setColor(Color.BLACK);
            g.drawOval(740, 395, 30, 30);
            g.drawOval(710, 425, 30, 30);
            g.drawOval(740, 460, 30, 30);
        }
        //----------------------------------------------------------------------
        //Burbujas de CO2 y O2

        if (!ListaBacterias.isEmpty()) {
            EvolucionarOMatarBaterias();
        }
        if (!ListaBacterias.isEmpty()) {
            int tamaño = ListaBacterias.size();
            for (int i = 0; i < tamaño; i++) {
                ReproduccionBacterias(ListaBacterias.get(i).getId(), ListaBacterias.get(i).getTipo());
            }
        }

        //region des
        if (!ListaBacterias.isEmpty()) {
            MoverBacterias();
            //
            //dibujar bacterias
            //
            g.setColor(Color.DARK_GRAY);
            for (int i = 0; i < ListaBacterias.size(); i++) {
                if (ListaBacterias.get(i).getTipo() == 1) {
                    if (ListaBacterias.get(i).getNivel() <= 5) {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 20, 20);
                    } else if (ListaBacterias.get(i).getNivel() <= 15) {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 40, 40);
                    } else {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 60, 60);
                    }
                }
            }
            g.setColor(Color.GREEN);
            for (int i = 0; i < ListaBacterias.size(); i++) {
                if (ListaBacterias.get(i).getTipo() == 2) {
                    if (ListaBacterias.get(i).getNivel() <= 5) {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 20, 20);
                    } else if (ListaBacterias.get(i).getNivel() <= 15) {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 40, 40);
                    } else {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 60, 60);
                    }
                }
            }
            g.setColor(Color.WHITE);
            for (int i = 0; i < ListaBacterias.size(); i++) {
                if (ListaBacterias.get(i).getTipo() == 3) {
                    if (ListaBacterias.get(i).getNivel() <= 5) {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 20, 20);
                    } else if (ListaBacterias.get(i).getNivel() <= 15) {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 40, 40);
                    } else {
                        g.fillOval(ListaBacterias.get(i).X, ListaBacterias.get(i).Y, 60, 60);
                    }
                }
            }
        }
    }

    public void reload() {
        Timer timer;
        timer = new Timer(1000, (ActionEvent ae) -> {

            repaint();

        });
        timer.start();
    }

    public static void servidor() {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        final int puente = 5000;

        try {
            servidor = new ServerSocket(puente);
            System.out.println("Servidor inicializado");

            while (true) {

                sc = servidor.accept();
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                String mensaje = in.readUTF();

                mensajeDeTiempo = mensaje;

                System.out.println(" Tiempo en segundos:" + mensajeDeTiempo);

                out.writeUTF(mensaje);
                sc.close();
            }

        } catch (IOException ex) {
            
        }
    }

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
            java.util.logging.Logger.getLogger(Bacterias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bacterias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bacterias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bacterias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bacterias().setVisible(true);
        });

        servidor();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Bacteria;
    private javax.swing.JLabel C;
    private javax.swing.JLabel CCtxtA;
    private javax.swing.JLabel H;
    private javax.swing.JLabel HHtxtA;
    private javax.swing.JButton IMFORMACION;
    private javax.swing.JLabel O;
    private javax.swing.JLabel OOtxtA;
    private javax.swing.JLabel T;
    private javax.swing.JButton THCO;
    private javax.swing.JLabel TTtxtA;
    private javax.swing.JTextField co2txt;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField humtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JLabel m5;
    private javax.swing.JTextField o2txt;
    private javax.swing.JTextField temptxt;
    // End of variables declaration//GEN-END:variables
}
