package homework;

public class homework3 {
    public static void main(String[] args) {
//          write a program where you give your
//        //credit score
//        //your marital status
//        //number of children
//
//
//        //if credit score is more than 680
//        //married
//        //more than 2 children
//
//        boolean giveFamilyHealthInsuranceCoverage;

        boolean giveFamilyHealthInsuranceCoverage;
        int creditScore = 715;
        byte numberOfChildren=5;
        boolean maritalStatus=true;

        giveFamilyHealthInsuranceCoverage= creditScore>680 && maritalStatus && numberOfChildren>2;
        System.out.println(giveFamilyHealthInsuranceCoverage);


    }
}
