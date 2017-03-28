
public class Principal {

	public static void main(String[] args) {
		TV tv1 = new TV(12, 20, "Sony", true);

		System.out.println("A TV está no canal " + tv1.getCanal());
		System.out.println("O volume da TV é " + tv1.getVolume());
		System.out.println("O modelo da TV é " + tv1.getModelo());
		System.out.println("A TV está ligada? " + tv1.isLigada());

		tv1.aumentarCanal();
		System.out.println("A TV está no canal " + tv1.getCanal());
		tv1.aumentarVolume();
		System.out.println("O volume da TV é " + tv1.getVolume());
		tv1.desligar();
		System.out.println("A TV está ligada? " + tv1.isLigada());
		tv1.ligar();
		System.out.println("A TV está ligada? " + tv1.isLigada());
		tv1.diminuirCanal();
		System.out.println("A TV está no canal " + tv1.getCanal());
		tv1.diminuirVolume();
		System.out.println("O volume da TV é " + tv1.getVolume());
		tv1.setModelo("Samsung");
		System.out.println("Modelo alterado para " + tv1.getModelo());
		
		ControleRemoto controle = new ControleRemoto(tv1);
		
		controle.desligarTV();
		System.out.println("Controle remoto - A TV está ligada? " + tv1.isLigada());
		controle.ligarTV();
		System.out.println("Controle remoto - A TV está ligada? " + tv1.isLigada());
		controle.irParaCanal(40);
		System.out.println("Controle remoto - A TV está no canal " + tv1.getCanal());
	}

}
