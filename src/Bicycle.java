public class Bicycle extends Bike{

    private int pedalNum = 4;
    private String wheelShape = "circle";
    protected int wheelNum = 2;
    private String seatShape =  "Sport";


    public int getPedalNum(){
        return pedalNum;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("The"+ this.getClass().getName()+ "pedal number is " + getPedalNum());
    }
}


