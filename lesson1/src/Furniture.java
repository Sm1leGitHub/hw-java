public abstract class Furniture {

    private int cost;
    private int size;
    private int firm;

    public Furniture() {
        this.cost = cost;
        this.firm = firm;
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFirm() {
        return firm;
    }

    public void setFirm(int firm) {
        this.firm = firm;
    }

    public abstract void selling();

    public abstract void buying();
}
