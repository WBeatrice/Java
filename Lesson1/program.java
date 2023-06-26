import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	    int n = 5;
	    String a = "Hello";
	    var x = 'f';
	    boolean flag = true;
	    System.out.println(a + " World");
		for (int i = 0;i <= 10 ;i++ ){
		    System.out.println(i);
		} 
		while(n < 20){
		    System.out.println(n);
		    n+=5;
		}
		
		int j = 7;
        do{
            System.out.println(j);
            j--;
        }
        while (j > 0);
        
        int[] nums = new int[5];
        int[] x1 = {1,215,627,35684,3221,7658,96473};
        
        for (int i = 0;i < x1.length;i++ ){
            if(x1[i] % 2 == 0)
                System.out.println(x1[i]); 
        } 

        //Ввод данных с клавиатуры
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
        
        
        
        
        
        
	}
}
