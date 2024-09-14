public class Geladeira {
	//Atributos
	private String marca;
	private String modelo;
	private int temperatura;
	private boolean ligada;
	Geladeira(){
		marca = "Samsumg";
		modelo = "Duas portas";
		temperatura = -25;
		ligada = true;
		
	}
	//Metodos
	Geladeira(String m, String model, int t, boolean l){
		marca = m;
		modelo = model;
		temperatura = t;
		ligada = l;
	}
	//metodos de acesso
	public String getMarca() {
		return marca;
	}
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String model) {
		this.modelo = model;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int t) {
		this.temperatura = t;
	}
	
	public boolean getLigada() {
		return ligada;
	}
	public void setLigada(boolean l) {
		this.ligada = l;
	}
	
	
	public static void main(String[] args) {
        Geladeira g1 = new Geladeira();
        Geladeira g2 = new Geladeira("Eletrolux", "Uma porta", 15, false);
        Geladeira g3 = new Geladeira("Brastemp", "Duas portas", -10, true);
        
        System.out.println("A Geladeira g1 é: \nMarca: " + g1.getMarca());
        System.out.println("Modelo: " + g1.getModelo());
        System.out.println("Temperatura: " + g1.getTemperatura());
        System.out.println("Ligada: " + g1.getLigada());
        System.out.println("--------------------");

        System.out.println("A Geladeira g2 é: \nMarca: " + g2.getMarca());
        System.out.println("Modelo: " + g2.getModelo());
        System.out.println("Temperatura: " + g2.getTemperatura());
        System.out.println("Ligada: " + g2.getLigada());
        System.out.println("--------------------");

        System.out.println("A Geladeira g3 é: \nMarca: " + g3.getMarca());
        System.out.println("Modelo: " + g3.getModelo());
        System.out.println("Temperatura: " + g3.getTemperatura());
        System.out.println("Ligada: " + g3.getLigada());
        System.out.println("--------------------");
    }
    
	

}