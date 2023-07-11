public class Searching {
    public static void main(String[] args) {
        Searching search = new Searching();
        int [] arr = {1,2,4,5,7,8,10,23};
        search.BinarySearch(2, arr);
    }

// binary search 
// splits the array in half cutting the time compleixty
/*
 * best case: O(1) // get it first try 
 * average case: O(logn) 
 * worst case: O(logn) 
 */
public int BinarySearch(int findelement,int [] arr) {
   int index = 0; 
   int first = 0;
   int last = arr.length - 1; 
   int midpoint =(first+last)/2; 
   while(arr[midpoint]!=findelement) {
        if(findelement<arr[midpoint]) {
            last = midpoint; 
        } else if(findelement>arr[midpoint]) {
            first = midpoint; 
        } else {
            return -1;
        }
   }
   
   return -1; 
} 
}
