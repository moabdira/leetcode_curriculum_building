Problem: https://leetcode.com/problems/defanging-an-ip-address/description/

Solution 1:
class Solution {
    fun defangIPaddr(address: String): String = address.replace(".", "[.]")
}

Solution 2:
class Solution {
    fun defangIPaddr(address: String): String {
        val target = "."
        val replace = "[.]"
        return Pattern.compile(target, Pattern.LITERAL).matcher(address)
            .replaceAll(Matcher.quoteReplacement(replace))
    }
}

Solution 3:
class Solution {
    fun defangIPaddr(address: String): String = address.replace(Regex("\\."), "[.]")
}
