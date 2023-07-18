package seminar1;


class Shapes {
    public static void main(String[] args) {
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle();
    
    
    
    t1.height = 4.0;
    t1.width = 10.1;
    t1.style = "green";

    t2.height = 3.0;
    t2.width = 25.0;
    t2.style = "wrate";

    System.out.println("Информация от Т1 ");
    t1.showStyle ();
    t1.showDim ();
    System.out.println(" Площадь равно " + t1.area());

    System.out.println("Информация от Т2 ");
    t2.showStyle ();
    t2.showDim ();
    System.out.println(" Площадь равно " + t2.area());

    }
}
// package Seminar1OOP;

// class Shapes {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         Triangle t2 = new Triangle();



//         t1.setHeight(4.0);
//         t1.setWidth(10.1);
//         t1.style = "green";

//         t2.setHeight(3.0);
//         t2.setWidth(25.0);
//         t2.style = "wrate";

//         System.out.println("Информация от Т1 ");
//         t1.showStyle ();
//         t1.showDim ();
//         System.out.println(" Площадь равно " + t1.area());

//         System.out.println("Информация от Т2 ");
//         t2.showStyle ();
//         t2.showDim ();
//         System.out.println(" Площадь равно " + t2.area());

//     }
// }