import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class Algorithms {

    public static void main( String args[]){
        int size = 10000;
        Timer myTimer = new Timer();
        int[] data = initialize(size);
        myTimer.start();
        int position = linearCount(data, 50);
        myTimer.stop();
        System.out.println("Time : " + myTimer.getTime());

        myTimer.start();
        bubbleSort(data);
        myTimer.stop();
        System.out.println("Sort Time : " + myTimer.getTime());

        // Modify size and record times for different sizes
        int[] sizes = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
        for (int s : sizes) {
            data = initialize(s);

            myTimer.start();
            position = linearCount(data, 50);
            myTimer.stop();
            System.out.println("Search Time for size " + s + ": " + myTimer.getTime());

            myTimer.start();
            bubbleSort(data);
            myTimer.stop();
            System.out.println("Sort Time for size " + s + ": " + myTimer.getTime());
        }

        // Test with size 1000000
        size = 1000000;
        data = initialize(size);

        myTimer.start();
        position = linearCount(data, 50);
        myTimer.stop();
        System.out.println("Search Time for size " + size + ": " + myTimer.getTime());

        myTimer.start();
        bubbleSort(data);
        myTimer.stop();
        System.out.println("Sort Time for size " + size + ": " + myTimer.getTime());


    }

    //this method creates an array of random num number of items between 0 and 1000000
    static int[] initialize(int size){
        int[] data = new int[size];
        Random generator = new Random();
        for(int i = 0; i < size; i++){

            data[i] = generator.nextInt(10000);

        }
        return data;

    }

    static int linearCount(int[] array, int number){
        int count=0;
        for(int num : array ){
            if( num == number){
                count++;
            }
        }
        return count;
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
