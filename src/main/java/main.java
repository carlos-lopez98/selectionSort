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

        int[] inputArray = new int[]{4,3, 34, 76, 23, 5};

        //See algorithms class for implementation
        algorithms.selectionSort(inputArray);

        for (int i : inputArray){
            System.out.print(i + " ");
        }



    /*    algorithms.bubbleSort(inputArray);
        algorithms.heapSort(inputArray);
        algorithms.quickSort(inputArray);*/
    }
}
