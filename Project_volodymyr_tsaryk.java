import java.util.Scanner;

public class Project_volodymyr_tsaryk
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int number;
      String name;
      String first;
      String last;
      int age;
      String smoker;
      double height;
      double weight;
      System.out.println("Please enter the Policy Number: ");
      number = input.nextInt();
      System.out.println();
      input.nextLine();
      System.out.println("Please enter the Provider Name: ");
      name = input.nextLine();
      System.out.println();
      System.out.println("Please enter the Policyholder’s First Name: ");
      first = input.nextLine();
      System.out.println();
      System.out.println("Please enter the Policyholder’s Last Name: ");
      last = input.nextLine();
      System.out.println();
      System.out.println("Please enter the Policyholder’s Age: ");
      age = input.nextInt();
      input.nextLine();
      System.out.println();
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      smoker = input.nextLine();
      System.out.println();
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      height = input.nextDouble();
      System.out.println();
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
      weight = input.nextDouble();
      System.out.println();
      Policy test = new Policy(number,name,first,last,age,smoker,height,weight);
      System.out.println("Policy Number: " + test.get_Number());
      System.out.println();
      System.out.println("Provider Name: " + test.get_Company());
      System.out.println();
      System.out.println("Policyholder’s First Name: " + test.get_Fisrt());
      System.out.println();
      System.out.println("Policyholder’s Last Name: " + test.get_Last());
      System.out.println();
      System.out.println("Policyholder’s Age: " + test.get_Age());
      System.out.println();
      System.out.println("Policyholder’s Smoking Status: " + test.get_Smoker());
      System.out.println();
      System.out.println("Policyholder’s Height: " + test.get_Height());
      System.out.println();
      System.out.println("Policyholder’s Weight: " + test.get_Weight());
      System.out.println();
      System.out.printf("Policyholder’s BMI: %.2f%n", test.BMICalc());
      System.out.println();
      System.out.printf("Policy Price: $%.2f%n",test.policyCost());
   }

}