import java.util.*;
import java.io.*;
public class Project_volodymyr_tsaryk
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");
      ArrayList<Policy> policies = new ArrayList<>();
      Scanner inputFile = new Scanner(file);

      int policy;
      String name;
      String first;
      String last;
      int age;
      String smoker;
      double height;
      double weight;      
      while(inputFile.hasNext()){
         policy = inputFile.nextInt();
         inputFile.nextLine();
         name = inputFile.nextLine();
         first = inputFile.nextLine();
         last = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smoker = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         inputFile.nextLine();
         policies.add(new Policy(policy,name,first,last,age,smoker,height,weight));
         
      }
      int smokerCount=0;
      int nonSmoker= 0;
      for (Policy test: policies){
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
         if(test.get_Smoker().equals("smoker")){
            ++smokerCount;
         }
         else{
            ++nonSmoker;
         }
         System.out.println("Policyholder’s Height: " + test.get_Height());
         System.out.println();
         System.out.println("Policyholder’s Weight: " + test.get_Weight());
         System.out.println();
         System.out.printf("Policyholder’s BMI: %.2f%n", test.BMICalc());
         System.out.println();
         System.out.printf("Policy Price: $%.2f%n",test.policyCost());
      }
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
      inputFile.close();
   }

}