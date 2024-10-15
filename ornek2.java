import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print(("Sıcaklık Değerini Girin:"));
        double sicaklik=oku.nextDouble();

        if(sicaklik<=5){
            System.out.print("Çok Soğuk");

        } else if (sicaklik>5 && sicaklik<=20) {
            System.out.print("Soğuk");
        } else if (sicaklik>20 && sicaklik<=27) {
            System.out.print("Normal");
        } else if (sicaklik>27 && sicaklik<=35 ) {
            System.out.print("Sıcak");
        }else {
            System.out.println("Çok Sıcak");
        }

    }
}
