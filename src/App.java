import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to the metric converter.\nBegin by typing 'commands' to see all conversions\nExample command: 'km > mi'");
        Scanner scnr = new Scanner(System.in);

        String usrIn;
        float num;
        boolean isDone = false;
        while(isDone == false){
            System.out.println("------------\nEnter command: ");
            usrIn = scnr.nextLine();
            System.out.println("------------");

            if(usrIn.equals("exit")){
                isDone = true;
            }else if(usrIn.equals("commands")){
                System.out.println("[All commands]\nkg > lb\nkm > mi\nc > f\nL > gal\ncommands\nexit");
            }else if(usrIn.equals("km > mi")){
                System.out.println("How many?");
                usrIn = scnr.nextLine();
                num = Integer.parseInt(usrIn);
                float mi = num * .62137f;
                System.out.println(num + " kilometers is " + mi + " miles.");
            }else if(usrIn.equals("kg > lb")){
                System.out.println("How many?");
                usrIn = scnr.nextLine();
                num = Integer.parseInt(usrIn);
                float lb = num * 2.2f;
                System.out.println(num + " kilograms is " + lb + " pounds.");
            }else if(usrIn.equals("c > f")){
                System.out.println("How many?");
                usrIn = scnr.nextLine();
                num = Integer.parseInt(usrIn);
                float f = (num * 1.8f) + 32;
                System.out.println(num + " celsius is " + f + "fahrenheit.");
            }else if(usrIn.equals("L > gal")){
                System.out.println("How many?");
                usrIn = scnr.nextLine();
                num = Integer.parseInt(usrIn);
                float gal = num * .2641720524f;
                System.out.println(num + " litres is " + gal + " gallons.");
            }else{
                System.out.println("Invalid command. Try again");
            }
        }

        scnr.close();
    }
}
