package org.example.strings

/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?*/

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val charMap = mutableMapOf<Char, Int>()
    val charMap2 = mutableMapOf<Char, Int>()

    for (index in s.indices) {
        val char = s[index]
        val char2 = t[index]
        charMap[char] = charMap.getOrDefault(char, 0) + 1
        charMap2[char2] = charMap2.getOrDefault(char2, 0) + 1
    }

    for (char in s) {
        if (!charMap2.containsKey(char)) return false
        if (charMap2[char] != charMap[char]) return false
    }


    return true
}