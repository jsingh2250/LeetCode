# Given a non-negative integer c, decide whether there're two integers a and b such that a**2 + b**2 = c.
class Solution:
    def judgeSquareSum(self, c: int) -> bool:

        # iterate values between 0 and square root of c for first number
        for a in range(int(c**0.5 + 1)):

            # calculate square of first integer
            aSquared = a * a

            # find value of squared second number
            bSquared = c - aSquared

            # check if squared second number is a perfect square using binary search to search for it's squareroot
            low = 0
            high = bSquared
            while low <= high:

                # find integer in the middle of low and high integers
                mid = (high - low) // 2 + low

                midSquared = mid * mid

                # If middle integer squared is equal to squared second number, the integer c is a sum of squares. Return True.
                if midSquared == bSquared:
                    return True

                # If middle integer squared is greater than squared second number,
                # the square root of the squared second number is between low and mid.
                # Set high equal to one less than mid.
                elif midSquared > bSquared:
                    high = mid - 1

                # If middle integer squared is less than squared second number,
                # the square root of the squared second number is between mid and high.
                # Set low equal to one more than mid.
                elif midSquared < bSquared:
                    low = mid + 1
        
        # The integer c is not a sum of squares. Return False.
        return False
            

def main():
    solution = Solution()

    testCases = [5, 3, 4, 2, 1]

    for testCase in testCases:
        output = solution.judgeSquareSum(testCase)
        print(output)


if __name__ == "__main__":
    main()
