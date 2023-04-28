public class Grocery
{
    public static void main(String args[])
       {
    Grocery object=new Grocery();
    int lastbill=object.billing();
    object.discount(lastbill);

       }

     public int billing()
      {
int goldwinerOil_1l=185;
int whiteRice_1kg=87;
int sugar_500g=67;
int wheat_1kg=179;
int pepper_50g=89;
int total=goldwinerOil_1l+whiteRice_1kg+sugar_500g+wheat_1kg+pepper_50g;
System.out.println("The Oil Amount is: " +goldwinerOil_1l);
System.out.println("The Rice Amount is: " +whiteRice_1kg);
System.out.println("The Sugar Amount is: " +sugar_500g);
System.out.println("The Wheat Amount is: " +wheat_1kg);
System.out.println("The Pepper Amount is: " +pepper_50g);
System.out.println("The Bill Amount is: " +total);
return total;
       }
public void discount(int ans)
{
int finalValues=ans-10;
System.out.println("Final pay is:"+finalValues);

}
}
