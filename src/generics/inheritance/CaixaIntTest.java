package generics.inheritance;

public class CaixaIntTest {
	
	public static void main(String[] args) {
		CaixaInt caixa = new CaixaInt();
		caixa.aguardar(123);
		
		System.out.println(caixa.abrir());
	}

}
