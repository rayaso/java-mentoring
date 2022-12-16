package javaExamSubmission;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String multiArray[][] = {{"class1", "class2", "Class3" }, {"sonia", "letti", "angel" }, {"exm1", "exm2", "exm3" }, {"pass", "pass", "field" }};
        for (int row = 0; row < multiArray.length; row++) {
            for (int column = 0; column < multiArray[row].length; column++) {
                System.out.print(multiArray[row][column] + "\t\t");
            }
            System.out.println();
        }
    }


}
