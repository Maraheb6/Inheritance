public class Square extends Rectangle{

    public Square() {
        super();


    }
    public Square(double side)
    {
        super(side, side);

    }

    public Square(double side,String color, boolean filled) {
        super();
        setWidth(side);
    }
  public void setSide(double width){
        super.setWidth(width);
  }
  public double getSide(){
        return super.getWidth();
  }

    public String toString() {
        return "A Square with side="+this.getSide()+" which is a subclass of "+ super.toString();
    }



}
