package fr.iutvalence.info.dut.m2107;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import fr.iutvalence.info.dut.m2107.R.TraitementBut1;

public class M extends JFrame implements ActionListener
{
	Joueur joueur1 = new Joueur("Clusel", "Mathieu");
	Joueur joueur2 = new Joueur("Rey", "Quentin");
	De mon_de = new De();
	Banque Labanque = new Banque();
    private String mot;                    // On cr�� la variable mot
    private JButton lancerde, acheter, vendre, passertour, actioncase, quitter, pion1, pion2, banque;       // On cr�� les deux boutons           
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
		//
        plateau.setIcon(new ImageIcon(("G:\\git\\Monopoly2\\MonopolyGames\\images\\s.jpg")));
        
        panneau = new JPanel(new BorderLayout(40, 50)); // Taille
        //panneau.setLayout(new GridLayout(1,1));
        lancerde = new JButton("lancerde");
        acheter = new JButton("acheter");
        vendre = new JButton("vendre");
        passertour = new JButton("passertour");
        actioncase = new JButton("actioncase");
        quitter = new JButton("quitter");
        banque = new JButton("Banque");
        pion1 = new JButton("1");
        pion2 = new JButton("2");
        
        pion1.setBackground(Color.GREEN);
        pion2.setBackground(Color.YELLOW);
        
        // Fait que le bouton attend une action
        lancerde.addActionListener(new TraitementBut1());  
        acheter.addActionListener(new TraitementBut2());   
        vendre.addActionListener(new TraitementBut3());
        passertour.addActionListener(new TraitementBut4());
        actioncase.addActionListener(new TraitementBut5());
        quitter.addActionListener(new TraitementBut6());
        pion1.addActionListener(new TraitementBut7());
        pion2.addActionListener(new TraitementBut8());
        banque.addActionListener(new TraitementBut9());
        
        // Permet de choisir la taille et l'emplacement des bouton et de la fenetre
        lancerde.setBounds(550, 0, 110, 70);
        acheter.setBounds(550, 90, 110, 70);
        vendre.setBounds(550, 180, 110, 70);
        passertour.setBounds(550, 270, 110, 70);
        actioncase.setBounds(550, 360, 110, 70);
        quitter.setBounds(550, 450, 110, 70);
        pion1.setBounds(450, 460, 20, 20);
        pion2.setBounds(450+25, 460, 20, 20);
        banque.setBounds(670, 0, 110, 70);
        panneau.setBounds(300, 100, 800, 500);
        ecran.setBounds(300, 100, 800, 550);
        
    
        // Ajoute l'image et les boutons � la fenetre
        panneau.add(lancerde);
        panneau.add(acheter);
        panneau.add(vendre);
        panneau.add(passertour);
        panneau.add(actioncase);
        panneau.add(quitter);
        panneau.add(pion1);
        panneau.add(pion2);
        panneau.add(banque);
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
         * obligatoire car test impl�mente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	mon_de.lancerDe();
        	System.out.println("de1 = " +mon_de.getValeur_de1());
        	System.out.println("de2 = " +mon_de.getValeur_de2());
        	System.out.println("Le joueur avance de : " +mon_de.getAdvance()+" cases.");
        }
    }
    
     public  class   TraitementBut2 implements   ActionListener
    {
    	 
         /**
         * obligatoire car test impl�mente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	 joueur1.deleteMoney(500);
        	
        }
    }
     public  class   TraitementBut3 implements   ActionListener
     {
          /**
          * obligatoire car test impl�mente l'interface ActionListener
          */
         public  void    actionPerformed(ActionEvent e)
         {
        	 System.out.println("Va");
         }
     }
     
      public  class   TraitementBut4 implements   ActionListener
     {
          /**
          * obligatoire car test impl�mente l'interface ActionListener
          */
         public  void    actionPerformed(ActionEvent e)
         {
        	 System.out.println("Les");
             
         }
     }
      
      public  class   TraitementBut5 implements   ActionListener
      {
           /**
           * obligatoire car test impl�mente l'interface ActionListener
           */
          public  void    actionPerformed(ActionEvent e)
          {
         	 System.out.println("Gens");
              
          }
      }
      
      public  class   TraitementBut6 implements   ActionListener
      {
           /**
           * obligatoire car test impl�mente l'interface ActionListener
           */
          public  void    actionPerformed(ActionEvent e)
          {
          	 ecran.dispose();
              
          }
      }
      
      public  class   TraitementBut7 implements   ActionListener
      {
           /**
           * obligatoire car test impl�mente l'interface ActionListener
           */
          public  void    actionPerformed(ActionEvent e)
          {
        	  System.out.println("Joueur 1 : "+joueur1.getLastname()+" "+joueur1.getName()+" : "+joueur1.getMoney());
              
          }
      }
      private int i=1;
      public  class   TraitementBut8 implements   ActionListener
      {
           /**
           * obligatoire car test impl�mente l'interface ActionListener
           */
          public  void    actionPerformed(ActionEvent e)
          {
        	  
        	  System.out.println("Joueur 2 : "+joueur2.getLastname()+" "+joueur2.getName()+" : "+joueur2.getMoney());
              
          }
      }
      
      public  class   TraitementBut9 implements   ActionListener
      {
           /**
           * obligatoire car test impl�mente l'interface ActionListener
           */
          public  void    actionPerformed(ActionEvent e)
          {
        	  
        	  System.out.println("La banque possède actuellement : "+Labanque.getBankMoney());
              
          }
      }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
  
