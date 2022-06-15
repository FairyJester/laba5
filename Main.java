package com.company;
    public class Main {
        public static void selectionSort(int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i][i];
                int min_i = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j][j] < min) {
                        min = arr[j][j];
                        min_i = j;
                    }
                }
                if (i != min_i) {
                    int tmp = arr[i][i];
                    arr[i][i] = arr[min_i][min_i];
                    arr[min_i][min_i] = tmp;
                }
            }
            System.out.println();
        }

        public static void arrayOut(int[][] myArray) {
            for (int i = 0; i<myArray.length; i++){
                for (int j = 0; j<myArray.length; j++){
                    System.out.print(myArray[i][j]+" ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int[][] myArray = new int[5][5];
            for (int i = 0; i<myArray.length; i++){
                for (int j = 0; j<myArray.length; j++){
                    myArray[i][j]=(int)(10*Math.random());
                }
            }

            arrayOut(myArray);

            selectionSort(myArray);

            arrayOut(myArray);
        }
    }