
package GUI;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class UAVDetails extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
   
    public UAVDetails() {
        initComponents();
        setTitle("Drone registeration form");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stud = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        fatherNameLabel = new javax.swing.JLabel();
        p3 = new javax.swing.JTextField();
        mnameLabel = new javax.swing.JLabel();
        p4 = new javax.swing.JTextField();
        mmobileLabel = new javax.swing.JLabel();
        p6 = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        p7 = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        p8 = new javax.swing.JComboBox<>();
        dobLabel = new javax.swing.JLabel();
        p9 = new javax.swing.JTextField();
        fathermobileLabel1 = new javax.swing.JLabel();
        p5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        p10 = new javax.swing.JTextField();
        droneIdLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p11 = new javax.swing.JTextField();
        doaLabel = new javax.swing.JLabel();
        p12 = new javax.swing.JTextField();
        aadharLabel = new javax.swing.JLabel();
        p13 = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        p14 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        getDataButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        droneRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Form");

        stud.setDividerLocation(0);
        stud.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );

        stud.setLeftComponent(jPanel6);

        jPanel5.setPreferredSize(new java.awt.Dimension(1300, 800));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("                                                           Drone Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jLabel1.setPreferredSize(new java.awt.Dimension(8, 55));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 710));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Basic Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        firstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("Name:");

        p1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p1.setToolTipText("Enter Drone Name here");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p1KeyTyped(evt);
            }
        });

        lastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Model:");
        lastNameLabel.setToolTipText("");

        p2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p2.setToolTipText("Enter Drone model Here");
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        p2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p2KeyTyped(evt);
            }
        });

        fatherNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        fatherNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fatherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fatherNameLabel.setText("Use:");

        p3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p3.setToolTipText("Enter purpose or usage here");
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        p3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p3KeyTyped(evt);
            }
        });

        mnameLabel.setBackground(new java.awt.Color(0, 0, 0));
        mnameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        mnameLabel.setText("Wingspan:");

        p4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p4.setToolTipText("Enter length of  wingspan here");
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        p4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p4KeyTyped(evt);
            }
        });

        mmobileLabel.setBackground(new java.awt.Color(0, 0, 0));
        mmobileLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mmobileLabel.setForeground(new java.awt.Color(255, 255, 255));
        mmobileLabel.setText("Weight:");

        p6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p6.setToolTipText("Enter total weight of drone here");
        p6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p6KeyTyped(evt);
            }
        });

        addressLabel.setBackground(new java.awt.Color(0, 0, 0));
        addressLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Flight control");

        p7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p7.setToolTipText("Enter flight control here ");
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });

        genderLabel.setBackground(new java.awt.Color(0, 0, 0));
        genderLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Level:");

        p8.setBackground(new java.awt.Color(102, 102, 102));
        p8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p8.setForeground(new java.awt.Color(255, 255, 255));
        p8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Easy", "Medium", "Hard" }));

        dobLabel.setBackground(new java.awt.Color(0, 0, 0));
        dobLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("Altitude:");

        p9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p9.setToolTipText("Enter altitude of the drone here");
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });

        fathermobileLabel1.setBackground(new java.awt.Color(0, 0, 0));
        fathermobileLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fathermobileLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fathermobileLabel1.setText("Length:");

        p5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p5.setToolTipText("Enter total length of drone here");
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        p5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fatherNameLabel))
                                .addGap(119, 119, 119)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fathermobileLabel1)
                                .addGap(154, 154, 154)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p7)
                                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(mnameLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(mmobileLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(210, 210, 210)
                                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dobLabel)
                                .addGap(270, 270, 270)
                                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherNameLabel)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnameLabel)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mmobileLabel)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fathermobileLabel1)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dobLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Advance Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        p10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p10.setToolTipText("Enter Cruise speed here");
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });
        p10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p10KeyTyped(evt);
            }
        });

        droneIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        droneIdLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        droneIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        droneIdLabel.setText("Cruise speed:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dash speed:");

        p11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p11.setToolTipText("enter drone's dash speed here");

        doaLabel.setBackground(new java.awt.Color(0, 0, 0));
        doaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        doaLabel.setForeground(new java.awt.Color(255, 255, 255));
        doaLabel.setText("Payload options:");

        p12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p12.setToolTipText("Enter Payload options here");
        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });

        aadharLabel.setBackground(new java.awt.Color(0, 0, 0));
        aadharLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aadharLabel.setForeground(new java.awt.Color(255, 255, 255));
        aadharLabel.setText("Prototype:");

        p13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p13.setToolTipText("Enter prototype of drone here");
        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });

        yearLabel.setBackground(new java.awt.Color(0, 0, 0));
        yearLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Endurance:");

        p14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        p14.setToolTipText("Enter drone's endurance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(droneIdLabel)
                    .addComponent(aadharLabel))
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(yearLabel)
                        .addGap(64, 64, 64)
                        .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(doaLabel)
                        .addGap(27, 27, 27)
                        .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(droneIdLabel))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doaLabel)
                        .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aadharLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        backButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        newButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        getDataButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getDataButton.setText("Get Data");
        getDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        droneRecord.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        droneRecord.setText("Drone Record");
        droneRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                droneRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newButton)
                .addGap(24, 24, 24)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(getDataButton)
                .addGap(18, 18, 18)
                .addComponent(droneRecord)
                .addGap(185, 185, 185))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, deleteButton, droneRecord, getDataButton, newButton, saveButton, updateButton});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(getDataButton)
                    .addComponent(droneRecord)
                    .addComponent(updateButton)
                    .addComponent(saveButton)
                    .addComponent(newButton)
                    .addComponent(backButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                .addContainerGap())
        );

        stud.setRightComponent(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p7ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p9ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
        
    }//GEN-LAST:event_p10ActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p12ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p13ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainMenu menu=new MainMenu();
        this.hide();
        menu.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        p5.setText("");
        p6.setText("");
        p7.setText("");
        p8.setSelectedIndex(0);
        p9.setText("");
        p10.setText("");
        p11.setText("");
        p12.setText("");
        p13.setText("");
        p14.setText("");
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        p2.requestFocus();
    }//GEN-LAST:event_newButtonActionPerformed

    private void getDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataButtonActionPerformed
        this.hide();
        Records record=new Records();
        record.setVisible(true);
    }//GEN-LAST:event_getDataButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
         try{
            con = Connect.ConnectDB();
            String sql = "update drone set Name='"+p1.getText()+"',Model='"+p2.getText()+"',Use='"+p3.getText()+"',Wingspan='"+p4.getText()+"',Length='"+p5.getText()+"',Weight='"+p6.getText()+"',Flightcontrol='"+p7.getText()+"',Level='"+p8.getSelectedItem()+"',Altitude='"+p9.getText()+"',Cruisespeed='"+p10.getText()+"',Dashspeed='"+p11.getText()+"',Payloadoptions='"+p12.getText()+"',Prototype='"+ p13.getText()+"'where StudentID='"+p14.getText()+"'";

            pst = con.prepareStatement(sql);
            pst.execute();
            if("".equals(p10.getText())){
                JOptionPane.showMessageDialog(null, "Please select a record to update!");
                return;
            }
            JOptionPane.showMessageDialog(this, "Updated Successfully!","Record",JOptionPane.INFORMATION_MESSAGE);
            updateButton.setEnabled(false);
            
            
        }
        catch(HeadlessException | SQLException ex){

            JOptionPane.showMessageDialog(this,ex);
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        try{
            con = Connect.ConnectDB();
            if("".equals(p2.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Student ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Statement st;
            st = con.createStatement();
            String sql1="select Model from drone where Model='"+p2.getText()+"'";
            rs = st.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Drone Model already exists", "Error", JOptionPane.ERROR_MESSAGE);
                p2.setText("");
                p2.requestDefaultFocus();
                return;
            }

            //String sql= "insert into drone(Name,Model,Usage,Wingspan,Length,Weight,Flightcontrol,Level,Altitude,Cruisespeed,Dashspeed,Payloadoptions,Prototype,Endurance)values('"+p1.getText()+"','"+p2.getText()+"','"+p3.getText()+"','"+p4.getText()+"','"+p5.getText()+"','"+p6.getText()+"','"+p7.getText()+"','"+p8.getSelectedItem()+"','"+p9.getText()+"','"+p10.getText()+"','"+p11.getText()+"','"+p12.getText()+"','"+p13.getText()+"','"+p14.getText()+"')";
            //pst = con.prepareStatement(sql);
            String sql= "insert into drone values('"+p1.getText()+"','"+p2.getText()+"','"+p3.getText()+"','"+p4.getText()+"','"+p5.getText()+"','"+p6.getText()+"','"+p7.getText()+"','"+p8.getSelectedItem()+"','"+p9.getText()+"','"+p10.getText()+"','"+p11.getText()+"','"+p12.getText()+"','"+p13.getText()+"','"+p14.getText()+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered!", "Student", JOptionPane.INFORMATION_MESSAGE);
            saveButton.setEnabled(false);
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        try{
            if("".equals(p2.getText())){
                JOptionPane.showMessageDialog(null, "Please enter Student ID to delete record!");
                return;
            }
            int d = JOptionPane.showConfirmDialog(this, "Are sure want to delete.?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(d==0){
                con = Connect.ConnectDB();
                String sql = "delete from drone where Model='"+p2.getText()+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                reset();
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void droneRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_droneRecordActionPerformed
        Records record = new Records();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_droneRecordActionPerformed

    private void p4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p4KeyTyped
        //char input = evt.getKeyChar();
         //if(!(input<'0' || input>'9') && input!='\b'){
           //  evt.consume();
             //JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
         //}
    }//GEN-LAST:event_p4KeyTyped

    private void p6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p6KeyTyped
        //char input = evt.getKeyChar();
         //if((input<'0' || input>'9') && input!='\b'){
           //  evt.consume();
             //JOptionPane.showMessageDialog(this, "Please enter digits!");
         //}
    }//GEN-LAST:event_p6KeyTyped

    private void p10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p10KeyTyped
        //char input = evt.getKeyChar();
         //if((input<'0' || input>'9') && input!='\b'){
           //  evt.consume();
             //JOptionPane.showMessageDialog(this, "Please enter digits!");
        // }
    }//GEN-LAST:event_p10KeyTyped

    private void p5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p5KeyTyped
        //char input = evt.getKeyChar();
         //if((input<'0' || input>'9') && input!='\b'){
           //  evt.consume();
             //JOptionPane.showMessageDialog(this, "Please enter digits!");
         //}
    }//GEN-LAST:event_p5KeyTyped

    private void p1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyTyped
        //char input = evt.getKeyChar();
         //if(!(input<'0' || input>'9') && input!='\b'){
           //  evt.consume();
             //JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
        // }
    }//GEN-LAST:event_p1KeyTyped

    private void p3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p3KeyTyped
        //char input = evt.getKeyChar();
         //if(!(input<'0' || input>'9') && input!='\b'){
           //  evt.consume();
             //JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
       //  }
    }//GEN-LAST:event_p3KeyTyped

    private void p2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2KeyTyped
        //char input = evt.getKeyChar();
        // if(!(input<'0' || input>'9') && input!='\b'){
          //   evt.consume();
            // JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
        // }
    }//GEN-LAST:event_p2KeyTyped

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4ActionPerformed

     void reset(){
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        p5.setText("");
        p6.setText("");
        p7.setText("");
        p8.setSelectedIndex(0);
        p9.setText("");
        p10.setText("");
        p11.setText("");
        p12.setText("");
        p13.setText("");
        p14.setText("");
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        p10.requestFocus();
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
            java.util.logging.Logger.getLogger(UAVDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UAVDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UAVDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UAVDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new UAVDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aadharLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    public javax.swing.JButton deleteButton;
    private javax.swing.JLabel doaLabel;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel droneIdLabel;
    private javax.swing.JButton droneRecord;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JLabel fathermobileLabel1;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton getDataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel mmobileLabel;
    private javax.swing.JLabel mnameLabel;
    private javax.swing.JButton newButton;
    public javax.swing.JTextField p1;
    public javax.swing.JTextField p10;
    public javax.swing.JTextField p11;
    public javax.swing.JTextField p12;
    public javax.swing.JTextField p13;
    public javax.swing.JTextField p14;
    public javax.swing.JTextField p2;
    public javax.swing.JTextField p3;
    public javax.swing.JTextField p4;
    public javax.swing.JTextField p5;
    public javax.swing.JTextField p6;
    public javax.swing.JTextField p7;
    public javax.swing.JComboBox<String> p8;
    public javax.swing.JTextField p9;
    public javax.swing.JButton saveButton;
    private javax.swing.JSplitPane stud;
    public javax.swing.JButton updateButton;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
