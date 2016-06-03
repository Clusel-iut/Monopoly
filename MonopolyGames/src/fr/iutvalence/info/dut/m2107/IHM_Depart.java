package fr.iutvalence.info.dut.m2107;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/**
 * Represent the Departure window whith button and the picture
 * 
 */
public class IHM_Depart extends JFrame implements ActionListener
{
	
/**
 * Represent the button to begin the game 
 */
    private JButton jouer;
/**
 * Represent the button to leave the game         
 */
	private JButton quitter;
 /**
  * Represent all that there are in the window
  */
    JPanel panoe = new JPanel ();
 /**
  * Represent the picture of the window
  */
    JLabel image = new JLabel();

 /**
  * Represent the Departure window empty
  */
    JFrame fenetre;
    
 /**
  *   It is the constructor of this class
  */
    public IHM_Depart()
    {
        //setSize(700, 500);       
        //setTitle("Bouton");      
        setDefaultCloseOperation(EXIT_ON_CLOSE); // allows add on the window 3 buttons. One to shrink the window, one to change the size of the window 
        
        fenetre = new JFrame("Bienvenue sur le jeu de Jumatik"); // Window name
		fenetre.setBounds(300, 100, 412, 440); //Window size
		fenetre.setLayout(new GridLayout(1,1)); // Met la fenetre au milieu
		
        
        image.setIcon(new ImageIcon(("G:\\git\\MonopolyV2\\MonopolyGames\\images\\l.png"))); //add picture in Jlabel "image"
        panoe = new JPanel(new BorderLayout(40, 50)); // Pannel Board
        jouer = new JButton("Jouer"); // Button name set Jouer.
        quitter = new JButton("Quitter"); //  Button name set Quitter
        
       
		jouer.addActionListener(new TraitementJouer());  // The button waits an action
        quitter.addActionListener(new TraitementQuitter());   // The button waits an action
        
        // It is to choose the size and the positon of Buttons and pannel 
        jouer.setBounds(50, 200, 100, 100);
        quitter.setBounds(200, 200, 100, 100);
        panoe.setBounds(300, 100, 800, 500);
        
        // Add picture and buttons to the pannel
        panoe.add(jouer);
        panoe.add(quitter);
        panoe.add(image);
        
        //Add the pannel to the window
        fenetre.add(panoe);
        
        // Put visible the window 
        fenetre.setVisible(true);
        

        // Validate changes
        validate();
        
    
    }

    
    /**
     * Represent the action when you clic on the button Jouer
     * @author reyqu
     *
     */
    public  class   TraitementJouer implements   ActionListener
    {
         /**
         * compulsory but we implement the interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	 IHM_Joueur.ecran.setVisible(true); // Display window in IHM_joueur
        	 fenetre.dispose(); // removed the display of this window ( in IHM_Depart)
        	 IHM_Joueur.ecran.setResizable(false); // The size of the window in IHM_Joueur can't changes
        }
    }
 /**
  * Represent the action when you clic on the button Quitter
  * @author reyqu
  *
  */
     public  class   TraitementQuitter implements   ActionListener
    {
         /**
         * compulsory but we implement the interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	 fenetre.dispose();  // removed the display of this window ( in this class)
            
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
     
     
