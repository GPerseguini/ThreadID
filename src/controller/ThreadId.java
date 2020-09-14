package controller;

public class ThreadId extends Thread {
	
	 public ThreadId(){
		
	}
	
	 public void run(){
		 //getID() para obter o número de cada um dos threads.
		 System.out.println("TID #"+getId());
	 }
}
