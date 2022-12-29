package generics.inheritance;

public class CaixaNumeroTest {
	
	public static void main(String[] args) {
		CaixaNumero<Integer> caixa = new CaixaNumero<>();
		caixa.aguardar(1);
		System.out.println(caixa.abrir());
		
		CaixaNumero<Double> caixa1 = new CaixaNumero<>();
		caixa1.aguardar(1.123);
		System.out.println(caixa1.abrir());
	}

}
