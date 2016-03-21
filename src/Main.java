import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle kolo;
        Square kwadrat;
        Triangle trojkat;
        int what;
        double edge;

        while(true) {
            Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
            System.out.println("1 kolo, 2 kwadrat, 3 trojat");
            what = odczyt.nextInt();
            switch (what) {
                case 1:
                    System.out.println("Podaj R: ");
                    edge = odczyt.nextDouble();
                    try {
                        kolo = new Circle(edge);
                        kolo.print();
                    }catch (Exception e){
                        e.printStackTrace();}
                    break;

                case 2:
                    System.out.println("Podaj edge: ");
                    edge = odczyt.nextDouble();


                    try {
                        kwadrat = new Square(edge);
                        kwadrat.print();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("Podaj edge: ");
                    edge = odczyt.nextDouble();

                    try {
                        trojkat = new Triangle(edge);
                        trojkat.print();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                default:

            }
        }

    }


}