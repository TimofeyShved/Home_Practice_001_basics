# Основы

1.1. Реализуйте алгоритм сортировки пузырьком для сортировки массива

Задача
--------
Заполните массив случайным числами и сделать сортировку


Решение:
--------

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


