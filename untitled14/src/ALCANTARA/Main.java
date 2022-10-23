package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here




                Scanner sc = new Scanner(System.in);

                System.out.println("Enter birth Rate In Seconds : ");
                double birthRateInSeconds =  sc.nextDouble();
                System.out.println("Enter death Rate In Seconds : ");
                double deathRateInSeconds = sc.nextDouble();
                System.out.println("Enter newimmigrantIn Seconds : ");
                double newImmigrantInSeconds = sc.nextDouble();


                System.out.println("Enter currentPopulation  : ");
                double currentPopulation =  sc.nextDouble();

                double secondsInYears = 60 * 60 * 24 * 365;

                double numBirths = secondsInYears / birthRateInSeconds;
                double numDeaths = secondsInYears / deathRateInSeconds;
                double numImmigrants = secondsInYears / newImmigrantInSeconds;

                for (int i = 1; i <= 5; i++) {
                    currentPopulation += numBirths + numImmigrants - numDeaths;
                    System.out.println("Year " + i + " = " + (int)currentPopulation);

                }


            }
        }
