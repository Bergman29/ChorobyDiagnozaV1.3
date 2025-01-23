import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiseaseExpertSystem expertSystem = new DiseaseExpertSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje symptomy, oddzielając je przecinkami (np. gorączka, kaszel, zmęczenie):");
        String input = scanner.nextLine();
        String[] symptoms = input.split(",\s*");

        String diagnosis = expertSystem.diagnose(symptoms);

        System.out.println("Diagnoza: " + diagnosis);
        scanner.close();
    }
}