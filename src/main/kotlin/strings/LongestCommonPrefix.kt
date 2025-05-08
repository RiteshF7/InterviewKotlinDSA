package org.example.strings

/*
*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*
*
* hint
*
* ### Hint for Future Approach
The common prefix will always be within the first string itself.

After that, you have two choices:
1. Check each character across all strings (efficient, avoids sorting).
2. Sort the array and compare first and last strings (simplifies comparison but adds sorting overhead).

Choose the method based on speed vs. simplicity. Let me know if you need more refinements!

* */

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    val sortedArray = strs.sortedArray()
    var longestCommonPrefix = ""
    val firstString = sortedArray.first()
    val lastString = sortedArray.last()

    for (i in firstString.indices) {
        if (firstString[i] != lastString[i]) break
        longestCommonPrefix += firstString[i]
    }
    return longestCommonPrefix
}

fun alternativeApproch(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    val firstString = strs.first()
    for (i in firstString.indices) {
        val char = firstString[i]
        for (j in 1 until strs.size) {
            if (i >= strs[j].length || strs[j][i] != char) {
                return firstString.substring(0, i)
            }
        }
    }
    return ""
}