public class calculate_total_meal_price {

    public static void calculateTotalMealprice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }
    
    public static void main(String[] args) {
        calculateTotalMealprice(25, .18, .08);

    }

}
