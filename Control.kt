import java.util.Scanner

fun main()
{
   //Scanner s = new Scanner(System.`in`) ;
   var s =Scanner(System.`in`);
   var x = s.nextInt();
   if(x >0)
   {
    println("$x is greater than 0")
   }
   else if(x==0)
   {
    println("$x is zero")
   }
   else println("$x is less than zero")

   var a=when(x)
   {
    10,20,30->println("10,20,30");

    in 40..50->println("Between 40 to 50") ;

    else -> "Default";
   }
   //print(a)
}