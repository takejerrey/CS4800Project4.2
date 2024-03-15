public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[6];
        customers[0] = new Customer("James", "NoRestriction");
        customers[1] = new Customer("Oliver", "Vegan");
        customers[2] = new Customer("Wei", "Paleo");
        customers[3] = new Customer("Liam", "NutAllergy");
        customers[4] = new Customer("Yared", "NoRestriction");
        customers[5] = new Customer("Mohammed", "Vegan");
        for (int i = 0; i < customers.length; i++) {
            Factory carbFactory = (Factory) Singleton.getInstance("Carbs");
            Factory fatFactory = (Factory) Singleton.getInstance("Fats");
            Factory proteinFactory = (Factory) Singleton.getInstance("Protein");

            String carbs = carbFactory.createCarbs(customers[i].getPlan());
            String fat = fatFactory.createFat(customers[i].getPlan());
            String protein = proteinFactory.createProtein(customers[i].getPlan());

            System.out.println(customers[i].getName() + " is on the " + customers[i].getPlan() + " meal plan.");
            System.out.println("The meal plan consists of: ");
            System.out.println("Carbs: " + carbs);
            System.out.println("Fats: " + fat);
            System.out.println("Protein: " + protein + "\n");
        }
    }
}