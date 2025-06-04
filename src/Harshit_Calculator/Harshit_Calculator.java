package Harshit_Calculator;
import java.awt.*;
/**
 *
 * @author Harshit Raj
 */
public class Harshit_Calculator extends javax.swing.JFrame {
    
 // Variables to store the operands and result of calculations
    double NumberEnter1;
    double  NumberEnter2;
    double Result;
    String op;
    
    public Harshit_Calculator() {
        initComponents();
    }
    /**
     * This method initializes all GUI components (buttons, labels, text field)
     * and sets their layout, colors, fonts, and event handlers.
     */

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

       //Assigning TextField,Button and Label 
        jtxtResult = new javax.swing.JTextField(); // Display for input/output
        jbtnCE = new javax.swing.JButton();         // Clear entry
        jbtnBKP = new javax.swing.JButton();        // Backspace
        jbtnSum = new javax.swing.JButton();        // Addition
        jbtnC = new javax.swing.JButton();          // Clear all
        jbtnDigit8 = new javax.swing.JButton();     // Digits 0–9
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();        // Decimal point
        jbtnEqual = new javax.swing.JButton();       // Equal button
        jbtnPM = new javax.swing.JButton();           // Positive/negative toggle
        jbtnSub = new javax.swing.JButton();          // Subtraction
        jbtnMul = new javax.swing.JButton();           // Multiplication
        jbtnDiv = new javax.swing.JButton();             // Division
        jLabel1 = new javax.swing.JLabel();            // Title label
        jLabel2 = new javax.swing.JLabel();             //Name Label

        // Set up JFrame properties
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 128));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 255));
        setResizable(false);
       getContentPane().setBackground(new Color(128, 0, 128));   //Background colour

         // Setup jtxtResult
        jtxtResult.setBackground(new java.awt.Color(255, 172, 72));
      jtxtResult.setFont(new java.awt.Font("Monospaced", java.awt.Font.BOLD, 24));
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });

         // Set button text, font, background and actions
        jbtnCE.setBackground(new java.awt.Color(0, 255, 255));
        jbtnCE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });

        jbtnBKP.setBackground(new java.awt.Color(0, 255, 255));
        jbtnBKP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnBKP.setText("BKP");
        jbtnBKP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBKPActionPerformed(evt);
            }
        });

        
        jbtnSum.setBackground(new java.awt.Color(102, 255, 0));
        jbtnSum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnSum.setText("+");
        jbtnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumActionPerformed(evt);
            }
        });

        jbtnC.setBackground(new java.awt.Color(0, 255, 255));
        jbtnC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        jbtnDigit8.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });

        jbtnDigit7.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });

        jbtnDigit9.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });

        jbtnDigit5.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });

        jbtnDigit4.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });

        jbtnDigit6.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });

        jbtnDigit2.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });

        jbtnDigit1.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });

        jbtnDigit3.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });

        jbtnDigit0.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDigit0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });

        jbtnDot.setBackground(new java.awt.Color(255, 204, 255));
        jbtnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtnEqual.setBackground(new java.awt.Color(0, 0, 255));
        jbtnEqual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        jbtnPM.setBackground(new java.awt.Color(0, 255, 255));
        jbtnPM.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPM.setText("+/-");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });

        jbtnSub.setBackground(new java.awt.Color(102, 255, 0));
        jbtnSub.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnSub.setText("-");
        jbtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubActionPerformed(evt);
            }
        });

        jbtnMul.setBackground(new java.awt.Color(102, 255, 0));
        jbtnMul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnMul.setText("*");
        jbtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMulActionPerformed(evt);
            }
        });

        jbtnDiv.setBackground(new java.awt.Color(102, 255, 0));
        jbtnDiv.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDiv.setText("/");
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });

         // Display "CASIO" and author signature
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setText("CASIO");

        jLabel2.setBackground(new java.awt.Color(204, 255, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("      MADE BY HARSHIT RAJ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnBKP)
                                .addGap(5, 5, 5)
                                .addComponent(jbtnCE)
                                .addGap(8, 8, 8)
                                .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jbtnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jbtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jbtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jbtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jbtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnBKP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
     private void EnterNumbers(String q){
     String Nums=jtxtResult.getText() + q;
     jtxtResult.setText(Nums);
     }
    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

     // Button Event Handlers
    private void jbtnSumActionPerformed(java.awt.event.ActionEvent evt) {
    NumberEnter1 =Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText("");
     op="+";
        // Set operation to addition
    }

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {
     NumberEnter1 =Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText("");
     op="/";
        // Set operation to division
    }

    private void jbtnBKPActionPerformed(java.awt.event.ActionEvent evt) {
      
        String backSp =null;
        if(jtxtResult.getText().length() >0){
            
            StringBuilder ab=new StringBuilder(jtxtResult.getText());
            ab.deleteCharAt(jtxtResult.getText().length() -1);
            backSp =ab.toString();
            jtxtResult.setText( backSp);
        }
    }
    
  // Each digit button calls EnterNumbers with the respective digit
    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {
       EnterNumbers("7");
    }

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {
          EnterNumbers("8");
    }

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {
      EnterNumbers("9");
    }

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("4");
    }

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {
          EnterNumbers("5");
    }

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {
          EnterNumbers("6");
    }

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {
       EnterNumbers("1");
    }

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {
       EnterNumbers("2");
    }

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {
       EnterNumbers("3");
    }

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {
    EnterNumbers("0");
    }

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {
      if(! jtxtResult.getText().contains(".")) {
          jtxtResult.setText(jtxtResult.getText()+ jbtnDot.getText() );
      }
    }

    private void jbtnMulActionPerformed(java.awt.event.ActionEvent evt) {
       NumberEnter1 =Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText("");
     op="*";
        // Multiplication
    }

    private void jbtnSubActionPerformed(java.awt.event.ActionEvent evt) {
      NumberEnter1 =Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText("");
     op="-";
         // Subtraction
    }

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear display only
        jtxtResult.setText("");
    }

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {
            // Change sign
        jtxtResult.setText("");
        
        String Fn , Sn;
        
        Fn=String.valueOf(NumberEnter1);
    Sn= String.valueOf(NumberEnter2);
    Fn="";
    Sn="";
    
    }

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {
   double nums=Double.parseDouble(String.valueOf(jtxtResult.getText()));
  nums =nums*(-1);
   jtxtResult.setText(String.valueOf( nums));
    }

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {
          // Perform the selected operation
    NumberEnter2 =Double.parseDouble(jtxtResult.getText());
    if (op =="+"){
     Result =NumberEnter1 +NumberEnter2;
     jtxtResult.setText(String.valueOf(Result));
    }
  else  if (op =="-"){
     Result =NumberEnter1 - NumberEnter2;
     jtxtResult.setText(String.valueOf(Result));
    }
  
 else   if (op =="*"){
     Result =NumberEnter1*NumberEnter2;
     jtxtResult.setText(String.valueOf(Result));
    }
    
     else   if (op =="/"){
     Result =NumberEnter1/NumberEnter2;
     jtxtResult.setText(String.valueOf(Result));
    }
    

    }

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Harshit_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Harshit_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Harshit_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Harshit_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Harshit_Calculator().setVisible(true);
            }
        });
    }

 
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnBKP;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMul;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnSub;
    private javax.swing.JButton jbtnSum;
    private javax.swing.JTextField jtxtResult;
  
}
