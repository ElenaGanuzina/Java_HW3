import java.util.ArrayList;

//Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее из этого списка.

public class task_2 {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array = getArray(-10, 10, 10);
        getAverage(array);
        getMinMax(array);
    }

    public static ArrayList<Integer> getArray(int start, int end, int size){
        ArrayList<Integer> array = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            array.add((int) (Math.random()*(end - start + 1)) + start);
        }
        return array;
    }

    public static void getAverage(ArrayList<Integer> array){
        Integer average = 0;
        System.out.println(array);
        for (Integer element : array) {
            average += element;
        }
        Double result = (double) average / (double) array.size();
        System.out.printf("The average is %.2f.\n", result);
    }
    public static void getMinMax(ArrayList<Integer> array){
        Integer min = 0;
        Integer max = 0;
        for (Integer element : array) {
            if(element > max){
                max = element;
            }
            
            if (element < min){
                min = element;
            }
        }
        System.out.printf("The minimum element is %d.\n", min);
        System.out.printf("The maximum element is %d.\n", max);
    }
}
