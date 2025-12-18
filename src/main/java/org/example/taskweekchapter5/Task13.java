package org.example.taskweekchapter5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {

        List<String> strBan = Arrays.asList("Секс", "Наркотики", "С++");
        List<String> strMaybeBan = Arrays.asList("Привет", "Я люблю С++", "Пойдём гулять");

        Task13 task13 = new Task13();

        System.out.println(task13.ban(strBan, strMaybeBan));

    }
    public List<String> ban(List<String> ban, List<String> mayBan){
        List<String> cleanArr = new ArrayList<>();
        for (int i = 0; i < mayBan.size(); i++){
            boolean isBad = false;
            for (int j = 0; j < ban.size(); j++){
                if (mayBan.get(i).contains(ban.get(j))){
                    isBad = true;
                }
            }
            if (isBad == false){
                cleanArr.add(mayBan.get(i));
            }
        }
        return cleanArr;
    }
}
