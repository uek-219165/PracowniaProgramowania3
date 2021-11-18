import java.util.Arrays;
import java.util.Random;

public class AfterClass18 {
    static class StudentGrades {
        String studentName;
        double[] grades;

        StudentGrades(String name, int numberOfGrades) {
            this.studentName = name;
            double[] generatedGrades = new double[numberOfGrades];

            double rangeMin = 2.0;
            double rangeMax = 5.0;
            Random r = new Random();
            for (int i = 0; i < numberOfGrades; i++) {
                double randomValue = Math.round(rangeMin + (rangeMax - rangeMin) * r.nextDouble());
                generatedGrades[i] = randomValue;
                this.grades = generatedGrades;
            }
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
        StudentGrades amanda = new StudentGrades("Amanda", 10);
        StudentGrades james = new StudentGrades("James", 8);

        amanda.showStudent();
        System.out.println();
        james.showStudent();
    }
}
