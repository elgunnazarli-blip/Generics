import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        // ARRAYS
       //  1 - ci tapşırıq
        int[] numbers = {3,1,4,5,2};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if(numbers[j] > numbers[j+1]){   // çoxdan aza düzdükdə > işarəsi < olmalıdı
                    int a = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = a;
                }
            }
        }
        for (int d = 0; d < numbers.length; d++) {
            System.out.println(numbers[d]);
        }


        // 2 - ci tapşırıq
        int[] num = {1,2,3,4,5};
        Scanner a = new Scanner(System.in);
        System.out.println("Birinci indeksi daxil edin:");
        int b = a.nextInt();
        System.out.println("İkinci indeksi daxil edin:");
        int c = a.nextInt();

        int temp = num[b];
        num[b] = num[c];
        temp = num[c];

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


        // 3 - cü tapşırıq
        int[] f = {1,2,3,4,5,6};
        int[] newarr = new int[6];
        for (int i = 0; i < f.length; i++) {
            if(f[i] % 2 == 0){
                newarr[i] = f[i];
            }
            System.out.println(newarr[i]);
        }


        // 4 - cü tapşırıq
        int[]num = {1,2,3,1,3,4};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if(num[i] == num[j]){
                    num[i]=0;
                }
            }
            System.out.println(num[i]);


        // 5 - ci tapşırıq
            int[] num1 = {1,5,4,8,3,9};
            int max = num1[0];
            int second = num1[1];

            for (int i = 0; i < num1.length; i++) {
                if(num1[i] > max){
                    second = max;
                    max = num1[i];
                }
            }
            System.out.println("İkinci ən böyük:"+second);


            // Methods
            //1 - ci tapşırıq
            int netice = factorial(5);
            System.out.println(netice);


        }
        public static int factorial(int n){
            int faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial = faktorial * i;
            }
            return faktorial;


            // 2 - ci tapşırıq
            public static void fibonacci(int n) {

                int a = 0;
                int b = 1;

                for (int i = 0; i < n; i++) {

                    System.out.println(a);

                    int c = a + b;
                    a = b;
                    b = c;
                }


                // 3 - cü tapşırıq

                public static void main(String[] args) {

                    System.out.println(sadeEdeddir(7));

                }


                public static boolean sadeEdeddir(int n) {

                    if (n < 2) {
                        return false;
                    }

                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            return false;
                        }
                    }

                    return true;
                }
            }
        }
        }
    }

