/**
 * Describes instances of Tart by flavor and size
 */

public class Tart {

    /**
     * Denotes the flavor of our tart
     */

    public String flavor = "";

    /**
     * Denotes the size of our tart
     */

    public int size = 0;

    /**
     * Tells us what's on top of our tart
     */

    public String topping = "";

    /**
     * Sets default parameters for Tart
     * @param flavor Flavor of Tart
     * @param size Size of Tart (in inches)
     * @param topping What's on top of the tart
     */

    public Tart(String flavor, int size, String topping){

        this.flavor = flavor;
        this.size = size;
        this.topping = topping;

    }

    /**
     *
     * @return Returns description of your tart
     */

    public String toString() {
        return "Your tart is a " + size + " inch " + flavor + " tart, topped with " + topping;
    }
}

