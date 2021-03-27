import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listString = new ArrayList<>();
        
        System.out.println("Nhập số bất kỳ: ");
        
        while (sc.hasNextInt()) {
            String string = sc.nextLine();
            listString.add(string);

            Integer i = Integer.parseInt(string);
          
        }
        System.out.println("Chuỗi số sau khi sắp xếp là :");
        Collections.sort(listString);

        for(String str : listString){
            System.out.print(str+" ");
        }
    }
    
}
