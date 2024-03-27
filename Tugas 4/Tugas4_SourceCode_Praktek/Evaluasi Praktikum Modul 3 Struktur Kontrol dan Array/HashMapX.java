import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.println("Masukkan jumlah data yang ingin dimasukkan:");
        int n = scanner.nextInt();

        System.out.println("Masukkan " + n + " pasangan key dan nilai:");

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan key:");
            String key = scanner.next();
            System.out.println("Masukkan nilai:");
            int value = scanner.nextInt();
            hashMap.put(key, value);
        }

        System.out.println("\nHashMap setelah dimasukkan data:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }

        scanner.close();
    }
}
