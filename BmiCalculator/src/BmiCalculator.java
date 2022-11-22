import javax.swing.JOptionPane;
import java.math.*;
public class BmiCalculator {

	public static void main(String[] args) {
	double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height?" + " (In meters)"));
	double weight = Double.parseDouble(JOptionPane.showInputDialog("What's your weight?" + " (In kilograms)"));
	double bmi = weight / Math.pow(height, 2);
	bmi = Math.round(bmi);
	if(bmi<18.5) {
		JOptionPane.showMessageDialog(null, "Your BMI is " + bmi + " and it falls within the underweight rangen");
	} 
	else if(bmi > 18.5 && bmi < 25){
		JOptionPane.showMessageDialog(null, "Your BMI is " + bmi + " and it falls within the healthy weight range.");
	}
	else if(bmi > 25 && bmi < 30) {
		JOptionPane.showMessageDialog(null, "Your BMI is " + bmi + " and it falls within the overweight range.");
	}
	else if(bmi > 30) {
		JOptionPane.showMessageDialog(null, "Your BMI is " + bmi + " and it falls within the obesity range.");
	}
	}

}
