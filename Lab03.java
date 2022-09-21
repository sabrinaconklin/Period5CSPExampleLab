public class Lab03 {


    public static void main(String args[]) {
    int startingvalue = 10000123;
    int hours = startingvalue / 3600;
    int seconds = startingvalue % 3600;
    int minutes = 2800 % 60;
        System.out.println();
        System.out.println("Lab03, 100 point version/n");
        System.out.println();
        int milli = 10000123;
        System.out.println("Starting milliseconds:  "  + milli);
        int Hours = startingvalue/3600000;
        System.out.println("Hours: \t\t\t\t\t" + Hours);
        int Minutes = 2800/60;
        System.out.println("Minutes: \t\t\t\t" + Minutes);
        int Seconds = 2800 % 60;
        System.out.println("Seconds: \t\t\t\t" + Seconds);
        int Milliseconds = startingvalue % 1000;
        System.out.println("Milliseconds: \t\t\t" + Milliseconds);






    }

}


