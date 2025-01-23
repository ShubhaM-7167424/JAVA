
public class BreakContinue {

    public static void main(String[] args) {

        //     break = break out of a loop (STOP)
        //     continue = skip the current iteration of a loop (SKIP)
        /*
		for (int i = 0; i < 10; i++) {
			if(i == 5){
				break;
			}			   			
		  stem.out.print( i  + " ");
		  }
	     
         */

        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
