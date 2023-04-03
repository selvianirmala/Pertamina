import java.util.Scanner;

public class test1{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Soal 1");
        pattern1();
        System.out.println("\nSoal 2 \n" +
                "Karena tidak terdapat segitiga sama siku, " +
                "maka saya tambahkan kode untuk segitiga siku-siku dan sama kaki");
        System.out.println("\n==========Segitiga Siku Siku==========");
        segitigaSikuSiku();
        System.out.println("\n==========Segitiga Sama Kaki==========");
        segitigaSamaKaki();
        System.out.println("\nSoal 3 \n" +
                "Merupakan soal untuk mencari bilangan fibonacci");
        fibonacci();
    }

    static void pattern1(){
        for(int i=1; i<=3; i++){
            for (int j=1; j<=5; j++){
                System.out.print(j);
                if(j==5){
                    System.out.println();
                    for (int k=1; k<=1; k++){
                        for (int l=5; l>=1; l--){
                            System.out.print(l);
                            if(l==1){
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
    }

    static void segitigaSikuSiku(){
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--) {
                System.out.print(" ");
            }for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void segitigaSamaKaki(){
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void fibonacci(){
//        Variable x bisa memiliki nilai awal 0 atau 1.
//          Jika nilai awalnya 0, maka bilangan fibonacci dimulai dari 0 dan 1
//          Jika nilai awalnya 1, maka bilangan fibonacci dimulai dari 1 dan 1
        int n, x = 0, y = 1, z=1;
        System.out.print("Masukkan jumlah bilangan fibonacci: ");
        n = in.nextInt();
        for (int i=0; i<n; i++){
            System.out.print(" " + z);
            z = x+y;
            x=y;
            y=z;
        }
    }
}