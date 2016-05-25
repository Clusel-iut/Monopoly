package fr.iutvalence.info.dut.m2107;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class M extends JFrame implements ActionListener
{
	
    private String mot;                    // On créé la variable mot
    private JButton lancerde, acheter, vendre, passertour, actioncase;       // On créé les deux boutons           
    JPanel panneau = new JPanel ();
    JLabel plateau = new JLabel();
    JLabel affichage = new JLabel();
    
    //JLabel pionjaune = new JLabel();
    //JLabel pionbleu = new JLabel();
    JFrame ecran;
    
    public M()// Constructeur pde la classe
    {
    	
        setSize(700, 500);       //Taille de fenetre
        setTitle("Bouton");      // Nom de la fentre
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ecran = new JFrame("Ma seconde fenetre");
		
		ecran.setLayout(new GridLayout(1,1));
		
        //Selection d'un image depuis mon ordinateur
        //plateau.setIcon(new ImageIcon(this.getClass().getResource("/s.jpg")));
        plateau.setIcon(new ImageIcon(("G:\\git\\MonopolyV2\\MonopolyGames\\images\\s.jpg")));
        
        panneau = new JPanel(new BorderLayout(40, 50)); // Taille
        //panneau.setLayout(new GridLayout(1,1));
        lancerde = new JButton("lancerde");
        acheter = new JButton("acheter");
        vendre = new JButton("vendre");
        passertour = new JButton("passertour");
        actioncase = new JButton("actioncase");
        
        // Fait que le bouton attend une action
        lancerde.addActionListener(this);  
        acheter.addActionListener(this);   
        vendre.addActionListener(this);
        passertour.addActionListener(this);
        actioncase.addActionListener(this);
        
        // Permet de choisir la taille et l'emplacement des bouton et de la fenetre
        lancerde.setBounds(550, 50, 90, 70);
        acheter.setBounds(550, 140, 90, 70);
        vendre.setBounds(550, 230, 90, 70);
        passertour.setBounds(550, 320, 90, 70);
        actioncase.setBounds(550, 410, 90, 70);
        panneau.setBounds(300, 100, 800, 500);
        ecran.setBounds(300, 100, 800, 550);
        
    
        // Ajoute l'image et les boutons à la fenetre
        panneau.add(lancerde);
        panneau.add(acheter);
        panneau.add(vendre);
        panneau.add(passertour);
        panneau.add(actioncase);
        panneau.add(plateau);
       
        
        // Affiche la fenetre 
        ecran.add(panneau);
       
        // Met la fenetre visble 
        ecran.setVisible(true);
        //validate();
        
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

 
}
  
