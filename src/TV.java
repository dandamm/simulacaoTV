
public class TV {
	private int canal, volume;
	private String modelo;
	private boolean ligada;

	public TV(int canal, int volume, String modelo, boolean ligada) {
		this.canal = canal;
		this.volume = volume;
		this.modelo = modelo;
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public int getVolume() {
		return volume;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void aumentarCanal() {
		this.canal++;
	}

	public void diminuirCanal() {
		this.canal--;
	}

	public void aumentarVolume() {
		this.volume++;
	}

	public void diminuirVolume() {
		this.volume--;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = false;
	}
	public void setModelo (String modelo){
		this.modelo = modelo;
	}
	public void modificarCanal(int canal){
		this.canal = canal;
	}
}
