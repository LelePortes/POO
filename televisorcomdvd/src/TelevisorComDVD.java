public class TelevisorComDVD extends Televisor {
    // Construtor padrão da subclasse
    public TelevisorComDVD() {
        super(); // Chama o construtor da superclasse
        setCanal(31);
        setTamanho("20 polegadas");
        setModelo("PHILCO");
    }

    // Métodos adicionais da subclasse
    public String eject() {
        return "Eject ativado";
    }

    public String play() {
        return "Função Play ativada";
    }

    public String stop() {
        return "Função Stop ativada";
    }

    public String pause() {
        return "Função Pause ativada";
    }
}

