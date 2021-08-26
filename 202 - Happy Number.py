class Solution:
    def isHappy(self, n: int) -> bool:
        
        numbersInSequence = {}

        number = int(n)

        while True:

            if number == 1:
                return True

            digits = str(number)

            number = 0

            for digit in digits:
                number += int(digit) ** 2

            if number in numbersInSequence.keys():
                return False

            numbersInSequence[number] = True

def main():
    solution = Solution()

    testCases = [19, 2, 1, 7]

    for testCase in testCases:
        output = solution.isHappy(testCase)
        print(output)

if __name__ == "__main__":
    main()