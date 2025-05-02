package lab_12;

public class sumElements {
    public static void main(String[] args) {

        int[] nums = {8,5,4,6,7,5,1,4,5,6};
        System.out.println(sumArray(nums, 0));
    }
    public static int sumArray(int[] arr, int index){
        if(arr.length == index)
            return 0;
        else
            return arr[index] + sumArray(arr, index + 1);
    }
}
