
public class Fios extends Thread {
    


public Fios(){
	
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
		new Thread(t4).start();

}

private static Runnable	t1  = new Runnable() {

	@Override
	public void run() {
		System.out.println("Teste1");
		
	}
};

private static Runnable	t2  = new Runnable() {

	@Override
	public void run() {
		System.out.println("Teste2");
		
	}
};

private static Runnable	t3  = new Runnable() {

	@Override
	public void run() {
		
		int pessoas2 = 10;
		
		if( pessoas2  > 7) {
			
		System.out.println("Teste concluido");
		
		}
		
	}
};

private static Runnable	t4  = new Runnable() {

	
public static int pessoas = 10;
public static String mostrar = "Número de pessoas:";

	@Override
	public void run() {
		
		for(pessoas = 10; pessoas > 0; pessoas -- ) {
			
			System.out.println(mostrar + pessoas);
		}
		
	}
};




}

