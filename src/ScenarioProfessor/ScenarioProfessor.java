package ScenarioProfessor;

import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import Exit.Exit;
import Home.Home;
import ScenarioYasser.ScenarioYasser;
import java.net.URL;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class ScenarioProfessor extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ScenarioProfessor frame = new ScenarioProfessor();;
    private final Exit exit = new Exit();
    private static URL[] prof;
    private static URL[] words;
    /**
     * Creates new form Scenario
     */
    public ScenarioProfessor() {
        ScenarioProfessor.words = new URL[]{getClass().getResource("/ScenarioProfessor/1.png"), getClass().getResource("/ScenarioProfessor/2.png"), getClass().getResource("/ScenarioProfessor/3.png"), getClass().getResource("/ScenarioProfessor/4.png"), getClass().getResource("/ScenarioProfessor/5.png"), getClass().getResource("/ScenarioProfessor/6.png"), getClass().getResource("/ScenarioProfessor/7.png"), getClass().getResource("/ScenarioProfessor/8.png"), getClass().getResource("/ScenarioProfessor/9.png")};
        ScenarioProfessor.prof = new URL[]{getClass().getResource("/ScenarioProfessor/prof1.png"), getClass().getResource("/ScenarioProfessor/prof2.png")};
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sound = new javax.swing.JButton();
        gotIt = new javax.swing.JButton();
        wordsButton = new javax.swing.JButton();
        profButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sound/on(1).png"))); // NOI18N
        sound.setBorderPainted(false);
        sound.setContentAreaFilled(false);
        sound.setDefaultCapable(false);
        sound.setFocusPainted(false);
        sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundActionPerformed(evt);
            }
        });
        getContentPane().add(sound);
        sound.setBounds(1260, 0, 100, 100);

        gotIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScenarioProfessor/got-it.png"))); // NOI18N
        gotIt.setBorderPainted(false);
        gotIt.setContentAreaFilled(false);
        gotIt.setDefaultCapable(false);
        gotIt.setFocusPainted(false);
        gotIt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotItMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotItMouseExited(evt);
            }
        });
        gotIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotItActionPerformed(evt);
            }
        });
        getContentPane().add(gotIt);
        gotIt.setBounds(1090, 660, 270, 100);

        wordsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScenarioProfessor/1.png"))); // NOI18N
        wordsButton.setBorderPainted(false);
        wordsButton.setContentAreaFilled(false);
        wordsButton.setDefaultCapable(false);
        wordsButton.setFocusPainted(false);
        getContentPane().add(wordsButton);
        wordsButton.setBounds(20, 70, 510, 310);

        profButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScenarioProfessor/prof1.png"))); // NOI18N
        profButton.setBorderPainted(false);
        profButton.setContentAreaFilled(false);
        profButton.setDefaultCapable(false);
        profButton.setFocusPainted(false);
        getContentPane().add(profButton);
        profButton.setBounds(560, 40, 800, 630);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit/exit.png"))); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setDefaultCapable(false);
        exitButton.setFocusPainted(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(0, 0, 200, 70);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScenarioProfessor/background.png"))); // NOI18N
        background.setLabelFor(background);
        getContentPane().add(background);
        background.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        if(!Home.mute){
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/mute(1).png"));
            sound.setIcon(image);
            Home.audioClip.stop();
            Home.mute = true;
        }
        else{
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/on(1).png"));
            sound.setIcon(image);
            Home.audioClip.loop(Clip.LOOP_CONTINUOUSLY);
            Home.audioClip.start();
            Home.mute = false;
        }
    }//GEN-LAST:event_soundActionPerformed

    private void gotItMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotItMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/ScenarioProfessor/got-it-clicked.png"));
        gotIt.setIcon(image);
    }//GEN-LAST:event_gotItMouseEntered

    private void gotItMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotItMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/ScenarioProfessor/got-it.png"));
        gotIt.setIcon(image);
    }//GEN-LAST:event_gotItMouseExited

    private void gotItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotItActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        ScenarioYasser.main(null);
        frame.setVisible(false);
    }//GEN-LAST:event_gotItActionPerformed

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Exit/exit-clicked.png"));
        exitButton.setIcon(image);
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Exit/exit.png"));
        exitButton.setIcon(image);
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        exit.setTitle("Memory Game");
        exit.setSize(600, 446);
        exit.setVisible(true);
        exit.setLocationRelativeTo(null);
        exit.setResizable(false);
        frame.setEnabled(false);
        Exit.from = "Scenario";
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void setIt(){
        frame.setEnabled(true);
    }
    
    private static void time(double time){
        double end = System.currentTimeMillis() + time;
        while(System.currentTimeMillis() < end){
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                frame.setTitle("Memory Game");
                frame.setSize(1366, 768);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
                if(Home.mute){
                    ImageIcon image = new ImageIcon(getClass().getResource("/Sound/mute(1).png"));
                    sound.setIcon(image);
                }
            }
        });
        time(250);
        for(int i=0 ; i<9 ; i++){
            wordsButton.setIcon(new ImageIcon(words[i]));
            time(1500);
            profButton.setIcon(new ImageIcon(prof[0]));
            time(1500);
            profButton.setIcon(new ImageIcon(prof[1]));
            time(1500);
            profButton.setIcon(new ImageIcon(prof[0]));
            time(1500);
            profButton.setIcon(new ImageIcon(prof[1]));
            time(2000);
            if(i == 8)
                i = -1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gotIt;
    private static javax.swing.JButton profButton;
    private static javax.swing.JButton sound;
    private static javax.swing.JButton wordsButton;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(ScenarioProfessor.class.getName());
}
