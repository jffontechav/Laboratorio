package tiendalibro;

import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class tienda extends javax.swing.JFrame {
    private DefaultTableModel  modelo1, modelo2;

    private String Datos[][] = {};
    private String[] Encabezado1 = {"ISBN", "Título", "Precio Unitario"};
    private String[] Encabezado2 = {"ISBN", "Título", "Cantidad", "Precio Unitario"};

    public tienda() {
        initComponents();
        
        modelo1 = new DefaultTableModel(Datos, Encabezado1);
        Tabla1.setModel(modelo1);
        
        modelo2 = new  DefaultTableModel (Datos, Encabezado2);
        Tabla2.setModel(modelo2);    
        
        Tabla2.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent lse) {
            
                
                
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Comprar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        addLibro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda de Libros");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Del Catalogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setToolTipText("");

        Tabla1.setBackground(new java.awt.Color(0, 204, 204));
        Tabla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123-876-653", "Algoritmica y Programacion", "57.000,00"},
                {"345-980-343", "Programacion en Java", "75.000,00"},
                {"908-654-870", "El Lenguaje UML", "43.500,00"},
                {"243-865-443", "Usando JUnit", "63.092,00"},
                {"877-765-343", "Programacion en c#", "65.432,00"}
            },
            new String [] {
                "ISBN", "Titulo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Tabla1);
        if (Tabla1.getColumnModel().getColumnCount() > 0) {
            Tabla1.getColumnModel().getColumn(0).setHeaderValue("ISBN");
            Tabla1.getColumnModel().getColumn(1).setHeaderValue("Titulo");
            Tabla1.getColumnModel().getColumn(2).setHeaderValue("Precio");
        }

        Comprar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Comprar.setText("Comprar Libro");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar)
                    .addComponent(Borrar))
                .addContainerGap())
        );

        addLibro.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        addLibro.setText("Adicionar Libro");
        addLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLibroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Del Carrito De Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N

        Tabla2.setBackground(new java.awt.Color(0, 204, 204));
        Tabla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Titulo", "Cantidad", "Precio Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla2);
        if (Tabla2.getColumnModel().getColumnCount() > 0) {
            Tabla2.getColumnModel().getColumn(0).setHeaderValue("ISBN");
            Tabla2.getColumnModel().getColumn(1).setHeaderValue("Titulo");
            Tabla2.getColumnModel().getColumn(2).setHeaderValue("Cantidad");
            Tabla2.getColumnModel().getColumn(3).setHeaderValue("Precio Unitario");
        }

        btnCalcular.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnCalcular.setText("Calcular Total");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel2.setText("Costo de los Libros:");

        campoTotal.setEditable(false);
        campoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(addLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(addLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        int s = Tabla1.getSelectedRow();

        if(s==-1) 
           JOptionPane.showMessageDialog(this, "Seleccione el libro que desea comprar."); 
        else{
            int pos = buscarEnCarrito(s);
            if( pos != -1 ) {
                String cantidad = JOptionPane.showInputDialog("Ya se ha adquirido este libro. Ingrese la nueva cantidad que desea adquirir:");
                if(cantidad.equals("0"))
                    modelo2.removeRow(pos);
                else modelo2.setValueAt(cantidad, pos, 2);
                return;
            }
            String cantidad = JOptionPane.showInputDialog("Ingrese cantidad a comprar:");
            Object fila [] = new Object[modelo2.getColumnCount()];
            fila[0] = modelo1.getValueAt(s, 0); // ISBN.
            fila[1] = modelo1.getValueAt(s, 1); // Título.
            fila[3] = modelo1.getValueAt(s, 2); // Precio unitario.
            fila[2] = cantidad;
            modelo2.addRow(fila);
        }
    }//GEN-LAST:event_ComprarActionPerformed

    private int buscarEnCarrito(int s) {
        String ISBN = (String) modelo1.getValueAt(s, 0);
        String Titulo = (String) modelo1.getValueAt(s, 1);
        
        for(int i=0; i<modelo2.getRowCount(); ++i) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) modelo2.getDataVector().get(i);
            if(v.get(0).equals(ISBN) && v.get(1).equals(Titulo))
                return i;
        }
        return -1;        
    }
    
    private void addLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLibroActionPerformed
        String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        String Titulo = JOptionPane.showInputDialog("Ingrese el nombre del libro:");
        String Precio = JOptionPane.showInputDialog("Ingrese el precio del libro:");
       
        if( existeLibro(ISBN, Titulo) ) 
            JOptionPane.showMessageDialog(this, "El libro ya se encuentra registrado.");
        else {
            JOptionPane.showMessageDialog(this, "El libro se ha registrado correctamente.");        
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String Datos[] = {ISBN, Titulo, Precio};
            modelo1.addRow(Datos);
        }
    }//GEN-LAST:event_addLibroActionPerformed

    private boolean existeLibro(String ISBN, String Titulo) {
        Iterator it = modelo1.getDataVector().iterator();
        while(it.hasNext()) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) it.next();
            if(v.get(0).equals(ISBN) && v.get(1).equals(Titulo))
                return true;
        }
        return false;
    }
    
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        int s = Tabla1.getSelectedRow();
        if(s==-1) 
           JOptionPane.showMessageDialog(this,"Por favor seleccione una fila."); 
        else modelo1.removeRow(s);        
    }//GEN-LAST:event_BorrarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double precio = 0;
        for(int i=0; i<modelo2.getRowCount(); ++i)
            precio += Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
        campoTotal.setText(precio+"");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void campoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tienda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Comprar;
    private static javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton addLibro;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
