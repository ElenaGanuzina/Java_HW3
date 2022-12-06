import java.util.Arrays;

//Реализовать алгоритм сортировки слиянием

public class task_3 {
    public static void main(String[] args){

        int[] array = getArray(-100, 100, 9);
        printArray(array);
        int[] result = sortArray(array);
        printArray(result);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
            
        }
        System.out.println();
    }

    public static int[] getArray(int start, int end, int length){
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = ((int) (Math.random()*(end - start + 1)) + start);
        }
        return array;
    }

    public static int[] sortArray(int[] array1){ 
        if (array1 == null) {
            return null;
        }
        if (array1.length < 2) {
            return array1;
        }
        int[] array2 = new int[array1.length / 2];
        System.arraycopy(array1, 0, array2, 0, array1.length / 2);

        int[] array3 = new int[array1.length - array1.length / 2];
        System.arraycopy(array1, array1.length / 2, array3, 0, array1.length - array1.length / 2);

        array2 = sortArray(array2);
        String res2 = Arrays.toString(array2);
        System.out.println("Result of sorting array2 " + res2); 
        array3 = sortArray(array3); 
        String res3 = Arrays.toString(array3);
        System.out.println("Result of sorting array3 " + res3);

        return mergeArray(array2, array3);
    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int position1 = 0;
        int position2 = 0;
               
        for(int i = 0; i < array3.length; i++) {
            if(position1 == array1.length){
                array3[i] = array2[position2];
                position2++;
            } else if(position2 == array2.length){
                array3[i] = array1[position1];
                position1++;
            } else if(array1[position1] < array2[position2]){
                array3[i] = array1[position1];
                position1++;
            } else {
                array3[i] = array2[position2];
                position2++;
            }
            String res = Arrays.toString(array3);
            System.out.println("Result of merging " + res);
        }
        return array3;
    }
}

