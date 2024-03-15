import java.util.Random;
public class Fats implements Factory {
    private String[] noRestriction = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
    private String[] vegan = {"Avocado", "Peanuts"};
    private String[] paleo = {"Avocado", "Tuna", "Peanuts"};
    private String[] nutAllergy = {"Avocado", "Sour cream", "Tuna"};

    private Random random = new Random();
    @Override
    public String createCarbs(String plan) {
        throw new UnsupportedOperationException("Carbs factory can't create Carbs");
    }

    @Override
    public String createProtein(String plan) {
        throw new UnsupportedOperationException("Carbs factory can't create protein");
    }

    @Override
    public String createFat(String plan) {
        switch (plan) {
            case "NoRestriction":
                return noRestriction[random.nextInt(noRestriction.length)];
            case "Vegan":
                return vegan[random.nextInt(vegan.length)];
            case "Paleo":
                return paleo[random.nextInt(paleo.length)];
            case "NutAllergy":
                return nutAllergy[random.nextInt(nutAllergy.length)];
            default:
                throw new IllegalArgumentException("Diet plan not recognized");
        }
    }
}
