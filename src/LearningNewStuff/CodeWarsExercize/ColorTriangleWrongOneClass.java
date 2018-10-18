package LearningNewStuff.CodeWarsExercize;

class ColorTriangleWrongOneClass {

    public void entry() {

        String test1 = "GBGB";    // expect R
        String test2 = "BBBBBGG";   // expect R
        String test3 = "RGGB";  // expect B

        char result;
        result = triangle(test1);

        System.out.println(result);
        System.out.println(triangle(test2));
        System.out.println(triangle(test3));
    }

    public static char triangle(final String row) {
        String result = row;
        while (result.length() != 1 && result.length() != 0) {
            int iterator = result.length();
            String temp = "";
            for (int i = 0; i < result.length(); i += 2) {


                if (iterator == 1) {
                    if (result.charAt(result.length() - 1) == 'B') {
                        temp += "B";
                    }
                    if (result.charAt(result.length() - 1) == 'R') {
                        temp += "R";
                    }
                    if (result.charAt(result.length() - 1) == 'G') {
                        temp += "G";
                    }
                } else {
                    if (result.charAt(i) == 'B' && result.charAt(i + 1) == 'G' || result.charAt(i) == 'G' && result.charAt(i + 1) == 'B') {
                        temp += "R";
                    }
                    if (result.charAt(i) == 'R' && result.charAt(i + 1) == 'G' || result.charAt(i) == 'G' && result.charAt(i + 1) == 'R') {
                        temp += "B";
                    }
                    if (result.charAt(i) == 'B' && result.charAt(i + 1) == 'R' || result.charAt(i) == 'R' && result.charAt(i + 1) == 'B') {
                        temp += "G";
                    }
                    if (result.charAt(i) == 'B' && result.charAt(i + 1) == 'B') {
                        temp += "B";
                    }
                    if (result.charAt(i) == 'R' && result.charAt(i + 1) == 'R') {
                        temp += "R";
                    }
                    if (result.charAt(i) == 'G' && result.charAt(i + 1) == 'G') {
                        temp += "G";
                    }
                }
                iterator -= 2;
            }
            result = temp;
        }
        return result.charAt(0);
    }
}
