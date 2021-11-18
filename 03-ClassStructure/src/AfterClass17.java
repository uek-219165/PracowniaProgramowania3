import java.util.Arrays;

public class AfterClass17 {
    static class StudentGrades {
        String studentName;
        double[] grades;

        StudentGrades(String name, double[] grades) {
            this.studentName = name;
            this.grades = grades;
        }

        double lowestGrade() {
            double min = grades[0];
            for (int i = 0; i < grades.length; i++) {
                if(grades[i] < min)
                    min = grades[i];
            }
            return min;
        }

        double highestGrade() {
            double max = grades[0];
            for (int i = 0; i < grades.length; i++) {
                if(grades[i] > max)
                    max = grades[i];
            }
            return max;
        }

        void gradeAmount() {
            System.out.println(grades.length);
        }

        double gradeAvg() {
            double sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            return sum / grades.length;
        }

        void showStudent() {
            System.out.println("Name: " + studentName);
            System.out.println("Grades: " + Arrays.toString(grades));
            System.out.println("Lowest grade: " + lowestGrade());
            System.out.println("Highest grade: " + highestGrade());
            System.out.println("Average grade: " + gradeAvg());
        }
    }

    public static void main(String[] args) {
        StudentGrades amanda = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades james = new StudentGrades("James", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});

        amanda.showStudent();
        System.out.println();
        james.showStudent();
    }
}
