package seminar1;



public class TwoShape {
    double width;
    double height;

    void showDim() {
        System.out.println(" Ширина и высота" + width + " и " + height);
    }
}

class Triangle extends TwoShape {
    String style;

    double area () {
        return (width * height / 2);
    }
    void showStyle() {
        System.out.println(" Треугольник" + style);
    }
} 
// package Seminar1OOP;

//     public class TwoShapes {
//         private double width;
//         private double height;

//         public void setWidth(double width) {
//             this.width = width;
//         }

//         public void setHeight(double height) {
//             this.height = height;
//         }

//         public double getWidth() {
//             return width;
//         }

//         public double getHeight() {
//             return height;
//         }

//         void showDim() {
//             System.out.println(" Ширина и высота" + width + " и " + height);
//         }
//     }

//     class Triangle extends TwoShapes {
//         String style;

//         double area () {
//             return (getWidth() * getHeight() / 2);
//         }
//         void showStyle() {
//             System.out.println(" Треугольник" + style);
//         }
//     }