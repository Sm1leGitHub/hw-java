public class DefaultStyle extends Sofa {
    private boolean elegance;
    private String proportionsAndBalance;
    private String traditionalColorsAndFinishes;

    public DefaultStyle(String mechanism, String material, String color) {
        super(mechanism, material, color);
        this.elegance = elegance;
        this.proportionsAndBalance = proportionsAndBalance;
        this.traditionalColorsAndFinishes = traditionalColorsAndFinishes;
    }

    public boolean isElegance() {
        return elegance;
    }

    public void setElegance(boolean elegance) {
        this.elegance = elegance;
    }

    public String getProportionsAndBalance() {
        return proportionsAndBalance;
    }

    public void setProportionsAndBalance(String proportionsAndBalance) {
        this.proportionsAndBalance = proportionsAndBalance;
    }

    public String getTraditionalColorsAndFinishes() {
        return traditionalColorsAndFinishes;
    }

    public void setTraditionalColorsAndFinishes(String traditionalColorsAndFinishes) {
        this.traditionalColorsAndFinishes = traditionalColorsAndFinishes;
    }
}
