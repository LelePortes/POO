public class CR {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(10, "10 polegadas", "Gradiente");
        TelevisorComDVD tvdvd1 = new TelevisorComDVD();

        System.out.println("O objeto tv1 é " + tv1.getModelo());
        System.out.println("O objeto tv2 é " + tv2.getModelo());
        System.out.println("O objeto tvdvd1 é " + tvdvd1.getModelo());
        System.out.println(" " + tvdvd1.eject());
        System.out.println(" " + tvdvd1.stop());
        System.out.println(" " + tvdvd1.play());
        System.out.println(" " + tvdvd1.pause());
    }
}
