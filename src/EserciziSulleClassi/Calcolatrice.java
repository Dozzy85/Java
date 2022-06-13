package EserciziSulleClassi;

/*La classe deve avere i seguenti metodi
 * Somma: stampa la somma di a e b
 * Moltiplicazione: stampa la moltiplicazione di a e b
 * Divisione
 * Sottrazione
 */

public class Calcolatrice {
	
	private int a;
	private int b;
	
	public Calcolatrice(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int somma() {
		int somma=a+b;
		System.out.println("La somma è: "+somma);
		return somma;
	}
	
	public int moltiplicazione() {
		int moltiplicazione=a*b;
		System.out.println("La moltiplicazione è: "+moltiplicazione);
		return moltiplicazione;
	}
	
	public int divisione() {
		int divisione=a/b;
		System.out.println("La divisione è: "+divisione);
		return divisione;
	}
	
	public int sottrazione() {
		int sottrazione=a-b;
		System.out.println("La sottrazione è: "+sottrazione);
		return sottrazione;
	}
	
	public static void main(String[] args) {
		
		Calcolatrice c=new Calcolatrice(10,2);

		
		c.somma();
		c.moltiplicazione();
		c.divisione();
		c.sottrazione();
		
	}

}
