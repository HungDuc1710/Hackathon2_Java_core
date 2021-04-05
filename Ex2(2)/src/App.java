import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // 02: Tìm tổng hai số trong một mảng có giá trị gần nhất một số đã cho
        // Nhập vào một số N nguyên dương > 8 và < 14
        // Sinh ra một mảng gồm N phần tử là các số tự nhiên ngẫu nhiên có giá trị từ -10 đến 10
        // In các phần tử mảng ra màn hình
        // Nhập vào một số X trong khoảng từ -10 đến 10
        // Hãy liệt kê tất cả các cặp 2 số trong mảng có tổng gần với số X nhất.
        // Hướng dẫn các làm bài này:

        // Hãy viết thành các phương thức, mỗi phương thức chỉ tập trung làm một việc, tham số hoá chứ không nên dùng biến toàn cục. Quy tắc Clean Code
        // Có thể tạo sẵn một mảng khoảng 10 phần tử để kiểm tra khi chạy cho dễ dàng.

        input();
    }

    public static void input() {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int range = 10 - (-10) + 1;
        System.out.println("Nhập vào một số N nguyên dương > 8 và < 14: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while (n <= 8 || n >= 14) {
            System.out.println("Nhập sai, yêu cầu nhập lại: ");
            n = sc.nextInt();
        }
        System.out.println("Mảng gồm N phần tử ngẫu nhiên là: ");
        for (int i = 0; i < n; i++) {
            arr.add(i, (random.nextInt(range) + (-10)));
            // System.out.print(arr.get(i) +" ");
        }
        for (int i = 0; i < n; i++) {
            if (arr.get(i) < 0) {
                System.out.print("(" + arr.get(i) + ")" + " ");
            } else {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
    // Nhập vào một số X trong khoảng từ -10 đến 10
    // Hãy liệt kê tất cả các cặp 2 số trong mảng có tổng gần với số X nhất.
    public static void sumMethod(ArrayList<Integer>arr) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhập vào một số X trong khoảng từ -10 đến 10");
        int x = sc.nextInt();
        while (x < -10 || x > 10) {
            System.out.println("Nhập sai, yêu cầu nhập lại");
            x = sc.nextInt();
        }
        for(int a : arr ){
            int nearestSum = 
        }
        
        

    } 
}
