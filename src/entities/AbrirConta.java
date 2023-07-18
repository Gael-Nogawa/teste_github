package entities;

public class AbrirConta {
	
	private int num;
	private String nome;
	private double valor;
	
	
	public AbrirConta(int num, String nome) {
		this.num = num;
		this.nome = nome;
	}

	public AbrirConta(int num, String nome, double valorInicial) { //valorInicial vai para dentro do IF, por isso ele é colocado aqui.
		
		this.num = num;
		this.nome = nome;
		deposito(valorInicial);
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getNum() { // o número não pode ser alterado.
		return num;
	}

	

	public double getValor() { // O valor só pode ser alterado pelo deposito ou saque
		return valor;
	}

	
	public void deposito(double qtde) {
		valor += qtde;
	}
	
	public void saque(double qtde) {
		valor -= qtde + 5.00; // qtde + 5,00 que vão ser sacados no valor
	}



	public String toString() {
		return "Número da conta: "
				+ num
				+ ", titular: "
				+ nome
				+ ", valor na conta: R$ "
				+ String.format("%.2f", valor);
	}
	
	

}
