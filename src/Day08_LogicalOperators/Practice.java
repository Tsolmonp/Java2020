package Day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        //
        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 17;
        String citizinShip = "USA";

        boolean eligibleToVote = age >= 18 || citizinShip == "USA";
        //               19 >= 18 && "USA" == "USA"
        //                  true  &&  true

        String fullName = firstName+ " " +lastName;
        System.out.println(fullName);
        System.out.println(fullName+ " is eligible to vote: " +eligibleToVote );

    }
}
