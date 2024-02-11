public class Chair extends Furniture {
    private String form;
    private int numberOfLegs;
    private boolean back;

    public Chair(String form, int numberOfLegs, boolean back) {
        this.form = form;
        this.numberOfLegs = numberOfLegs;
        this.back = back;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    @Override
    public void selling() {

    }

    @Override
    public void buying() {

    }
}
