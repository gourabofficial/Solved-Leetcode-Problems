public class BS {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,59,80,100};
        int target = 80;

        System.out.println(binary_search(arr,0,arr.length-1,target));
    }

    static int binary_search(int arr[], int left,int right,int target){
        if(left > right){
            return -1;
        }

        int mid = (left+right)/2;

        if(arr[mid] == target ) return mid;
        
        if(arr[mid] > target){
            return binary_search(arr,left,mid-1,target);
        }

        return binary_search(arr, mid+1 , right, target);
       
    }
}
