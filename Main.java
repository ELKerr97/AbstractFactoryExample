public class Main {

    public static void main(String[] args) {

        DecorationPlacer decorationPlacer = new DecorationPlacer(new HalloweenFactory());
        DecorationPlacer christmasDecorationPlacer = new DecorationPlacer(new ChristmasFactory());

        System.out.println(decorationPlacer.placeDecorations());
        System.out.println(christmasDecorationPlacer.placeDecorations());

    }
}
