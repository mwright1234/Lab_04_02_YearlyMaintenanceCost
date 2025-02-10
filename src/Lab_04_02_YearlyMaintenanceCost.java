public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String[] args) {

        double springCost = 130.0;
        double summerCost = 210.0;
        double fallCost = 160.0;
        double winterCost = 300.0;

        double totalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + totalCost);
    }
}
