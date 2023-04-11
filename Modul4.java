import java.util.Scanner;
public class Modul4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hari;
        System.out.println("Jumblah hari : ");
        hari=input.nextInt();
        int tahun, sisa1, bulan, sisa2;
        tahun = hari/365;
        sisa1 = hari%365;

        bulan = sisa1/30;
        sisa2 = sisa1%30;
        System.out.println(hari+"hari = "+tahun+"tahun = "+bulan+"bulan = "+sisa2+"hari");
        
        


    }
}


