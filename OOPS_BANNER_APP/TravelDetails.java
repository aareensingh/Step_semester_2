import java.util.Scanner;

class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String fromCity = input.nextLine();
        String viaCity = input.nextLine();
        String toCity = input.nextLine();

        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();
        double timeFromToVia = input.nextDouble();
        double timeViaToFinalCity = input.nextDouble();

        double totalDistance = (fromToVia + viaToFinalCity) * 1.6;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}
