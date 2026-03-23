public class Policy{
   /** @param policy_Number policy number of individual */
   int policy_Number;
   /** @param provider_name insurance company */
   String provider_name;
   /** @param holder_First first name */
   String holder_First;
   /** @param holder_Last last name */
   String holder_Last;
   /** @param holder_Age holders age */
   int holder_Age;
   /** @param smoker if they are a smoker */
   String smoker;
   /** @param height holders height */
   double height;
   /** @param height holders weight */
   double weight;
   public Policy(){
      this.policy_Number=0;
      this.provider_name = "company";
      this.holder_First= "john";
      this.holder_Last = "smith";
      this.holder_Age = 0;
      this.smoker="non-smoker";
      this.height = 0;
      this.weight = 0;
   }
   public Policy(int number, String name, String first, String last,int age, String smoker, double height, double weight ){
      this.policy_Number=number;
      this.provider_name = name;
      this.holder_First= first;
      this.holder_Last = last;
      this.holder_Age = age;
      this.smoker=smoker;
      this.height = height;
      this.weight = weight;
   }
   public int get_Number(){
   /** @return the policy number */
      return policy_Number;
   }
   public String get_Company(){
   /** @return the policy company */
      return provider_name;
   }
   public String get_Fisrt(){
   /** @return the policy holders first name */
      return holder_First;
   }
   public String get_Last(){
   /** @return the policy holders last name */
      return holder_Last;
   }
   public int get_Age(){
   /** @return the policy holders age */
      return holder_Age;
   }
   public String get_Smoker(){
   /** @return if the holder is a smoker */
      return smoker;
   }
   public double get_Height(){
   /** @return the height */
      return height;
   }
   public double get_Weight(){
   /** @return the weight */
      return weight;
   }
   public void set_Number(int number){
      this.policy_Number=number;
   }
   public void set_Company(String company){
      this.provider_name=company;
   }
   public void set_Fisrt(String first){
       this.holder_First=first;
   }
   public void set_Last(String last){
      this.holder_Last=last;
   }
   public void set_Age(int age){
      this.holder_Age=age;
   }
   public void set_Smoker(String smoker){
      this.smoker = smoker;
   }
   public void set_Height(double height){
      this.height=height;
   }
   public void set_Weight(double weight){
      this.weight = weight;
   }
   public double BMICalc(){
      return( (weight*703)/(height*height));
   }
   public double policyCost(){
      double cost;
      double BMI = BMICalc(); 
      cost = 600;
      if (holder_Age > 50){
         cost +=75;
      }
      if (smoker.equals("smoker")){
         cost +=100;
      }
      if (BMI > 35){
         cost +=(BMI-35)*20;
      }
      /** @return the cost of the policy */
      return cost;
   } 


   
}