public class algorithms {


    public static void selectionSort(int[] array){


        for (int i = 0; i < array.length; i++){
            //Stores initial values
            int minIndex = i;
            int minVal = array[i];

            for(int j = i + 1; j < array.length; j++){
                int secondIndex = j;
                int currentVal = array[j];

                //Does comparison
                if(currentVal < minVal) {
                    minVal = currentVal;
                    minIndex = secondIndex;
                }
            }

            //Do the swap
            int temp = array[i];
            array[minIndex] = temp;
            array[i] = minVal;
        }
    }


    public static int[] bubbleSort(int[] array){
        return null;
    }


    public static int[] heapSort(int[] array){
        return null;
    }


    public static int[] quickSort(int[] array){
        return null;
    }
}
