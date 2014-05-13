
class PlayingCard implements Card
{
	
	private int suit;	
	private int rank;

	
	public PlayingCard(String suit, int rank)
	{
					
		if(suit == "spade")
		{
		    this.suit= 3;
		}
		if(suit == "heart")
		{
		    this.suit = 2;
		}
		if (suit == "diamond")
		{
		    this.suit = 1;
		}
		if(suit == "club" )
		{
		    this.suit = 0;
		}
		 		 
		    this.rank = rank;


		
	}
	
	    public void setRank(int rank)
	   {
		this.rank = rank;
		
	   }
	
	   public int getRank()
	  {
		return rank;
		
	  }
		

	public void  setSuit(int suit)
	{
	
		this.suit = suit;
	
	}



	public int getSuit()
	{
		return suit;
	
	}

	public String toString(String suit, int rank)
	{
		String str=
		
		rank +  " of  " + suit;
		return str;

	}
		
	public boolean beats(PlayingCard otherCard)
	{
		PlayingCard myCard= deck(5);	
		if( myCard.getRank() > otherCard.getRank() )
		{
		    return true;
		}
		else if( myCard.getRank() < otherCard.getRank() )
		{
		    return false;
		}
		else
		{
		    if( myCard.getSuit() > otherCard.getSuit() )
                {
                    return true;
                }
                else
                {
                    return false;
                }
		}

			
	}

}
