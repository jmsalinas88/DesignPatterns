package com.salinas.juan.pattern.creational.singleton;

public class App {

	public static void main(String[] args) {
		
		 System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
	                		"If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
	                		"RESULT:" + "\n");
		 
		 Thread threadBar = new Thread(new ThreadBar());
		 Thread threadFoo = new Thread(new ThreadFoo());
		 threadFoo.start();
		 threadBar.start();
		 
	}

	
	public static class ThreadBar implements Runnable{

		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.getValue());
		}
		
	}
	
	
	public static class ThreadFoo implements Runnable{

		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.getValue());
		}
		
	}
	
}

