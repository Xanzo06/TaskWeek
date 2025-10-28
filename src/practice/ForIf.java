package practice;

public class ForIf {
    public static void main(String[] args) {
        int a = 30;
        int b = 5;

        while(a > 1){
            if(a % b != 0){
                break;
            }
            a /= b;
        }
        if(a == 1){
            System.out.println("Степень пятёрки");
        }else {
            System.out.println("Не степень пятёрки");
        }

    }

    }