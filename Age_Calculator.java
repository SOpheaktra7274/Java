package Calculate_Age;
import java.util.Scanner;
import java.time.LocalDate;
public class Age_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        
        int CurrentDay   = today.getDayOfMonth();
        int CurrentMonth = today.getMonthValue();
        int CurrentYear  = today.getYear();
   
        System.out.println("Age calculator");
        System.out.println("Enter your date of birth");
        System.out.print("Day   : ");int day = sc.nextInt();
        System.out.print("Month : ");int month = sc.nextInt();
        System.out.print("Year  : ");int year = sc.nextInt();
        
        System.out.println("\t\tDay\t\tMonth\t\tYear");
        System.out.println("\t\t"+day+"\t\t"+month+"\t\t"+year);
        System.out.println("");
        
        if(day == CurrentDay && month == CurrentMonth && year<CurrentYear){
            System.out.println("You're : "+(CurrentYear-year)+" year old");
            System.out.println("         "+(CurrentYear-year)*365+" day old");
        }
        if(day != CurrentDay && month != CurrentMonth && year<CurrentYear){
            int totalDays = (CurrentYear-year-1)*365;
            System.out.println("You're : "+(CurrentYear-year-1)+" year old");
            System.out.println("         "+totalDays+" day old");
        }
        if(year==CurrentYear){
            if(month==CurrentMonth){
                System.out.println("You're : "+day+" day old");
            }
            if(month<CurrentMonth){
                if(month%2==0){
                    System.out.println("You're : "+((CurrentMonth*30)-(month*30))+" day old");
                }
                else{
                    System.out.println("You're : "+((CurrentMonth*30)-(month*31))+" day old");
                }
            }
            else{
                System.out.println("The birthdate hasn't passed in the current year yet.");
            }
        }
        else {
            System.out.println("The birthdate hasn't passed in the current year yet.");
        }
            

    }
}