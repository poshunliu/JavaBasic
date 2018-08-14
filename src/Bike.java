
public class Bike {

   public static String wheelShape = "circle";
   public int wheelNum = 2;
   private String seatShape =  "normal";



    public int getwheelNum(){
        return wheelNum;
    }

    public String getWheelShape(){
        return wheelShape;
    }


    public String getSeatShape(){
        return seatShape;

    }
    public void print(){
        System.out.println("The" +this.getClass().getName()+" wheel shape is " + getWheelShape());
        System.out.println("The" +this.getClass().getName()+" wheel number is" + getwheelNum());
        System.out.println("The" +this.getClass().getName()+" seat shape is "+ getSeatShape());
    }





}
