package Day09_IfStatement;

public class Vote {
    public static void main(String[] args) {
        int age = 15;
        boolean usCitizin = true;

        if( age > 18 && usCitizin){
            System.out.println("ELIGIBLE TO VOTE FOR TRUMP");
        }else{
            System.out.println("Not Eligible to vote for Trump");
        }
    }
}
