import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int puan=0;

        System.out.println("Aldığı puan:");
        puan= oku.nextInt();
        if (puan<50){
            System.out.println(("1 ile Kaldı"));

        } else if (puan>=50 && puan<60) {
            System.out.println("2 ile Geçti");

        } else if (puan>=60 && puan<70) {
            System.out.println("3 ile Geçti");
        } else if (puan>=70 && puan<85) {
            System.out.println("4 ile Geçti");
        }else {
            System.out.println("5 ile Geçti");
        }

    }
}
