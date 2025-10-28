package stroki;

public class Stroki {

    public static void main(String[] args){
        String text = "https://example.com/page?id=123&name=test";
        int index = text.indexOf("?");

        if(index != -1 ){
            System.out.println("Найдено на позиции: " + index);
        }
        String sub1 = text.substring(0, index);
        System.out.println("Основной URL" + sub1);

        String sub2 = text.substring(index + 1);
        System.out.println("Параметры: " + sub2);
    }


}

