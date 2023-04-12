public class main {

    /*
    *
    * Selection sort is automatically being run here
    * Feel free to hop between the different algorithms
    *
    * */
    public static void main(String[] args){

        /*
        * Task 1 - Run javac fileName to compile then java fileName to run
        */
        System.out.println("Hello World");


        /*
        * Task 2
        */

        char[] inputArray = new char[]{4,3, 34, 76, 23, 5};

        //See algorithms class for implementation
        algorithms.selectionSort(inputArray);
        algorithms.bubbleSort(inputArray);
        algorithms.heapSort(inputArray);
        algorithms.quickSort(inputArray);
    }
}
