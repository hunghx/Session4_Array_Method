package ra;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4,5};
        arrayInt = addInteger(10,10,arrayInt);
        displayArr(arrayInt);

        // xoa vị trí số 4
        arrayInt = deleteItem(4,arrayInt);
        displayArr(arrayInt);

    }
    public static void displayArr(int[] arr){
        System.out.println("\n----------Danh sách mảng-------------");
        for (int value: arr) {
            System.out.print(value+"  ");
        }
    }

    public static int[] addInteger(int value, int index,int[] arr){
        if(index<0||index>arr.length){
            index=arr.length;
        }
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < newArr.length ; i++) {
            if(i<index){
                newArr[i] = arr[i];
            }else if (i==index){
                newArr[i] = value;
            }else {
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    }
    public static void updateArr(int value, int index,int[] arr){
        arr[index] = value;
    }
    public static int[] deleteItem(int index,int[] arr) {
        int[] newArr = new int[arr.length - 1]; // length = 4
        for (int i = 0; i < newArr.length; i++) {
            if(i<index){
                newArr[i] = arr[i];
            }else {
                newArr[i] = arr[i+1];
            }
        }
        return newArr;
    }
}
