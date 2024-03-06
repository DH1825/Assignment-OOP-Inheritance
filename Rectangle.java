public class Rectangle extends Shape {

  protected Double lenght;
  protected Double weight;

  public Rectangle(Double lenght, String name, Double weight) {
    super.setName(name);
    this.calculateArea(lenght, weight);
    this.calculateperimeter(lenght, weight);
  }

  public void calculateArea(Double lenght, Double weight) {
    super.area = lenght * weight;
  }

  public void calculateperimeter(Double lenght, Double weight) {
    super.perimeter = 2 * lenght + 2 * weight;
  }
}
