package uni.sofia.fmi.master.tzi;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MovieTest {

	public static void main(String[] args) {
		MovieTest mt = new MovieTest();
		Movie movie1 = mt.initMovieDirectly();
		Movie movie2 = mt.initMovieViaCommandLine();
		Movie movie3 = mt.initMovieViaDialog();
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);
	}
	
	public Movie initMovieDirectly(){
		Movie mov = new Movie();
		mov.setYear(2016);
		mov.setTitle("The Revenant");
		mov.setDirector("Alejandro González Iñárritu");
		mov.setOscarCount((byte)3);
		return mov;
	}
	
	public Movie initMovieViaDialog(){
		 JTextField nameField = new JTextField(15);
	     JTextField yearField = new JTextField(15);
	     JTextField directorField = new JTextField(15);
	     JTextField oscarField = new JTextField(15);

	      JPanel myPanel = new JPanel(new GridLayout(0,2,2,2));
	      myPanel.add(new JLabel("Name:", SwingConstants.RIGHT));
	      myPanel.add(nameField);
	      myPanel.add(new JLabel("Year:", SwingConstants.RIGHT));
	      myPanel.add(yearField);
	      myPanel.add(new JLabel("Director:", SwingConstants.RIGHT));
	      myPanel.add(directorField);
	      myPanel.add(new JLabel("Oscars:", SwingConstants.RIGHT));
	      myPanel.add(oscarField);
	      
	      int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
	      
	      Movie mov = new Movie();
	      if (result == JOptionPane.OK_OPTION) {
	    	  try{
	    		  mov.setTitle(nameField.getText());
	    		  mov.setYear(parseInteger(yearField.getText()));
	    		  mov.setDirector(directorField.getText());
	    		  mov.setOscarCount(parseByte(oscarField.getText()));
	    	  }catch(NumberFormatException nfe){
	    		  nfe.printStackTrace();
	    	  }
	      }
	   	   
		return mov;
	}
	
	public Movie initMovieViaCommandLine(){
		Movie mov = new Movie();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Title : ");
			mov.setTitle(br.readLine());
			System.out.print("Director : ");
			mov.setDirector(br.readLine());
			System.out.print("Year : ");
			mov.setYear(parseInteger(br.readLine()));
			System.out.print("Oscar Count : ");
			mov.setOscarCount(parseByte(br.readLine()));
		}catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		return mov;
	}
	
	private int parseInteger(String intString){
		int intValue = Integer.parseInt(intString);		
		return intValue;
	}
	
	private byte parseByte(String byteString){
		byte byteValue = Byte.parseByte(byteString);		
		return byteValue;
	}
}
