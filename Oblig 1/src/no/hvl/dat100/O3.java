package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Integer.parseInt;
public class O3 {

public static void main(String[] args) {
int n = parseInt(showInputDialog("Gi et helt tall:"));
long sum=1;
for(int i=1; i<=n; i++) {

sum = sum*i;}


showMessageDialog(null, "svar: "+ sum);	
	}

}
