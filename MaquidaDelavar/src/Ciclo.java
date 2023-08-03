import java.util.Timer;
import java.util.TimerTask;


public class Ciclo {

Timer timer1 = new Timer();
int dequando = 5000;
int tempo =  5000;
int dequando2 = 1000;
int tempo2 =  5000;

public Ciclo() {
	
	 tarefa();
	 tarefa2();
	
}

public void tarefa() {
	
	 timer1.scheduleAtFixedRate(new TimerTask() {
	        public void run() {
	        	
	        	System.out.println("1");
	        }
	        }, dequando,  tempo);
	
}

public void tarefa2() {


	 timer1.scheduleAtFixedRate(new TimerTask() {
	        public void run() {
	        	
	        	System.out.println("Repete isso");
	        }
	        }, dequando2,  tempo2);
	

}
}

