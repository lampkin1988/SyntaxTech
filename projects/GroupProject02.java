package com.syntax.group.projects;

public class GroupProject02 {
	
	//Task 1
	
public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle2 implements Shape {
    double radius;
    Circle2(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
class Square2 implements Shape {
double length, width;
Square2(double length, double width){
    this.length=length;
    this.width=width;
}
    @Override
    public double calculateArea() {
        return length*width;
    }
    @Override
    public double calculatePerimeter() {
        return length*2+width*2;
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle2 circle = new Circle2(10.9);
        System.out.println("Area of circle is "+circle.calculateArea());
        System.out.println("Perimeter of circle is "+circle.calculatePerimeter());
        Square2 square = new Square2(20.2,30.39);
        System.out.println("Area of square is "+square.calculateArea());
        System.out.println("Perimeter of square is "+square.calculatePerimeter());
    }
}

//Task 2

public abstract class Marks {
	
    abstract double getPercentage();
}
class A extends Marks {
    double subject1, subject2, subject3;
    double average;
    A(double sub1, double sub2, double sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
    @Override
    double getPercentage() {
        average = (subject1 + subject2 + subject3) / 3;
        return average;
    }
}
class B extends Marks {
    double subject1, subject2, subject3, subject4;
    double average;
    B(double sub1, double sub2, double sub3, double sub4) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.subject4 = sub4;
    }
    @Override
    double getPercentage() {
        average = (subject1 + subject2 + subject3 + subject4) / 4;
        return average;
    }
}
class MarksTester {
    public static void main(String[] args) {
        A objA = new A(90, 94.5, 87);
        B objB = new B(98, 97.5, 76, 89);
        System.out.println(objA.getPercentage());
        System.out.println(objB.getPercentage());
    }
}




//Task 3


public class Car {
    double carprice;
    String carcolor;
    Car(double carprice, String carColor){
        this.carprice=carprice;
        this.carcolor=carColor;
    }
    public double calculateSalePrice(){
        return carprice;
    }
}
class Truck extends Car {
    double weight;
    Truck(double carprice, String carColor, double weight) {
        super(carprice, carColor);
        this.weight = weight;
    }
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carprice - (carprice * 0.1);
        } else {
            return carprice - (carprice + 0.2);
        }
    }
}
    class Sedan extends Car{
        double length;
        Sedan(double carprice, String carColor,double length) {
            super(carprice, carColor);
            this.length=length;
        }
        @Override
        public double calculateSalePrice() {
            if(this.length>20){
                return carprice-(carprice*0.05);
            }else{
                return carprice-(carprice*0.1);
            }
        }
        public static void main(String[] args) {
            Car Truck=new Truck(350000,"White",16000);
            System.out.println("The new price of the truck with discount is "+Truck.calculateSalePrice());
            Car Sedan=new Sedan(100,"Blue",190);
            System.out.println("The new price of Sedan with discount is "+Sedan.calculateSalePrice());
        }
    }

//Task 4
public class Registration {
    private String email, userName, password;
    void setEmail(String email){
        if (email.endsWith("@yahoo.com")) {
            this.email=email;
        }else{
            System.out.println("Please enter only yahoo email");
        }
    }
    void setUserName(String userName){
        if(userName.length()>6){
            this.userName=userName;
        }else{
            System.out.println("Username must be more than 6 characters");
        }
    }
    void setPassword(String password){
        if ((password!=userName) && (password.length()>6)){
            this.password=password;
        }else{
            System.out.println("Your password is too short or it contains your username");
        }
    }
    void print(){
        System.out.println("Your email is: "+email);
        System.out.println("Your username is "+userName);
        System.out.println("Your password is "+password);
    }
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("imrobot@yahoo.com");
        user.setUserName("1234567");
        user.setPassword("12345678");
        user.print();
    }
}


//Task 5
public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
public interface RemoteWebDriver extends WebDriver, TakeScreenshot {
    void navigate();
}
public interface TakeScreenshot {
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println(getTitle() + " can navigate different URL through Google Chrome Browser");
    }
    @Override
    public void open() {
        System.out.println(getTitle() + " can open Google Chrome Browser");
    }
    @Override
    public void close() {
        System.out.println(getTitle() + " can close Google Chrome Browser");
    }
    @Override
    public String getTitle() {
        String title = "Chrome Driver";
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println(getTitle() + " can take Screenshot");
    }
}
public class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println(getTitle() + " can open Firefox Browser");
    }
    @Override
    public void close() {
        System.out.println(getTitle() + " can close Firefox Browser");
    }
    @Override
    public String getTitle() {
        String title = "FireFox Driver";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println(getTitle() + " can navigate different URL through Firefox Browser");
    }
    @Override
    public void getScreenshot() {
        System.out.println(getTitle() + " can take Screenshot");
    }
}
public class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println(getTitle() + " can navigate different URL through Safari Browser");
    }
    @Override
    public void getScreenshot() {
        System.out.println(getTitle() + " can take Screenshot");
    }
    @Override
    public void open() {
        System.out.println(getTitle() + " can open Safari Browser");
    }
    @Override
    public void close() {
        System.out.println(getTitle() + " can close Safari Browser");
    }
    @Override
    public String getTitle() {
        String title = "Safari Driver";
        return title;
    }
}
public class WebDrivertester {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.getTitle();
        chrome.open();
        chrome.navigate();
        chrome.getScreenshot();
        chrome.close();
    }
}
}


