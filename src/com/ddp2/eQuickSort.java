package com.ddp2;

public class eQuickSort {

  public static void main(String[] args) {
    // Deklarasi dan inisialisasi array integer
    int bilangan[] = {43, 85, 91, 25, 73};
    
    // Panggil fungsi quictSortInt untuk melakukan pengurutan array
    quickSortInt(bilangan);
  }

  static void quickSortInt(int[] angka){
    // Sebelum sorting, tampilkan isi array
    System.out.println("== SEBELUM ==");
    for (int i : angka) 
      System.out.print(i + ", ");
    
    // Logicnya
    quickSortLogic(angka, 0, angka.length - 1);

    // Setelah sorting, tampilkan isi array
    System.out.println("\n== SESUDAH ==");
    for (int i : angka) {
      System.out.print(i + ", ");
    }
  }

  // Metode utama untuk memulai algoritma Quick Sort
  public static void quickSortLogic(int[] arr, int low, int high) {
    if (low < high) {
        // Mencari posisi partisi untuk elemen pivot
        int partitionIndex = partition(arr, low, high);

        // Memanggil rekursif untuk kedua bagian array
        quickSortLogic(arr, low, partitionIndex - 1);
        quickSortLogic(arr, partitionIndex + 1, high);
    }
}

// Metode untuk menemukan posisi partisi dan membagi array
public static int partition(int[] arr, int low, int high) {
    // Memilih elemen pivot (di sini, pivot diambil dari bagian paling kanan)
    int pivot = arr[high];

    // Inisialisasi indeks partisi
    int i = low - 1;

    // Looping untuk mempartisi array
    for (int j = low; j < high; j++) {
        // Jika elemen saat ini lebih kecil dari pivot
        if (arr[j] < pivot) {
            // Meningkatkan indeks partisi dan menukar elemen
            i++;
            swap(arr, i, j);
        }
    }

    // Menempatkan pivot pada posisi yang tepat
    swap(arr, i + 1, high);

    // Mengembalikan indeks pivot yang benar
    return i + 1;
}

// Metode untuk menukar dua elemen dalam array
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

// Metode untuk mengonversi array menjadi string untuk mencetaknya
public static String arrayToString(int[] arr) {
    StringBuilder result = new StringBuilder("[");
    for (int i = 0; i < arr.length; i++) {
        result.append(arr[i]);
        if (i < arr.length - 1) {
            result.append(", ");
        }
    }
    result.append("]");
    return result.toString();
}
  
}
