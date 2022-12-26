package generics;

public class CaixaGenericoTeste {

	public static void main(String[] args) {
		
		//Double
		CaixaGenerico<Double> caixaDouble = new CaixaGenerico<>();
		caixaDouble.aguardar(2.3);
		System.out.println(caixaDouble.abrir());
		
		//String
		CaixaGenerico<String> caixaString = new CaixaGenerico<>();
		caixaString.aguardar("Hello");
		System.out.println(caixaString.abrir());
		
		//Integer
		CaixaGenerico<Integer> caixaInt = new CaixaGenerico<>();
		caixaInt.aguardar(123456);
		System.out.println(caixaInt.abrir());
		
		//Float
		CaixaGenerico<Float> caixaFloat = new CaixaGenerico<>();
		caixaFloat.aguardar(2.5f);
		System.out.println(caixaFloat.abrir());
		
	}
}
