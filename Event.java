import java.util.Scanner;

public class Event {
static int rnum;
static Scanner kb = new Scanner(System.in);

//stores a random number
public static int roll(){
    int score =0;
    int tracker = 0;

    while (score < 20 && tracker <= 4 ){
rnum = (int)((Math.random() *101)% 4);

switch (rnum) {
    case 1:
        System.out.println("You come across some birds,\n it is very...\n very boring.\n your day ends here");
        return score;
    case 2:// berry event
        System.out.println("there are berries here...");
        if (Math.random()< 0.6){
            score += 4;
            System.out.println("The berries are good perfect for food.");
        }
        else{
         score -=2;
            System.out.println("They burn to the touch\n oh, you are quite allergic to them it seems,\n this is definately going to slow you down");
        }
        break;
    case 3:
        System.out.println("A BEAR>>>\n IT IS SO FAST\n QUICK 1 RUN" );
        if(kb.nextLine()=="run" ||kb.nextLine()=="RUN"||kb.nextLine()=="i run"){
            System.out.println("you escape but you are pretty much useless for the rest of the day");
            return score;
        }
        else{
            System.out.println("the bear stomps you into a hole like a cartoon and he steals your picnic basket");
            return 0;
        }

    case 4:

    System.out.println("Is that food\n \n Epic");
     score +=7;
        break;

    default:
        break;

    }
System.out.println("wanna call it quits early?\n 1 for yes");

if(kb.nextInt()==1){
    kb.nextLine();
    tracker= 4;
}
kb.nextLine();
    tracker++;
}

return score;



};







    
};