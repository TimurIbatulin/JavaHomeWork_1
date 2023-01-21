//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)


import java.util.Arrays;
import java.util.Random;

public class W2 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println(i);
        int n = 0;
        int z = 2;
        while (z < i) {
            z = z*2;
            n += 1;
        }
        System.out.println(n);
        int y = (32767-i)/n;
        int w = i;
        int [] arr = new int[y];
        int g = 0;
        while (w <= Short.MAX_VALUE){
            if ( w%n == 0){
                arr[g] = w;
                w += n;
                g += 1;
            } else {
                w += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        int r = (32768 + i) - (32768/n + (i-1)/n);
        int [] arr2 = new int[r];
        int cou = 0;
        while (i >= Short.MIN_VALUE){
            if (i%n !=0){
                arr2[cou] = i;
                i =i - 1;
                cou += 1;
            } else{
                i = i - 1;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
