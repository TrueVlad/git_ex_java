public class Main {
    public static void main(String[] args) {
        Shape[] arr =new Shape[]{
                new Circle(), new Square(), new Triangle()
        };
        for (int i = 0; i < arr.length; i++){
            arr[i].draw();
        }

        System.out.println("_____________________________");

        Shape shape = new Square();
        shape.draw();

        Shape shape2 = new Circle();
        shape2.draw();
    }
}
