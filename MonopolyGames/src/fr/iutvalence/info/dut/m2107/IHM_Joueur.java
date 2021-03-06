	package fr.iutvalence.info.dut.m2107;

	import java.awt.*;
	import java.awt.event.*;

	import javax.swing.*;



	public class IHM_Joueur extends JFrame implements ActionListener
	{
		Joueur joueur1 = new Joueur("Clusel", "Mathieu");
		Joueur joueur2 = new Joueur("Rey", "Quentin");
		De mon_de = new De();
		Pion pionj1 = new Pion(1);
		Pion pionj2 = new Pion(2);
		Banque Labanque = new Banque();
	    private String mot;                    // On cree la variable mot
	    private JButton lancerde, acheter, vendre, passertour, actioncase, quitter, pion1, pion2, banque;       // On cr�� les deux boutons           
	    public int xPion1 = pionj1.getxPosition();
	    public int yPion1 = pionj1.getyPosition()+25;
	    JPanel panneau = new JPanel ();
	    JLabel plateau = new JLabel();
	    JLabel affichage = new JLabel();
	    
	    //JLabel pionjaune = new JLabel();
	    //JLabel pionbleu = new JLabel();
	    static JFrame ecran;
	    
	    public IHM_Joueur()// Constructeur pde la classe
	    {
	    	
	        setSize(700, 500);       //Taille de fenetre
	        setTitle("Bouton");      // Nom de la fentre
	        
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        ecran = new JFrame("Ma seconde fenetre");
			
			ecran.setLayout(new GridLayout(1,1));
			
	        //Selection d'un image depuis mon ordinateur
	        //plateau.setIcon(new ImageIcon(this.getClass().getResource("/s.jpg")));
			//								G:\\git\\Monopoly\\MonopolyGames\\images\\s.jpg
	        plateau.setIcon(new ImageIcon(("C:\\Users\\MARTIN Sylvie\\git\\Monopoly\\MonopolyGames\\images\\s.jpg")));
	        
	        panneau = new JPanel(new BorderLayout(40, 50)); // Taille
	        //panneau.setLayout(new GridLayout(1,1));
	        lancerde = new JButton("Lancer le dé");
	        acheter = new JButton("Acheter");
	        vendre = new JButton("Vendre");
	        passertour = new JButton("Passer tour");
	        actioncase = new JButton("Action Case");
	        quitter = new JButton("Quitter le jeu");
	        banque = new JButton("Banque");
	        pion1 = new JButton("J1");
	        pion2 = new JButton("J2");
	        
	        pion1.setBackground(Color.GREEN);
	        pion2.setBackground(Color.YELLOW);
	        
	        // Fait que le bouton attend une action
	        lancerde.addActionListener(new TraitementDe());  
	        acheter.addActionListener(new TraitementAchat());   
	        vendre.addActionListener(new TraitementVente());
	        passertour.addActionListener(new TraitementPasserTour());
	        actioncase.addActionListener(new TraitementAction());
	        quitter.addActionListener(new TraitementQuitter());
	        pion1.addActionListener(new TraitementPion1());
	        pion2.addActionListener(new TraitementPion2());
	        banque.addActionListener(new TraitementBanque());
	        
	        // Permet de choisir la taille et l'emplacement des bouton et de la fenetre
	        lancerde.setBounds(550, 20, 110, 50);
	        acheter.setBounds(550, 80, 110, 50);
	        vendre.setBounds(670, 80, 110, 50);
	        passertour.setBounds(550, 140, 110, 50);
	        actioncase.setBounds(670, 140, 110, 50);
	        quitter.setBounds(670, 475, 110, 30);
	        pion1.setBounds(xPion1, yPion1, 20, 20);
	        pion2.setBounds(pionj2.getxPosition(), pionj2.getyPosition(), 20, 20);
	        banque.setBounds(670, 20, 110, 50);
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

	    public  class   TraitementDe implements   ActionListener
	    {
	         /**
	         * obligatoire car test impl�mente l'interface ActionListener
	         */
	        public  void    actionPerformed(ActionEvent e)
	        {
	        	int p=450;
	        	mon_de.lancerDe();
	        	System.out.println("de1 = " +mon_de.getValeur_de1());
	        	System.out.println("de2 = " +mon_de.getValeur_de2());
	        	System.out.println("Le joueur avance de : " +mon_de.getAdvance()+" cases.");
	        	if(p >10)
	        	{
	        		pion1.setBounds(xPion1=xPion1-(42*mon_de.getAdvance()), yPion1=yPion1, 20, 20);
	        		p=p-xPion1-(42*mon_de.getAdvance());
	        	}
	        	if(xPion1<10)
	        	{
	        		pion1.setBounds(xPion1=10, pionj1.getyPosition()+25, 20, 20);
	        		pion1.setBounds(xPion1=xPion1, yPion1=yPion1-(40*mon_de.getAdvance()), 20, 20);
	        	}
	        	
	        	if(yPion1<10)
	        	{
	        		pion1.setBounds(xPion1, yPion1=10, 20, 20);
	        		pion1.setBounds(xPion1=xPion1+(42*mon_de.getAdvance()), yPion1=yPion1, 20, 20);
	        		
	        	}
	        	if(xPion1>450)
	        	{
	        		
	        		pion1.setBounds(xPion1=xPion1, yPion1=yPion1+(40*mon_de.getAdvance()), 20, 20);
	        	}
	        	
	        	
	        }
	    }
	    
	     public  class   TraitementAchat implements   ActionListener
	    {
			/**
	         * obligatoire car test implemente l'interface ActionListener
	         */
	        public  void    actionPerformed(ActionEvent e)
	        {
	        	 joueur1.deleteMoney(500);
	        	 joueur2.deleteMoney(500*2);
	        }
	    	
	    }
	     public  class   TraitementVente implements   ActionListener
	     {
	          /**
	          * obligatoire car test implemente l'interface ActionListener
	          */
	         public  void    actionPerformed(ActionEvent e)
	         {
	        	 System.out.println("Va");
	         }
	     }
	     
	      public  class   TraitementPasserTour implements   ActionListener
	     {
	          /**
	          * obligatoire car test implemente l'interface ActionListener
	          */
	         public  void    actionPerformed(ActionEvent e)
	         {
	        	 System.out.println("Les");
	             
	         }
	     }
	      
	      public  class   TraitementAction implements   ActionListener
	      {
	           /**
	           * obligatoire car test implemente l'interface ActionListener
	           */
	          public  void    actionPerformed(ActionEvent e)
	          {
	         	 System.out.println("Gens");
	              
	          }
	      }
	      
	      public  class   TraitementQuitter implements   ActionListener
	      {
	           /**
	           * obligatoire car test implemente l'interface ActionListener
	           */
	          public  void    actionPerformed(ActionEvent e)
	          {
	          	 ecran.dispose();
	              
	          }
	      }
	      
	      public  class   TraitementPion1 implements   ActionListener
	      {
	           /**
	           * obligatoire car test implemente l'interface ActionListener
	           */
	          public  void    actionPerformed(ActionEvent e)
	          {
	        	  System.out.println("Joueur 1 : "+joueur1.getLastname()+" "+joueur1.getName()+" : "+joueur1.getMoney());
	              
	          }
	      }
	      private int i=1;
	      public  class   TraitementPion2 implements   ActionListener
	      {
	           /**
	           * obligatoire car test implemente l'interface ActionListener
	           */
	          public  void    actionPerformed(ActionEvent e)
	          {
	        	  
	        	  System.out.println("Joueur 2 : "+joueur2.getLastname()+" "+joueur2.getName()+" : "+joueur2.getMoney());
	              
	          }
	      }
	      
	      public  class   TraitementBanque implements   ActionListener
	      {
	           /**
	           * obligatoire car test implemente l'interface ActionListener
	           */
	          public  void    actionPerformed(ActionEvent e)
	          {
	        	  
	        	  System.out.println("La banque possede actuellement : "+Labanque.getBankMoney());
	              
	          }
	      }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}