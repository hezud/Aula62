package banco;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;

	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	public Conta(int numero, String nome, double saldoInicial) {
		super();
		this.numero = numero;
		this.nome = nome;
		deposito(saldoInicial);
	}

	public void deposito(double valor) {
		saldo = saldo + valor;
	}

	public void saque(double valor) {
		saldo = saldo - valor - 5;
	}

	@Override
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f.", numero, nome, saldo);
	}

}
