/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.HTMLEditorKit;
import model.Arco;
import model.Bruja;
import model.Caballero;
import model.Cuchillo;
import model.Escoba;
import model.Espada;
import model.Personaje;
import model.Reina;
import model.Rey;
import model.Trol;

/**
 *
 * @author sergi
 */
public class crud extends javax.swing.JFrame {

    /**
     * Creates new form crud
     */
    LinkedList<Personaje> ListPersonajes;
    DefaultListModel modelListPersonajes;
    Personaje personaje;

    public crud() {
        initComponents();
        setImage(lblPersonajes, "src/image/bruja.png");
        setImage(lblArmas, "src/image/espada.png");
        this.ListPersonajes = new LinkedList<>();
        modelListPersonajes = new DefaultListModel();
        JlistPersonajes.setModel(modelListPersonajes);
        this.setLocationRelativeTo(null);
        personaje = new Personaje() {
            @Override
            public void pelear() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void usarArma() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPfunciones = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        boxPersonajes = new javax.swing.JComboBox<>();
        lblPersonajes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBlDanoMagia = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblArmas = new javax.swing.JLabel();
        boxArmas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        boxNivelPoder = new javax.swing.JComboBox<>();
        boxDanoMagia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxDanoArma = new javax.swing.JComboBox<>();
        boxPeso = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        JlistPersonajes = new javax.swing.JList<>();
        btnUsarArma = new javax.swing.JButton();
        btnPelear = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        boxPersonajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bruja", "Trol", "Reina", "Caballero", "Rey" }));
        boxPersonajes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxPersonajesItemStateChanged(evt);
            }
        });
        jDesktopPane2.add(boxPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));
        jDesktopPane2.add(lblPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 140, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Codigo:");
        jDesktopPane2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jBlDanoMagia.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jBlDanoMagia.setText("Daño de la magia:");
        jDesktopPane2.add(jBlDanoMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jDesktopPane2.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, -1));
        jDesktopPane2.add(lblArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 140, 120));

        boxArmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espada", "Arco", "Escoba", "Cuchillo" }));
        boxArmas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxArmasItemStateChanged(evt);
            }
        });
        jDesktopPane2.add(boxArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Nombre:");
        jDesktopPane2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Nivel de poder");
        jDesktopPane2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jDesktopPane2.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, -1));

        boxNivelPoder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jDesktopPane2.add(boxNivelPoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        boxDanoMagia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jDesktopPane2.add(boxDanoMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Daño:");
        jDesktopPane2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Peso:");
        jDesktopPane2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 50, -1));

        boxDanoArma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jDesktopPane2.add(boxDanoArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        boxPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10kg", "25kg", "35kg", "40kg" }));
        jDesktopPane2.add(boxPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        javax.swing.GroupLayout jPfuncionesLayout = new javax.swing.GroupLayout(jPfunciones);
        jPfunciones.setLayout(jPfuncionesLayout);
        jPfuncionesLayout.setHorizontalGroup(
            jPfuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        jPfuncionesLayout.setVerticalGroup(
            jPfuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Personajes", jPfunciones);

        jDesktopPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(JlistPersonajes);

        jDesktopPane4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 390, 360));

        btnUsarArma.setText("USAR ARMA");
        btnUsarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarArmaActionPerformed(evt);
            }
        });
        jDesktopPane4.add(btnUsarArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 100, 60));

        btnPelear.setText("PELEAR");
        btnPelear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelearActionPerformed(evt);
            }
        });
        jDesktopPane4.add(btnPelear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 100, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista Personajes", jPanel3);

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    eleimina los personajes llena la lista y borra el form
    */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        if (txtCod.getText().equals("") && txtNom.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "por busque primero");
        } else {
            if (estaElPersonaje(txtCod.getText())) {
                delete();
            }
        }
        llenarListaPersonajes();
        borrarForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    /*
    Creacion de los personajes
     */
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        if (txtCod.getText().equals("") && txtNom.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "por favor llene todos los campos");
        } else {
            CrearPersonajes();
        }
        borrarForm();
        llenarListaPersonajes();
    }//GEN-LAST:event_btnCreateActionPerformed

    /*
    buscar los personajes
    */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtCod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "recuerde buscar por el codigo");
        }
        if (estaElPersonaje(txtCod.getText())) {

            setearDatos(txtCod.getText());
        }

    }//GEN-LAST:event_btnSearchActionPerformed
