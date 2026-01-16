package MINI_PROJECTS.PROJECT_1;

public class QUESTION {

    private String question;
    private int id;
    private String opt_1;
    private String opt_2;
    private String opt_3;
    private String opt_4;
    private String answer;

    public QUESTION(int id, String question, String opt_1, String opt_2, String opt_3, String opt_4, String answer) {
        this.id = id;
        this.question = question;
        this.opt_1 = opt_1;
        this.opt_2 = opt_2;
        this.opt_3 = opt_3;
        this.opt_4 = opt_4;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpt_1() {
        return opt_1;
    }

    public void setOpt_1(String opt_1) {
        this.opt_1 = opt_1;
    }

    public String getOpt_2() {
        return opt_2;
    }

    public void setOpt_2(String opt_2) {
        this.opt_2 = opt_2;
    }

    public String getOpt_3() {
        return opt_3;
    }

    public void setOpt_3(String opt_3) {
        this.opt_3 = opt_3;
    }

    public String getOpt_4() {
        return opt_4;
    }

    public void setOpt_4(String opt_4) {
        this.opt_4 = opt_4;
    }


    @Override
    public String toString() {
        return "QUESTION{" +
                "question='" + question + '\'' +
                ", id=" + id +
                ", opt_1='" + opt_1 + '\'' +
                ", opt_2='" + opt_2 + '\'' +
                ", opt_3='" + opt_3 + '\'' +
                ", opt_4='" + opt_4 + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
