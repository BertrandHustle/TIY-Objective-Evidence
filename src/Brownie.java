/**
 * Describes instances of brownie by flavor and size
 */

public class Brownie {

    /**
     * Denotes the flavor of our brownie
     */

    public String flavor = "";

    /**
     * Denotes the size of our brownie pan (in inches)
     */

    public int panSize = 0;

    /**
     * Sets default parameters for brownie
     * @param flavor Flavor of brownie
     * @param panSize Size of brownie pan (in inches)
     */

    public Brownie(String flavor, int panSize){

        this.flavor = flavor;
        this.panSize = panSize;

    }

    /**
     *
     * @return Returns description of your brownies
     */

    public String toString() {
        return "You made a " + panSize + " inch pan of " + flavor + " brownies.";
    }
}
