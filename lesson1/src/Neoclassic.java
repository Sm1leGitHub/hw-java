public class Neoclassic extends Sofa {
    private String symmetry;
    private String simplicityAndConciseness;
    private String expensiveAppearanceOfTheRoom;

    public Neoclassic(String symmetry, String simplicityAndConciseness, String expensiveAppearanceOfTheRoom) {
        super(symmetry, simplicityAndConciseness, expensiveAppearanceOfTheRoom);
        this.symmetry = symmetry;
        this.expensiveAppearanceOfTheRoom = expensiveAppearanceOfTheRoom;
        this.simplicityAndConciseness = simplicityAndConciseness;
    }

    public String getSymmetry() {
        return symmetry;
    }

    public void setSymmetry(String symmetry) {
        this.symmetry = symmetry;
    }

    public String getSimplicityAndConciseness() {
        return simplicityAndConciseness;
    }

    public void setSimplicityAndConciseness(String simplicityAndConciseness) {
        this.simplicityAndConciseness = simplicityAndConciseness;
    }

    public String getExpensiveAppearanceOfTheRoom() {
        return expensiveAppearanceOfTheRoom;
    }

    public void setExpensiveAppearanceOfTheRoom(String expensiveAppearanceOfTheRoom) {
        this.expensiveAppearanceOfTheRoom = expensiveAppearanceOfTheRoom;
    }
}
