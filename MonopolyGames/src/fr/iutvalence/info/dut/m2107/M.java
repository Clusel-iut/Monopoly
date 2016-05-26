package fr.iutvalence.info.dut.m2107;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import fr.iutvalence.info.dut.m2107.R.TraitementBut1;

public class M extends JFrame implements ActionListener
{
	
    private String mot;                    // On créé la variable mot
    private JButton lancerde, acheter, vendre, passertour, actioncase, quitter,pion;       // On créé les deux boutons           
    JPanel panneau = new JPanel ();
    JLabel plateau = new JLabel();
    JLabel affichage = new JLabel();
    
    //JLabel pionjaune = new JLabel();
    //JLabel pionbleu = new JLabel();
    static JFrame ecran;
    
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
        quitter = new JButton("quitter");
        pion = new JButton("1");
        
        pion.setBackground(Color.GREEN);
        
        // Fait que le bouton attend une action
        lancerde.addActionListener(new TraitementBut1());  
        acheter.addActionListener(new TraitementBut2());   
        vendre.addActionListener(new TraitementBut3());
        passertour.addActionListener(new TraitementBut4());
        actioncase.addActionListener(new TraitementBut5());
        quitter.addActionListener(new TraitementBut6());
        pion.addActionListener(this);
        
        // Permet de choisir la taille et l'emplacement des bouton et de la fenetre
        lancerde.setBounds(550, 0, 110, 70);
        acheter.setBounds(550, 90, 110, 70);
        vendre.setBounds(550, 180, 110, 70);
        passertour.setBounds(550, 270, 110, 70);
        actioncase.setBounds(550, 360, 110, 70);
        quitter.setBounds(550, 450, 110, 70);
        pion.setBounds(450, 460, 20, 20);
        panneau.setBounds(300, 100, 800, 500);
        ecran.setBounds(300, 100, 800, 550);
        
    
        // Ajoute l'image et les boutons à la fenetre
        panneau.add(lancerde);
        panneau.add(acheter);
        panneau.add(vendre);
        panneau.add(passertour);
        panneau.add(actioncase);
        panneau.add(quitter);
        panneau.add(pion);
        panneau.add(plateau);
       
        
        // Affiche la fenetre 
        ecran.add(panneau);
       
        // Met la fenetre visble 
        ecran.setVisible(false);
        //validate();
        
        
    }

    public  class   TraitementBut1 implements   ActionListener
    {
         /**
         * obligatoire car test implémente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	System.out.println("Slt");
        }
    }
    
     public  class   TraitementBut2 implements   ActionListener
    {
         /**
         * obligatoire car test implémente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	System.out.println("Sa");
            
        }
    }
     public  class   TraitementBut3 implements   ActionListener
     {
          /**
          * obligatoire car test implémente l'interface ActionListener
          */
         public  void    actionPerformed(ActionEvent e)
         {
        	 System.out.println("Va");
         }
     }
     
      public  class   TraitementBut4 implements   ActionListener
     {
          /**
          * obligatoire car test implémente l'interface ActionListener
          */
         public  void    actionPerformed(ActionEvent e)
         {
        	 System.out.println("Les");
             
         }
     }
      
      public  class   TraitementBut5 implements   ActionListener
      {
           /**
           * obligatoire car test implémente l'interface ActionListener
           */
          public  void    actionPerformed(ActionEvent e)
          {
         	 System.out.println("Gens");
              
          }
      }
      
      public  class   TraitementBut6 implements   ActionListener
      {
           /**
           * obligatoire car test implémente l'interface ActionListener
           */
          public  void    actionPerformed(ActionEvent e)
          {
          	 ecran.dispose();
              
          }
      }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}      
 
}
  
