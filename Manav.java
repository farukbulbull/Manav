import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        //fiyat listemizi oluşturduk

        double armut=2.14,
                elma=3.67,
                domates=1.11,
                muz=0.95,
                patlıcan=5.00;


        Scanner inp =new Scanner(System.in);

        //kullanıcıdan değer aldık



        System.out.print("ARMUT KAÇ KG ? :");
       double armutKg=inp.nextDouble();
        System.out.print("ELMA KAÇ KG ? :");
        double elmaKg= inp.nextDouble();
        System.out.print("MUZ KAÇ KG ? :");
       double muzkg=inp.nextDouble();
        System.out.print("DOMATES KAÇ KG ? :");
       double domatesKg= inp.nextDouble();
        System.out.print("PATLICAN KAÇ KG ? :");
       double patlıcanKg= inp.nextDouble();

       //toplama işlemini yaptık

        double toplam= armut*armutKg+
                elmaKg*elma+
                muzkg*muz+
                domatesKg*domates+
                patlıcanKg*patlıcan;

                //sonucu ekrana yazdırdık:)


        System.out.print("TOPLAM FİYAT(TL)"+toplam);

    }
}
