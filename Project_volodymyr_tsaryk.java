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
      int smokerCount=0;
      int nonSmoker= 0;      
      while(inputFile.hasNext()){
         policy = inputFile.nextInt();
         inputFile.nextLine();
         name = inputFile.nextLine();
         first = inputFile.nextLine();
         last = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smoker = inputFile.nextLine();
         if(smoker.equals("smoker")){
            ++smokerCount;
         }
         else{
            ++nonSmoker;
         }
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         inputFile.nextLine();
         policies.add(new Policy(policy,name,new PolicyHolder(first,last,age,smoker,height,weight)));
         
      }
      int policyCount = 0;
      for (Policy test: policies){
         System.out.println(test);
         System.out.println();
         policyCount = test.policyCount;
      }
      System.out.println("There were "+ policyCount +" Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
      inputFile.close();
   }

}