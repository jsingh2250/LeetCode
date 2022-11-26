class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        // Calculate the number of customers satisfied if the not grumpy trick is used on minute zero.
        int maxNumberOfCustomersSatisfied = 0;
        for (int minute = 0; minute < customers.length; minute++) {
            if ((grumpy[minute] == 0) || (minute < minutes)) {
                maxNumberOfCustomersSatisfied += customers[minute];
            }
        }

        // Calculate the maximum number of customers satisfied no matter when the not grumpy trick is used.
        int notGrumpyTrickStartingMinute = 1;
        int notGrumpyTrickEndingMinute = minutes;
        int numberOfCustomersSatisfied = maxNumberOfCustomersSatisfied;
        while (notGrumpyTrickEndingMinute < customers.length) {
            numberOfCustomersSatisfied += -(customers[notGrumpyTrickStartingMinute - 1]
            * grumpy[notGrumpyTrickStartingMinute - 1])
            + (customers[notGrumpyTrickEndingMinute] * grumpy[notGrumpyTrickEndingMinute]);

            maxNumberOfCustomersSatisfied = Math.max(maxNumberOfCustomersSatisfied, numberOfCustomersSatisfied);

            notGrumpyTrickStartingMinute++;
            notGrumpyTrickEndingMinute++;
        }

        // Return the maximumn number of customers satisfied.
        return maxNumberOfCustomersSatisfied;
    }
}