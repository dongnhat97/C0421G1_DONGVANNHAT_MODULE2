package _2_LoppJava.exercise;

public class SoNguyenTo3 {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;
        int run = 1;
        while (run<100) {
            count=0;
            for (int i=1;i<=run;i++) {
                if (run%i==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(run);
            }

            run++;
        }
    }
}
