package com.ddp2;

import java.util.Arrays;

public class cobaMerge {

  public static void main(String[] args) {
      int[] arr = {38, 27, 43, 3, 9, 82, 10, 20};
      System.out.println("Array sebelum diurutkan: " + Arrays.toString(arr));

      mergeSort(arr);

      System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
  }

  public static void mergeSort(int[] arr) {
      if (arr.length <= 1) {
          return;
      }

      int middle = arr.length / 2;
      int[] left = Arrays.copyOfRange(arr, 0, middle);
      int[] right = Arrays.copyOfRange(arr, middle, arr.length);

      mergeSort(left);
      mergeSort(right);
      merge(arr, left, right);
  }

  public static void merge(int[] arr, int[] left, int[] right) {
      int i = 0, j = 0, k = 0;

      while (i < left.length && j < right.length) {
          if (left[i] <= right[j]) {
              arr[k++] = left[i++];
          } else {
              arr[k++] = right[j++];
          }
      }

      while (i < left.length) {
          arr[k++] = left[i++];
      }

      while (j < right.length) {
          arr[k++] = right[j++];
      }
  }
}
