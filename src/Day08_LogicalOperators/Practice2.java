package Day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        int age = 21;
        String firstName = "Khabib";
        String lastName = "Legend";
        String citizin1 = "USA";
        String citizin2 = "France";
        boolean eligibleAge = age >= 18;//21 >= 18 ==> true
        boolean usCitizin = citizin1 == "USA" || citizin2 == "USA";
            // "USA" == "USA" || "France" == "USA"
            //    true        || false
            //true
        String fullName = firstName+" "+lastName;
        boolean eligibleToVote = eligibleAge && usCitizin;
        System.out.println(fullName+ " is eligible to vote for Trump: " +eligibleToVote );


    }
}
