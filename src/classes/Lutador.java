package classes;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	public Lutador(String no, String na, int id, float al, float pe, 
			int vi, int de, int em) {
		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura =  al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}


	
	public void apresentar() {
		
		System.out.println("Tenho a honra de apresentar o lutador " + this.getNome());
		System.out.println("De origem " + this.getNacionalidade());
		System.out.println("Com a idade de " + this.getIdade() + " anos");
		System.out.println("Pesando exatamente seus " +this.getPeso() + " KG " );
		System.out.println("Ele já ganhou um total de "+ this.getVitorias()+" vitórias em sua carreira");
		System.out.println("Teve um total de " + this.getDerrotas() + " derrotas em sua carreira");
		System.out.println("Teve um total de "+ this.getEmpates() +" empates em sua carreira");
	}
	
	public void Status() {
		System.out.println(getNome()+ " Peso " + this.getCategoria());
		System.out.println("ganhou = " + this.getVitorias());
		System.out.println("perdeu = " + this.getDerrotas());
		System.out.println("Empatou = " + this.getEmpates());
	}
	
	public void ganharLuta() {
		
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		
		this.setEmpates(this.getEmpates() + 1);
		
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String no) {
		this.nome = no;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int id) {
		this.idade = id;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(float al) {
		this.altura = al;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria() {
		if (this.peso < 52.2) {
			categoria = "Invalido";
		}else if (this.peso <= 70.3) {
			categoria = "Leve";
		}else if ( this.peso <= 83.9) {
			categoria = "Médio";
		}else if (this.peso <= 120.2) {
			categoria = "Pesado";
		}else{
			categoria = "Não está no peso padrão";
		}
	}



	public int getVitorias() {
		return vitorias;
	}



	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}



	public int getDerrotas() {
		return derrotas;
	}



	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}



	public int getEmpates() {
		return empates;
	}



	public void setEmpates(int empates) {
		this.empates = empates;
	}
	

}
