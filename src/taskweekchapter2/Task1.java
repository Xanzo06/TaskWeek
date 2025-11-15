package taskweekchapter2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
 public static void Calendar(int year, int month) {
     LocalDate date = LocalDate.of(year, month, 1 );//Класс для выражения даты в некотором неозначенном месте
     System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
     DayOfWeek weekDay = date.getDayOfWeek();//Возвращает день недели на который приходится дата
     int value = weekDay.getValue();//Возвращает значение 1-пн, 2-вт...;
     int offset = (value % 7);// Делим день недели на количество дней, для получения воскресенья, а то есть первого числа месяца

     for (int i = 0; i < offset; i++){
         System.out.print("    ");
     }
     while (date.getMonthValue() == month){ // Проверяем в том ли месяце мы находимся
         int dayOfMonth = date.getDayOfMonth();// получаем число месяца
         System.out.printf("%4d", dayOfMonth);
         if (date.getDayOfWeek() == DayOfWeek.SUNDAY){//проверяем число, если сегодня вскр то перехохдим на новую строку
             System.out.println(); //Переход
         }
         date = date.plusDays(1); //переходим к следующему дню

     }
     if (date.minusDays(1).getDayOfWeek() != DayOfWeek.SUNDAY){
         System.out.println();
     }
 }

    public static void main(String[] args) {
       Calendar(2025, 11);
    }
    }






