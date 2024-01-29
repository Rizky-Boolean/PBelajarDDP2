package com.ddp2;

// SORTING
// Sorting (Pengurutan/Mengurutkan) adalah suatu proses
/* 
Mengurutkan sekumpulan data dari yang terkecil(ASCENDING) atau dari yang terbesar (DESCENDING).
Sorting bisa mengurutkan sekumpulan data berupa angka maupun tulisan (huruf).
*/

// SELECTION SORT
/*
Algoritma sederhana untuk pengurutan sekumpulan data dengan membandingkan semua data lalu setelah nilainya ditemukan barulah dilakukan pertukaran nilai.
Nilai yang sudah ditetapkan tidak akan dibandingkan lagi.
 */

public class bSelectionSort {
  public static void main(String[] args) {

    // 1. Integer 
    int angka[] = {56, 93, 29, 67, 47};
    selectionSortInteger(angka);

    // 2. Double
    double ipk[] = {3.6, 1.9, 3.8, 2.6};
    selectioinSortDouble(ipk);

    // 3. String
    String nama[] = {"Adi","Abdul", "Hedra", "Abbdul", "Aji"};
    selectionSortString(nama);

    // 4. Char
    char karakter[] = {'j', '2', 'm', 'J', '1', 'a'};
    selectionSortChar(karakter);
    
  }


  // 1. INTEGER
  static void selectionSortInteger( int bilangan[]){
    // Sebelum
    System.out.println("\n== SEBELUM ==");
    for(int b : bilangan){
      System.out.print(b + ",");
    }
    
    // Logicnya
    for (int i = 0; i < bilangan.length-1; i++){

      int iArray = i;

      for (int j = i; j < bilangan.length; j++){
        if (bilangan[iArray] < bilangan[j]){
          iArray = j;
        }
      }

      // Swap / Ditukar
      int tampungan = bilangan[i];
      bilangan[i] = bilangan[iArray];
      bilangan[iArray] = tampungan;
    }
    
    
    // Sesudah
    System.out.println("\n\n== SESUDAH ==");
    for(int b : bilangan){
      System.out.print(b + ",");
    }
  }


  // 2. DOUBLE
  static void selectioinSortDouble( double angka[]){
    // sebelum
    System.out.println("\n\n== SEBELUM ==");
    for (double a : angka){
      System.out.print(a +", ");
    }
    
    // logicnya
    for(int i = 0; i < angka.length; i ++){
      int simpan = i;

      for (int j = i; j < angka.length; j++){
        if (angka[simpan]< angka[j]){
          simpan = j;
        }
      }
      // tukar
      double tampung = angka[i];
      angka[i] = angka[simpan];
      angka[simpan] = tampung;
    }
    
    // setelah
    System.out.println("\n\n== SEBELUM ==");
    for (double a : angka){
      System.out.print(a +", ");
    }
    
  }

  // 3. STRING
  static void selectionSortString( String nama[]){
    // Sebelum
    System.out.println("\n\n== SEBELUM ==");
    for(String b : nama){
      System.out.print(b + ",");
    }
    
    // Logicnya
    for (int i = 0; i < nama.length-1; i++){

      int iArray = i;

      for (int j = i; j < nama.length; j++){
        if (nama[iArray].compareTo(nama[j]) < 0){
          iArray = j;
        }
      }

      // Swap / Ditukar
      String tampungan = nama[i];
      nama[i] = nama[iArray];
      nama[iArray] = tampungan;
    }
    
    
    // Sesudah
    System.out.println("\n\n== SESUDAH ==");
    for(String b : nama){
      System.out.print(b + ",");
    }
  }

  // 4. CHARACTER
  static void selectionSortChar( char huruf[]){
    // Sebelum
    System.out.println("\n\n== SEBELUM ==");
    for(char b : huruf){
      System.out.print(b + ",");
    }
    
    // Logicnya
    for (int i = 0; i < huruf.length-1; i++){

      int iArray = i;

      for (int j = i; j < huruf.length; j++){
        if (huruf[iArray]< huruf[j]){
          iArray = j;
        }
      }

      // Swap / Ditukar
      char tampungan = huruf[i];
      huruf[i] = huruf[iArray];
      huruf[iArray] = tampungan;
    }
    
    // Sesudah
    System.out.println("\n\n== SESUDAH ==");
    for(char b : huruf){
      System.out.print(b + ",");
    }
  }

}
