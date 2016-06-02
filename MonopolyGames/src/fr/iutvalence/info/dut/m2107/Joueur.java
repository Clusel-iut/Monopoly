package fr.iutvalence.info.dut.m2107;

	/**
	 * Class representing the player
	 * @author martithi
	 *
	 */
	public class Joueur {

		
		/**
		 * 
		 */
		private static final int DEFAULT_MONEY = 1500;
		/**
		 * 
		 */
		private static final int DEFAULT_XPOSITION = 450;
		/**
		 * 
		 */
		private static final int DEFAULT_YPOSITION = 480;
		/**
		 * 
		 */
		private static final int DEFAULT_PLAYERPOSITIONONTHEBOARD = 0;
		/**
		 * Player's last name
		 */
		private final String nom;
		/**
		 * Player's first name
		 */
		private final String prenom;
		/**
		 * Identifier of player
		 */
		private int num_joueur;
		/**
		 * Pawn's color
		 */
		private int couleur;
		
		/**
		 * 
		 */
		private int playerposition;
		
		/**
		 * Player's pawn's position
		 */
		private int xposition;	
		
		/**
		 * 
		 */
		private int yposition;
		/**
		 * Money
		 */
		private int money;

		

		/**
		 * Method to initialize a player
		 * @param Nom 
		 * @param Prenom 
		 */
		public Joueur(String Nom, String Prenom) {
			
			this.nom = Nom;
			this.prenom = Prenom;
			this.xposition = DEFAULT_XPOSITION;
			this.yposition = DEFAULT_YPOSITION;
			this.money = DEFAULT_MONEY;
			this.playerposition = DEFAULT_PLAYERPOSITIONONTHEBOARD;		
		}
		
		

		/**
		 * 
		 * @param position
		 */
		public void Position(int position) 
		{
			
		}

		/**
		 * Method to get the position of the player at any time
		 * @return position
		 */
		public int getXPosition() 
		{
			return this.xposition;
		}
		/**
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public int getYPosition() 
		{
			return this.yposition;
		}
		
		/**
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public int getPlayerPosition() 
		{
			return this.playerposition;
		}	
		
		/**
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public void setPlayerPosition(int newplayerposition) 
		{
			this.playerposition = newplayerposition;
		}
		

		/**
		 * The name of the player
		 */
		public void entrerNom() 
		
		{
			
		}

		/**
		 * advance the position of the pion 
		 * @param avancer
		 */
		public void Avancer(int avancer)
		{
			this.xposition= ((this.xposition+avancer) % 40);
			
			
		}
		
		/**
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public String getLastname()
		{
			return this.nom;
		}
		/**
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public String getName()
		{
			return this.prenom;
		}
		/**
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public int getMoney()
		{
			return this.money;
		}

		/**
		 * @param newmoney
		 */
		public void setMoney(int newmoney) 
		{
			this.money = newmoney;
		}
		
		/**
		 * @param amount
		 */
		public void addMoney(int amount)
		{
			this.money += amount;
		}
		
		/**
		 * @param amount
		 */
		public void deleteMoney(int amount)
		{
			this.money -= amount;
		}



		/**
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public boolean homeless()
		{
			if ( this.money < 0 )
			{
				return true;
			}
			return false;
		}





	}