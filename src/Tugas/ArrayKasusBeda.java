package Tugas;

public class ArrayKasusBeda {
    public static void main(String[] args) {
        String[][] laptop = { {"toshiba","5.000.000"},{"acer","3.000.000"},{"asus","4.000.000"},{"lenovo","1.500.000"},};

        for(int x=0; x< laptop.length; x++){
            System.out.println("merek : "+ laptop[x][0]);
            System.out.println("merek : "+ laptop[x][1]);
            System.out.println("---------------------------");
        }
    }
}
