package Clase11;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha =  LocalDate.now();
		
		System.out.println(fecha.getDayOfMonth());
		if (fecha.getDayOfMonth()== 9 ) {
			JOptionPane.showMessageDialog(null, "Hay parcial");
		}
	}

}
