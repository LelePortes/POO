public class Automovel {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private boolean cambioManual;

    // Construtor padrão
    Automovel() {
        marca = "Volkswagen";
        modelo = "Gol";
        ano = 2020;
        cambioManual = true; // Gol com câmbio manual por padrão
    }

    // Construtor com parâmetros
    Automovel(String m, String model, int ano, boolean cambioManual) {
        marca = m;
        modelo = model;
        this.ano = ano;
        this.cambioManual = cambioManual;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isCambioManual() {
        return cambioManual;
    }

    public void setCambioManual(boolean cambioManual) {
        this.cambioManual = cambioManual;
    }

    // Método principal para testar a classe Automovel
    public static void main(String[] args) {
        // Instanciação dos objetos Automovel
        Automovel a1 = new Automovel();
        Automovel a2 = new Automovel("Toyota", "Corolla", 2022, false); // Automático
        Automovel a3 = new Automovel("Ford", "Mustang", 2018, true); // Manual

        // Exibir as informações de cada automóvel
        System.out.println("O Automóvel a1 é: \nMarca: " + a1.getMarca());
        System.out.println("Modelo: " + a1.getModelo());
        System.out.println("Ano: " + a1.getAno());
        System.out.println("Câmbio: " + (a1.isCambioManual() ? "Manual" : "Automático"));
        System.out.println("--------------------");

        System.out.println("O Automóvel a2 é: \nMarca: " + a2.getMarca());
        System.out.println("Modelo: " + a2.getModelo());
        System.out.println("Ano: " + a2.getAno());
        System.out.println("Câmbio: " + (a2.isCambioManual() ? "Manual" : "Automático"));
        System.out.println("--------------------");

        System.out.println("O Automóvel a3 é: \nMarca: " + a3.getMarca());
        System.out.println("Modelo: " + a3.getModelo());
        System.out.println("Ano: " + a3.getAno());
        System.out.println("Câmbio: " + (a3.isCambioManual() ? "Manual" : "Automático"));
        System.out.println("--------------------");
    }
}
