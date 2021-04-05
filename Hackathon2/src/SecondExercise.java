import java.util.*;

public class SecondExercise {
     ArrayList<Integer> arr = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        SecondExercise t = new SecondExercise();
        t.input();
        t.display();
        t.tongGanNhat();
    }

    public void input() {
        try {
            System.out.println("Nhập vào N trong khoảng từ 8 đến 14");
            int n = sc.nextInt();
            while (n < 8 || n > 14) {
                System.out.println("Giá trị chưa đúng, vui lòng nhập lại!");
                n = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr.add((int) (Math.random() * 21 - 10));
            }

        } catch (Exception e) {
            System.out.println("Giá trị nhập vào không hợp lệ!");
        }
    }

    public void display() {
        System.out.println("Mảng các phần tử:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public void tongGanNhat() {
        System.out.println("\nNhập vào X trong khoảng tử -10 đến 10");
        int x = sc.nextInt();
        while (x < -10 || x > 10) {
            System.out.println("X là giá trị trong khỏang -10 đến 10, vui lòng nhập lại!");
            x = sc.nextInt();
        }
        int minSum = 100;


        //vòng lặp tìm tổng gần nhất
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((Math.abs(arr.get(i) + arr.get(j) - x)) < minSum && (Math.abs(arr.get(i) + arr.get(j) - x) != 0)) {
                    minSum = Math.abs(arr.get(i) + arr.get(j) - x);
                }
            }
        }

        //hiển thị
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((Math.abs(arr.get(i) + arr.get(j) - x)) == minSum) {
                    System.out.println("Hai số có tổng gần " + x + " nhất tại vị trí " + i + " " + j + " là: " + arr.get(i)
                            + " " + arr.get(j) + " với khoảng cách là " + minSum);
                }
            }
        }
        sc.close();
    }
    
}
