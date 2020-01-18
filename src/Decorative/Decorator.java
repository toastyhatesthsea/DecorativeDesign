package Decorative;

public abstract class Decorator implements Shape{

    protected Shape aShape;

    public Decorator(Shape aShape) {
        this.aShape = aShape;
    }

    public void draw() {
        aShape.drawThing();
    }
}
