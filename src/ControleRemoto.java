
public class ControleRemoto {
	private TV televisao;
	
	public ControleRemoto(TV televisao){
		this.televisao = televisao;
	}
	public void irParaCanal(int canal){
		this.televisao.modificarCanal(canal);
	}
	public void ligarTV(){
		this.televisao.ligar();
	}
	public void desligarTV(){
		this.televisao.desligar();
	}
}
