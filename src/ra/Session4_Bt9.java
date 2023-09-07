package ra;

public class Session4_Bt9 {
    public static void main(String[] args) {
        int[] arr = {11,9,7,9,5,3,5,7,8,2,11};
        int max1;
        int max2;
        if (arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }else {
            max1=arr[1];
            max2=arr[2];
        }
        for (int value: arr) {
            if(max1<value){
                max2=max1;
                max1=value;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
