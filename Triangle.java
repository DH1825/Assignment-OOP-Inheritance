public class Triangle extends Shape {

  protected Double base;
  protected Double high;

  public Triangle(Double base, Double high, String name) {
    super.setName(name);
    this.calculateArea(base, high);
    this.calculatePerimeter(base, high);
  }

  public void calculateArea(Double base, Double high) {
    super.area = 0.5 * (base * high);
  }

  public void calculatePerimeter(Double base, Double high) {
    super.perimeter =
      base + high + (Math.sqrt((Math.pow(base, 2.0)) + (Math.pow(high, 2))));
  }
}
