package app;

public class Main {
    public static final double M = 1.609;
    public static void main(String[] args) {

        System.out.println("App for converting miles into kilometres");
        double mile = 1;
        System.out.println(mile + " mile is "+ milesToKilometres(mile)+ " kilometres");
        double km = 1;
        System.out.println(km + " km is "+ kilometresToMiles(km)+ " miles");

    }

    public static double milesToKilometres(double miles){
        return miles * M;
    }
    public static double kilometresToMiles(double kilometres){
        return kilometres / M;
    }
}

