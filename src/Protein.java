import java.util.Random;
public class Protein implements Factory{
    private String[] noRestriction = {"Fish", "Chicken", "Beef", "Tofu"};
    private String[] vegan = {"Tofu"};
    private Random random = new Random();
    @Override
    public String createFat(String plan) {
        return null;
    }

    @Override
    public String createCarbs(String plan) {
        return null;
    }

    @Override
    public String createProtein(String plan) {
        if ("NoRestriction".equals(plan)) {
            return noRestriction[random.nextInt(noRestriction.length)];
        } else if ("Vegan".equals(plan)) {
            return vegan[random.nextInt(vegan.length)];
        } else if ("NutAllergy".equals(plan)) {
            return noRestriction[random.nextInt(noRestriction.length)];
        } else if ("Paleo".equals(plan)) {
            return noRestriction[random.nextInt(noRestriction.length - 1)];
        }
        return null;
    }
}