/*
    actualizar cambiar los personajes
    */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (txtCod.getText().equals("") && txtCod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "recuerde buscar primero");
        } else {
            if (estaElPersonaje(txtCod.getText())) {
                update();
            }
        }
        borrarForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    /*
    Evento del combo box para que las imagenes se cambien y ademas para hacer visible la
    eleccion de la magia de la bruja y el troll
    */
    private void boxPersonajesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxPersonajesItemStateChanged
        // TODO add your handling code here:
        seleccionada();
        if (boxPersonajes.getSelectedItem().toString() != "Bruja"
                || boxPersonajes.getSelectedItem().toString() != "Trol") {
            jBlDanoMagia.setVisible(false);
            boxDanoMagia.setVisible(false);
        }
        if (boxPersonajes.getSelectedItem().toString() == "Bruja"
                || boxPersonajes.getSelectedItem().toString() == "Trol") {
            jBlDanoMagia.setVisible(true);
            boxDanoMagia.setVisible(true);
        }
    }//GEN-LAST:event_boxPersonajesItemStateChanged

    //evento del comboBox
    private void boxArmasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxArmasItemStateChanged
        // TODO add your handling code here:
        seleccionadaArma();
    }//GEN-LAST:event_boxArmasItemStateChanged
    /*
    Pedimos que se seleccione la lista para posteriormente poner a pelear al personaje
    */
    private void btnPelearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelearActionPerformed
        // TODO add your handling code here:
        if (JlistPersonajes.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "seleccione un personaje de la lista");
        } else {
            int index = JlistPersonajes.getSelectedIndex();
            pelear(index);
        }
    }//GEN-LAST:event_btnPelearActionPerformed

    /*
    Pedimos que se seleccione la lista para posteriormente poner a usar el arma al personaje
    */
    private void btnUsarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarArmaActionPerformed
        // TODO add your handling code here:
        if (JlistPersonajes.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "seleccione un personaje de la lista");
        } else {
            int index = JlistPersonajes.getSelectedIndex();
            UsarArma(index);
        }
    }//GEN-LAST:event_btnUsarArmaActionPerformed

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
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud().setVisible(true);
            }
        });
    }

    /*
    llamamos al metodo pelear del personaje seleccioando
    */
    private void pelear(int index) {
        int i = 0;
        for (Personaje p : ListPersonajes) {
            if (i == index) {
                p.pelear();
                break;
            }
            i++;
        }
    }

    /*
    llamamos al metodo de usar arma del personaje seleccionado
    */
    private void UsarArma(int index) {
        int i = 0;
        for (Personaje p : ListPersonajes) {
            if (i == index) {
                p.usarArma();
                break;
            }
            i++;
        }
    }

    /*
    codigo para cambiar la imagen y que esta este escalable acerca del jlabel
    */
    private void setImage(JLabel label, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(label.getWidth(),
                        label.getHeight(),
                        Image.SCALE_DEFAULT
                )
        );
        label.setIcon(icon);
        this.repaint();

    }

    /*
    verificamos si el personaje existe en la lista
    */
    private boolean estaElPersonaje(String codigo) {
        boolean bandera = false;
        for (Personaje p : ListPersonajes) {
            if (p.getCodigo().equals(codigo)) {
                bandera = true;
            }
        }

        return bandera;
    }

    public void update() {
        for (Personaje p : ListPersonajes) {
            if (p.getCodigo().equals(txtCod.getText())) {
                p.setCodigo(txtCod.getText());
                p.setNombre(txtNom.getText());
                p.setNivelPoder(Integer.parseInt(boxNivelPoder.getSelectedItem().toString()));
                p.getListArmas().remove(0);
                creacionArma(p);
                p.getListArmas().get(0).setDano(Integer.parseInt(boxDanoArma.getSelectedItem().toString()));
                p.getListArmas().get(0).setPeso(boxDanoArma.getSelectedItem().toString());
            }

        }

    }

