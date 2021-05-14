package classes;

public class Executavel {

	public static void main(String[] args) {
		
		
		Lutador l [] = new Lutador [6];
				l [0] =new Lutador ("Pretty Boy", "França",31,1.75f,68.9f,11,2,1);
		
	
		
		
		System.out.println("************************************************************");
	
		l [1] =new Lutador ("Putscript", "Brasil",29,1.68f,57.8f,2,4,6);
		
		
		
		System.out.println("************************************************************");
		
		Luta UEC01 = new Luta ();
		UEC01.marcarLuta(l[1],l [1]);
		UEC01.lutar();
		l [0].Status();
		l [1].Status();
	
	

	}

}
