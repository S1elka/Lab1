package lab3.Task2;

public class Circle {
    private Point centre;
    private int rad;
    public Circle(Point ob, int rad){
        this.centre=ob;
        this.rad=rad;
    }
    public void setXcord(double x){
        centre.setX(x);
    }
    public void setYcord(double y){
        centre.setY(y);
    }
    public void setRad(int rad){this.rad=rad;}

    public Point getCentre() {
        return centre;
    }
    public double getXcord(){
        return centre.getX();
    }
    public double getYcord(){
        return centre.getY();
    }
    public int getRad(){return this.rad;}
    public String toString(){
        double len=(this.getRad()*2)*Math.PI;
        return "Центр окружности по х: "+this.getXcord()+", Центр окружности по у: "+this.getYcord()+", Радиус окружности: "+this.getRad()+", Длина окружности: "+len;
    }
}
