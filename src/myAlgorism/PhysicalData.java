package myAlgorism;

public class PhysicalData {
	 private String name;
     private int height;
     private double vision;
     
     PhysicalData(String name, int height, double vision){
    	 this.name = name;
    	 this.height = height;
    	 this.vision = vision;
     }
     public String toString() {
         return name + " " + height + " " + vision;
     }

}
