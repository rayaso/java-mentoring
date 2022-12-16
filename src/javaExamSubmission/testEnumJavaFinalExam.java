package javaExamSubmission;

public class testEnumJavaFinalExam {
    public static void main(String[] args) {
        enumJavaFinalExam soraya = enumJavaFinalExam.MARCH ;
            switch (soraya) {
                case APRIL:
                    System.out.println("i will travel to algeria");
                    break;
                case MAI:
                    System.out.println("i will come back to usa");
                    break;
                case JUNE:
                    System.out.println("i will be en vacation");
                    break;
                case JULY:
                    System.out.println("'the end of my vacation");
                    break;

            }
            for (enumJavaFinalExam s:enumJavaFinalExam.values()){
                System.out.println(s);
            }
        }
    }

