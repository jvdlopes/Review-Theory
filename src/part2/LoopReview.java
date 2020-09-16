
package part2;


public class LoopReview {

    
    public static void main(String[] args) {
        //for loop example
        for (int i = 0; i < 10; i++) 
            System.out.format("i is now %d\n", i);
        for (double temp = 20; temp < 10; temp-=0.5){
            System.out.print("Temperature is " + temp);
            String weather = temp >=15? "WARM" : "COLD";
            System.out.println("\t\tThe weather is " + weather);
        }
           
        /*
        while loop: keep repeating until condition is met
        3 ways
        */
        
        int rnum;
        int tries = 0;
        System.out.println("GAME 1\n==========\n");
        
        do{
            rnum = (int)(Math.random() * 20 + 1);
            tries++;
            System.out.format("Try %d -> Number picked %d\n", tries, rnum);
        } while (rnum!= 7);
        rnum=0;
        tries=0;
        //while loop exit condition is at the top
        System.out.println("Game 2\n==========\n");
        while(rnum != 7) {
            rnum = (int)(Math.random() * 20 + 1);
            tries++;
            System.out.format("Try %d -> Number picked %d\n", tries, rnum);
        }
        //while true - exit condition is in the middle with an if statement
        rnum=0;
        tries=0;
        System.out.println("Game 3\n==========\n");
        while(true){
            rnum = (int)(Math.random() * 20 + 1);
            tries++;
            System.out.format("Try %d -> Number picked %d\n", tries, rnum);
            if(rnum== 7) break;
        }
        System.out.println("Game over you got it in " + tries + " tries.");
        
    }
    
}
