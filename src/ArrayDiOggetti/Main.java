package ArrayDiOggetti;

public class Main {

	public static void main(String[] args) {
		
		Studente s=new Studente();
		Studente s1=new Studente();
		
		s.nome="Andrea";
		s.cognome="Rossi";
		s1.nome="Marco";
		s1.cognome="Verdi";
		
		Studente[] t=new Studente[2];
		
		t[0]=s;
		t[1]=s1;
		
		for(int i=0; i<t.length; i++) {
			
			System.out.print(t[i].nome);
			System.out.print(" ");
			System.out.println(t[i].cognome);
			
		}
		
	}

}
