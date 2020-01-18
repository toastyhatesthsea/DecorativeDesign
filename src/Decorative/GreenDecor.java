package Decorative;

public class GreenDecor extends Decorator{

    public GreenDecor(Shape aShape)
    {
        super(aShape);
    }

    @Override
    public void drawThing() {
        aShape.drawThing();
        greenColor(aShape);
    }

    private void greenColor(Shape aShape) {
        System.out.println("Green Color");
    }
}


class Testers {
    public static void main(String[] aslkdaslkdlaskdlaskd) {
        Shape thing = new Star();

        Shape greenThing = new GreenDecor(new Star());
        System.out.println("Regular thing");
        thing.drawThing();

        System.out.println("\nGreen thing");
        greenThing.drawThing();
    }
}