import java.math.*;
public class PolicyHolder{
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
      double rounded = Math.round((weight*703)/(height*height)*100.0);
      rounded = rounded/100.0;
      return (rounded);
   }
   
   public String toString(){
   return("Policyholder’s First Name: " + holder_First+ "\n" + "Policyholder’s Last Name: " + holder_Last + "\n" + "Policyholder’s Age: " + holder_Age + "\n" + "Policyholder’s Smoking Status: " + smoker +"\n" +"Policyholder’s Height: " + height+"\n"+"Policyholder’s Weight: " + weight + "\n" + "Policyholder’s BMI: " + BMICalc());
   }
}