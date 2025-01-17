package prueba;


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import pruebaCirculo.Circle;


public class PruebaCirculo {
	
	public static void main(String[] args) {
		Circle circulo = new Circle(37, 43, 2.5);
		String salida = "La coordenada X es " + circulo.getX() + "\nLa coordenada Y es " + circulo.getY()
				+ "\nEl radio es " + circulo.getRadio();
		circulo.setX(35);
		circulo.setY(20);
		circulo.setRadio(4.25);
		salida += "\n\nLa nueva ubicacion y el radio del circulo son\n" + circulo.toString();
		DecimalFormat dosDigitos = new DecimalFormat("0.00");
		salida += "\nEl diametro es " + dosDigitos.format(circulo.getDiametro());
		salida += "\nLa circunferencia es " + dosDigitos.format(circulo.getCircunferencia());
		salida += "\nEl area es " + dosDigitos.format(circulo.getArea());
		JOptionPane.showMessageDialog(null, salida);
		System.exit(0);
	} // fin de main
} // fin de la clase PruebaCirculo
