public class Main {
    public static void ageCheck(int age) {
        int LIMIT = 18;
        boolean isAdult = age >= LIMIT; //comparison operator that generates a boolean value

        if(isAdult) {
            System.out.println("IS ADULT.");
        }else{
            System.out.println("IS *NOT* ADULT.");
        }
    }

    public static void main(String[] args) {
        ageCheck(21);
        ageCheck(12);
        //COMPARISON OPERATORS - GENERATE A BOOLEAN VALUE (TRUE/FALSE)
        System.out.println(25 == 21); //exactly equal
        System.out.println(25 != 21); // not equal
        System.out.println(25 > 21); // greater than
        System.out.println(25 < 21); // less than
        System.out.println(25 >= 21); // grater than or equal to
        System.out.println(25 <= 21); // less than or equal


        //LOGICAL OPERATORS && || !  - AND, OR, NOT

        boolean isDiabetic = false;
        boolean likesCake = true;

        if(likesCake && !isDiabetic){ // if likes cake *and* is *not* diabetic
            System.out.println("eats cake");
        }

        boolean isCat = true;
        boolean isDog = false;
        boolean isFriendly = false;

        if((isCat || isDog) && isFriendly){ //if is a cat *or* is a dog then pet it.
            System.out.println("Pet it.");
        }else{
            System.out.println("DON'T! pet it.");
        }

    }
}