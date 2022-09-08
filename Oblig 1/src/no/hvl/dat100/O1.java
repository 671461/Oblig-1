package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Integer.parseInt;

public class O1 {
	
public static void main(String[] args) {
		
int tallTxt = parseInt(showInputDialog("Bruttoinntekt: ")); 
		
if(tallTxt <= 164100) {
showMessageDialog(null, "Trinnsskatt0");
showMessageDialog(null, "Skatt: " + tallTxt*0.0);
}else
if(tallTxt >= 164101 && tallTxt <=230950) {
showMessageDialog(null, "Trinnsskatt1");
showMessageDialog(null, "Skatt: " + tallTxt*0.0093);
}else
if(tallTxt >= 230951 && tallTxt <=580650) {
showMessageDialog(null, "Trinnsskatt2");
showMessageDialog(null, "Skatt: " + tallTxt*0.0241);
}else
if(tallTxt >= 580651 && tallTxt <=934050) {
showMessageDialog(null, "Trinnsskatt3");
showMessageDialog(null, "Skatt: " + tallTxt*.1152);
}else
if(tallTxt >= 934051) {
showMessageDialog(null, "Trinnsskatt4");
showMessageDialog(null, "Skatt: " + tallTxt*0.1452);
}

	
	}

}


	


