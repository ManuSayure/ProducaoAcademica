package principal;
import java.util.InputMismatchException;
import java.util.Scanner;
public static int lerNumero(){ 	
	int n;   
	Scanner scan = new Scanner(System.in);
    try{
    	System.out.print("Insira um número");
        n = scan.nextInt();
    } catch(InputMismatchException e){
        System.out.print("Tem que ser um número");
        return lerNumero();        
    }
    return n;  
}   

public class Excessoes {
	
public void lerInt(String inteiro)
{
	
}
public void lerString(String palavra)
{
	
}
public void lerDouble(String double)
{
	
}
}

