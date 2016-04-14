/**
 * Describes instances of Cake
 */

public class Cake {

    /**
     * Denotes the flavor of our pie
     */

    public String flavor = "";

    /**
     * Denotes the size of our pie
     */

    public int size = 0;

    /**
     * Tells us whether or not the name of the pie also refers to a song name
     */

    public int layers = 0;

    /**
     * Sets default parameters for Pie
     *
     * @param flavor Flavor of cake
     * @param size   Size of cake (in inches)
     * @param layers Number of layers in cake
     */

    public Cake(String flavor, int size, int layers) {

        this.flavor = flavor;
        this.size = size;
        this.layers = layers;

    }

    /**
     *
     * @return Returns description of your cake
     */


    public String toString() {
        return "Your cake is a " + size + " inch " +
                flavor + " cake " + "with " + layers + " layers";
    }
}
