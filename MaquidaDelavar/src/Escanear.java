import java.util.Scanner;

public class Escanear {
	
	public Scanner sn = new Scanner(System.in);
	

public Escanear() {
	
	escanearr();
	
}


public void escanearr() {
	
	
	System.out.print("Qual o seu nome: ");
    sn.next();
    System.out.println("Seja bem vindo! " + " Qual a tua idade:" );
    sn.next();
    System.out.println("Você já têm idade para estudar! "  +  " Desejas estudar humanas ou exatas?");
    
    
	
}
	
	
}
