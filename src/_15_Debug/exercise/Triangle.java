package _15_Debug.exercise;

public class Triangle {
    public static void trianGle(int a , int b, int c) {
        boolean check =true;

        while (check=false) {
            try {
                int x = a +b;
                int x1 = a+c;
                int x2 = b+c;
            }catch (Exception e ) {
                System.out.println("loi do "+e.getMessage()+" la so am");
            }
            if (a>0||b>0||c>0||(a+b)>c||(a+c)>b||(b+c)>a) {
                check=true;
            }
        }

    }

}
