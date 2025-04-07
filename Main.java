


public class Main {

    public static void main(String[] args){
        int score = 0;
        
        System.out.println("It is time to game\n");
        for(int day = 0; day <=5;day++){

            System.out.println("\n A new day begins\n"+
            "day" + day +"score is " + score);

            score += Event.roll();


        };

        







    };
    
};
