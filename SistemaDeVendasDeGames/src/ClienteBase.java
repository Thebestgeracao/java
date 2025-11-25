import java.util.Random;

public class ClienteBase {
	private int idCliente;
	private String nome;
	private String tipo;
	private String email;
	private String dataDeNascimento;
	private String sexo;
	private double saldo;

	public ClienteBase(String nome, String tipo, String email, String dataDeNascimento, String sexo, double saldo) {
		Random random = new Random();
		this.idCliente = random.nextInt(9000) + 1000;
		this.nome = nome;
		this.tipo = tipo;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.saldo = saldo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEmail() {
		return email;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setdataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void setsexo(String sexo) {
		this.sexo = sexo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean debitarSaldo(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ID: " + idCliente + ", Nome: " + nome + ", Tipo: " + tipo + ", E-mail: " + email + ", Saldo: R$ "
				+ String.format("%.2f", saldo);
	}
}
