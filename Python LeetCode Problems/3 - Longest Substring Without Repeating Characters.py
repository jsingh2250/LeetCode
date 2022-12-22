class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        # variable that stores length of longest substring
        longestSubstringLength = 0
        
        # variables for storing substring properties
        substringStartIndex = 0

        # dictionary for storing seen characters and character indices
        # it's faster to search the dictionary for repeats than it is to search the string
        seenCharacterIndices = {}

        # loop end index of substring through string
        for substringEndIndex, substringEndCharacter in enumerate(s):

            # check if the letter at the end of the substring was seen previously in the string
            wasSeen = substringEndCharacter in seenCharacterIndices.keys()

            # check if the letter was seen after the start index of the substring
            if wasSeen:
                previouslySeenIndex = seenCharacterIndices[substringEndCharacter]
                wasSeenAfterStartIndex = substringStartIndex <= previouslySeenIndex

                # start new substring after previous instance of duplicate character in substring
                if wasSeenAfterStartIndex:
                    substringStartIndex = previouslySeenIndex + 1

            # add/update index of substring end character in dictionary
            seenCharacterIndices[substringEndCharacter] = substringEndIndex

            # calculate length of substring
            substringLength = substringEndIndex - substringStartIndex + 1

            # update length of longest substring if necessary
            if substringLength > longestSubstringLength:
                longestSubstringLength = substringLength
        
        # output length of longest substring
        return longestSubstringLength

def main():
    solution = Solution()

    testCases = ["abcabcbb", "bbbbb", "pwwkew", ""]

    for testCase in testCases:
        longestSubstringLength = solution.lengthOfLongestSubstring(testCase)
        print(longestSubstringLength)

if __name__ == "__main__":
    main()