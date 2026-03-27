import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        }

        ListIterator<Integer> iterator = list.listIterator();

        System.out.print("Forward: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.print("Backward: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
