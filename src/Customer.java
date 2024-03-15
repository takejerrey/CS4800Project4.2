public class Customer {
    private String name;
    private String plan;

    public Customer(String name, String plan) {
        this.name = name;
        this.plan = plan;
    }

    public String getName() {
        return name;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setName(String name) {
        this.name = name;
    }
}
