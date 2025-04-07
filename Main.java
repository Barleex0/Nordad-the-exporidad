


public class Main {

    public static void main(String[] args){
        int score = 0;
        
        System.out.println("It is time to game\n");
        for(int day = 0; day <=5;day++){

            System.out.println("\n A new day begins\n"+
            "day " + day +"\nscore is " + score);

            score += Event.roll();


        };

        System.out.println("your adventure comes to an end.\n");
        if (score< 25) {
            System.out.println("you did pretty bad out there but thats how it is on this little rock ball isn't it.");
        }

        else{
            System.out.println("somehow you lived?\n you got exceptionally lucky\n i would say keep it that way\n \n no reason to chance it anymore");
        }

        







    };
    
};
