package artscrafts;

import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Electra_Arts extends JFrame
{
   private ImageIcon image1;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;
	
	Electra_Arts(String image_1,String image_2)
	{
		setLayout(new FlowLayout());
		image1=new ImageIcon(getClass().getResource(image_1));
		label1=new JLabel(image1);
		add(label1);
		
		image2=new ImageIcon(getClass().getResource(image_2));
		label2=new JLabel(image2);
		add(label2);
	}
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		Scanner object=new Scanner(System.in);
		Scanner object_2=new Scanner(System.in); 
		Scanner number=new Scanner(System.in);
	    String six_sigma="";
		Electra_Arts Mexico=new Electra_Arts("107757.jpg","arts-and-crafts-hand.jpg");
		Electra_Arts Bolivia=new Electra_Arts("arts-and-carft3.jpg","arts-and-carft4.jpg");
	    String authorized_username="electra";
	    String authorized_password="electra_2023@@";
	    
	    System.out.println("******Welcome to the Electra Artisans System*****");
	    System.out.println("Please select\nA.Adminstrator\nB.Customer");
	
	    String selection=object.nextLine();
	    
	    switch(selection)
	    {
	      case("A"):
	    	  System.out.println("*******Please Enter Username:-");
	           String username=object.nextLine();
	           
	          System.out.println("*******Please Enter Password:-");
	          String password=object.nextLine();
	        
	          if(username.equals(authorized_username)&& password.equals(authorized_password))
	          {
	        	  System.out.println("Logged in Successfully,Welcome adminstartor!");
	        	  System.out.println("Dear Adminstrator,Please select how you would like to analyze the business\n(I)Cost of Goods computation(COGS)\n(II)Profit Margin\n(III)Six sigma value\n");
	        	  
	        	  String admin_choice=object.nextLine();
	        	  
	        	  if(admin_choice.equals("I"))
	        	  {
	        		  System.out.println("********Cost of goods Sold(COGS - $ )********");
	        		  System.out.println("********Enter the beggining inventory price is US dollars:-");
	        		  
	        		  int begg_inventprice=object_2.nextInt();
	        		  
	        		  System.out.println("********Enter the purchase price($):-");
	        		  int purchase_price=object_2.nextInt();
	        		  
	        		  System.out.println("********Enter the ending inventory price is US dollars:-");
	        		  int end_inventprice=object_2.nextInt();
	        		  
	        		  System.out.println("Calculating.......................");
	        		  
	        		  int COGS=begg_inventprice+purchase_price-end_inventprice;
	        	 
	        		  System.out.println("The cost of goods sold for your business is:-"+COGS);
	        	  }//if
	        	  
	        	  else if(admin_choice.equals("II"))
	        	  {
	        		  System.out.println("********profitMargin($)********"); 
	        	  
	        		  System.out.println("********Enter the net income in US dollars:- ");
	        		  double net_income=object_2.nextDouble();
	        	  

	        		  System.out.println("********Enter the revenue in US dollars:- ");
	        		  double revenue=object_2.nextDouble();
	        	  
	        		  
	        		  System.out.println("Calculating.......................");
	        		  double profit_margin=(net_income/revenue)*100;
	        	 
	        		  System.out.println("The profit margin is:- "+profit_margin+ ""+ ""+ "this means you get to keep "+ profit_margin + "%"+ " of your business");
	        		  		
	        	  }
	        		  	    
	        	  else if(admin_choice.equals("III"))
	        	  {
	        		  //calculating the DPO
	        		  System.out.println("********Six Sigma value********"); 
	        		 
	        		  System.out.println("********Calculating the DPO(Defects Per Opportunity)********"); 
	        		  System.out.println("********Defects:- ");
	        		  double defects=object_2.nextDouble();
	        		  
	        		  System.out.println("********Opportunity per unit:- ");
	        		  double opp=object_2.nextDouble();
	        		  
	        		  System.out.println("********Units:- ");
	        		  double units=object_2.nextDouble();
	        		  
	        		  double total_opportunities=units*opp;
	        		  double DPO=defects/total_opportunities;
	        		  
	        		  //calculating the yeild
	        		  double yeild=(1-DPO)*100;
	        		  
	        		  if(yeild>=69.10 && yeild<93.33)
	        		  {
	        			  six_sigma="2"; 
	        		  }
	        		  else if(yeild>=93.33 && yeild<99.38)
	        		  {
	        			  six_sigma="3";   
	        		  }
	        		  
	        		  else if(yeild>=99.38 && yeild<99.97)
	        		  {
	        			  six_sigma="4";   
	        		  }
	        		  
	        		  else if(yeild>=99.97 && yeild<99.99)
	        		  {
	        			  six_sigma="5";   
	        		  }
	        		  
	        		  else if(yeild>=99.99 && yeild<=100)
	        		  {
	        			  six_sigma="6";   
	        		  }
	        		  
	        		  System.out.println("\nMost businesses tun at 3 or 4 sigma values,achieving a 6 sigma means delivering near perfect product or services");
	        		  
	        		  System.out.println("*********************Six Sigma Result*********************");
	        		  System.out.println("Six Sigma Value:- "+six_sigma);
	        		  System.out.println("*********************Six Sigma Result*********************");
	        	  }
	          
	          }//first if
	          
	          else if(!username.equals(authorized_username)&& !password.equals(authorized_password))
	          {
	        	  System.out.println("Authorization Unsuccessful!");
	        	  System.exit(0);
	          }
	          
	          break;
	          
	      case("B"):
	    	  System.out.println("*************Welcome customer,please select the traditional arts and craft that you would like to view from a Latin American country\nA.Mexico\nB.Bolivia");
	         
	          String selection_2=object.nextLine();
	          
	          if(selection_2.equals("A"))
	          {
	        	  System.out.println("*********************Mexican Traditional Arts And Carfts*********************");  
	              
	        	  System.out.println("*********************Huichol Arts & Crafts*********************");  
	              
	        	  System.out.println("Find out more by:-\n1.play the Huichol  Arts & Crafts audiotrack\n2.Read about the Huichol Arts & Crafts");
	              String user_choice=object.nextLine();
	          
	              if(user_choice.equals("1"))
	              {
	            	  File file=new File("Huichol.wav");
	            	  AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
	            	  Clip clip=AudioSystem.getClip();
	            	  clip.open(audioStream);
	            	  
	            	  System.out.println("Enter P to play:- ");
	            	  String response=object_2.nextLine();
	            	  response=response.toUpperCase();
	            	  
	            	  if(response.equals("P"))
	            	  {
	            		  clip.start();
	            		  
	            		  System.out.println("Enter S to stop:- ");
	            		   response=object_2.nextLine();
	            		   response=response.toUpperCase();
	            		   
	            		   if(response.equals("S"))
	            		   {
	            			   clip.stop();
	            			   System.out.println("Thank You!");
	            		   }
	            	  }
	              }
	              
	              else if(user_choice.equals("2"))
	              {
	            	  System.out.println("**************The Huichol Art From Nayarit:- Huichol art makes use of a wide variety of bright colors from the Huichol Indian allowing them to express their interdependence");
	            	  
	              }
	              
	              System.out.println("*********************************************************************************************************************************************************************************");
	          
              System.out.println("*********************Talavera from puebla Arts & Crafts*********************");  
	              
	        	  System.out.println("Find out more by:-\n1.play the Talavera  Arts & Crafts audiotrack\n2.Read about the Talavera Arts & Crafts");
	              String user_choice2=object.nextLine();
	          
	              if(user_choice2.equals("1"))
	              {
	            	  File file=new File("Talavera.wav");
	            	  AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
	            	  Clip clip=AudioSystem.getClip();
	            	  clip.open(audioStream);
	            	  
	            	  System.out.println("Enter P to play:- ");
	            	  String response=object_2.nextLine();
	            	  response=response.toUpperCase();
	            	  
	            	  if(response.equals("P"))
	            	  {
	            		  clip.start();
	            		  
	            		  System.out.println("Enter S to stop:- ");
	            		   response=object_2.nextLine();
	            		   response=response.toUpperCase();
	            		   
	            		   if(response.equals("S"))
	            		   {
	            			   clip.stop();
	            			   System.out.println("Thank You!");
	            		   }
	            	  }
	              }
	              
	              else if(user_choice.equals("2"))
	              {
	            	  System.out.println("**************The Talavera art from puebla:- These pottery artworks are produced and supervised from artisan in a town called Talavera De La Reina\nThe artisans are specialized in the style of ceramics that were introduced by Arab in spain");
	            	  
	              }
	              
	              System.out.println("*********************************************************************************************************************************************************************************");
	              System.out.println("The Huichol art picture is on the left(cost $550.50),the Talavera picture is on the right(cost $780.00)");
	          
	              Mexico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	             
	              Mexico.setVisible(true);
	              
	              Mexico.pack();
	              
	              Mexico.setTitle("Mexican Arts and Crafts");
	          }//if
	    }
	
	}

}
