package com.ddp2;

public class fSequentialSearch {

  public static void main(String[] args) {
    String nama[] = {"Budi", "Andi", "Rizky", "Yunus", "Farhan"};
    sequentialSearchString(nama, "riZky");
    
    
  }

  static void sequentialSearchString(String[] siapa, String search){
    boolean status = false;

    for(int i = 0; i < siapa.length; i++){
      if( search.equalsIgnoreCase(siapa[i])){
        System.out.println(search + " ditemukan pada posisi ke "+(i+1)+" index ke-" + i);
        status = true;
        break;
      }
    }

    if(status == false){
      System.out.println("Keywoard yg anda cari tidak ada dalam data");
    }

  }
  
}
