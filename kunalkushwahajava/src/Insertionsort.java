import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[]arr={54,84,8,65,842,4,0,6588};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Insertion(int[]arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int[]arr,int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
