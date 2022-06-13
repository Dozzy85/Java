package EserciziSulleClassi;

import java.util.Scanner;

/*creare la classe rettangolo con i metodi
 * calcola area e perimetro
 */

public class Rettangolo {
	
	private int base;
	private int altezza;
			
	public Rettangolo(int base, int altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int area() {
		int area=base*altezza;
		return area;
	}
	
	public int perimetro() {
		int perimetro=2*base+2*altezza;
		return perimetro;
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.print("Base=");
	int b=s.nextInt();
	
	System.out.print("Altezza=");
	int h=s.nextInt();
	
	Rettangolo r=new Rettangolo(h,b);

	System.out.println("L'area è: "+r.area());
	System.out.println("Il perimetro è: "+r.perimetro());
}

}
