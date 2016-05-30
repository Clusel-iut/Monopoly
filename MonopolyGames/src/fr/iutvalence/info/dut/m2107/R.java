package fr.iutvalence.info.dut.m2107;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class R extends JFrame implements ActionListener
{
	
    private String mot;                    // On créé la variable mot
    private JButton jouer;      			   // On créé les deux boutons           
	private JButton quitter;
    JPanel panoe = new JPanel ();
    JLabel image = new JLabel();
    JLabel affichage = new JLabel();
    JFrame fenetre;
    
    public R()// Constructeur pde la classe
    {
        setSize(700, 500);       //Taille de fenetre
        setTitle("Bouton");      // Nom de la fentre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        fenetre = new JFrame("Ma premiere fenetre");
		fenetre.setBounds(300, 100, 412, 440);
		fenetre.setLayout(new GridLayout(1,1));
		
        //Selection d'un image depuis mon ordinateur
        //image.setIcon(new ImageIcon(this.getClass().getResource("/l.png")));
        image.setIcon(new ImageIcon(("G:\\git\\Monopoly2\\MonopolyGames\\images\\l.png")));
        panoe = new JPanel(new BorderLayout(40, 50)); // Taille
        //panoe.setLayout(new GridLayout(1,1));
        jouer = new JButton("jouer");
        quitter = new JButton("quitter");
        
       
		jouer.addActionListener(new TraitementBut1());  // Fait que le bouton attend une action
        quitter.addActionListener(new TraitementBut2());   // Fait que le bouton attend une action
        
        // Permet de choisir la taille et l'emplacement des bouton et de la fenetre
        jouer.setBounds(50, 200, 100, 100);
        quitter.setBounds(200, 200, 100, 100);
        panoe.setBounds(300, 100, 800, 500);
        
        // Ajoute l'image et les boutons à la fenetre
        panoe.add(jouer);
        panoe.add(quitter);
        panoe.add(image);
        
        // Affiche la fenetre 
        fenetre.add(panoe);
        // Met la fenetre visble 
        fenetre.setVisible(true);
       // Graphics g = jouer.getGraphics();
       // g.setColor(Color.BLACK);
       // g.fillRect(jouer.getBounds().x, jouer.getBounds().y, jouer.getBounds().width, jouer.getBounds().height);
       // jouer.update(g);
       // jouer.repaint();
        
        validate();
        
        
      
        
  //  void fermer()
   // {
    // panoe.dispose();	   
    //}    
 
        
    }
    public  class   TraitementBut1 implements   ActionListener
    {
         /**
         * obligatoire car test implémente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	 M.ecran.setVisible(true);
        	 fenetre.dispose();
        	 M.ecran.setResizable(false);
        }
    }
    
     public  class   TraitementBut2 implements   ActionListener
    {
         /**
         * obligatoire car test implémente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	 fenetre.dispose();
            
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
     
