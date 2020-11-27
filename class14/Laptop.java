package com.syntax.class14;

public class Laptop {

	public static void main(String[] args) {
		
		//ClassesInJava
		
		
		Laptop laptop = new Laptop();
		laptop.make="Mac";
		laptop.model="Pro 12";
		laptop.storages=1;
		laptop.RamCapacity=16;
		laptop.color="Pink";
		laptop.processessor="Core i7";
		laptop.GPU="RTX 12GB"
		laptop.playMovies ();
		laptop.browseInternet();
		laptop.makeVideoCall(contact: "Biden");
		String model = laptop.getModel();
		System.out.println(model);
		
		
		//Laptop
		
		String make;
		String model;
		int hardDriveCapacity;
		int RamCapacity;
		String color;
		String processor;
		String GPU;

		void playMovies(){
			System.out.println("Playing movies");
		}
		void browseInternet(){
			System.out.println("Browsing the internet");
		}
		void makeVideoCall(String contact){
			System.out.println("Video calling to "+contact);
		}
		public String getModel(){ return "Hi";}
		
		int getRamCapacity() {
			return RAMCapacity*2;
		}
		
		int upgradeRam(int newRamunit) {
			return newRamunit*RamCapacity;
		}	

}

		

	}


