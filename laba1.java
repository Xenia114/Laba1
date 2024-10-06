import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class laba1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);//вводить значения с клавиатуры
        laba1 n = new laba1();
        for (int io=1; io<=20; io++){
        out.println("Введите номер задачи :\n(модуль 1, номера 1, 3, 5, 7, 9)\n(модуль 2, номера 21, 23, 25, 27, 29)\n(модуль 3, номера 31, 33, 35, 37, 39)\n(модуль 4, номера 41, 43, 45, 47, 49) ");
        int exr = in.nextInt();

        switch(exr){
            case 1:double a;
                out.println("Задание 1: Необходимо реализовать метод таким образом, чтобы он возвращал только\n" +
                        "дробную часть числа х.");
                out.println("введите дробное число: ");
                a = in.nextDouble();
                double x = n.fraction(a);
                out.println("Дробная часть от числа: ");
                out.println(String.format("%.4f", x));
                out.println("\n");
                break;

            case 3:
                out.println("Задание 3: Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7\n" +
                        "8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал\n" +
                        "символ в соответствующее число.");
                out.println("введите символ из набора (0 1 2 3 4 5 6 7 8 9): ");
                char s = in.next().charAt(0);
                out.println("Число, соответствующее вашему символу: ");
                int ch = n.charToNum(s);
                out.println(ch);
                out.println("\n");
            case 5:
                out.println("Задание 5: вНеобходимо реализовать метод таким образом, чтобы он принимал число x и\n" +
                        "возвращал true, если оно двузначное.");
                out.println("ведите число, которое нужно проверить на дузначность: ");
                int d = in.nextInt();
                boolean k = n.is2Digits(d);
                out.println(k);
                out.println("\n");
            case 7:
                out.println("Задание 7: Метод принимает левую и правую границу (a и b) некоторого числового\n" +
                        "диапазона. Необходимо реализовать метод таким образом, чтобы он возвращал\n" +
                        "true, если num входит в указанный диапазон (включая границы). Обратите\n" +
                        "внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а\n" +
                        "кто меньше)");
                out.println("введите границы диапазона a,b и число, которое нужно проверить на принадлежность к диапазону [a, b] или [b, a], в зависимости от того кто из них больше: ");
                int l= in.nextInt();
                int u = in.nextInt();
                int m = in.nextInt();
                boolean rt = n.isInRange(l, u, m);
                if (l<u){
                    if (rt == true){
                        out.println("Число принадлежит диапазону [a, b]");
                    }
                    else {
                        out.println("Число не принадлежит диапазону [a, b]");
                    }
                }
                else {
                    if (rt == true){
                        out.println("Число принадлежит диапазону [b, a]");
                    }
                    else {
                        out.println("Число не принадлежит диапазону [b, a]");
                    }
                }

                out.println(rt);
                out.println("\n");
            case 9:
                out.println("Задание 9: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n" +
                        "все три полученных методом числа равны\n");
                out.println("введите числа a, b, c,чтобы проверить их на равнество:\n ");
                int q= in.nextInt();
                int w = in.nextInt();
                int e = in.nextInt();
                boolean qwe = n.isEqual(q, w, e);
                if (qwe == true){
                    out.println("Числa равны");
                }
                else {
                    out.println("Числа не равны\n");
                }
            case 21:
                out.println("\nМодуль 2, задание 1: Необходимо реализовать метод таким образом, чтобы он возвращал модуль\n" +
                        "числа х (если оно было положительным, то таким и остается, если он было\n" +
                        "отрицательным – то необходимо вернуть его без знака минус).\n");
                out.println("Введите число: ");
                int g = in.nextInt();
                int gabs= n.abs(g);
                out.println(gabs);
            case 23:
                out.println("Модуль 2, задание 3: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n" +
                        "число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то\n" +
                        "вернуть надо false.\n");
                out.println("Введите число: ");
                int h = in.nextInt();
                boolean fds = n.is35(h);
                out.println(fds);
            case 25:
                out.println("Модуль 2, задание 5: Необходимо реализовать метод таким образом, чтобы он возвращал\n" +
                        "максимальное из трех полученных методом чисел.\n");
                out.println("Введите числа x, y, z: ");
                int j = in.nextInt();
                int kl=in.nextInt();
                int yu = in.nextInt();
                int chislomax = n.max3(j, kl, yu);
                out.println(chislomax);
            case 27:
                out.println("Модуль 2, задание 7: Необходимо реализовать метод таким образом, чтобы он возвращал сумму\n" +
                        "чисел x и y. Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть\n" +
                        "число 20.\n");
                out.println("Введите числа x, y: ");
                int p = in.nextInt();
                int o=in.nextInt();
                int op=n.sum2(o, p);
                out.println(op);
            case 29:
                out.println("\nМодуль 2, задание 9: Метод принимает число x, обозначающее день недели. Необходимо реализовать\n" +
                        "метод таким образом, чтобы он возвращал строку, которая будет обозначать\n" +
                        "текущий день недели, где 1- это понедельник, а 7 – воскресенье. Если число не\n" +
                        "от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче\n" +
                        "используйте switch. \n");
                out.println("Введите число от 1 до 7, чтобы получить название дня недели: ");
                int day = in.nextInt();
                String yuiip= n.day(day);
                out.println(yuiip);
            case 31:
                out.println("\nМодуль 3, задание 1: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n" +
                        "которой будут записаны все числа от 0 до x (включительно).\n");
                out.println("Введите числo х, чтобы записать все числа от 0 до x в строку: ");
                int mlk = in.nextInt();
                String tuy=n.listNums(mlk);
                out.println(tuy);
            case 33:
                out.println("\nМодуль 3, задание 3: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n" +
                        "которой будут записаны все четные числа от 0 до x (включительно).\n");
                out.println("Введите числo х, чтобы записать все четные числа от 0 до х в строку: ");
                int zxc = in.nextInt();
                String cxz=n.chet(zxc);
                out.println(cxz);
            case 35:
                out.println("\nМодуль 3, задание 5: Необходимо реализовать метод таким образом, чтобы он возвращал количество\n" +
                        "знаков в числе x. \n");
                out.println("Введите числo х, чтобы узнать количество знаков в числе: ");
                int mnb = in.nextInt();
                int lon = n.numLen(mnb);
                if (mnb<0){
                    out.println("Количество знаков в отрицательном числе с учетом '-': ");
                }
                else {
                    out.println("Количество знаков в числе: ");
                }
                out.println(lon);
            case 37:
                out.println("Модуль 3, задание 7: Необходимо реализовать метод таким образом, чтобы он выводил на экран\n" +
                        "квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в\n" +
                        "высоту.\n ");
                out.println("Введите числo х, чтобы получить квадрат из '*': ");
                int ncv = in.nextInt();
                n.square(ncv);
            case 39:
                out.println("\nМодуль 3, задание 9: Необходимо реализовать метод таким образом, чтобы он выводил на экран\n" +
                        "треугольник из символов ‘*’ у которого х символов в высоту, а количество\n" +
                        "символов в ряду совпадает с номером строки, при этом треугольник выровнен\n" +
                        "по правому краю.\n");
                out.println("Введите числo х, чтобы получить правильный треугольник из '*': ");
                int tre = in.nextInt();
                n.rightTriangle(tre);
            case 41:
                out.println("\nМодуль 4, задание 1: Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n" +
                        "первого вхождения числа x в массив arr. Если число не входит в массив –\n" +
                        "возвращается -1.\n");
                out.println("Введите числo х, чтобы получить индекс первого вхождения числа x в массив {1, 2, 2, 3, 7, 8, 9, 3, 4, 5}: ");
                int[] arr = {1, 2, 2, 3, 7, 8, 9, 3, 4, 5};
                int ind = in.nextInt();
                int index=n.findFirst(arr, ind);
                out.println("Индекс: "+index);
            case 43:
                out.println("\nМодуль 4, задание 3: Необходимо реализовать метод таким образом, чтобы он возвращал\n" +
                        "наибольшее по модулю (то есть без учета знака) значение массива arr.\n");
                out.println("Введите массив (7 чисел): ");
                int[] arrs =  new int[7];
                for (int i=0; i<arrs.length; i++){
                    arrs[i] = in.nextInt();
                }
                int yui = n.maxAbs(arrs);
                out.println("наибольшее по модулю значение массива: "+yui);
            case 45:
                out.println("\nМодуль 4, задание 5: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" +
                        "массив, который будет содержать все элементы массива arr, однако в позицию\n" +
                        "pos будут вставлены значения массива ins. \n");
                out.println("Введите 1-ый массив(5 чисел): ");
                int[] arrr1 = new int[5];
                for (int i=0; i<arrr1.length; i++){
                    arrr1[i] = in.nextInt();
                }
                out.println("\nВведите 2-oй массив(3 числа): ");
                int[] arrr2 = new int[3];
                for (int i=0; i<arrr2.length; i++){
                    arrr2[i] = in.nextInt();
                }
                out.println("\nВведите позицию, с которой будет вставлен второй массив в первый: ");
                int pos = in.nextInt();
                int[] newarr = n.add(arrr1, arrr2, pos);
                out.print("Результат: ");
                for (int num : newarr) {
                    out.print(num + " ");
                }
                out.println("\n");
            case 47:
                out.println("\nМодуль 4, задание 7: Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором значения массива arr записаны задом наперед.\n");
                out.println("\nВведите массив(5 чисел): ");
                int[] arrrr = new int[5];
                for (int i=0; i<arrrr.length; i++){
                    arrrr[i] = in.nextInt();
                }
                int[] newarrr = n.reverseBack(arrrr);
                out.print("\nМассив в обратном порядке: ");
                for (int num : newarrr) {
                    out.print(num + " ");
                }
            case 49:
                out.println("\nМодуль 4, задание 9: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" +
                        "массив, в котором записаны индексы всех вхождений числа x в массив arr.\n");
                out.println("Введите массив(5 чисел): ");
                int[] ar = new int[5];
                for (int i=0; i<ar.length; i++){
                    ar[i] = in.nextInt();
                }
                out.println("\nВведитете число х: ");
                int xx = in.nextInt();
                int [] new_arr = n.findAll(ar, xx);
                out.println("\nМассив индексов: ");
                for (int num: new_arr){
                    out.println(num + " ");
                }
                out.println("\n");
        }
    }
    }
    public double fraction (double x){
        int y = (int) x;
        return
                x - (double) y;
    }
    public int charToNum(char x) {
        switch (x) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default:
                System.out.println("Недопустимый символ");
                return -1;
        }
    }

    public boolean is2Digits (int x){
        if (x /100==0 && x/10!=0){
            return (true);
        }
        return false;
    }
    public boolean isInRange (int a, int b, int num){
        if (a>b){

            if (num>=b && num<=a){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (num<=b && num>=a){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public boolean isEqual(int a, int b, int c){
        if (a==b && a==c && b==c){
            return true;
        }
        else{
            return false;
        }
    }
    public int abs(int x) {
        if (x > 0) {
            System.out.println("Модуль положительного числа: ");
            return x;
        }
        if (x == 0) {
            System.out.println("Модуль нуля: ");
            return x;
        } else {
            System.out.println("Модуль отрицательного числа: ");
            return -x; // Возвращаем модуль отрицательного числа
        }
    }
    public boolean is35 (int x){
        if (x % 3==0 && x%5!=0){
            out.println("Число делится на 3");
            return true;
        }
        if (x%5==0 && x%3!=0){
            out.println("Число делится на 5");
            return true;
        }
        if (x%5==0 && x%3==0){
            out.println("Число делится и на 3, и на 5");
            return false;
        }
        return false;
    }
    public int max3 (int x, int y, int z){
        out.println("Наибольшее число: ");
        int cv;
        if (x>y){
            cv=x;
        }
        else{
            cv = y;
        }
        if (cv >z){
            return cv;
        }
        else{
            return z;
        }
    }
    public int sum2 (int x, int y){
        if (x+y>=10 && x+y<=19){
            out.println("Сумма x и y попала в диапазон [10, 19]: ");
            return 20;
        }
        else{
            out.println("Сумма x и y: ");
            return x+y;
        }
    }
    public String day (int x){
        switch (x){
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default:
                out.println("это не день недели");
        }
        return "";
    }
    public String listNums (int x){
        StringBuilder str = new StringBuilder();
        for (int i=0; i<=x; i++){
            str.append(i).append(" ");
        }
        return String.valueOf(str);
    }
    public String chet (int x){
        out.println("Получившаяся строка: ");
        StringBuilder str = new StringBuilder();
        for (int i=0; i<=x; i += 2){
            str.append(i).append(" ");
        }
        return String.valueOf(str);
    }
    public int numLen (long x){
        int count=0;
        if (x==0){
            return 1;
        }
        if (x>0){
        while (x!=0){
            count++;
            x=x/10;
        }}
        else{
            count++;
            while (x!=0){
                count++;
                x=x/10;
            }
        }
        return count;
    }
    public void square (int x){
        if (x<=0){

            out.println("Размер квадрата должен быть больше 0");
        }
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++){
                out.print("*");
            }
            out.println();
        }
    }
    public void rightTriangle (int x){
        if (x <= 0) {
            System.out.println("Высота треугольника должна быть больше 0");
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                out.print("*");
            }
            out.println();
        }
    }
    public int findFirst (int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public int maxAbs (int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxValue)) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }
    public int[] add (int[] arr, int[] ins, int pos){
        if (pos < 0 || pos > arr.length) {
            out.println("Invalid position");
        }
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }
    public int[] reverseBack (int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
    public int[] findAll (int[] arr, int x){
        int[] indices = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[count] = i;
                count++;
            }
        }
        return indices;}
}
