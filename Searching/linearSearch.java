class linearSearch{
    public static void main(String[] args) {
        int[]arr = {1,2,3,48,9,0,10};
        int result = searching(arr, 10);
        System.out.println("the target element is: " + result);
    }
    public static int searching(int[]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == target)
            return arr[i];
        }
        return -1;
    } 
}