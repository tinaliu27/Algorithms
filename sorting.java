import java.util.Arrays;
class Sorting{
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        int[] arr = {2,1,42,53,0,4,6};
        sort.printarray(sort.function(arr));
    } 
    public int[] function(int [] array) {
    Arrays.sort(array);
    return array;
    }
    public void printarray(int [] array) {
        for(int i = 0; i< array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
