package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		//Double
		CaixaObjeto caixaDouble = new CaixaObjeto();
		caixaDouble.aguardar(2.3);
		System.out.println(caixaDouble.abrir());
		
		//String
		CaixaObjeto caixaString = new CaixaObjeto();
		caixaString.aguardar("Hello");
		System.out.println(caixaString.abrir());
		
		//Integer
		CaixaObjeto caixaInt = new CaixaObjeto();
		caixaInt.aguardar(123456);
		System.out.println(caixaInt.abrir());
		
	}
}
