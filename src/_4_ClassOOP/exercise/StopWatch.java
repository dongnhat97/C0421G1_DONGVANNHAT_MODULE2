package _4_ClassOOP.exercise;

public class StopWatch {
private long starTime;
private long endTime;
public StopWatch() {
    this.starTime=System.currentTimeMillis();
}
public long start() {
    this.starTime=System.currentTimeMillis();
    return this.starTime;
}
public long stop() {
    this.endTime = System.currentTimeMillis();
    return this.endTime;
}
public void thuatToan() {
    int[] arr = {1,2,3,4,5,6};
    for (int i = 0;i<arr.length;i++) {
        System.out.println(arr[i]);
    }

}
public long getElapsedTime() {
    return this.endTime-this.starTime;
}

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("thoi gian bat dau :"+stopWatch.start());
        System.out.println("chay thuat toan: ");
        stopWatch.thuatToan();
        System.out.println("tam dung :"+stopWatch.stop());
        System.out.println("thoi gian da chay :"+stopWatch.getElapsedTime());
    }
}
