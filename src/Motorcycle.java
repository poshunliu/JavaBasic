

public class Motorcycle extends Bicycle {


    private String gasTank = "Large";
    private String motor = "3.5";
    private int pedalNum = 4;
    private String wheelShape = "circle";
    private int wheelNum = 2;
    private String seatShape =  "Sport";





    public String getGasTank(){
        return gasTank;
    }

    public String getMotor(){
        return motor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("The Motorcycle's gas tank is" + getGasTank());
        System.out.println("The Motorcycle's gas tank is" + getMotor());
    }
}
