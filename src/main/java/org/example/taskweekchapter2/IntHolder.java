package org.example.taskweekchapter2;

public class IntHolder {
    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntHolder(int value) {
        this.value = value;


    }
    public static void swap1(IntHolder a, IntHolder b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        IntHolder i = new IntHolder(10);
        IntHolder j = new IntHolder(20);

        System.out.println("До: i = " + i.value + ", j = " + j.value);

        swap1(i , j);
        System.out.println("После: i = " + i.value + ", j = " + j.value);
    }
}


