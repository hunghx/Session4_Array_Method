package ra;

import java.util.Arrays;

public class Main {
     static public void main(String[] args) {
        // Khái niêm mảng , tương tự java script nhưng ở trong java độ dài mảng không thay đổi
        // khai báo mảng
        int[] arrayInt = new int[10];
        String[] arrString = new String[20];
        System.out.println(Arrays.toString(arrString));
        // cách 2 : tường minh
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        // cách truy xuất phần tử của mảng theo vị trí
        System.out.println("Phần tử ở vị trí index = 2 la : " + arr[1]);
        // thay đổi gia trị phần tử mảng theo vị trí
        arr[1] = 10;
        System.out.println("Phần tử ở vị trí index = 2 la : " + arr[1]);
        // thuộc lấy ra độ dài của mảng
        System.out.println(arr.length);
        // bài toán crud
        int[] arr1 = {1, 2, 3, 4, 5}; // length = 5
        // thêm mới giá trị là 10 vào cuối mảng
        // tạo mảng mới có  leng+1 phần tử
//        int[] newArr = new int[arr1.length+1]; // length = 6
//        for (int i = 0; i < arr1.length ; i++) {
//            newArr[i] = arr1[i];
//        }
//        newArr[newArr.length-1] = 10;
//        System.out.println(Arrays.toString(newArr));

//        nâng cao chèn vào vi trí bất kì i = 3
//        int[] newArr = new int[arr1.length + 1]; // length = 6
//        for (int i = 0; i < newArr.length; i++) {
//            if(i<3){
//                newArr[i] = arr1[i];
//            }else if (i==3){
//                newArr[i] = 10;
//            }else {
//                newArr[i] = arr1[i-1];
//            }
//        }
//        System.out.println(Arrays.toString(newArr));

        // xóa tại vị trí số 2
        //  {1, 2, 3, 4, 5}
//        int[] newArr = new int[arr1.length - 1]; // length = 4
//        for (int i = 0; i < newArr.length; i++) {
//           if(i<2){
//               newArr[i] = arr1[i];
//           }else {
//               newArr[i] = arr1[i+1];
//           }
//        }
//        System.out.println(Arrays.toString(newArr));

         // mảng da chiều , xét mảng 2 chiều
         int[][] arr2Chieu = {{1,2,3},{4,5,6}};
         for (int i = 0; i < arr2Chieu.length; i++) {
             for (int j = 0; j < arr2Chieu[i].length; j++) {
                 System.out.print(arr2Chieu[i][j]+" ");
             }
             System.out.println();
         }

    }
}
