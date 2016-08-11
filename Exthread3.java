package gom.Samrat.Models;

public class Exthread3 extends Thread {
	int count=0;
          public void run(){
        	  for(int i=0;i<10;i++){
        		  count=i;
        		  System.out.println("Printing the count "+count);
        	  }
          }
	public static void main(String[]args){
		for(int j=0;j<10;j++){
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Thread name is " +name);}
		Exthread3 ex = new Exthread3();
		ex.start();
	}
	
}
