package collections.idea.Q7;

public class Question7 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8};
        int[] B = {1,2,3,4,5};


        String arrStringA = "";
        String arrStringB = "";
        for (int i = 0; i < A.length; i++) {
            arrStringA+=A[i]+",";
            
        }
        for (int i = 0; i <B.length ; i++) {
            arrStringB+=B[i]+",";
        }
        if(arrStringA.contentEquals(arrStringB))
            System.out.println("A id equal B ");
        else if (arrStringA.contains(arrStringB)) {
//            System.out.println(arrStringA.contains(arrStringB));
            System.out.println("A is superList to B");
        } else if (arrStringB.contains(arrStringA)) {
//            System.out.println(arrStringB.contains(arrStringA));
            System.out.println("A is a sublist of B ");
        }
        else {
            System.out.println("A is not a superlist, sublist or equal to B");
        }

    }
}
