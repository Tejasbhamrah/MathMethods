
import java.awt.Component;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas Bhamrah
 */
public class MathMethods extends javax.swing.JFrame {

    /**
     * Creates new form MathMethods
     */
    public MathMethods() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Largeinput1 = new javax.swing.JTextField();
        Largeinput2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Smallinput1 = new javax.swing.JTextField();
        Smallinput2 = new javax.swing.JTextField();
        Powerinput2 = new javax.swing.JTextField();
        Powerinput1 = new javax.swing.JTextField();
        Rootinput = new javax.swing.JTextField();
        Cubeinput = new javax.swing.JTextField();
        Calculate1 = new javax.swing.JButton();
        Calculate2 = new javax.swing.JButton();
        Calculate3 = new javax.swing.JButton();
        Calculate4 = new javax.swing.JButton();
        Calculate5 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Output = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Sin = new javax.swing.JTextField();
        Calculate6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("vs");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Math Methods");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Largest Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Smallest Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Power Function");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cuberoot");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Squareroot ");

        Largeinput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Largeinput1ActionPerformed(evt);
            }
        });

        Largeinput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Largeinput2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("vs");

        Smallinput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Smallinput1ActionPerformed(evt);
            }
        });

        Smallinput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Smallinput2ActionPerformed(evt);
            }
        });

        Powerinput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Powerinput2ActionPerformed(evt);
            }
        });

        Powerinput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Powerinput1ActionPerformed(evt);
            }
        });

        Rootinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RootinputActionPerformed(evt);
            }
        });

        Cubeinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CubeinputActionPerformed(evt);
            }
        });

        Calculate1.setText("Calculate");
        Calculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate1ActionPerformed(evt);
            }
        });

        Calculate2.setText("Calculate");
        Calculate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate2ActionPerformed(evt);
            }
        });

        Calculate3.setText("Calculate");
        Calculate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate3ActionPerformed(evt);
            }
        });

        Calculate4.setText("Calculate");
        Calculate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate4ActionPerformed(evt);
            }
        });

        Calculate5.setText("Calculate");
        Calculate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate5ActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Clear.setText("Clear All");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("vs");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel11.setText("to the power of");

        Output.setEditable(false);

        jLabel12.setText("Output");

        Calculate6.setText("Calculate");
        Calculate6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate6ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Sin ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rootinput, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calculate5))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Powerinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addComponent(Calculate3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Powerinput2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Largeinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(35, 35, 35)
                                .addComponent(Largeinput2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(Calculate1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Calculate6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Sin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)))
                                .addGap(88, 88, 88))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Smallinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(Smallinput2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Calculate2)
                                    .addComponent(jLabel4))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Cubeinput, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Calculate4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel12)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Largeinput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Largeinput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(Calculate1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Smallinput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Smallinput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(Sin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calculate2)
                            .addComponent(Calculate6))))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(Calculate4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Powerinput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Powerinput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cubeinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Calculate3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Rootinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Calculate5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit)
                    .addComponent(Clear))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Custom function that returns a value
    private double GetInput(JTextField input){
        return Double.parseDouble(input.getText());
    }

    //the following are all text fields or buttons which perform tasks

    private void Largeinput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Largeinput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Largeinput1ActionPerformed

    private void Largeinput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Largeinput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Largeinput2ActionPerformed

    private void Smallinput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Smallinput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Smallinput1ActionPerformed

    private void Smallinput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Smallinput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Smallinput2ActionPerformed

    private void Powerinput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Powerinput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Powerinput2ActionPerformed

    private void Powerinput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Powerinput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Powerinput1ActionPerformed

    private void RootinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RootinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RootinputActionPerformed

    private void CubeinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CubeinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CubeinputActionPerformed
    //button used to calculate
    private void Calculate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate1ActionPerformed
  try {
      //retrieves data from text fields
      double lginput1 = GetInput(Largeinput1);
      double lginput2 = GetInput(Largeinput2);

    //displays output of calculation    
        Output.setText(String.valueOf("The larger number is: " +Math.max(lginput1,lginput2)));    
  } 
  //checks to see if all inputs are valid
  catch (NumberFormatException e) {
      Component jScrollPane = null;
            JOptionPane.showMessageDialog(jScrollPane, "Error! Please check your inputs.");

        }
  
    }//GEN-LAST:event_Calculate1ActionPerformed

    private void Calculate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate2ActionPerformed
