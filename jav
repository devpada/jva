import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ANNA");
        names.add("MARK");
        names.add("JACOB");
        names.add("JOHN");
        names.add("ALICE");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(95);
        scores.add(75);
        scores.add(86);
        scores.add(90);

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " IS " + scores.get(i));
            
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
