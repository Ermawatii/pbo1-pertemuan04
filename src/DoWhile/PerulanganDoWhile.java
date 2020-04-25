package DoWhile;

public class PerulanganDoWhile {
    public static void main(String[] args) {
        int IsiGelas = 225;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

        do {
            IsiGelas++;
            System.out.println("sedang mengisi gelas..");
            System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
        }while(IsiGelas != penuh);

        System.out.println("Finale : Isi Gelas Sekarang : "+ IsiGelas + "ml");
    }
}
