package LearningNewStuff.CodeWarsExercize;

public class ColorTriangleRightClass {

    public void entry() {
        String test1 = "GBGB";
        System.out.println(triangle(test1));

    }

    public static char triangle(final String row) {
        String temp = row;
        while (temp.length() > 1) {
            String temp2 = "";
            for (int i = 0; i < temp.length() - 1; i++) {
                if (temp.charAt(i) == 'B' && temp.charAt(i + 1) == 'G' || temp.charAt(i) == 'G' && temp.charAt(i + 1) == 'B') {
                    temp2 += "R";
                }
                if (temp.charAt(i) == 'R' && temp.charAt(i + 1) == 'G' || temp.charAt(i) == 'G' && temp.charAt(i + 1) == 'R') {
                    temp2 += "B";
                }
                if (temp.charAt(i) == 'B' && temp.charAt(i + 1) == 'R' || temp.charAt(i) == 'R' && temp.charAt(i + 1) == 'B') {
                    temp2 += "G";
                }
                if (temp.charAt(i) == 'B' && temp.charAt(i + 1) == 'B') {
                    temp2 += "B";
                }
                if (temp.charAt(i) == 'R' && temp.charAt(i + 1) == 'R') {
                    temp2 += "R";
                }
                if (temp.charAt(i) == 'G' && temp.charAt(i + 1) == 'G') {
                    temp2 += "G";
                }
            }
            temp = temp2;
        }
        return temp.charAt(0);
    }
}
