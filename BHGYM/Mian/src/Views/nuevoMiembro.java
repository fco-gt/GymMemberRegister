/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Library.Objetos;
import ViewModels.RegistroVM;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class nuevoMiembro extends javax.swing.JFrame {

    /**
     * Creates new form nuevoMiembro
     */
    public nuevoMiembro() {
        initComponents();
        
        try {
            String currentDirectory = System.getProperty("user.dir");
            String fontPath = currentDirectory + "/src/Font/BlackFuture.otf";
            String fontPath2 = currentDirectory + "/src/Font/Natural Precision.ttf";
            
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            Font customFont2 = Font.createFont(Font.TRUETYPE_FONT,new File(fontPath2));
            
            customFont = customFont.deriveFont(80f);
            customFont2 = customFont2.deriveFont(24f);
            
            lblTituloRegistro.setFont(customFont);
            lblRUT.setFont(customFont2);
            lblNombre.setFont(customFont2);
            lblApellido.setFont(customFont2);
            lblTaller.setFont(customFont2);
            lblCuotaMensual.setFont(customFont2);
            lblDiasIncripcion.setFont(customFont2);
            
            txtRUT.setFont(customFont2);      
            txtNombre.setFont(customFont2);
            txtApaterno.setFont(customFont2);
            txtAmaterno.setFont(customFont2);
            
            cmbTaller.setFont(customFont2);
            cmbCuotaMensual.setFont(customFont2);
            
            rdb30.setFont(customFont2);
            rdb90.setFont(customFont2);
            rdb180.setFont(customFont2);
            
            btnAgregar.setFont(customFont2);
            btnLimpiar.setFont(customFont2);
            btnVolver.setFont(customFont2);
            
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlTituloRegistro = new javax.swing.JPanel();
        lblTituloRegistro = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        pnlCuerpo = new javax.swing.JPanel();
        pnlDatosUsuario = new javax.swing.JPanel();
        lblRUT = new javax.swing.JLabel();
        txtRUT = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtApaterno = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtAmaterno = new javax.swing.JTextField();
        pnlDatosGym = new javax.swing.JPanel();
        lblTaller = new javax.swing.JLabel();
        cmbTaller = new javax.swing.JComboBox<>();
        lblDiasIncripcion = new javax.swing.JLabel();
        rdb30 = new javax.swing.JRadioButton();
        rdb90 = new javax.swing.JRadioButton();
        rdb180 = new javax.swing.JRadioButton();
        lblCuotaMensual = new javax.swing.JLabel();
        cmbCuotaMensual = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlBase.setBackground(new java.awt.Color(30, 30, 30));

        pnlTituloRegistro.setBackground(new java.awt.Color(61, 61, 61));

        lblTituloRegistro.setFont(new java.awt.Font("Segoe UI", 0, 69)); // NOI18N
        lblTituloRegistro.setForeground(new java.awt.Color(1, 176, 187));
        lblTituloRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegistro.setText("REGISTRO NUEVO MIEMBRO");

        javax.swing.GroupLayout pnlTituloRegistroLayout = new javax.swing.GroupLayout(pnlTituloRegistro);
        pnlTituloRegistro.setLayout(pnlTituloRegistroLayout);
        pnlTituloRegistroLayout.setHorizontalGroup(
            pnlTituloRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTituloRegistroLayout.setVerticalGroup(
            pnlTituloRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        pnlBotones.setBackground(new java.awt.Color(61, 61, 61));

        btnLimpiar.setBackground(new java.awt.Color(1, 176, 187));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.setIconTextGap(10);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(1, 176, 187));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/check.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAgregar.setIconTextGap(10);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(1, 176, 187));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/flechaizq.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 950, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pnlCuerpo.setBackground(new java.awt.Color(30, 30, 30));

        pnlDatosUsuario.setBackground(new java.awt.Color(30, 30, 30));

        lblRUT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblRUT.setForeground(new java.awt.Color(255, 255, 255));
        lblRUT.setText("RUT");

        txtRUT.setBackground(new java.awt.Color(1, 176, 187));
        txtRUT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtRUT.setForeground(new java.awt.Color(255, 255, 255));
        txtRUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUTActionPerformed(evt);
            }
        });
        txtRUT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRUTKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRUTKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(1, 176, 187));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("NOMBRE");

        txtApaterno.setBackground(new java.awt.Color(1, 176, 187));
        txtApaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtApaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApaternoActionPerformed(evt);
            }
        });
        txtApaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApaternoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApaternoKeyTyped(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("APELLIDOS");

        txtAmaterno.setBackground(new java.awt.Color(1, 176, 187));
        txtAmaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAmaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtAmaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmaternoActionPerformed(evt);
            }
        });
        txtAmaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmaternoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosUsuarioLayout = new javax.swing.GroupLayout(pnlDatosUsuario);
        pnlDatosUsuario.setLayout(pnlDatosUsuarioLayout);
        pnlDatosUsuarioLayout.setHorizontalGroup(
            pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblApellido)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre)
                    .addComponent(lblRUT)
                    .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                        .addComponent(txtApaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addComponent(txtRUT))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pnlDatosUsuarioLayout.setVerticalGroup(
            pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblRUT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRUT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pnlDatosGym.setBackground(new java.awt.Color(30, 30, 30));
        pnlDatosGym.setPreferredSize(new java.awt.Dimension(634, 495));

        lblTaller.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTaller.setForeground(new java.awt.Color(255, 255, 255));
        lblTaller.setText("TALLER");

        cmbTaller.setBackground(new java.awt.Color(50, 55, 65));
        cmbTaller.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTaller.setForeground(new java.awt.Color(255, 255, 255));
        cmbTaller.setMaximumRowCount(20);
        cmbTaller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA OPCIÓN", "Taller de Defensa Personal", "Taller de Kickboxing Fitness", "Taller de Kung-Fu", "Taller de Jiu-Jitsu", "Taller de Tai Chi" }));
        cmbTaller.setToolTipText("");
        cmbTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTallerActionPerformed(evt);
            }
        });

        lblDiasIncripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDiasIncripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDiasIncripcion.setText("DIAS DE INSCRIPCION");

        rdb30.setBackground(new java.awt.Color(30, 30, 30));
        rdb30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdb30.setForeground(new java.awt.Color(255, 255, 255));
        rdb30.setText("30");
        rdb30.setToolTipText("");
        rdb30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb30ActionPerformed(evt);
            }
        });

        rdb90.setBackground(new java.awt.Color(30, 30, 30));
        rdb90.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdb90.setForeground(new java.awt.Color(255, 255, 255));
        rdb90.setText("90");
        rdb90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb90ActionPerformed(evt);
            }
        });

        rdb180.setBackground(new java.awt.Color(30, 30, 30));
        rdb180.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdb180.setForeground(new java.awt.Color(255, 255, 255));
        rdb180.setText("180");
        rdb180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb180ActionPerformed(evt);
            }
        });

        lblCuotaMensual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCuotaMensual.setForeground(new java.awt.Color(255, 255, 255));
        lblCuotaMensual.setText("CUOTA MENSUAL");

        cmbCuotaMensual.setBackground(new java.awt.Color(50, 55, 65));
        cmbCuotaMensual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCuotaMensual.setForeground(new java.awt.Color(255, 255, 255));
        cmbCuotaMensual.setMaximumRowCount(20);
        cmbCuotaMensual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA OPCIÓN", "1", "3", "6", "9", "12" }));
        cmbCuotaMensual.setToolTipText("");
        cmbCuotaMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuotaMensualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosGymLayout = new javax.swing.GroupLayout(pnlDatosGym);
        pnlDatosGym.setLayout(pnlDatosGymLayout);
        pnlDatosGymLayout.setHorizontalGroup(
            pnlDatosGymLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosGymLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlDatosGymLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCuotaMensual)
                    .addComponent(lblTaller)
                    .addGroup(pnlDatosGymLayout.createSequentialGroup()
                        .addComponent(rdb30)
                        .addGap(62, 62, 62)
                        .addComponent(rdb90)
                        .addGap(54, 54, 54)
                        .addComponent(rdb180))
                    .addComponent(lblDiasIncripcion)
                    .addComponent(cmbCuotaMensual, 0, 410, Short.MAX_VALUE)
                    .addComponent(cmbTaller, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pnlDatosGymLayout.setVerticalGroup(
            pnlDatosGymLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosGymLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTaller, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTaller, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDiasIncripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosGymLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb30)
                    .addComponent(rdb90)
                    .addComponent(rdb180))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCuotaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCuotaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCuerpoLayout = new javax.swing.GroupLayout(pnlCuerpo);
        pnlCuerpo.setLayout(pnlCuerpoLayout);
        pnlCuerpoLayout.setHorizontalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(pnlDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322)
                .addComponent(pnlDatosGym, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        pnlCuerpoLayout.setVerticalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCuerpoLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDatosGym, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTituloRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlTituloRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Importar RegistroVM como usuario
    public RegistroVM usuario;    
  
    private void txtRUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUTActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApaternoActionPerformed

    private void txtAmaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmaternoActionPerformed

    private void cmbTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTallerActionPerformed
        if (!cmbTaller.getSelectedItem().toString().equals("SELECCIONA UNA OPCIÓN")) {
            lblTaller.setText("TALLER");
            lblTaller.setForeground(new Color(0, 153, 51));
        } else {
            lblRUT.setForeground(new Color(0, 153, 51));
        }
    }//GEN-LAST:event_cmbTallerActionPerformed

    private void cmbCuotaMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuotaMensualActionPerformed
        if (!cmbCuotaMensual.getSelectedItem().toString().equals("SELECCIONA UNA OPCIÓN")) {
            lblCuotaMensual.setText("CUOTA MENSUAL");
            lblCuotaMensual.setForeground(new Color(0, 153, 51));
        } else {
            lblCuotaMensual.setForeground(new Color(0, 153, 51));
        }
    }//GEN-LAST:event_cmbCuotaMensualActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Registrar usuario
        usuario.RegistrarUsuario();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void rdb30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb30ActionPerformed
        rdb90.setSelected(false);
        rdb180.setSelected(false);
        lblDiasIncripcion.setText("DIAS DE INSCRIPCION");
        lblDiasIncripcion.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_rdb30ActionPerformed

    private void rdb90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb90ActionPerformed
        rdb30.setSelected(false);
        rdb180.setSelected(false);
        lblDiasIncripcion.setText("DIAS DE INSCRIPCION");
        lblDiasIncripcion.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_rdb90ActionPerformed

    private void rdb180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb180ActionPerformed
        rdb30.setSelected(false);
        rdb90.setSelected(false);
        lblDiasIncripcion.setText("DIAS DE INSCRIPCION");
        lblDiasIncripcion.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_rdb180ActionPerformed
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
  
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRUT.setText("");
        txtNombre.setText("");
        txtApaterno.setText("");
        txtAmaterno.setText("");
        
        txtRUT.requestFocus(true);
        cmbTaller.setSelectedIndex(0);
        rdb30.setSelected(false);
        rdb90.setSelected(false);
        rdb180.setSelected(false);
        cmbCuotaMensual.setSelectedIndex(0);
        
        lblRUT.setForeground(new Color(255,255,255));
        lblNombre.setForeground(new Color(255,255,255));
        lblApellido.setForeground(new Color(255,255,255));
        lblTaller.setForeground(new Color(255,255,255));
        lblDiasIncripcion.setForeground(new Color(255,255,255));
        lblCuotaMensual.setForeground(new Color(255,255,255));
        
        lblRUT.setText("RUT");
        lblNombre.setText("Nombre");
        lblApellido.setText("Apellido");
        lblTaller.setText("Taller");
        lblDiasIncripcion.setText("DIAS DE INSCRIPCION");
        lblCuotaMensual.setText("Cuota Mensual");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Agregar informacion al abrir la ventana
        
        // Listas de componentes
        ArrayList<JLabel> label = new ArrayList();
        ArrayList<JTextField> textField = new ArrayList();
        ArrayList<JComboBox> comboBox = new ArrayList();
        ArrayList<JRadioButton> radioButton = new ArrayList();
        
        // Agregar los Label a la lista label
        label.add(lblRUT);
        label.add(lblNombre);
        label.add(lblApellido);
        label.add(lblTaller);
        label.add(lblDiasIncripcion);
        label.add(lblCuotaMensual);
        
        // Agregar los TextField a la lista textField
        textField.add(txtRUT);
        textField.add(txtNombre);
        textField.add(txtApaterno);
        textField.add(txtAmaterno);
        
        // Agregar los ComboBox a la lista comboBox
        comboBox.add(cmbTaller);
        comboBox.add(cmbCuotaMensual);
        
        // Agregar los RadioButton a la lista radioButton
        radioButton.add(rdb30);
        radioButton.add(rdb90);
        radioButton.add(rdb180);
        
        // Agregar las variables al usuario
        usuario = new RegistroVM(label, textField, comboBox, radioButton);
        
        // Pedir que rellene el formulario iniciando por el RUT
        lblRUT.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void txtRUTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUTKeyReleased
        if(txtRUT.getText().equals("")){
            lblRUT.setForeground(new Color(255,255,255));
        }else{
            lblRUT.setText("RUT");
            lblRUT.setForeground(new Color(0, 153, 51));
        }
    }//GEN-LAST:event_txtRUTKeyReleased

    private void txtRUTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUTKeyTyped
        Objetos.eventos.numberKeyPres(evt);
    }//GEN-LAST:event_txtRUTKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if(txtNombre.getText().equals("")){
            lblNombre.setForeground(new Color(255,255,255));
        }else{
            lblNombre.setText("NOMBRE");
            lblNombre.setForeground(new Color(0, 153, 51));
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Objetos.eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApaternoKeyReleased
        if(txtApaterno.getText().equals("")){
            lblApellido.setForeground(new Color(255,255,255));
        }else{
            lblApellido.setText("APELLIDOS");
            lblApellido.setForeground(new Color(0, 153, 51));
        }
    }//GEN-LAST:event_txtApaternoKeyReleased

    private void txtApaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApaternoKeyTyped
        Objetos.eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtApaternoKeyTyped

    private void txtAmaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmaternoKeyTyped
        Objetos.eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtAmaternoKeyTyped

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
            java.util.logging.Logger.getLogger(nuevoMiembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoMiembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoMiembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoMiembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoMiembro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCuotaMensual;
    private javax.swing.JComboBox<String> cmbTaller;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCuotaMensual;
    private javax.swing.JLabel lblDiasIncripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRUT;
    private javax.swing.JLabel lblTaller;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JPanel pnlDatosGym;
    private javax.swing.JPanel pnlDatosUsuario;
    private javax.swing.JPanel pnlTituloRegistro;
    private javax.swing.JRadioButton rdb180;
    private javax.swing.JRadioButton rdb30;
    private javax.swing.JRadioButton rdb90;
    private javax.swing.JTextField txtAmaterno;
    private javax.swing.JTextField txtApaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUT;
    // End of variables declaration//GEN-END:variables
}
