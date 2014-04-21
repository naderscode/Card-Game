import java.io.*;
import java.util.*;

public class MyCardGame
{

	public static void main(String [] args)
	{
		
				
		String s="";
        String r="";
				
		try
			{

				
                List deck = new ArrayList();
                        
                BufferedReader br = new BufferedReader(new FileReader("cards.txt"));
                String card = br.readLine();
                while(card != null)
                {

                    StringTokenizer st = new StringTokenizer(card);
                   s = st.nextToken();
                   r= st.nextToken();
                    int rank = Integer.parseInt(r);
                    PlayingCard p1 = new PlayingCard(s, rank);
                    deck.add(p1);
                    card = br.readLine();
                  //System.out.println(deck);
                    System.out.println(p1.toString());
                  //p1.toString();
                }//end loop
            }//end try
            catch (IOException e)
            {
                System.out.println("Error: " + e);
            }
		
                
        for(PlayingCard otherCard : deck)
        {	
        if (otherCard.beats(myCard))
           {
           System.out.println("I Lost");
           }
        }
		
		
	}//end main
}//end class
