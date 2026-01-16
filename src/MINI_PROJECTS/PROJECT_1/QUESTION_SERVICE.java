package MINI_PROJECTS.PROJECT_1;
import java.util.Scanner;
public class QUESTION_SERVICE {

        Scanner sc = new Scanner(System.in);
        QUESTION[] questions_array = new QUESTION[5];
        String[] ans = new String[5];

        public QUESTION_SERVICE(){
            questions_array[0] = new QUESTION(1, "size if int", "2" , "4", "6", "8", "4");
            questions_array[1] = new QUESTION(2, "size if char", "2" , "4", "6", "8", "2");
            questions_array[2] = new QUESTION(3, "size if double", "2" , "4", "6", "8", "8");
            questions_array[3] = new QUESTION(4, "size if long", "2" , "4", "6", "8", "6");
            questions_array[4] = new QUESTION(5, "size if boolean", "2" , "4", "6", "8", "4");
        }

        public void playQUiz(){

            int score = 0;
            int j = 0;
            for(QUESTION i : questions_array){
                System.out.println("Question: " + i.getId());
                System.out.println(i.getQuestion());
                System.out.println(i.getOpt_1());
                System.out.println(i.getOpt_2());
                System.out.println(i.getOpt_3());
                System.out.println(i.getOpt_4());
                ans[j] = sc.nextLine();

                if( ans[j].equals(i.getAnswer())){
                    score++;
                }
                j++;
            }
            System.out.println("Your Score is " + score);
        }


}
