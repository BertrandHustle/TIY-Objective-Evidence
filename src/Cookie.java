/**
 * Describes instances of Cookie
 */

public class Cookie {

    /**
     * Denotes the flavor of our Cookie
     */

    public String flavor = "";

    /**
     * Denotes the number of cookies we have
     */

    public int numberOfCookies = 0;

    /**
     * Tells us how many batches we made
     */

    public int batches = 0;

    /**
     * Sets default parameters for Cookie
     * @param flavor Flavor of Cookie
     * @param numberOfCookies Number of cookies we made
     * @param batches Number of batches of cookies we made
     */

    public Cookie(String flavor, int numberOfCookies, int batches){

        this.flavor = flavor;
        this.numberOfCookies = numberOfCookies;
        this.batches = batches;

    }

    /**
     *
     * @return Returns description of your cookies
     */

    public String toString() {
        return "You have " + numberOfCookies + " " + flavor + " cookies. You made " + batches
                + " batches";
    }
}
