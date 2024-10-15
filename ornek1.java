import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float y1,y2,ortalama;
        System.out.print(("1.Yazılı:"));
        y1=oku.nextFloat();
        System.out.print(("2.Yazılı:"));
        y2=oku.nextFloat();
        ortalama=(y1+y2)/2;
        System.out.print("Ortalamanız:");
        if (ortalama>=50){
            System.out.print("Geçtiniz:");
        }
        else {
            System.out.print("Kaldınız:");

        }
    }
}
