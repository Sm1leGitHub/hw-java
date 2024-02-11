public class Sofa extends Furniture {
    private String mechanism;
    private String material;
    private String color;

    public Sofa(String mechanism, String material, String color) {
        super();
        this.mechanism = mechanism;
        this.color = color;
        this.material = material;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void selling() {

    }

    @Override
    public void buying() {

    }
}
