/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

/**
 *
 * @author calinbora
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    
    private int humanScore;
    private int computerScore;
    private int drawScore;
    
    public Game() {
        initComponents();
        
        restartjButton.setVisible(false);
        RockjButton.setVisible(false);
        PaperjButton.setVisible(false);
        ScissorsjButton.setVisible(false);
        computerscorejLabel.setVisible(false);
        computerScorejLabel.setVisible(false);
        humanscorejLabel.setVisible(false);
        humanScorejLabel.setVisible(false);
        drawscorejLabel.setVisible(false);
        drawScorejLabel.setVisible(false);
        restartjButton.setVisible(false);
        
        humanScore = Integer.parseInt(humanScorejLabel.getText());
        computerScore = Integer.parseInt(computerScorejLabel.getText());
        drawScore = Integer.parseInt(drawScorejLabel.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startjButton = new javax.swing.JButton();
        restartjButton = new javax.swing.JButton();
        RockjButton = new javax.swing.JButton();
        PaperjButton = new javax.swing.JButton();
        ScissorsjButton = new javax.swing.JButton();
        computerscorejLabel = new javax.swing.JLabel();
        computerScorejLabel = new javax.swing.JLabel();
        humanscorejLabel = new javax.swing.JLabel();
        humanScorejLabel = new javax.swing.JLabel();
        drawscorejLabel = new javax.swing.JLabel();
        drawScorejLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startjButton.setText("Start Game");
        startjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startjButtonActionPerformed(evt);
            }
        });

        restartjButton.setText("Restart Game");
        restartjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartjButtonActionPerformed(evt);
            }
        });

        RockjButton.setText("Rock");
        RockjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RockjButtonActionPerformed(evt);
            }
        });

        PaperjButton.setText("Paper");
        PaperjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperjButtonActionPerformed(evt);
            }
        });

        ScissorsjButton.setText("Scissors");
        ScissorsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScissorsjButtonActionPerformed(evt);
            }
        });

        computerscorejLabel.setText("Computer Score");

        computerScorejLabel.setText("0");

        humanscorejLabel.setText("Human Score");

        humanScorejLabel.setText("0");

        drawscorejLabel.setText("Draw");

        drawScorejLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restartjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(startjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RockjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computerScorejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computerscorejLabel))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drawscorejLabel)
                                    .addComponent(drawScorejLabel))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(humanScorejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(humanscorejLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PaperjButton)
                                .addGap(93, 93, 93)
                                .addComponent(ScissorsjButton)))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerscorejLabel)
                    .addComponent(humanscorejLabel)
                    .addComponent(drawscorejLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerScorejLabel)
                    .addComponent(humanScorejLabel)
                    .addComponent(drawScorejLabel))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RockjButton)
                    .addComponent(PaperjButton)
                    .addComponent(ScissorsjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(startjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restartjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //action start button
    private void startjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startjButtonActionPerformed
        // TODO add your handling code here:
        
        restartjButton.setVisible(true);
        RockjButton.setVisible(true);
        PaperjButton.setVisible(true);
        ScissorsjButton.setVisible(true);        
        computerscorejLabel.setVisible(true);
        computerScorejLabel.setVisible(true);
        humanscorejLabel.setVisible(true);
        humanScorejLabel.setVisible(true);
        drawscorejLabel.setVisible(true);
        drawScorejLabel.setVisible(true);
        restartjButton.setVisible(true);
        
        startjButton.setVisible(false);
    }//GEN-LAST:event_startjButtonActionPerformed

    // 0 - rock 1 - paper 3 - Scissors 
    private void RockjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RockjButtonActionPerformed
        // TODO add your handling code here:
        
        new choiceGame();

        
        switch (choiceGame.getcomputerChoice()) {
            case 0:
                
                drawScore = drawScore +1;
                
                drawScorejLabel.setText(String.valueOf(drawScore));
                
                break;
            case 1:
                
                computerScore = computerScore +1;
                System.out.println("You lose");
                
                computerScorejLabel.setText(String.valueOf(computerScore));
                
                break;    
            case 2:
                
                humanScore = humanScore + 1;
                System.out.println("You win");
                
                humanScorejLabel.setText(String.valueOf(humanScore));

                break;
            default:
                throw new AssertionError();
        }
        
    }//GEN-LAST:event_RockjButtonActionPerformed

    // 0 - rock 1 - paper 3 - Scissors 
    private void PaperjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperjButtonActionPerformed
        // TODO add your handling code here:
        
        new choiceGame();
        
        switch (choiceGame.getcomputerChoice()) {
            case 0:
                
                humanScore = humanScore + 1;
                
                humanScorejLabel.setText(String.valueOf(humanScore));
                
                break;
            case 1:
                
                drawScore = drawScore + 1;
                
                drawScorejLabel.setText(String.valueOf(drawScore));
                
                
                break;    
            case 2:
                
                computerScore = computerScore + 1;
                
                computerScorejLabel.setText(String.valueOf(computerScore));

                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_PaperjButtonActionPerformed

    // 0 - rock 1 - paper 3 - Scissors 
    private void ScissorsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScissorsjButtonActionPerformed
        // TODO add your handling code here:
        
        new choiceGame();
        
        switch (choiceGame.getcomputerChoice()) {
            case 0:
                
                computerScore = computerScore + 1;
                
                computerScorejLabel.setText(String.valueOf(computerScore));
                
                break;
            case 1:
                
                humanScore = humanScore + 1;
                
                humanScorejLabel.setText(String.valueOf(humanScore));
                
                
                break;    
            case 2:
                
                drawScore = drawScore + 1;
                
                drawScorejLabel.setText(String.valueOf(drawScore));

                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_ScissorsjButtonActionPerformed

    private void restartjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartjButtonActionPerformed
        // TODO add your handling code here:
        
        computerScore = 0;
        humanScore = 0;
        drawScore = 0;
        
        computerScorejLabel.setText(String.valueOf(computerScore));
        humanScorejLabel.setText(String.valueOf(humanScore));
        drawScorejLabel.setText(String.valueOf(drawScore));
    }//GEN-LAST:event_restartjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PaperjButton;
    private javax.swing.JButton RockjButton;
    private javax.swing.JButton ScissorsjButton;
    private javax.swing.JLabel computerScorejLabel;
    private javax.swing.JLabel computerscorejLabel;
    private javax.swing.JLabel drawScorejLabel;
    private javax.swing.JLabel drawscorejLabel;
    private javax.swing.JLabel humanScorejLabel;
    private javax.swing.JLabel humanscorejLabel;
    private javax.swing.JButton restartjButton;
    private javax.swing.JButton startjButton;
    // End of variables declaration//GEN-END:variables
}
