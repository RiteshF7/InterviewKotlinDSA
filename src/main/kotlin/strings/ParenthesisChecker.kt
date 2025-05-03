package org.example.strings

/*
* Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']', verify the validity of the arrangement.
An input string is valid if:

         1. Open brackets must be closed by the same type of brackets.
         2. Open brackets must be closed in the correct order.

Examples :

Input: s = "[{()}]"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "[()()]{}"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "([]"
Output: False
Explanation: The expression is not balanced as there is a missing ')' at the end.
Input: s = "([{]})"
Output: False
Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
Constraints:
1 ≤ s.size() ≤ 106
s[i] ∈ {'{', '}', '(', ')', '[', ']'}
* */

fun validateParenthesis(input: CharArray): Boolean {
    val pStack = ArrayDeque<Char>()
    val p1 = Pair('(', ')')
    val p2 = Pair('{', '}')
    val p3 = Pair('[', ']')

    for (char in input) {
        when (char) {
            p1.first, p2.first, p3.first -> pStack.addLast(char)
            p1.second -> if (pStack.isEmpty() || pStack.removeLast() != p1.first) return false
            p2.second -> if (pStack.isEmpty() || pStack.removeLast() != p2.first) return false
            p3.second -> if (pStack.isEmpty() || pStack.removeLast() != p3.first) return false

        }
    }
    return pStack.isEmpty()
}