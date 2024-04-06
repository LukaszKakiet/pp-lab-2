import java.util.Scanner;
    public class zad2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double[] ocenyMatematyka = pobierzOceny("Matematyki", scanner);
            double[] ocenyFizyka = pobierzOceny("Fizyki", scanner);
            double[] ocenyChemia = pobierzOceny("Chemii", scanner);
            double[] wszystkieOceny = scalOceny(ocenyMatematyka, ocenyFizyka, ocenyChemia);
            double sredniaWszystkich = obliczSrednia(wszystkieOceny);
            System.out.println("Średnia ocen: " + sredniaWszystkich);
            scanner.close();
        }

        public static double[] pobierzOceny(String przedmiot, Scanner scanner) {
            System.out.println("Podaj ilość ocen z " + przedmiot + ": ");
            int iloscOcen = scanner.nextInt();
            double[] oceny = new double[iloscOcen];
                for (int i = 0; i < iloscOcen; i++) {
                System.out.println("Podaj ocenę " + (i + 1) + " z " + przedmiot + ": ");
                oceny[i] = scanner.nextDouble();
            }
                return oceny;
        }
        public static double[] scalOceny(double[] oceny1, double[] oceny2, double[] oceny3) {
            int dlugosc = oceny1.length + oceny2.length + oceny3.length;
            double[] wszystkieOceny = new double[dlugosc];
                int index = 0;
            for (double ocena : oceny1) {
                wszystkieOceny[index] = ocena;
                index++;
            }
            for (double ocena : oceny2) {
                wszystkieOceny[index] = ocena;
                index++;
            }
            for (double ocena : oceny3) {
                wszystkieOceny[index] = ocena;
                index++;
            }
            return wszystkieOceny;
        }
        public static double obliczSrednia(double[] oceny) {
            double suma = 0;
            for (double ocena : oceny) {
                suma += ocena;
            }
            return suma / oceny.length;
        }
    }