package ClassOOP.exercise;

public class StopWatch {
private long starTime;
private long endTime;
public StopWatch() {
    this.starTime=System.currentTimeMillis();
}
public long start() {
return this.starTime;
}
public long stop() {
    this.endTime = System.currentTimeMillis();
    return this.endTime;
}
public long getElapsedTime() {
    return this.endTime-this.starTime;
}

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("thoi gian bat dau :"+stopWatch.start());
        System.out.println("tam dung :"+stopWatch.stop());
        System.out.println("thoi gian da chay :"+stopWatch.getElapsedTime());
    }
}
