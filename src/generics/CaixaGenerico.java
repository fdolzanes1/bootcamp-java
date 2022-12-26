package generics;

public class CaixaGenerico<T> {
	
	private T coisa;
	
	public void aguardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
