public class App {

  public static void main(String[] args) throws Exception {
    Rectangle areaABCD = new Rectangle(7.0, "Persegi Panjang", 14.0);
    areaABCD.getInfo();

    Circle areacircle = new Circle(7.0, "Lingkaran");
    areacircle.getInfo();

    Triangle Right = new Triangle(5.0, 7.0, "Segitiga Siku Siku");
    Right.getInfo();
  }
}
