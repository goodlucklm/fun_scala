class StringQuestions {
  def lengthOfLongestSubstring(s: String): Int = {
    var i = 0
    var maxLength = 0
    val seen: Array[Boolean] = new Array[Boolean](256)
    for (j <- 0 to s.length() - 1) {
      while (seen(s.charAt(j))) {
        seen(s.charAt(i)) = false
        i += 1
      }
      seen(s.charAt(j)) = true
      maxLength max (j - i + 1)
    }
    maxLength
  }
}

object Demo1 {
  def main(args: Array[String]): Unit = {
    val sq = new StringQuestions
    println(sq.lengthOfLongestSubstring("abcabcbb"))
  }
}
