/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author poste
 */
public class Reservation_train extends javax.swing.JFrame {
    
    Connection con ;
    PreparedStatement pst ;
    ResultSet rs ;
    
    public Reservation_train() {
        initComponents();
     // paiment();
        //aut_tick();
       
       
    }

 /*   public void paiment(){
         int prix_t=Integer.parseInt(Total.getText());
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "souad1");
            pst = con.prepareStatement("select code,solde from CORDONNES_BANCAIRE where code=?");
            pst.setString(1,code_b.getText());
           
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
           int solde_b=Integer.parseInt(rs.getString("solde"));
           int  sum = solde_b - prix_t;
           if(rs.next()){
           if(sum >0){
             JOptionPane.showMessageDialog(null, "paiment bien effectuier!!");
           }else{
               JOptionPane.showMessageDialog(null, "pas de solde!!");
           }}
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Reservation_train.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }*/
      
    /*  public void aut_tick() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "souad1");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(id_r) from reservation_t");
            rs.next();
            rs.getString("MAX(id_r)");
            if (rs.getString("MAX(id_r)") == null) {
                numticket.setText("1");
            } else {
                long id2 = Long.parseLong(rs.getString("MAX(id_r)").substring(2, rs.getString("MAX(id_r)").length()));
                id2 ++ ;
                numticket.setText("id1");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Reservation_train.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gareDepart = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        gareArrive = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        num_t = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        depar1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        arriv = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        timed = new javax.swing.JLabel();
        arrivetime = new javax.swing.JLabel();
        timeA = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        class1 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        typev = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        numtrain = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        date1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        passager1 = new javax.swing.JSpinner();
        prix2 = new javax.swing.JTextField();
        id_v = new javax.swing.JTextField();
        numticket = new javax.swing.JTextField();
        serche = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(878, 878));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Gare de départ");

        gareDepart.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        gareDepart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maroc", "France", "Italie", "Etats_Unis" }));
        gareDepart.setBorder(null);
        gareDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gareDepartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Gare d'arrivée");

        gareArrive.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        gareArrive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maroc", "France", "Italie", "Etats_Unis" }));
        gareArrive.setBorder(null);
        gareArrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gareArriveActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 153, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "num_vol", "depart", "arrive", "heureDepart", "heureArrive", "prix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(25);
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        num_t.setBackground(new java.awt.Color(255, 255, 255));
        num_t.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ID_Voyageur");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Depart");

        depar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        depar1.setForeground(new java.awt.Color(0, 102, 102));
        depar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Arrive");

        arriv.setBackground(new java.awt.Color(255, 255, 255));
        arriv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        arriv.setForeground(new java.awt.Color(0, 102, 102));
        arriv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arriv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("HeureDepart");

        timed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timed.setForeground(new java.awt.Color(0, 102, 102));
        timed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timed.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        arrivetime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        arrivetime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        arrivetime.setText("HeureArrive");

        timeA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timeA.setForeground(new java.awt.Color(0, 102, 102));
        timeA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("classe");

        class1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        class1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1er classe", "2eme classe" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("type de voyage ");

        typev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        typev.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aller simple", "aller retour" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("date");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("N° ticket");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("N° train");

        numtrain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numtrain.setForeground(new java.awt.Color(0, 102, 102));
        numtrain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numtrain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("prix ");

        tot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tot.setText("Total");

        Total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Total.setForeground(new java.awt.Color(0, 102, 102));
        Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));

        date1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(0, 102, 102));
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("passager");

        passager1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                passager1StateChanged(evt);
            }
        });

        prix2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prix2.setForeground(new java.awt.Color(0, 102, 102));
        prix2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prix2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout num_tLayout = new javax.swing.GroupLayout(num_t);
        num_t.setLayout(num_tLayout);
        num_tLayout.setHorizontalGroup(
            num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(num_tLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(class1, 0, 145, Short.MAX_VALUE)
                    .addComponent(timed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(id_v)
                    .addComponent(date1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(arrivetime, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prix2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(numtrain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arriv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, num_tLayout.createSequentialGroup()
                        .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, num_tLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numticket)
                    .addComponent(typev, 0, 113, Short.MAX_VALUE)
                    .addComponent(passager1))
                .addContainerGap())
        );
        num_tLayout.setVerticalGroup(
            num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(num_tLayout.createSequentialGroup()
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(num_tLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numtrain, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(num_tLayout.createSequentialGroup()
                                        .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(numticket, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(5, 5, 5)))
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id_v))
                        .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(num_tLayout.createSequentialGroup()
                                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(num_tLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, num_tLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(depar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(num_tLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(num_tLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(timed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(num_tLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passager1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(typev, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(num_tLayout.createSequentialGroup()
                                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(num_tLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, num_tLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arriv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arrivetime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(num_tLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(num_tLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prix2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(num_tLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(num_tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        serche.setBackground(new java.awt.Color(0, 102, 102));
        serche.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serche.setText("Rechercher");
        serche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sercheActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(0, 102, 102));
        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setText("Confirmer");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gareArrive, 0, 148, Short.MAX_VALUE)
                                    .addComponent(gareDepart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(serche, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(num_t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(gareDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gareArrive, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(serche)))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jButton4.setText("<<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gareDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gareDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gareDepartActionPerformed

    private void gareArriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gareArriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gareArriveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        numtrain.setText(df.getValueAt(selectIndex, 0).toString());
        depar1.setText(df.getValueAt(selectIndex, 1).toString());
        arriv.setText(df.getValueAt(selectIndex, 2).toString());
        timed.setText(df.getValueAt(selectIndex, 3).toString());
        timeA.setText(df.getValueAt(selectIndex, 4).toString());
       // prix1.setText(df.getValueAt(selectIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void sercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sercheActionPerformed
      String depar = gareDepart.getSelectedItem().toString();
        String arriv = gareArrive.getSelectedItem().toString();

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "souad1");
            pst = con.prepareStatement("select * from train1 where depart =? and arrive=?");
           
            pst.setString(1, depar);
            pst.setString(2, arriv);

            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int c;
            c=rsm.getColumnCount();

            while (rs.next()) {
                DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
                df.setRowCount(0);
                Vector v2 = new Vector();
                 for(int i=0;i<=c;i++){
                    v2.add(rs.getString("num"));
                    v2.add(rs.getString("depart"));
                    v2.add(rs.getString("arrive"));
                    v2.add(rs.getString("heure_D"));
                    v2.add(rs.getString("heure_A"));
                    v2.add(rs.getString("prix"));

                    }
                df.addRow(v2);

            }
            //JOptionPane.showMessageDialog(null,"succeful()");
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Reservation_train.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    {
    }//GEN-LAST:event_sercheActionPerformed

    private void prix2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prix2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prix2ActionPerformed

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date1ActionPerformed

    private void passager1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_passager1StateChanged
     int prix1=Integer.parseInt(prix2.getText());
     int qte=Integer.parseInt(passager1.getValue().toString());
     int tot=prix1*qte;
     Total.setText(String.valueOf(tot));
    }//GEN-LAST:event_passager1StateChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
   
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "souad1");
            pst = con.prepareStatement("insert into reservation_train values (?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, numticket.getText());
            pst.setString(2, id_v.getText());
            pst.setString(3, numtrain.getText());
            pst.setString(4, depar1.getText());
            pst.setString(5, arriv.getText());
            pst.setString(6, timed.getText());
            pst.setString(7, timeA.getText());
            pst.setString(8, date1.getText());
            pst.setString(9, Total.getText());
            pst.setString(10, class1.getSelectedItem().toString());
            pst.setString(11, (String)passager1.getValue().toString());
            pst.setString(12, typev.getSelectedItem().toString());
            pst.executeQuery();

            JOptionPane.showMessageDialog(null, "reservation bien effectué!!");

            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "error !!!!!!!!");
            Logger.getLogger(Reservation_train.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Reservation_train.super.dispose();
        interface_Voyageur iv=new interface_Voyageur();
        iv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Reservation_train.super.dispose();
        interface_Voyageur t=new interface_Voyageur();
        t.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Reservation_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation_train().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JLabel arriv;
    private javax.swing.JLabel arrivetime;
    private javax.swing.JComboBox class1;
    private javax.swing.JTextField date1;
    private javax.swing.JLabel depar1;
    private javax.swing.JComboBox gareArrive;
    private javax.swing.JComboBox gareDepart;
    private javax.swing.JTextField id_v;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel num_t;
    private javax.swing.JTextField numticket;
    private javax.swing.JLabel numtrain;
    private javax.swing.JSpinner passager1;
    private javax.swing.JTextField prix2;
    private javax.swing.JButton save;
    private javax.swing.JButton serche;
    private javax.swing.JLabel timeA;
    private javax.swing.JLabel timed;
    private javax.swing.JLabel tot;
    private javax.swing.JComboBox typev;
    // End of variables declaration//GEN-END:variables
}
