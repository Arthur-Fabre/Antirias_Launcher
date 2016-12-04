/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antirias_launcher_v1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author TURPAL34000
 */
public class LauncherFrame extends JFrame implements ActionListener {

    private static LauncherFrame instance;

    private JLabel titre;
    private JTextField pseudo;
    private JPasswordField mdp;
    private JButton jouer;
    private JProgressBar pb;
    
    private JLabel fond;

    private String username = null;
    private String accessToken = null;
    private String id = null;

    public LauncherFrame() {
        

        this.setTitle("Mon Launcher Style");
        this.setSize(850, 500);
        //this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(64, 64, 64));
        //this.getContentPane(new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png")));
        /*
        fond = new JLabel(new ImageIcon("fond.jpg"));
        fond.setBounds(300, 300, 850, 500);
        this.add(fond);
       */
        titre = new JLabel("Antirias Launcher", SwingConstants.CENTER);
        titre.setForeground(Color.WHITE);
        titre.setFont(titre.getFont().deriveFont(60f));
        titre.setBounds(0, 20, 850, 100);
        this.add(titre);

        pseudo = new JTextField("Pseudo");
        pseudo.setBounds(350, 275, 150, 20);
        this.add(pseudo);

        mdp = new JPasswordField("Mot de Passe");
        mdp.setBounds(350, 305, 150, 20);
        this.add(mdp);
        
        jouer = new JButton("Jouer !");
        // Enregistre la fenetre entant qu'ActionListener
        jouer.addActionListener(this);
        jouer.setBounds(350, 335, 150, 20);
        this.add(jouer);
       
        pb = new JProgressBar();
        pb.setStringPainted(true);
        pb.setBounds(0, 480, 850, 20);
        this.add(pb);
        
        this.setVisible(true);
    }

   @Override
   public void actionPerformed(ActionEvent e) {
       Thread t = new Thread() {
           @Override
           public void run() {
               // Ici on appellera les methodes de la class Launcher
           }
       };
       t.start();
    }

    public static void main(String[] args) {
        // Astuce pour avoir le style visuel du systeme hôte
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        instance = new LauncherFrame();
    }

    // Retourne l'instance de LauncherFrame
    public static LauncherFrame getInstance() {
        return instance;
    }

    // Retourne l'instance de notre progress bar
    public JProgressBar getProgressBar() {
        return pb;
    }
    
}


