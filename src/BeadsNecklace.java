public class BeadsNecklace {


    int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

    int[] constructBeads(int numBeads) {
        int[] beads = new int[numBeads];
        for (int i = 0; i < numBeads; ++i) {
            beads[i] = i + 1;
        }
        return beads;
    }

    boolean isPrime(int number) {
        for (int i = 0; i < primes.length; i++) {
            if (number == primes[i]) {
                return true;
            }
        }
        return false;
    }

    void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }



    int calculateNumNecklaces(int[] beads, int numBeads, int fromPosition) {

        if (fromPosition == numBeads) {
            if (isPrime(beads[0] + beads[numBeads - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        int previousNumber = beads[fromPosition - 1];
        if (isPrime(previousNumber + beads[fromPosition])) {
            count += calculateNumNecklaces(beads, numBeads, fromPosition + 1);
        }
        for (int pos = fromPosition + 1; pos < numBeads; ++pos) {
            if (isPrime(previousNumber + beads[pos])) {
                swap(beads, fromPosition, pos);
                count += calculateNumNecklaces(beads, numBeads, fromPosition + 1);
                swap(beads, fromPosition, pos);
            }
        }
        return count;
    }
}
