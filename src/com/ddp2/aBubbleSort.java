package com.ddp2;

// SORTING
// Sorting (Pengurutan/Mengurutkan) adalah suatu proses
/* 
Mengurutkan sekumpulan data dari yang terkecil(ASCENDING) atau dari yang terbesar (DESCENDING).
Sorting bisa mengurutkan sekumpulan data berupa angka maupun tulisan (huruf).
*/


// BUBBLE SORT
/* 
Algoritma sederhana untuk pengurutan sekumpulan data dengan membandingkan sekaligus menukar data (kalau pengkondisiannya bernilai true) dari nilai n dengan nilai n+1

Banyak Perbandingan
= ( jumlahData – 1 ) x ( jumlahData – 1 ) 
*/

public class aBubbleSort {
  public static void main(String[] args) {
    // 1. Integer
    int nilai[] = {98, 34, 80, 27, 50};
    bubbleSortInteger(nilai);

    // 2. Double
    double ipk[] = {3.6, 1.9, 3.8, 2.6};
    bubbleSortDoubble(ipk);

    // 3. String
    String nama[] = {"Adi","Abdul", "Hedra", "Abbdul", "Aji"};
    bubbleSortString(nama);

    // 4. Char
    char karakter[] = {'j', '2', 'm', 'J', '1', 'a'};
    bubbleSortChar(karakter);


  }


  // 1. BUBBLE SORT INTEGER
  static void bubbleSortInteger(int angka[]){
    // tampilan sebelum
    System.out.println("\n== SEBLUM ==");
    for(int bil : angka){
      System.out.print(bil + ", ");
    }

    // Logicnya
    for (int i = 1; i < angka.length; i++){
      for (int j = 0; j < angka.length-1; j++){
        // jika nilai sekarang > nilai setelahnya
        if(angka[j] > angka[j+1]){
          // maka ditukar
          int tampungan = angka[j];
          angka[j] = angka[j+1];
          angka[j+1] = tampungan;
        }
      }
    }

    // tampilan sesudah
    System.out.println("\n== SESUDAH ==");
    for(int bil : angka){
      System.out.print(bil + ", ");
    }
  }



  // 2. BUBBLE SORT DOUBLE
  static void bubbleSortDoubble(double angka[]){
    // tampilan sebelum
    System.out.println("\n== SEBELUM ==");
    for(double bilangan : angka){
      System.out.print(bilangan + ", ");
    }

    // Logicnya
    for(int i = 1; i < angka.length; i++){
      for (int j = 0; j < angka.length-1; j++){
        if (angka[j] > angka[j+1]){
          double penampung = angka[j];
          angka[j] = angka[j+1];
          angka[j+1] = penampung;
        }
      }
    }

    // tampulan sesudah
    System.out.println("\n== SESUDAH ==");
    for(double bilangan : angka){
      System.out.print(bilangan + ", ");
    }
  }



  // 3. BUBBLE SORT STRING
  static void bubbleSortString(String kalimat[]){
    // sebelum bubble sort
    System.out.println("\n\n== SEBELUM ==");
    for (String kata : kalimat){
      System.out.print(kata + ", ");
    }
    
    // Logicnya
    for(int i = 1; i < kalimat.length; i++){
      for(int j = 0; j < kalimat.length-1; j++ ){
        if(kalimat[j].compareTo(kalimat[j+1]) > 0){
          String penampung = kalimat[j];
          kalimat[j] = kalimat[j+1];
          kalimat[j+1] = penampung;
        }
      }
    }
    
    
    // Setelah bubblesort
    System.out.println("\n== SESUDAH ==");
    for (String kata : kalimat){
      System.out.print(kata + ", ");
    }
  }



  // 4. BUBBLE SORT CHAR
  static void bubbleSortChar(char huruf[]){
    // tampilan sebelum
    System.out.println("\n\n== SEBELUM ==");
    for(char hrf : huruf){
      System.out.print(hrf + ", ");
    }

    // Logicnya
    for(int i = 1; i < huruf.length; i++){
      for(int j = 0; j < huruf.length-1; j++ ){
        if(huruf[j] > huruf[j+1]){
          char penampung = huruf[j];
          huruf[j] = huruf[j+1];
          huruf[j+1] = penampung;
        }
      }
    }

    // tampilan sesudah
    System.out.println("\n== SESUDAH ==");
    for(char hrf : huruf){
      System.out.print(hrf + ", ");
    }
  }




}
