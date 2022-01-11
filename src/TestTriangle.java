public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);
        System.out.println("Triangle with perimeter="+triangle.getPerimeter());
        System.out.println("Triangle with area="+triangle.getArea());
        triangle=new Triangle("red",5,7,10);
        System.out.println("\n"+triangle);
        System.out.println("Triangle with perimeter="+triangle.getPerimeter());
        System.out.println("Triangle with area="+triangle.getArea());
    }
}