/*
    eliminacion de los personajes(recorre toda la lista)
    */
    public void delete() {
        int i = 0;
        for (Personaje p : ListPersonajes) {
            if (p.getCodigo().equals(txtCod.getText())) {
                break;
            }
            i++;
        }
        ListPersonajes.remove(i);

    }
   /*
    setea todos los datos del valor buscado por el codigo
    */
    public void setearDatos(String codigo) {

        int i = 0;

        for (Personaje p : ListPersonajes) {
            if (p.getCodigo().equals(codigo)) {
                String tipo = tipoPersonaje(i);
                String tipoArma = tipoArma(i);
                txtCod.setText(p.getCodigo());
                txtNom.setText(p.getNombre());
                boxNivelPoder.setSelectedItem(p.getNivelPoder());
                boxPersonajes.setSelectedItem(tipo);
                boxArmas.setSelectedItem(tipoArma);
                boxPeso.setSelectedItem(p.getListArmas().get(0).getPeso());
                boxDanoArma.setSelectedItem(p.getListArmas().get(0).getDano());
                break;
            }
            i++;
        }
    }

    
    /*
    gracias al instanceof nos damos cuenta que tipo de arma para poder posteriormente
    seleccioanrla
    */
    private String tipoArma(int i) {
        String tipo = "";
        if (ListPersonajes.get(i).getListArmas().get(0) instanceof Cuchillo) {
            tipo = "Cuchillo";
        }
        if (ListPersonajes.get(i).getListArmas().get(0) instanceof Espada) {
            tipo = "Espada";
        }
        if (ListPersonajes.get(i).getListArmas().get(0) instanceof Arco) {
            tipo = "Arco";
        }
        if (ListPersonajes.get(i).getListArmas().get(0) instanceof Escoba) {
            tipo = "Escoba";
        }

        return tipo;
    }

     /*
    gracias al instanceof nos damos cuenta que tipo de personaje es para poder posteriormente
    selecciorlo ->bruja, troll etc
    */
    private String tipoPersonaje(int i) {
        String tipo = "";
        if (ListPersonajes.get(i) instanceof Bruja) {
            tipo = "Bruja";
        }
        if (ListPersonajes.get(i) instanceof Caballero) {
            tipo = "Caballero";
        }
        if (ListPersonajes.get(i) instanceof Rey) {
            tipo = "Rey";
        }
        if (ListPersonajes.get(i) instanceof Trol) {
            tipo = "Trol";
        }
        if (ListPersonajes.get(i) instanceof Reina) {
            tipo = "Reina";
        }
        return tipo;
    }

    
    /*
    llenamos la Jlist
    */
    private void llenarListaPersonajes() {
        modelListPersonajes.removeAllElements();

        for (int i = 0; i < ListPersonajes.size(); i++) {
            modelListPersonajes.add(i, ListPersonajes.get(i));
        }

    }

    /*
    borramos el form para que quede limpio para su creacion
    */
    private void borrarForm() {
        txtCod.setText("");
        txtNom.setText("");
        boxArmas.setSelectedIndex(0);
        boxDanoMagia.setSelectedIndex(0);
        boxNivelPoder.setSelectedIndex(0);
        boxPersonajes.setSelectedIndex(0);
        boxPeso.setSelectedIndex(0);
        boxDanoArma.setSelectedIndex(0);
    }

    /*
    depende de cual este seleccionado el lbl cambiara su imagen
    */
    private void seleccionada() {
        if (this.boxPersonajes.getSelectedItem().toString() == "Bruja") {
            setImage(lblPersonajes, "src/image/bruja.png");
        }
        if (this.boxPersonajes.getSelectedItem().toString() == "Trol") {
            setImage(lblPersonajes, "src/image/troll.png");
        }
        if (this.boxPersonajes.getSelectedItem().toString() == "Caballero") {
            setImage(lblPersonajes, "src/image/caballero.png");
        }
        if (this.boxPersonajes.getSelectedItem().toString() == "Rey") {
            setImage(lblPersonajes, "src/image/rey.png");
        }
        if (this.boxPersonajes.getSelectedItem().toString() == "Reina") {
            setImage(lblPersonajes, "src/image/reina.png");
        }

    }

    /*
    depende de cual este seleccionado la arma cambiara su imagen
    */
    private void seleccionadaArma() {
        if (this.boxArmas.getSelectedItem().toString() == "Espada") {
            setImage(lblArmas, "src/image/espada.png");
        }
        if (this.boxArmas.getSelectedItem().toString() == "Cuchillo") {
            setImage(lblArmas, "src/image/cuchillo.png");
        }
        if (this.boxArmas.getSelectedItem().toString() == "Arco") {
            setImage(lblArmas, "src/image/arco.png");
        }
        if (this.boxArmas.getSelectedItem().toString() == "Escoba") {
            setImage(lblArmas, "src/image/escoba.png");
        }

    }

    /*
    se crean los personajes apartir del escogido
    puede ser una bruja,troll etc
    */
    private void CrearPersonajes() {
        if (boxPersonajes.getSelectedItem().toString() == "Bruja") {
            Bruja bruja = new Bruja("Golpear",
                    txtCod.getText(),
                    2,
                    txtNom.getText(),
                    Integer.parseInt(boxNivelPoder.getSelectedItem().toString()),
                    "Hechizo de convercion",
                    Integer.parseInt(boxDanoMagia.getSelectedItem().toString()));
            creacionArma(bruja);
            ListPersonajes.add(bruja);

        }
        if (boxPersonajes.getSelectedItem().toString() == "Trol") {
            Trol trol = new Trol("Super fuerza",
                    txtCod.getText(),
                    2,
                    txtNom.getText(),
                    Integer.parseInt(boxNivelPoder.getSelectedItem().toString()),
                    "crear troll",
                    Integer.parseInt(boxDanoMagia.getSelectedItem().toString()));
            creacionArma(trol);
            ListPersonajes.add(trol);
        }
        if (boxPersonajes.getSelectedItem().toString() == "Caballero") {
            Caballero caballero = new Caballero("artes marciales",
                    txtCod.getText(),
                    1,
                    txtNom.getText(),
                    Integer.parseInt(boxNivelPoder.getSelectedItem().toString()));
            creacionArma(caballero);
            ListPersonajes.add(caballero);
        }
        if (boxPersonajes.getSelectedItem().toString() == "Rey") {
            Rey rey = new Rey("patadas",
                    txtCod.getText(),
                    1,
                    txtNom.getText(),
                    Integer.parseInt(boxNivelPoder.getSelectedItem().toString()));
            creacionArma(rey);
            ListPersonajes.add(rey);
        }
        if (boxPersonajes.getSelectedItem().toString() == "Reina") {
            Reina reina = new Reina("puños",
                    txtCod.getText(),
                    1,
                    txtNom.getText(),
                    Integer.parseInt(boxNivelPoder.getSelectedItem().toString()));
            creacionArma(reina);
            ListPersonajes.add(reina);
        }
    }

    /*
    returnamos el string seleccionado en la arma
    */
    private String ArmaSeleccionada() {
        return boxArmas.getSelectedItem().toString();
    }

    
    /*
    depende del strin seleccionado se crea la respectiva arma
    cuchillo,espada
    */
    public void creacionArma(Personaje personaje) {
        String tipoArma = ArmaSeleccionada();
        if (tipoArma == "Espada") {
            Espada espada = new Espada(boxPeso.getSelectedItem().toString(), Integer.parseInt(boxDanoArma.getSelectedItem().toString()));
            personaje.getListArmas().add(espada);
        }
        if (tipoArma == "Cuchillo") {
            Cuchillo cuhillo = new Cuchillo(boxPeso.getSelectedItem().toString(), Integer.parseInt(boxDanoArma.getSelectedItem().toString()));
            personaje.getListArmas().add(cuhillo);
        }
        if (tipoArma == "Arco") {
            Arco arco = new Arco(boxPeso.getSelectedItem().toString(), Integer.parseInt(boxDanoArma.getSelectedItem().toString()));
            personaje.getListArmas().add(arco);
        }
        if (tipoArma == "Escoba") {
            Escoba escoba = new Escoba(boxPeso.getSelectedItem().toString(), Integer.parseInt(boxDanoArma.getSelectedItem().toString()));
            personaje.getListArmas().add(escoba);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlistPersonajes;
    private javax.swing.JComboBox<String> boxArmas;
    private javax.swing.JComboBox<String> boxDanoArma;
    private javax.swing.JComboBox<String> boxDanoMagia;
    private javax.swing.JComboBox<String> boxNivelPoder;
    private javax.swing.JComboBox<String> boxPersonajes;
    private javax.swing.JComboBox<String> boxPeso;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPelear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUsarArma;
    private javax.swing.JLabel jBlDanoMagia;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPfunciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblArmas;
    private javax.swing.JLabel lblPersonajes;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
