package sum;

import java.util.Scanner;

public class LinearEquation {
	protected  double b;
	protected  double c;
	public   LinearEquation() {
		
	}
	public   LinearEquation(double b, double c) {
		this.setB(b);
		this.setC(c);
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public void setB(double b) {
		this.b=b;
	}
	public void setC(double c) {
		this.c=c;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter b:");
		this.setB(kb.nextDouble());
		
		System.out.println("Enter c:");
		this.setC(kb.nextDouble());
	}
	

	public void solve() {
		if(b!=0) {
			System.out.println("Phuong trinh co 1 nghiem duy nhat x=" +-c/b);
			}
		else if(c==0) System.out.println("Phuong trinh co vo so nghiem");
	     	 else System.out.println("Phuong trinh vo nghiem");
}
	public void f(int a,int b) {
		System.out.println(a-b);
	}
	public void f1(int a ,int b) {
		System.out.println(a+b);
	}
	public void f(int a,int b,int c) {
		System.out.println(a-b-c);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinearEquation l1=new LinearEquation();
			/*l1.b=5;
			l1.c=8;*/
			l1.input();
			l1.solve();

			/*LinearEquation l2=new LinearEquation(0,0);
			//l2.b=0;
			//l2.c=0;
			l2.solve(); */
			
		
			/*LinearEquation l3=new LinearEquation(0,9);
			//l3.b=0;
			//l3.c=9;
			l3.solve();*/
			

	}

}
