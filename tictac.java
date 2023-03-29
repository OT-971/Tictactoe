import java.util.*;
import java.lang.*;



public class tictac {
    static void myboard() {


        System.out.println("|---|---|---|");
        System.out.println("| " + numbers.one + " | " + numbers.two + " | " + numbers.thr + " | ");
        System.out.println("|-----------|");
        System.out.println("| " + numbers.fou + " | " + numbers.fiv + " | " + numbers.six + " | ");
        System.out.println("|-----------|");
        System.out.println("| " + numbers.sev + " | " + numbers.eig + " | " + numbers.nin + " |");
        System.out.println("|-----------|");

    }


    public static void main(String[] args) {


        System.out.println("Welcome to tic tac toe");
        int playerst = 0;
        while (playerst == 0) {
            System.out.println("Do you want to start a game?");
            System.out.println("if yes, type yes or y, if no, type no or n");
            Scanner Playerstart = new Scanner(System.in);
            String Playerstartstr = Playerstart.nextLine();
            String lowerstart = Playerstartstr.toLowerCase();
            if (lowerstart.equals("yes") || lowerstart.equals("y")) {
                System.out.println("let's start!");
                ++playerst;
                System.out.println("to win, you must complete 3 in a row");
                System.out.println("Enter a number between 1-9 as shown on the board that HASN'T been taken already");
                myboard();
            } else if (lowerstart.equals("no") || lowerstart.equals("n")) {
                ++playerst;
                numbers.one = "3";
                numbers.two = "3";
                winnercheck();
            }

        }

            String X = "X";
            String O = "O";
            int loopend = 1;

            while (winnercheck() == false) {
                winnercheck();


                while (loopend == 1) {


                    Scanner PlayerXscan = new Scanner(System.in);


                    String PlayerXpos = PlayerXscan.nextLine();
                    Boolean checkint = true;
                    for (int a = 0; a < PlayerXpos.length(); a++) {
                        if (!Character.isDigit(PlayerXpos.charAt(a))) {
                            checkint = false;
                        }


                    }
                    if (winnercheck() == false) {
                        if (checkint == true) {
                            String PlayerString = PlayerXpos;

                            int PlayerXInt = Integer.parseInt(PlayerString);


                            if ((PlayerXInt < 9 && PlayerXInt >= 0)) {
                                if (PlayerXpos.equals(numbers.one)) {
                                    numbers.one = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.two)) {
                                    numbers.two = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.thr)) {
                                    numbers.thr = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.fou)) {
                                    numbers.fou = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.fiv)) {
                                    numbers.fiv = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.six)) {
                                    numbers.six = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.sev)) {
                                    numbers.sev = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.eig)) {
                                    numbers.eig = X;
                                    myboard();
                                    loopend++;


                                }
                                if (PlayerXpos.equals(numbers.nin)) {
                                    numbers.nin = X;
                                    myboard();
                                    loopend++;


                                }


                            } else {
                                System.out.println("you didn't input a number");
                            }
                        }
                    }
                }
                loopend = 1;
                winnercheck();

                int min = 1;
                int max = 9;
                int loopendai = 0;
                if (winnercheck() == false) {
                    while (loopendai == 0) {

                        int ai_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                        String AiPos = Integer.toString(ai_int);

                        if (AiPos.equals(numbers.one)) {
                            tictac.numbers.one = O;
                            myboard();
                            ++loopendai;


                        }
                        if (AiPos.equals(numbers.two)) {
                            tictac.numbers.two = O;
                            myboard();
                            ++loopendai;

                        }
                        if (AiPos.equals(numbers.thr)) {
                            tictac.numbers.thr = O;
                            myboard();
                            ++loopendai;


                        }
                        if (AiPos.equals(numbers.fou)) {
                            tictac.numbers.fou = O;
                            myboard();
                            ++loopendai;


                        }
                        if (AiPos.equals(numbers.fiv)) {
                            tictac.numbers.fiv = O;
                            myboard();
                            ++loopendai;


                        }
                        if (AiPos.equals(numbers.six)) {
                            tictac.numbers.six = O;
                            myboard();
                            ++loopendai;


                        }
                        if (AiPos.equals(numbers.sev)) {
                            tictac.numbers.sev = O;
                            myboard();
                            ++loopendai;

                        }
                        if (AiPos.equals(numbers.eig)) {
                            tictac.numbers.eig = O;
                            myboard();
                            ++loopendai;


                        }
                        if (AiPos.equals(numbers.nin)) {
                            tictac.numbers.nin = O;
                            myboard();
                            ++loopendai;


                        }
                        if (winnercheck() == true) {
                            ++loopendai;
                        }

                        System.out.println("the ai chose " + AiPos);
                    }


                }
            }
            winnercheckai();
            winnercheckplayer();

            if (winnercheckai() == true) {
                System.out.println("You lost, better luck next time");
                System.out.println("-");
                System.out.println("-");
                System.out.println("-");
                System.out.println("you did lose against a random ai");
                System.out.println("wow");

            }

            if (winnercheckplayer() == true) {
                System.out.println("Congrats, you won!!");

            }
            if (winnercheckai() == false && winnercheckplayer() == false && playerst == 0) {
                System.out.println("You tied, better luck next time");

            }
            if (winnercheckai() == false && winnercheckplayer() == false) {
                System.out.println("Goodbye");


            }



        }




    public class numbers {
        static String one = "1";
        static String two = "2";
        static String thr = "3";
        static String fou = "4";
        static String fiv = "5";
        static String six = "6";
        static String sev = "7";
        static String eig = "8";
        static String nin = "9";


    }

    static boolean winnercheck(){
        boolean winnercheckbool = false;
        if (numbers.one.equals(numbers.two) && numbers.two.equals(numbers.thr)){
            winnercheckbool = true;

        }
        if (numbers.one.equals(numbers.fou) && numbers.fou.equals(numbers.sev)){
            winnercheckbool = true;
        }
        if (numbers.one.equals(numbers.fiv) && numbers.fiv.equals(numbers.nin)){
            winnercheckbool = true;
        }
        if (numbers.two.equals(numbers.fiv) && numbers.fiv.equals(numbers.eig)){
            winnercheckbool = true;
        }
        if (numbers.thr.equals(numbers.six) && numbers.six.equals(numbers.nin)){
            winnercheckbool = true;
        }
        if (numbers.fou.equals(numbers.fiv) && numbers.fiv.equals(numbers.six)){
            winnercheckbool = true;
        }
        if (numbers.sev.equals(numbers.eig) && numbers.eig.equals(numbers.nin)){
            winnercheckbool = true;
        }
        if (numbers.thr.equals(numbers.fiv) && numbers.fiv.equals(numbers.sev)){
            winnercheckbool = true;
        }
        if (!(numbers.one.equals("1")) && !(numbers.two.equals("2")) && !(numbers.thr.equals("3")) && !(numbers.fou.equals("4")) && !(numbers.fiv.equals("5")) && !(numbers.six.equals("6")) && !(numbers.sev.equals("7")) && !(numbers.eig.equals("8")) && !(numbers.nin.equals("9"))){
            winnercheckbool = true;
        }
        return winnercheckbool;
    }
    static boolean winnercheckai(){
        boolean winnercheckboolai = false;
        if (numbers.one.equals(numbers.two) && numbers.two.equals(numbers.thr) && numbers.one.equals("O")){
            winnercheckboolai = true;

        }
        if (numbers.one.equals(numbers.fou) && numbers.fou.equals(numbers.sev)&& numbers.one.equals("O")){
            winnercheckboolai = true;
        }
        if (numbers.one.equals(numbers.fiv) && numbers.fiv.equals(numbers.nin)&& numbers.one.equals("O")){
            winnercheckboolai = true;
        }
        if (numbers.two.equals(numbers.fiv) && numbers.fiv.equals(numbers.eig)&& numbers.two.equals("O")){
            winnercheckboolai = true;
        }
        if (numbers.thr.equals(numbers.six) && numbers.six.equals(numbers.nin)&& numbers.thr.equals("O")){
            winnercheckboolai = true;
        }
        if (numbers.fou.equals(numbers.fiv) && numbers.fiv.equals(numbers.six)&& numbers.fou.equals("O")){
            winnercheckboolai = true;
        }
        if (numbers.sev.equals(numbers.eig) && numbers.eig.equals(numbers.nin)&& numbers.sev.equals("O")){
            winnercheckboolai = true;
        }
        if (numbers.thr.equals(numbers.fiv) && numbers.fiv.equals(numbers.sev)&& numbers.thr.equals("O")){
            winnercheckboolai = true;
        }


        return winnercheckboolai;
    }
    static boolean winnercheckplayer(){
        boolean winnercheckboolai = false;
        if (numbers.one.equals(numbers.two) && numbers.two.equals(numbers.thr) && numbers.one.equals("X")){
            winnercheckboolai = true;

        }
        if (numbers.one.equals(numbers.fou) && numbers.fou.equals(numbers.sev)&& numbers.one.equals("X")){
            winnercheckboolai = true;
        }
        if (numbers.one.equals(numbers.fiv) && numbers.fiv.equals(numbers.nin)&& numbers.one.equals("X")){
            winnercheckboolai = true;
        }
        if (numbers.two.equals(numbers.fiv) && numbers.fiv.equals(numbers.eig)&& numbers.two.equals("X")){
            winnercheckboolai = true;
        }
        if (numbers.thr.equals(numbers.six) && numbers.six.equals(numbers.nin)&& numbers.thr.equals("X")){
            winnercheckboolai = true;
        }
        if (numbers.fou.equals(numbers.fiv) && numbers.fiv.equals(numbers.six)&& numbers.fou.equals("X")){
            winnercheckboolai = true;
        }
        if (numbers.sev.equals(numbers.eig) && numbers.eig.equals(numbers.nin)&& numbers.sev.equals("X")){
            winnercheckboolai = true;
        }
        if (numbers.thr.equals(numbers.fiv) && numbers.fiv.equals(numbers.sev)&& numbers.thr.equals("X")){
            winnercheckboolai = true;
        }


        return winnercheckboolai;
    }

}




