package com.ddp2;

import java.util.Arrays;

public class dMergeSort {

  public static void main(String[] args) {

    // Deklarasi dan inisialisasi array integer
    int bilangan[] = {43, 85, 91, 25, 73};
    
    // Panggil fungsi mergeSortInt untuk melakukan pengurutan array
    mergeSortInt(bilangan);
    
  }

  // Fungsi utama untuk mengurutkan array integer menggunakan Merge Sort
  static void mergeSortInt(int angka[]){
    // Sebelum sorting, tampilkan isi array
    System.out.println("== SEBELUM ==");
    for (int i : angka) 
      System.out.print(i + ", ");
    
    // Panggil fungsi pisahInt untuk memulai proses pengurutan
    angka = pisahInt(angka);

    // Setelah sorting, tampilkan isi array
    System.out.println("\n== SESUDAH ==");
    for (int i : angka) {
      System.out.print(i + ", ");
    }
  }

  // Fungsi untuk membagi array menjadi dua bagian sampai menjadi satu elemen
  public static int[] pisahInt(int[] bilangan){
    // Jika hanya satu elemen atau tidak ada elemen, kembalikan array asli
    if(bilangan.length <= 1){
      return bilangan;
    }
    
    // Temukan titik tengah array
    int middle = bilangan.length / 2;
    
    // Pisahkan array menjadi dua bagian, kiri dan kanan
    int[] kiri = Arrays.copyOfRange(bilangan, 0, middle);
    int[] kanan = Arrays.copyOfRange(bilangan, middle, bilangan.length);

    // Rekursif: Panggil fungsi pisahInt untuk bagian kiri dan kanan
    kiri = pisahInt(kiri);
    kanan = pisahInt(kanan);
    
    // Panggil fungsi gabungInt untuk menggabungkan dua bagian yang sudah diurutkan
    return gabungInt(bilangan, kiri, kanan);
  }

  // Fungsi untuk menggabungkan dua bagian array yang sudah diurutkan
  static int[] gabungInt(int[] bil, int[] kiri, int[] kanan){
    int i = 0, j = 0, k = 0;
    /* i, j, dan k adalah indeks yang digunakan untuk melacak posisi saat ini di dalam array kiri, kanan, dan bil masing-masing. */

    // Gabungkan elemen-elemen dari bagian kiri dan kanan secara terurut
    while (i < kiri.length && j < kanan.length) {
    /* while (i < kiri.length && j < kanan.length) adalah kondisi loop. Loop akan terus berjalan selama masih terdapat elemen yang belum diproses baik di array kiri maupun kanan. */
      if (kiri[i] <= kanan[j]) {
      /* Di dalam loop, terdapat percabangan dengan kondisi if (kiri[i] <= kanan[j]). Ini berarti kita membandingkan elemen pada indeks i di array kiri dengan elemen pada indeks j di array kanan. */
        bil[k++] = kiri[i++];
      } 
      /* Jika kiri[i] > kanan[j], maka elemen pada kanan[j] akan dimasukkan ke dalam array utama (bil) pada posisi k, dan nilai j dan k akan ditingkatkan satu. */
      else {
        bil[k++] = kanan[j++];
      }

      /* Proses ini akan terus berlanjut sampai salah satu dari array kiri atau kanan habis diproses. */
    }

    // Tambahkan elemen yang masih tersisa di bagian kiri
    while (i < kiri.length) {
      /* Loop kedua (while (i < kiri.length)) menambahkan elemen-elemen yang masih tersisa di bagian kiri ke dalam array utama bil. */
      bil[k++] = kiri[i++];
    }

    // Tambahkan elemen yang masih tersisa di bagian kanan
    while (j < kanan.length) {
      /* Loop ketiga (while (j < kanan.length)) menambahkan elemen-elemen yang masih tersisa di bagian kanan ke dalam array utama bil. */
      bil[k++] = kanan[j++];
    }

    // Kembalikan array yang sudah digabung
    return bil;
    /* Setelah kedua loop selesai, array bil akan berisi elemen-elemen yang sudah diurutkan dari kedua bagian kiri dan kanan.
    Array yang sudah digabung dikembalikan sebagai hasil dari fungsi gabungInt. */
  }
}



// RINGKASAN

/*
  - Program menerima array integer, kemudian memanggil fungsi `mergeSortInt` untuk melakukan pengurutan.
  - Fungsi `pisahInt` membagi array menjadi dua bagian, memanggil dirinya sendiri secara rekursif, dan menggabungkan dua bagian tersebut.
  - Fungsi `gabungInt` digunakan untuk menggabungkan dua bagian array yang sudah diurutkan.
 */