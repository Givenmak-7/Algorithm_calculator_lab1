public class Timer {
    private long startTime;
    private long endTime;

    //returns the starting time of the algorithm
    public void start(){
        startTime = System.currentTimeMillis();

    }

    //returns the end time of the algorithm
    public  void stop(){
        endTime = System.currentTimeMillis();

    }

    //returns the difference between the two times
    public long getTime(){

        return endTime - startTime;
    }

}
