class Fruit{
    public static void main(String[] args) {
        int totalFruits = 100;
        double totalAmount = 100.0; 
        double firstFruitCost = 0.05;
        double secondFruitCost = 5.0;
        double thirdFruitCost = 1.0;
        for (int x = 1; x <= totalFruits; x++) { 
            for (int y = 1; y <= totalFruits - x; y++) {
                int z = totalFruits - x - y;
                if (z < 1) continue;
                double totalCost = x * firstFruitCost + y * secondFruitCost + z * thirdFruitCost;
                if (totalCost == totalAmount) {
                    System.out.println("Number of first fruit (cost 0.05 rupees): " + x);
                    System.out.println("Number of second fruit (cost 5 rupees): " + y);
                    System.out.println("Number of third fruit (cost 1 rupee): " + z);
                    return;
                }
            }
        }
        System.out.println("No valid combination found.");
    }
}
