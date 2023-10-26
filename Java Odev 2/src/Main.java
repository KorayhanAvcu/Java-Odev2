import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tutar;
        double kdv=0, toplamTutar=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tutar : ");
        tutar = inp.nextInt();
        if(tutar>1000){
            kdv=0.08;
        }

        else if(tutar<=1000){
            kdv=0.18;
        }
        toplamTutar= tutar + (tutar*kdv);

        System.out.println(toplamTutar);
    }
}