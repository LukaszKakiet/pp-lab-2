import java.util.Scanner;
    public class zad3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double[] ocenyMatematyka = pobierzOceny("Matematyki", scanner);
            double[] ocenyFizyka = pobierzOceny("Fizyki", scanner);
            double[] ocenyChemia = pobierzOceny("Chemii", scanner);
            wypiszOceny(ocenyMatematyka, "Matematyki");
            wypiszOceny(ocenyFizyka, "Fizyki");
            wypiszOceny(ocenyChemia, "Chemii");

            double[] wszystkieOceny = scalOceny(ocenyMatematyka, ocenyFizyka, ocenyChemia);
            System.out.println("Liczba ocen: " + wszystkieOceny.length);
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
        public static void wypiszOceny(double[] oceny, String przedmiot) {
            System.out.println("Oceny z " + przedmiot + ":");
            for (double ocena : oceny) {
                System.out.println(ocena);
            }
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