package main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout extends JFrame {
	public Layout(int opcao) {
		super("Layouts");
		
		Container c = getContentPane();
		Container c2 = new JPanel();

		switch(opcao) {
		case 1:
			c.setLayout(new BorderLayout(15,15)); //Adiciona 15px de padding (espaçamento)
			c.add(BorderLayout.NORTH, new JButton("N"));
			c.add(BorderLayout.SOUTH, new JButton("S"));
			c.add(BorderLayout.CENTER, new JButton("C"));
			c.add(BorderLayout.EAST, new JButton("E"));
			c.add(BorderLayout.WEST, new JButton("W"));
			break;
		case 2:
			c.setLayout(new GridLayout(3,3));
			c.add(new JButton("1"));
			c.add(new JButton("2"));
			c.add(new JButton("3"));
			c.add(new JButton("4"));
			c.add(new JButton("5"));
			c.add(new JButton("6"));
			c.add(new JButton("7"));
			c.add(new JButton("8"));
			c.add(new JButton("9"));
			break;
		case 3:
			c.setLayout(new BorderLayout(10,10));
			c2.setLayout(new GridLayout(1,3));
			c.add(BorderLayout.NORTH, new JButton("Nome"));
			c.add(BorderLayout.CENTER, new JButton("Imagem"));
			c2.add(new JButton("Play"));
			c2.add(new JButton("Pause"));
			c2.add(new JButton("Stop"));
			c.add(BorderLayout.SOUTH, c2);
			break;
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op;
		System.out.println("Escolha o layout para ser visualizado:");
		System.out.println("Border (1)");
		System.out.println("Grid (2)");
		System.out.println("Border + Grid (3)");
		
		op = entrada.nextInt();
		new Layout(op);
		
		entrada.close();
	}
}
