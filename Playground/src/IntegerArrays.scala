class IntegerArrays {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var map:Map[Int, Int] = Map()
    nums.zipWithIndex foreach {
      pair => map.get(target - pair._1) match {
        case Some(i) => return Array(i, pair._2)
        case None => map += pair
      }
    }
    Array[Int]()
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    val ia = new IntegerArrays
    println(ia.twoSum(Array(3,2,4), 6).zipWithIndex.deep.mkString("\n"))
  }
}
