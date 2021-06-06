package ClassOOP.exercise;

public class QuadraticEquation {
//    Khai báo các giá trị
    double a,b,c;
    double x1,x2;
    double delTa;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a ,double b , double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//    Tính delta
    public double getDelTa() {
        delTa = (Math.pow(b, 2))-4*this.a*this.c;
        return delTa;
    }
//    1 nghiệm duy nhất khi a = 0 và b khác 0
    public double oneExperiences() {
        x1 = -c/b;
        return x1;
    }
//    trường hợp nghiệm kép
    public String Experiences() {
        return "{x1 = x2 = "+((-this.b)/2*this.a)+"}";
    }
//    2 nghiệm phân biệt
    public void twoExperiences() {
        x1 = (-this.b+Math.sqrt(delTa))/(2*this.a);
        x2 = (-this.b-Math.sqrt(delTa))/(2*this.a);
        System.out.println("co 2 nghiem phan biet :"+x1+" va "+x2);

    }


}
