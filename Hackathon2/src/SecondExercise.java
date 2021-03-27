import java.util.*;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số N nguyên dương >8 và <14: ");
        int n = sc.nextInt();
        Random rd = new Random();
        int range = 10 - (-10) + 1;

        if (n <= 8 || n >= 14) {
            System.out.println("Nhập sai yêu cầu chạy lại chương trình.");
            System.exit(0);
        }
        int[] arr = new int[n];
        System.out.println("Mảng gồm N phần tử tự nhiên ngẫu nhiên từ -10 đến 10: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(range) + (-10);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNhập vào 1 số X trong khoảng từ -10 đến 10: ");
        int sum = sc.nextInt();
        if (sum < -10 || sum > 10) {
            System.out.println("Nhập sai yêu cầu chạy lại chương trình.");
            System.exit(0);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value)+1);
            } else {
                map.put(value, 1);
            }
            
        }
        for (int i=0; i< arr.length; i++)
        {
            if (map.get(sum - arr[i]) != null && map.get(sum - arr[i]) >= 1 && map.get(arr[i]) >= 1) {
                map.put(sum - arr[i], map.get(sum - arr[i]) - 1);
                map.put(arr[i], map.get(arr[i]) - 1);
                System.out.println(arr[i] + " - " + (sum - arr[i]));
                
            }
        }
        
        
    }
    
}
