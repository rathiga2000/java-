public class Simple
{
    public static void main (String args[])
    {
    Simple object=new Simple();6
int values=object.addition();
object.discount(values);

     }
   public int addition()
   {
int first=5;
int second=10;
int total=first+second;
System.out.println("The First value is:" +first);
System.out.println("The Second value is:" +second);
System.out.println("the total value is:" +total);
return total;
    }
public void discount(int amt)
{
int finalValues=amt-3;
System.out.println("Last Pay:"+finalValues);
}
}


