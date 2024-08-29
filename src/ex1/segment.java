package ex1;

public class segment {
	private int extr1;
	private int extr2;
	
	public void ordonner() {
		 int exp;
		if(this.extr1>this.extr2) {
			exp=this.extr1;
	        this.extr1=this.extr2;
	        this.extr2=exp; 
		}
	}
	public float getLongueur(){
		return this.extr2-this.extr1;
	}
	boolean 

}
