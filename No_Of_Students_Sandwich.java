import java.util.*;

public class No_Of_Students_Sandwich {

    public static int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        for (int student : students) {
            count[student]++;
        }

        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break;
            }
            count[sandwich]--;
        }

        return count[0] + count[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] students = new int[n];
        int[] sandwiches = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sandwiches[i] = sc.nextInt();
        }

        int ans = countStudents(students, sandwiches);
        System.out.println(ans);

        sc.close();
    }
}