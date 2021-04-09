public class calculate_total_meal_price_example2 {

    public static double calculateTotalMealprice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    
    public static void main(String[] args) {
        double groupTotalMealprice= calculateTotalMealprice(100, .2, .08);
    
        double individualTotalMealprice = groupTotalMealprice / 5;
        System.out.println(individualTotalMealprice);
    }

}
