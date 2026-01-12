package gr.aueb.cf.cf9.ch15.hw1;

/**
 * Main Class
 * Δοκιμαστική κλάση για να ελέγξουμε τη λειτουργικότητα των σχημάτων
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Δοκιμή Shapes ===\n");

        // Δημιουργία κύκλου
        Circle circle = new Circle(1, 5.0);
        System.out.println(circle);

        // Δημιουργία ορθογωνίου
        Rectangle rectangle = new Rectangle(2, 4.0, 6.0);
        System.out.println(rectangle);

        // Δημιουργία γραμμής
        Line line = new Line(3, 10.0);
        System.out.println(line);

        System.out.println("\n=== Δοκιμή Polymorphism ===\n");

        // Χρήση polymorphism με IShape
        IShape[] shapes = {circle, rectangle, line};
        for (IShape shape : shapes) {
            System.out.println("Shape ID: " + shape.getId());
        }

        System.out.println("\n=== Δοκιμή ITwoDimensional ===\n");

        // Χρήση ITwoDimensional για σχήματα με εμβαδόν
        ITwoDimensional[] twoDShapes = {circle, rectangle};
        for (ITwoDimensional shape : twoDShapes) {
            System.out.printf("Εμβαδόν: %.2f\n", shape.getArea());
        }

        System.out.println("\n=== Αλλαγή τιμών ===\n");

        // Αλλαγή της ακτίνας του κύκλου
        circle.setRadius(7.0);
        System.out.println("Νέος κύκλος: " + circle);

        // Αλλαγή διαστάσεων ορθογωνίου
        rectangle.setWidth(5.0);
        rectangle.setHeight(8.0);
        System.out.println("Νέο ορθογώνιο: " + rectangle);

        // Αλλαγή μήκους γραμμής
        line.setLength(15.0);
        System.out.println("Νέα γραμμή: " + line);
    }
}