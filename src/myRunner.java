public class myRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());
        System.out.println("+++++++++++++++");
        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);
        System.out.println(shapeCircleObj instanceof Circle);
        System.out.println("+++++++++++++++");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayshapName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);
        System.out.println(shapeRectangleObj instanceof Rectangle);
        System.out.println("+++++++++++++++");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayshapName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setWidth(15);
        System.out.println("Area of Triangle " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);

    }
}