try {
    //retrieves data from text fields
    double slinput1 = GetInput(Smallinput1);
    double slinput2 = GetInput(Smallinput2);
           
    //prints out answer    
        Output.setText(String.valueOf("The smaller number is: " +Math.min(slinput1,slinput2)));    
  } catch (NumberFormatException e) {
      Component jScrollPane1 = null;
            JOptionPane.showMessageDialog(jScrollPane1, "Error! Please check your inputs.");

        }
    }//GEN-LAST:event_Calculate2ActionPerformed

    private void Calculate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate3ActionPerformed
     try {
         //receives user inputs
         double powinput1 = GetInput(Powerinput1);
         double powinput2 = GetInput(Powerinput2);
       
       //prints out answer
        Output.setText(String.valueOf("Number 1 to the power of number 2 is: " +Math.pow(powinput1,powinput2)));
        } catch (NumberFormatException e) {
      Component jScrollPane1 = null;
            JOptionPane.showMessageDialog(jScrollPane1, "Error! Please check your inputs.");

        }
    }//GEN-LAST:event_Calculate3ActionPerformed

    private void Calculate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate4ActionPerformed
      try {
          //receives inputs
          double cubeinput = GetInput(Cubeinput);

       //sets output
       Output.setText(String.valueOf("The cube root of your number is:" +Math.cbrt(cubeinput) ));
     } catch (NumberFormatException e) {
      Component jScrollPane1 = null;
            JOptionPane.showMessageDialog(jScrollPane1, "Error! Please check your inputs.");

        }
    }//GEN-LAST:event_Calculate4ActionPerformed

    private void Calculate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate5ActionPerformed
 try {
     //receives inputs
     double rootinput = GetInput(Rootinput);

       //sets output
       Output.setText(String.valueOf("The square root of your function is:" +Math.sqrt(rootinput) ));
     }
        //checks to see if all inputs are numbers
        catch (NumberFormatException e) {
        Component jScrollPane1 = null;
            JOptionPane.showMessageDialog(jScrollPane1, "Error! Please check your inputs.");

        }        
    }//GEN-LAST:event_Calculate5ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    //exits application
        System.exit(0);        
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {
       
       //the following is my custom function which does not return a value.
        //this function clears all the text boxes.
       Largeinput1.setText(String.valueOf(""));
       Largeinput2.setText(String.valueOf(""));
       Powerinput1.setText(String.valueOf(""));
       Powerinput2.setText(String.valueOf(""));
       Smallinput1.setText(String.valueOf(""));
       Smallinput2.setText(String.valueOf(""));
       Cubeinput.setText(String.valueOf(""));
       Rootinput.setText(String.valueOf(""));
       Output.setText(String.valueOf(""));
       Sin.setText(String.valueOf(""));
    }

    private void Calculate6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate6ActionPerformed
   try {
       //receives inputs
       double sin = GetInput(Sin);
       
       //sets output
       Output.setText(String.valueOf("The sin value of your number is:" +Math.sin(sin) ));
     } catch (NumberFormatException e) {
      Component jScrollPane1 = null;
            JOptionPane.showMessageDialog(jScrollPane1, "Error! Please check your inputs.");

        }
    }//GEN-LAST:event_Calculate6ActionPerformed



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
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate1;
    private javax.swing.JButton Calculate2;
    private javax.swing.JButton Calculate3;
    private javax.swing.JButton Calculate4;
    private javax.swing.JButton Calculate5;
    private javax.swing.JButton Calculate6;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Cubeinput;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Largeinput1;
    private javax.swing.JTextField Largeinput2;
    private javax.swing.JTextField Output;
    private javax.swing.JTextField Powerinput1;
    private javax.swing.JTextField Powerinput2;
    private javax.swing.JTextField Rootinput;
    private javax.swing.JTextField Sin;
    private javax.swing.JTextField Smallinput1;
    private javax.swing.JTextField Smallinput2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
