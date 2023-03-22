public class DecorationPlacer {
    // create interfaces for each kind of provider
    // tablecloth
    // hanging
    // yard ornament

    // factory for Halloween
        // returns a Halloween tablecloth, hanging and yard ornament class
    // factory for other holiday
        // returns a holiday tablecloth, hanging, and yard ornament class

    private DecorationFactory factory;

    public DecorationPlacer(DecorationFactory factory) {
        this.factory = factory;
    }

    public String placeDecorations() {
        return "Everything was ready for the party. The " + factory.getOrnament()
                + " was in front of the house, the " + factory.getHanging()
                + " was hanging on the wall, and the tablecloth with " + factory.getTablecloth()
                + " was spread over the table.";
    }
}
