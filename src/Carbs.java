import java.util.Random;
public class Carbs implements Factory {
    private String[] paleo = {"pistachio"};
    private String[] vegan = {"Bread", "Lentils", "Pistachio"};
    private String[] nutAllergy = {"Cheese", "Bread", "Lentils"};
    private String[] noRestriction = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private Random random = new Random();

    @Override
    public String createCarbs(String plan) {
        if ("NoRestriction".equals(plan)) {
            return noRestriction[random.nextInt(noRestriction.length)];
        } else if ("Paleo".equals(plan)) {
            return paleo[random.nextInt(paleo.length)];
        } else if ("Vegan".equals(plan)) {
            return vegan[random.nextInt(vegan.length)];
        } else if ("NutAllergy".equals(plan)) {
            return nutAllergy[random.nextInt(nutAllergy.length)];
        }
        return null;
    }


    @Override
    public String createProtein(String plan) {
        return null;
    }

    @Override
    public String createFat(String plan) {
        return null;
    }
}