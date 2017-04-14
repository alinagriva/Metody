package Method;
public class task_3_to_7 {
    public static void main(String[] args) {
        createArray(10);
        randArray(int [10]);
        printArray(array);
    }
    public static void createArray(int a){
        int[] array= new int[a];
        return array;
    }
   public static void randArray(int[] array) {
   for (int i = 0; i < array.length; i++) {
   array[i] = (int) (Math.random() * 100);
       System.out.print("|" + array[i] + " ");
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("|" + array[i] + " ");
        }
    }
}