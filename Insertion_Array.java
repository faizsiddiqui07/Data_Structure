public class Insertion_Array {

    public static void display(int arr[], int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int indInsertion(int arr[], int size, int element, int index){
        for (int i = size-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] =element;
        return 1;
    }


    public static void main(String[] args) {
        int arr[] = {1,5,6,8,5};
        int size = 5, element = 45, index = 3;
        display(arr , size);
        indInsertion(arr, size, element, index);
        size+=1;
        display(arr , size);
    }
}