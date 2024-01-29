package com.ddp2;

public class gBinarySearch {

  public static void main(String[] args) {
    int[] nilai = {3, 7, 10, 17, 38, 49, 69};
    biarySeearchInt(nilai, 7);

  }

  static void biarySeearchInt(int[] angka, int search){
    int low = 0, high = angka.length-1, median;
    boolean status = false;

    while(low <= high){
      median = (low + high) / 2;

      // pengecekan apakah datanya ditemukan atau tidak
      if (search == angka[median]){
        // jika datanya ketemu
        System.out.println(search+ " ditemukan pada posisi ke "+(median+1)+" di index ke-"+median);
        status = true;
        break;
      }else{
        // kalo datanya tidak ketemu
        // lakukan pembagian array apakah lebih besar dari key atau lebih kecil dari key
        if(search > angka[median]){
          low = median + 1;
        }else{
          high = median - 1;
        }
      }
    }

    if(status == false){
      System.out.println(search + " tidak ditemukan pada data");
    }


  }
  
}
