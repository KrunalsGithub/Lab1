package coe318.lab1;

/**
 *
 * @author Krunal Patel 501175325
 */
public class Resistor {
    
    // Variables created to store resistance and voltage value and set to 0
    private double resistanceval = 0.0;
    private double voltage = 0.0;
    //Constructor creates a resistor with a resistance value
    public Resistor(double resistorval){
    //The resistor value is now initialized    
    resistanceval = resistorval; 
    }
    //Getter method used to return the resistance value
    public double getResistance(){   
        return resistanceval;
    }
    //Getter method used to return the voltage value 
    public double getVoltage(){
        return voltage; 
    }
    //Setter method used to set the voltage value so that it is between an allowed limit
    public void setVoltage(double voltageval) {
        //Checks if the voltage value is in between the allowed limit and if it is then sets the voltage value
        if(voltageval >= -50 && voltageval <= 50){
            voltage = voltageval;
        } else {
            //If the voltage value is not in the allowed limit, prints the error message
            System.out.println("Error: Voltage value is beyond the allowed limit");
        }
    }
    //Getter method current value is calculated and returned using Ohm's Law
    public double getCurrent(){ 
        return (voltage/resistanceval);
    }
    
    //Setter method used to set the current value so that it is between an allowed limit
    public void setCurrent(double currentval) {
        //Checks if the current value is in between the allowed limit 
        if (currentval >= -5 && currentval <= 5) {
            //Checks if the resistance value is 0 as division by 0 is to be avoided
            if (resistanceval != 0) { 
                //If the resistance is non-zero, voltage is calculated and set based on current and resistance
                voltage = currentval * resistanceval; 
        } else {
            //If the resistance value is 0, error message is printed
            System.out.println("Error: The Resistance value is zero, this current cannot be set.");
        }
    } else {
        //If the current value is beyond the allowed limit, error message is printed
        System.out.println("Error: The Current value is beyond the allowed limit");
        }
    }
    //Getter method calculates and returns power using voltage and resistance values
    public double getPower(){
        return (voltage * voltage) / resistanceval; 
    }
    
    //This is the Main function 
    public static void main(String[] args) {
        Resistor r1, r2;
        System.out.println("Creating a 50 Ohm resistor (r1)");
        r1 = new Resistor(50.0);
        System.out.println("Its resistance is "
                + r1.getResistance() + " Ohms");
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Creating a 100 Ohm resistor (r2)");
        r2 = new Resistor(100.0);
        System.out.println("Its resistance is "
                + r2.getResistance() + " Ohms");
        System.out.println("Setting r1's current to 10 Amps");
        r1.setCurrent(10.0);
        System.out.println("Setting r1's current to 2 Amps");
        r1.setCurrent(2.0); 
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Setting r1's voltage to 90 Volts");
        r1.setVoltage(90.0);
        System.out.println("Setting r1's voltage to 50 Volts");
        r1.setVoltage(50.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Setting r2's current to 3 Amps");
        r2.setCurrent(3.0);
        System.out.println("Its voltage is "
                + r2.getVoltage() + " Volts");
    }
}
