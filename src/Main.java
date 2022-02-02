public class Main {
    public static void main(String[] args) {
        System.out.println("main file");
//
        // Problem 1
//        ReversePalindrome reversePalindrome = new ReversePalindrome();
//
//        long[] res = reversePalindrome.solution(195);
//        if (res != null) {
//            System.out.println("Result : " + res[0] + " additionCount: " + res[1]);
//        }


        // Problem 2
        BeadsNecklace beadsNecklace = new BeadsNecklace();
        int numBeads = 6;
        int[] beads =  beadsNecklace.constructBeads(numBeads);
        int count = beadsNecklace.calculateNumNecklaces(beads, numBeads, 1);
        System.out.println("Number of possible ways for Necklace: " + count);
    }
}
