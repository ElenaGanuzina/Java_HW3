import java.util.ArrayList;


//Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task_1 {
    public static void main(String[] args) {
        System.out.println(getOddArray(-50, 50, 10));
    }
    public static ArrayList<Integer> getOddArray(int start, int end, int size){
        ArrayList<Integer> array = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            array.add((int) (Math.random()*(end - start + 1)) + start);
        }
        System.out.println(array);
        ArrayList<Integer> newArray = new ArrayList<>();
        for (Integer element : array) {
            if(element % 2 != 0){
                newArray.add(element);
            }
        }
        return newArray;
    }
}