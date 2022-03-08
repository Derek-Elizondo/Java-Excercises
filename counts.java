package tareajava;

import javax.swing.JOptionPane;

public class counts {
	
	double count = 0;
	double smallestNumber = Integer.MAX_VALUE;
	double sumatoria = 0; 
	double average;
	double number;
	String string;
	int position;
	
	int vcount = 0;
	
	counts(){}
	
	public void smallest() {
		while (count < 3) {
			number =  Integer.parseInt(
			JOptionPane.showInputDialog("Input a number:")
			);
			if (smallestNumber > number) {
				smallestNumber = number;
			}
			count++;
			}
			
		 JOptionPane.showMessageDialog(
	                null,
	                ("The smallest value is "+ smallestNumber));
		 count = 0;
	}
	public void average() {
		 while (count < 3) {
				number =  Integer.parseInt(
				JOptionPane.showInputDialog("Input a number:")
				);
				sumatoria = sumatoria + number;
				
				count++;
				}
		 average = sumatoria/3;
		 JOptionPane.showMessageDialog(
	                null,
	                ("The average value is "+ average));
	}
	public void middle() {
		string = JOptionPane.showInputDialog("Input a string to get the middle");
		 int length = string.length();
		 if (length % 2 == 0) {
			 position = length/2;
			 JOptionPane.showMessageDialog(null, "The middle characters are "+string.charAt(position-1)+" and "+ string.charAt(position));
		 }
		 else {
			 position = length/2;
			 JOptionPane.showMessageDialog(null, "The middle character is "+string.charAt(position));
			 
		 }
	}
	public void vowel() {
		string = JOptionPane.showInputDialog("Input a string to count vowels");
		 
		 for (int i=0; i<string.length(); i++) {
			 char cha = string.charAt(i);
			 if(cha == 'a'|| cha == 'e'|| cha == 'i' ||cha == 'o' ||cha == 'u'||cha == ' '){
		            vcount ++;
	         }
			 
		 }
		 JOptionPane.showMessageDialog(null, "The number of vowels is "+vcount);
	}
		


public static void main(String[] args) {
	int select;
	counts count1 = new counts();
	
	select = Integer.parseInt(JOptionPane.showInputDialog("Choose a functionality\n" +
            "  [1] --- Smallest amongst 3 numbers\n" +
            "  [2] --- Average of 3 numbers\n" +
            "  [3] --- Middle character of a string\n" +
            "  [4] --- all vowels in a string\n"+
            "**Any other thoughts will distract the hero!**"));
	
	switch (select) {
	
	case 1:
		count1.smallest();
		break;
	case 2:
		count1.average();
		break;
	case 3:
		count1.middle();
		
		break;
	case 4:
		count1.vowel();
		break;
		
		
		
		
		
}
}
}