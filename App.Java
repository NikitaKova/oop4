
import Figures.Circle;
import Figures.Rectangle;
import Figures.Square;
import Figures.Triangle;
import Figures.Base.Figure;

public class App {
    public static void main(String[] args) {
       
        myCollection<Figure> myFigures = new myCollection<>(
                new Figure[] {
                        new Triangle(3, 4, 5),
                        new Circle(5), new Circle(2),
                        new Rectangle(3, 4), new Rectangle(4, 6),
                        new Square(3), new Square(5)
                });
        myFigures.add(new Triangle());
        myFigures.add(new Circle());
        myFigures.add(new Rectangle());
        myFigures.add(new Square());
        System.out.println(myFigures);

        myFigures.delItemEqual(new Square(3));
        System.out.println("delItemEqual (Square(3))  " + myFigures);
        myFigures.delItemEqual(new Circle());
        System.out.println("delItemEqual (Circle())  " + myFigures);

        System.out.printf("min=%s\n", myFigures.getMin());
        System.out.printf("max=%s\n", myFigures.getMax());

        System.out.printf("sum=%s\n", myFigures.getSum());
        System.out.printf("prod=%s\n", myFigures.getProd());

        System.out.printf("Find (Triangle())=%s\n", myFigures.findIndexOfItem(new Triangle()));
        System.out.printf("Find (Triangle(9,10,11))=%s\n", myFigures.findIndexOfItem(new Triangle(9,10,11)));

        System.out.printf("Contains (Triangle())=%s\n", myFigures.containsItem(new Triangle()));
        System.out.printf("Contains (Triangle(9,10,11))=%s\n", myFigures.containsItem(new Triangle(9,10,11)));

        myFigures = new myCollection<>(
            new Figure[] {
                new Triangle(3, 4, 5), new Triangle(5, 6, 7), new Triangle(),
                new Circle(5), new Circle(2), new Circle(),
                new Rectangle(3, 4), new Rectangle(4, 6), new Rectangle(),
                new Square(3), new Square(5)
        });
        System.out.println("Unsorted " + myFigures);

        myFigures.bubbleSort();
        System.out.println("BubbleSorted " + myFigures);

        myFigures = new myCollection<>(
            new Figure[] {
                new Triangle(3, 4, 5), new Triangle(5, 6, 7), new Triangle(),
                new Circle(5), new Circle(2), new Circle(),
                new Rectangle(3, 4), new Rectangle(4, 6), new Rectangle(),
                new Square(3), new Square(5)
        });
        System.out.println("Unsorted " + myFigures);

        myFigures.insertionSort();
        System.out.println("InsertionSorted " + myFigures);

        myFigures = new myCollection<>(
            new Figure[] {
                new Triangle(3, 4, 5), new Triangle(5, 6, 7), new Triangle(),
                new Circle(5), new Circle(2), new Circle(),
                new Rectangle(3, 4), new Rectangle(4, 6), new Rectangle(),
                new Square(3), new Square(5)
        });
        System.out.println("Unsorted " + myFigures);

        myFigures.selectionSort();
        System.out.println("selectionSorted " + myFigures);

        System.out.println("Length = " + myFigures.length());


    }
}