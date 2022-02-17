package ru.gb;

import java.util.Arrays;

public class MainApp {

        public static void main(String[] args) {

            System.out.println(Arrays.toString(arrayPart(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7,})));
            System.out.println(Arrays.toString(arrayPart(new int[]{1, 2, 4, 1, 7, 5, 3, 2,})));
            System.out.println(Arrays.toString(arrayPart(new int[]{1, 2, 4,})));
            System.out.println(Arrays.toString(arrayPart(new int[]{1, 2, 5, 6})));

            System.out.println(arraysContainsOnly(new int[]{1, 1, 1, 4, 4, 1, 4, 4,}));
            System.out.println(arraysContainsOnly(new int[]{1, 1, 1, 1, 1, 1,}));
            System.out.println(arraysContainsOnly(new int[]{4, 4, 4, 4,}));
            System.out.println(arraysContainsOnly(new int[]{1, 4, 4, 1, 1, 4, 3}));
            System.out.println(arraysContainsOnly(new int[]{14, 41, 11, 44}));
        }


        public static int[] arrayPart (int[]arr){
            for (int i = arr.length - 1; i >= 0; i--) {
                if(arr[i] == 4){
                    return Arrays.copyOfRange(arr, i +1, arr.length);
                }
            }
            throw new RuntimeException("Массив не содержит 4");
        }

        public static boolean arraysContainsOnly(int[] arr){
            boolean num1 = false;
            boolean num4 = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 1 && arr[i] != 4){
                    return false;
                }
                if(arr[i] == 1){
                    num1 = true;
                }
                if(arr[i] == 4){
                    num4 = true;
                }
            }
            return num1 && num4;
        }
    }

