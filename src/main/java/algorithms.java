public class algorithms {


    public static int[] selectionSort(int[] array){

        int[] sortedArray = new int[array.length];

        for (int i =0; i < array.length; i++){
            int firstVar = array[i];


            for(int j = i + 1; j < array.length; j++){
                int secondVar = array[j];

                if(secondVar < firstVar) {
                        firstVar = secondVar;
                }
            }

            sortedArray[i] = firstVar;
        }

        return sortedArray;
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
