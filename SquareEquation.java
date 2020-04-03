package sum;

import java.util.Scanner;

public class SquareEquation extends LinearEquation {
	private double a;
   
	public double getA() {
		return this.a;
	}
	public void setA(double a) {
		this.a=a;
	}
	public     SquareEquation(double a, double b, double c) {
		super(b,c);//goi ham khoi tao co doi so cua cha
				   //luon nam dau tien trong ham khoi tao cua con
		this.setA(a);
	}
	 public     SquareEquation() {
			super();// goi ham khoi tao cua cha
					//luon nam dau tien trong ham khoi tao cua con
		}
	 public void input() {
		 Scanner kb=new Scanner(System.in);
			System.out.println("Enter a:");
			setA(kb.nextDouble());
			super.input();//goi ham input() cua lop cha 
			
			}
	public
	void solve() {
		//if(a==0)
		//	super.solve();
		//else {
			double del=b*b-4*a*c;
			if(del<0) System.out.println("Phuong trinh vo nghiem");
			else
				if(del==0)
					System.out.println("Phuong trinh co 2 nghiem kep x1=x2=" +(-b/(2*a)));
				else
					System.out.println("Phuong trinh co 2 nghiem x1=" +((-b+Math.sqrt(del))/(2*a)) +" va x2=" +((-b-Math.sqrt(del))/(2*a)));
		}
		//}
	@Override
	public void f(int a,int b) {
		System.out.println(a+b);
	}
	public void f(double a,double b) {
		System.out.println(a-b);
	}
	public void f(double a,double b,double c) {
		System.out.println(a-b-c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareEquation t1=new SquareEquation(1,2,3); 
		t1.input();
		t1.solve();
	
	
	
	}

}

