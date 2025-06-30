package Challenge1;

public class Variables {

    void PowerConsumption(){
        double rate; //charging rate per watt
        double watts; //amount of power consumed
        double total; //final amount of payment to be made

        rate = 100;
        System.out.println("Ksh per Watt: "+rate);
        watts = 50;
        System.out.println("Watts used: " +watts);

        total = rate * watts;
        System.out.println("Your final total is KSh " +total);

    }
 public static void main(String[] args){
        Variables power1 = new Variables();
        power1.PowerConsumption();


 }

}
