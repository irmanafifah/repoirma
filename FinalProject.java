/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fp;

/**
 *
 * @author SONY
 */

import java.util.Scanner;

public class FinalProject {

    static Scanner input = new Scanner(System.in);
    static int numright = 0;
    static int numwrong =0;
    static double answer = 0;
    
    static void soal(){
        System.out.println(
                "1. Berapakah akar dari 36?\n"
                + "2. Berapakah median dari deret angka berikut : 1 5 7 2 4 3 8\n"
                + "3. Berapakah panjang vektor dari titik (4,5) sampai ke titik (1,1)?\n"
                + "4. Berapakah luas segitiga jika alasnya 4 dan tingginya 6?\n"
                + "5. Berapakah hasil dari 5!(faktorial)?\n"
                + "6. Diketahui barisan aritmatika 5,8,11,.....,128,131 maka suku tengahnya adalah: \n"
                 );
    }
    static void jawablagi(){
        System.out.println("Apakah anda ingin menjawab pertanyaan lain?");
        System.out.println("tekan 1 untuk ya tekan 0 untuk tidak");
        int input1 = input.nextInt();
        if(input1==1){
            System.out.println("Silahkan input angka sesuai dengan nomer soal");
            pilihan();
        }
        else{
            double persentase = numright*100 / (numright + numwrong);
            System.out.println("jawaban benar yang telah anda jawab adalah: "
                    + numright + " \njawaban salah yang telah anda jawab adalah: " 
                    + numwrong + " \npresentase kebenaran jawaban anda adalah " + persentase + "%.");
        }
    }
    static void setjawaban1(){
        double menjawab = input.nextDouble();
        answer = Math.sqrt(36);
        if(menjawab == answer){
            System.out.println("Anda benar!\n");
            numright++;
            jawablagi();
        }
        else{
            System.out.println("Jawaban anda salah! Jawabannya adalah " + answer );
            numwrong++;
        }
    }
    static void setjawaban2(){
        double menjawab = input.nextDouble();
        int [] himpunan = {1,5,7,2,4,3,8};
        int temp;
        int n = himpunan.length;
        for(int i=0;i<n;i++){ //sorting
            for(int j=i;j<n;j++){
                if(himpunan[i]>himpunan[j]){
                    temp = himpunan[i];
                    himpunan[i]=himpunan[j];
                    himpunan[j]=temp;
                }
            }    
        }
        for(int i=0;i<n;i++){ //nampilin hasil sorting
            System.out.print(himpunan[i]);
        }
        System.out.println();
        answer = ((himpunan[0]+himpunan[6])/2);

        if(menjawab == answer){
            System.out.println("Anda benar!\n");
            numright++;
            jawablagi();
        }
        else{
            System.out.println("Jawaban anda salah! Jawabannya adalah " + answer );
            numwrong++;
        }
    }
    static void setjawaban3(){
        double menjawab = input.nextDouble();
        int x1=4;
        int x2=1;
        int y1=5;
        int y2=1;
        answer = Math.sqrt((Math.pow(x1-x2,2))+(Math.pow(y1-y2,2)));
        if(menjawab == answer){
            System.out.println("Anda benar!\n");
            numright++;
            jawablagi();
        }
        else{
            System.out.println("Jawaban anda salah! Jawabannya adalah " + answer );
            numwrong++;
        }
    }
    static void setjawaban4(){
        double menjawab = input.nextDouble();
        int alas = 4;
        int tinggi = 6;
        answer = (alas*tinggi)/2;
        if(menjawab == answer){
            System.out.println("Anda benar!\n");
            numright++;
            jawablagi();
        }
        else{
            System.out.println("Jawaban anda salah! Jawabannya adalah " + answer );
            numwrong++;
        }
    }
    static int fak(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fak(n-1);
        }
    }
        
    
    static void setjawaban5(){
        double menjawab = input.nextDouble();
        
        answer = fak(5);
        if(menjawab == answer){
            System.out.println("Anda benar!\n");
            numright++;
            jawablagi();
        }
        else{
            System.out.println("Jawaban anda salah! Jawabannya adalah " + answer );
            numwrong++;
        }
    }
    static void setjawaban6(){
        double menjawab = input.nextDouble();
        int a = 5;
        int b = 3;
        int Un = 131;
        
        answer = (a+131)/2;
        if(menjawab == answer){
            System.out.println("Anda benar!\n");
            numright++;
            jawablagi();
        }
        else{
            System.out.println("Jawaban anda salah! Jawabannya adalah " + answer );
            numwrong++;
        }
    }

    static void pilihan(){
        int input1 = input.nextInt();
        if(input1==1){
         System.out.println("Silahkan input jawaban anda: ");
         setjawaban1();  
       }
       else if(input1==2){
         System.out.println("Silahkan input jawaban anda: ");
         setjawaban2();  
       }
       else if(input1==3){
         System.out.println("Silahkan input jawaban anda: ");
         setjawaban3(); 
       }
        else if(input1==4){
         System.out.println("Silahkan input jawaban anda: ");
         setjawaban4(); 
       }
        else if(input1==5){
         System.out.println("Silahkan input jawaban anda: ");
         setjawaban5(); 
       }
        else if(input1==6){
         System.out.println("Silahkan input jawaban anda: ");
         setjawaban6(); 
       }
        else{
            System.out.println("ERROR! Silahkan input lagi");
            pilihan();
        } 
    }

    
    
    public static void main(String[] args) {
       //FinalProject show = new FinalProject();
       System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
       System.out.println("--Selamat Datang Di Kuis Matematika--");
       System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
       System.out.println("Daftar soal: ");
       soal();
       System.out.println("Silahkan input angka sesuai dengan nomer soal: ");
       pilihan();
       
       
       
    }
    
}
