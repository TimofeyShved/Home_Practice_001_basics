package com.company;

public class Main {

    public static void main(String[] args) {

        // создаём массив
        int[] arrayInt = new int[20];
        int[] arrayIntOLD = new int[20];
        for (int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = (int) (Math.random() * 100);
            arrayIntOLD[i] = arrayInt[i];
        }


        //сортируем
        boolean sorted = false;
        while (sorted!=true){
            int temp;
            sorted = true;
            for (int i = 0; i < arrayInt.length-1; i++){
                if(arrayInt[i]>arrayInt[i+1]){
                    temp = arrayInt[i];
                    arrayInt[i] = arrayInt[i+1];
                    arrayInt[i+1] = temp;
                    sorted = false;
                }
            }
        }

        //Выводим на экран
        System.out.println("Array OLD");
        for (int i = 0; i < arrayIntOLD.length; i++){
            System.out.print(arrayIntOLD[i] + " / ");
        }
        System.out.println("\n Array sorted");
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i] + " / ");
        }

    }
}
