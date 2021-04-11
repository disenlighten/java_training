public class triangle_class {
  
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15,  8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.FindArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.FindArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenOne);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);
    }
    
    
}
