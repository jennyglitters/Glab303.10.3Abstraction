public class Rectangle extends Shape {
    public Rectangle(String color){
        super.color = color;
    }
    public Rectangle(){

    }
    public Rectangle(String color, double width, double height){
        super.height = height;
        super.color = color;
        super.width = width;
    }
    @Override
    public double getArea(){
        return super.width *  super.height;
    }
    @Override
    public void displayshapName(){
        System.out.println("I am a rectangle"   );
    }
    @Override
    public String toString(){
        return "Rectangle [height=" + height + ", width=" + width + "," + super.toString() + "]";
    }
}
