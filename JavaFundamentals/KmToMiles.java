// Question : 1
/*CP - Create a program to convert the distance of 10.8 kilometers to miles.
Hint => 1 km = 1.6 miles
I/P => NONE
O/P => The distance ___ km in miles is ___
*/



public class KmToMiles{
public static void main(String... args){
double Km = sc.nextDouble();
double miles = 1.6*Km;
System.out.println("The distance "+ Km +" Km in mile is "+ miles);

}
}