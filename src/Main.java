import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int dd = scanner.nextInt();
        int aa = 0;
        while (aa <= 4) {
            aa++;
            if (ss <= dd)
                System.out.print(aa + ss + "\t\t");
            ss++;


        }
    }
}