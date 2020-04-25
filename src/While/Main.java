package While;

public class Main {
    public static void main(String[] args) {
        int isiGelas = 225;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

        while(isiGelas != penuh){
            isiGelas++;
            System.out.println("sedang mengisi gelas..");
            System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");

        }
        System.out.println("finale : Isi Gelas Sekarang : "+ isiGelas + "ml");
    }
}
