public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular; // Altera titular para o tipo Cliente (era String, referenciou ao Cliente)
	
	public void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca (double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (Conta destino, double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			destino.saldo+=valor;			
			return true;
		} else {			
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}