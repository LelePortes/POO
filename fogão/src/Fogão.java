public class Fogão {
    // Atributos
    private String marca;
    private String modelo;
    private int numeroDeBocas;
    private boolean ligado;

    // Construtor padrão
    Fogão(){
        marca = "Consul";
        modelo = "4 bocas";
        numeroDeBocas = 4;
        ligado = false;
    }

    // Construtor com parâmetros
    Fogão(String m, String model, int bocas, boolean l){
        marca = m;
        modelo = model;
        numeroDeBocas = bocas;
        ligado = l;
    }

    // Métodos de acesso
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

    public int getNumeroDeBocas() {
        return numeroDeBocas;
    }

    public void setNumeroDeBocas(int bocas) {
        this.numeroDeBocas = bocas;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    // Método principal para testar a classe Fogão
    public static void main(String[] args) {
        // Instanciação dos objetos Fogão
        Fogão f1 = new Fogão();
        Fogão f2 = new Fogão("Brastemp", "6 bocas", 6, true);
        Fogão f3 = new Fogão("Electrolux", "5 bocas", 5, false);
        
        // Exibir as informações de cada fogão
        System.out.println("O Fogão f1 é: \nMarca: " + f1.getMarca());
        System.out.println("Modelo: " + f1.getModelo());
        System.out.println("Número de bocas: " + f1.getNumeroDeBocas());
        System.out.println("Ligado: " + f1.getLigado());
        System.out.println("--------------------");

        System.out.println("O Fogão f2 é: \nMarca: " + f2.getMarca());
        System.out.println("Modelo: " + f2.getModelo());
        System.out.println("Número de bocas: " + f2.getNumeroDeBocas());
        System.out.println("Ligado: " + f2.getLigado());
        System.out.println("--------------------");

        System.out.println("O Fogão f3 é: \nMarca: " + f3.getMarca());
        System.out.println("Modelo: " + f3.getModelo());
        System.out.println("Número de bocas: " + f3.getNumeroDeBocas());
        System.out.println("Ligado: " + f3.getLigado());
        System.out.println("--------------------");
    }
}

