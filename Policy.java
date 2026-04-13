public class Policy{
   /** @param policy_Number policy number of individual */
   int policy_Number;
   /** @param provider_name insurance company */
   String provider_name;
   private PolicyHolder person;
   public static int policyCount=0;
   public Policy(){
      this.policy_Number=0;
      this.provider_name = "company";
      person = new PolicyHolder();
      ++policyCount;
   }
   public Policy(int number, String name, PolicyHolder holder ){
      this.policy_Number=number;
      this.provider_name = name;
      person = new PolicyHolder(holder);
      ++policyCount;
   }
   public int get_Number(){
   /** @return the policy number */
      return policy_Number;
   }
   public String get_Company(){
   /** @return the policy company */
      return provider_name;
   }
   public void set_Number(int number){
      this.policy_Number=number;
   }
   public void set_Company(String company){
      this.provider_name=company;
   }
   
   public double policyCost(){
      double cost;
      double BMI = person.BMICalc(); 
      cost = 600;
      if (person.holder_Age > 50){
         cost +=75;
      }
      if (person.smoker.equals("smoker")){
         cost +=100;
      }
      if (BMI > 35){
         cost +=(BMI-35)*20;
      }
      /** @return the cost of the policy */
      double rounded = Math.round(cost*100.0);
      rounded = rounded/100.0;
      return (rounded);
   } 
   public String toString(){
   return ("Policy Number: " + policy_Number + "\n" + "Provider Name: "+ provider_name +"\n"+ person.toString() +"\n" +"Policy Price: " + policyCost());
   }


   
}