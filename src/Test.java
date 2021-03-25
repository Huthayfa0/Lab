import java.util.Scanner;

public class Test {
    public Test() {
        return;
    }
    public static void main(String[] args) {


    m:
    for (int i=0;i<10;i++)
        for (int j=0;j<10;j++) {
            System.out.println(i + " " + j);
            if (j>=6&&i>=6)
                break m;
        }
    System.out.println();

    }

    }

