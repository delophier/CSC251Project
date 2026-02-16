public class Policy{
   int policy_Number;
   String provider_name;
   String holder_First;
   String holder_Last;
   int holder_Age;
   String smoker;
   int height;
   int weight;
   int BMI;
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
   public Policy(int number, String name, String first, String last,int age, String smoker, int height, int weight ){
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
      return policy_Number;
   }
   public String get_Company(){
      return provider_name;
   }
   public String get_Fisrt(){
      return holder_First;
   }
   public String get_Last(){
      return holder_Last;
   }
   public int get_Age(){
      return holder_Age;
   }
   public String get_Smoker(){
      return smoker;
   }
   public int get_Height(){
      return height;
   }
   public int get_Weight(){
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
   public void set_Height(int height){
      this.height=height;
   }
   public void set_Weight(int weight){
      this.weight = weight;
   }
   public int BMICalc(){
      return( (weight*703)/(height*height));
   }
   public int policyCost(){
      int cost;
      int BMI = BMICalc(); 
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
      return cost;
   } 


   
}