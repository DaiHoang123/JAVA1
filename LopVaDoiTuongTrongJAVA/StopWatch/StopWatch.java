public class StopWatch{
    long startTime;
    long endTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void end(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}