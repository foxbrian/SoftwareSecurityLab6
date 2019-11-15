import java.util.Random;
public class Hello2
{
 public static void main( String argv[] ){
 Random rand = new Random();
 for(i=0; i<10; i++){
	int num = rand.nextInt(10);
	System.out.print(num);
}
}