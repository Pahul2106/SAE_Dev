package implemens;

public class Arc {
    private final String source;
    private final String destination;
    private final int valuation;

    public Arc(String source, String destination, int valuation) {
        this.source = source;
        this.valuation = valuation;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getValuation() {
        return valuation;
    }

}