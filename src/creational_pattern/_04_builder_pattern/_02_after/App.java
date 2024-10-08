package creational_pattern._04_builder_pattern._02_after;


import creational_pattern._04_builder_pattern._01_before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();

        System.out.println(tourPlan.toString());
    }
}
