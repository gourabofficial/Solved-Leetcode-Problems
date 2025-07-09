public class SortedOrNot {

    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6,-1};
        boolean result = isSorted(arr,arr.length);
        if(result){
            System.out.println("Your Array is sorted");
        }else{
            System.out.println("Your Array is not sorted");
        }
    }

    static boolean isSorted(int []arr,int index ){
            
             if(index == 0 || index ==1){
                return true;
             }

             return arr[index-1] >= arr[index-2] && isSorted(arr, index-1);

    }
}
