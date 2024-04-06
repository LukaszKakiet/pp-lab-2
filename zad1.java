import java.util.Scanner;
    public class zad1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Podaj ocenę z matematyki: ");
            System.out.println("Podaj ocenę z fizyki: ");
            System.out.println("Podaj ocenę z chemii: ");

            double matematyka = scanner.nextDouble();
            double fizyka = scanner.nextDouble();
            double chemia = scanner.nextDouble();
            
            double sumaOcen = matematyka + fizyka + chemia;
            double srednia = sumaOcen / 3;
            
            System.out.println("Średnia ocen: " + srednia);
            
            scanner.close();
        }
    }