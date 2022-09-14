
public class TesteSacaNegativo {
	public static void main (String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(101);
		System.out.println(conta.getSaldo());
		//conta.saldo = conta.saldo -101; //quem tem acesso ao atribuito é somente a classe. Proibido acesso por outros métodos. Para isso usa-se PRIVATE
		//System.out.println(conta.saldo);		
	}
}
