package ra;

import java.util.Scanner;

public class Session4_BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // yêu cầu xác định kích thước ma trận (ma trận vuông)
        // NGười dùng nhập vào độ daif cạnh của ma trận
        System.out.println("Hãy nhập vào độ dài của ma trân n x n");
        int n = sc.nextInt();
        // yêu cầu nhập vào từng giá trị của phần tử
        int[][] array =  new int[n][n];
        // duyệt mảng
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("\nNhập giá trị cho phần tử array[%d][%d] = ",i,j);
                array[i][j] = sc.nextInt();
            }
        }
        // đã có đuwojc mảng 2 chiều
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" %2d ",array[i][j]);
            }
            System.out.println();
        }

        // thực hiện tính toán
        // tính tổng các phần tử trên đường chéo chính
        int sum = 0;
        int sum1= 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if(i==j){
                   sum = sum+array[i][j];
               }
               if(i==0){
                   sum1+=array[i][j];
               }
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là sum = "+ sum );
        System.out.println("Tổng các phần tử trên hàng thứ nhất là sum1 = "+ sum1 );
    }
}
