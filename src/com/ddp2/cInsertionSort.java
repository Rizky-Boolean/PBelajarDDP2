package com.ddp2;

public class cInsertionSort {

  public static void main(String[] args) {
    // integer
    int bilangan[] = {43, 85, 91, 25, 73};
    insertionSortInteger(bilangan);

    // double
    double angka[] = {3.5, 2.9, 2.3, 3.1, 3.9};
    insertionSortDouble(angka);

    // String 
    String siapa[] = {"Rizky", "Nanda", "Adib", "Tiyo", "Ricky"};
    insertionSortString(siapa);

    // Char
    char grade[] = {'M', 'R', 'i', 'Z', 'k', 'y', '1'};
    insertionSortChar(grade);
    
  }
  
  // 1. INTEGER
  static void insertionSortInteger(int angka[]){
    // sebelum
    System.out.println("== SEBELUM ==");
    for (int out : angka){
      System.out.print(out + ", ");
    }

    // Logicnya
    for(int i = 1; i < angka.length; i++){
      for (int j = i; j > 0; j--){
        if(angka[j] > angka[j-1]){
          int tampung = angka[j];
          angka[j] = angka[j-1];
          angka[j-1] = tampung;
        }
      }
    }

    // Sesudah
    System.out.println("\n== SESUDAH ==");
    for (int out : angka){
      System.out.print(out + ", ");
    }
  }
  
  // 2. DOUBLE
  static void insertionSortDouble(double angka[]){
    // sebelum
    System.out.println("\n\n== SEBELUM ==");
    for (double out : angka){
      System.out.print(out + ", ");
    }

    // Logicnya
    for(int i = 1; i < angka.length; i++){
      for (int j = i; j > 0; j--){
        if(angka[j] > angka[j-1]){
          double tampung = angka[j];
          angka[j] = angka[j-1];
          angka[j-1] = tampung;
        }
      }
    }

    // Sesudah
    System.out.println("\n== SESUDAH ==");
    for (double out : angka){
      System.out.print(out + ", ");
    }
  }
  
  // 3. STRING
  static void insertionSortString(String nama[]){
    // sebelum
    System.out.println("\n\n== SEBELUM ==");
    for (String out : nama){
      System.out.print(out + ", ");
    }

    // Logicnya
    for(int i = 1; i < nama.length; i++){
      for (int j = i; j > 0; j--){
        if(nama[j].compareTo(nama[j-1])>0){
          String tampung = nama[j];
          nama[j] = nama[j-1];
          nama[j-1] = tampung;
        }
      }
    }

    // Sesudah
    System.out.println("\n== SESUDAH ==");
    for (String out : nama){
      System.out.print(out + ", ");
    }
  }

  
  // 4. CHAR
  static void insertionSortChar(char huruf[]){
    // sebelum
    System.out.println("\n\n== SEBELUM ==");
    for (char out : huruf){
      System.out.print(out + ", ");
    }

    // Logicnya
    for(int i = 1; i < huruf.length; i++){
      for (int j = i; j > 0; j--){
        if(huruf[j]<huruf[j-1]){
          char tampung = huruf[j];
          huruf[j] = huruf[j-1];
          huruf[j-1] = tampung;
        }
      }
    }

    // Sesudah
    System.out.println("\n== SESUDAH ==");
    for (char out : huruf){
      System.out.print(out + ", ");
    }
  }







}
